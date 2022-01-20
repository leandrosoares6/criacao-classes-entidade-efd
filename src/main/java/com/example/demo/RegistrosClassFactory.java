package com.example.demo;

import java.lang.reflect.Modifier;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.example.demo.model.Campo;
import com.example.demo.model.Registro;
import com.example.demo.model.RegistroMetadataFactory;
import com.example.demo.model.RegistroTest;
import com.example.demo.service.SourceGeneratorFactory;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
import com.example.demo.util.CampoTipoId;
import com.example.demo.util.Indice;
import org.burningwave.core.classes.AnnotationSourceGenerator;
import org.burningwave.core.classes.ClassSourceGenerator;
import org.burningwave.core.classes.FunctionSourceGenerator;
import org.burningwave.core.classes.TypeDeclarationSourceGenerator;
import org.burningwave.core.classes.UnitSourceGenerator;
import org.burningwave.core.classes.VariableSourceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class RegistrosClassFactory {
	private static final String PACOTE = "com.example.demo.model.registros";
	private static final String SCHEMA = "APL_EFD";
	private static final String PREFIXO = "Registro";

	private RegistrosClassFactory() {}

	static void criaRegistros() {
		List<RegistroTest> registros = RegistroMetadataFactory.criaMetadados();
		criaClasses(registros);
	}

	private static void criaClasses(List<RegistroTest> registros) {
		for (RegistroTest registroTest : registros) {
			String nomeClasseRegistro = PREFIXO + registroTest.getNome();
			UnitSourceGenerator gerador = SourceGeneratorFactory.get(nomeClasseRegistro, PACOTE);
			ClassSourceGenerator registro = ClassSourceGenerator
					.create(TypeDeclarationSourceGenerator.create(nomeClasseRegistro))
					.addModifier(Modifier.PUBLIC)
					.addAnnotation(AnnotationSourceGenerator.create(Getter.class))
					.addAnnotation(AnnotationSourceGenerator.create(Setter.class))
					.addAnnotation(AnnotationSourceGenerator.create(NoArgsConstructor.class))
					.addAnnotation(AnnotationSourceGenerator.create(ToString.class))
					.addAnnotation(AnnotationSourceGenerator.create(Entity.class))
					.addAnnotation(AnnotationSourceGenerator.create(Table.class)
							.addParameter("name",
									VariableSourceGenerator.create(String.format("\"%s\"",
											registroTest.getNomeTabelaBd())))
							.addParameter("schema", VariableSourceGenerator
									.create(String.format("\"%s\"", SCHEMA))));

			criaColunas(registroTest.getCampos(), registro);

			// cria construtor com base na linha do arquivo
			registro.addConstructor(FunctionSourceGenerator.create().addModifier(Modifier.PUBLIC)
					.addParameter(VariableSourceGenerator.create(String.class, "linha"))
					.addBodyCodeLine("super(linha);")).expands(Registro.class);

			gerador.addClass(registro);

			// compartilha UnitSourceGenerator com outras classes
			SourceGeneratorFactory.set(registroTest.getNome(), gerador);

			// String caminhoPastaRegistros = System.getProperty("user.dir") + "/src/main/java/";
			// gerador.storeToClassPath(caminhoPastaRegistros);

		}
	}

	private static void criaColunas(List<Campo> campos, ClassSourceGenerator registro) {
		var existeCampoId = false;
		for (Campo campo : campos) {
			VariableSourceGenerator field = VariableSourceGenerator
					.create(TypeDeclarationSourceGenerator.create(String.class),
							campo.getNomeAtributo())
					.addModifier(Modifier.PRIVATE)
					.addAnnotation(AnnotationSourceGenerator.create(Column.class)
							.addParameter("name", VariableSourceGenerator
									.create(String.format("\"%s\"", campo.getNome())))
					// .addParameter("columnDefinition", VariableSourceGenerator
					// .create(String.format("\"%s\"", campo.getFuncaoBd())))

					)
					.addAnnotation(AnnotationSourceGenerator.create(Indice.class).addParameter(
							"valor",
							VariableSourceGenerator.create(String.valueOf(campo.getSequencial()))));

			if (campo.getNome().equals("ID")) {
				field.addAnnotation(AnnotationSourceGenerator.create(Id.class));
				existeCampoId = true;
			}
			if (campo.getEId()) {
				field.addAnnotation(AnnotationSourceGenerator.create(CampoTipoId.class));
			}
			if (campo.getEData()) {
				field.addAnnotation(AnnotationSourceGenerator.create(CampoTipoData.class));
			}
			if (campo.getEDataPart()) {
				field.addAnnotation(AnnotationSourceGenerator.create(CampoTipoDataPart.class));
			}

			registro.addField(field);
		}

		if (!existeCampoId) {
			registro.addField(VariableSourceGenerator
					.create(TypeDeclarationSourceGenerator.create(String.class), "id")
					.addModifier(Modifier.PRIVATE)
					.addAnnotation(AnnotationSourceGenerator.create(Id.class))
					.addAnnotation(AnnotationSourceGenerator.create(Column.class).addParameter(
							"name",
							VariableSourceGenerator.create(String.format("\"%s\"", "ID")))));
		}
	}
}
