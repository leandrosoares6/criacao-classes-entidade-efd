package com.example.demo;

import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.example.demo.enums.TipoOcorrencia;
import com.example.demo.model.Campo;
import com.example.demo.model.Registro;
import com.example.demo.model.RegistroBase;
import com.example.demo.model.RegistroMetadataFactory;
import com.example.demo.model.anotacoes.Indice;
import com.example.demo.model.anotacoes.Metadados;
import com.example.demo.model.anotacoes.PossuiDataPart;
import com.example.demo.service.SourceGeneratorFactory;
import com.example.demo.util.StringUtils;
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
	private static final String FORMATO_STRING_CAMPOS = "\"%s\"";
	private static final String FORMATO_STRING_FK = "@javax.persistence.ForeignKey(name = \"FK_TAB_EFD_%s_%s\")";
	private static final String PACOTE = "com.example.demo.model.registros";
	private static final String SCHEMA = "APL_EFD";
	private static final String PREFIXO_TABELAS = "TAB_EFD_";
	private static final String PREFIXO = "Registro";
	private static final String TIPO_DADO_ID = "NUMBER(19,0)";

	private RegistrosClassFactory() {}

	static void criaRegistros() {
		List<Registro> registros = RegistroMetadataFactory.criaMetadados();
		criaClasses(registros);
	}

	private static void criaClasses(List<Registro> registros) {
		for (Registro registroMetadados : registros) {
			String nomeClasseRegistro = PREFIXO + registroMetadados.getNome();
			UnitSourceGenerator gerador = SourceGeneratorFactory.get(nomeClasseRegistro, PACOTE);
			ClassSourceGenerator registro = ClassSourceGenerator
					.create(TypeDeclarationSourceGenerator.create(nomeClasseRegistro))
					.addModifier(Modifier.PUBLIC)
					.addAnnotation(AnnotationSourceGenerator.create(Getter.class))
					.addAnnotation(AnnotationSourceGenerator.create(Setter.class))
					.addAnnotation(AnnotationSourceGenerator.create(NoArgsConstructor.class))
					.addAnnotation(AnnotationSourceGenerator.create(ToString.class))
					.addAnnotation(AnnotationSourceGenerator.create(Entity.class))
					.addAnnotation(AnnotationSourceGenerator.create(Table.class).addParameter(
							"name",
							VariableSourceGenerator.create(String.format(FORMATO_STRING_CAMPOS,
									PREFIXO_TABELAS + registroMetadados.getNome())))
							.addParameter("schema",
									VariableSourceGenerator
											.create(String.format(FORMATO_STRING_CAMPOS, SCHEMA))))
					.addAnnotation(AnnotationSourceGenerator.create(Metadados.class).addParameter(
							"nomeRegistroPai",
							VariableSourceGenerator.create(String.format(FORMATO_STRING_CAMPOS,
									registroMetadados.getNomeRegistroPai())))
							.addParameter("ocorrencia",
									VariableSourceGenerator
											.create(String.format(FORMATO_STRING_CAMPOS,
													registroMetadados.getOcorrencia().name()))));
			if (registroMetadados.isPossuiDataPart()) {
				registro.addAnnotation(AnnotationSourceGenerator.create(PossuiDataPart.class));
			}

			criaColunas(registroMetadados, registro);

			// cria construtor com TipoOcorrencia.UNICA com dataPart
			if (registroMetadados.getOcorrencia().equals(TipoOcorrencia.UNICA)
					&& registroMetadados.isPossuiDataPart()) {
				registro.addConstructor(FunctionSourceGenerator.create()
						.addModifier(Modifier.PUBLIC)
						.addParameter(VariableSourceGenerator.create(String.class, "linha"))
						.addParameter(VariableSourceGenerator.create(Long.class, "id"))
						.addParameter(VariableSourceGenerator.create(Date.class, "dataPart"))
						.addBodyCodeLine("super(linha, id, dataPart);"))
						.expands(RegistroBase.class);
			}

			// cria construtor com TipoOcorrencia.UNICA sem dataPart
			if (registroMetadados.getOcorrencia().equals(TipoOcorrencia.UNICA)
					&& !registroMetadados.isPossuiDataPart()) {
				registro.addConstructor(
						FunctionSourceGenerator.create().addModifier(Modifier.PUBLIC)
								.addParameter(VariableSourceGenerator.create(String.class, "linha"))
								.addParameter(VariableSourceGenerator.create(Long.class, "id"))
								.addBodyCodeLine("super(linha, id);"))
						.expands(RegistroBase.class);
			}

			// cria construtor com TipoOcorrencia.MULTIPLA com dataPart
			if (registroMetadados.getOcorrencia().equals(TipoOcorrencia.MULTIPLA)
					&& registroMetadados.isPossuiDataPart()) {
				registro.addConstructor(FunctionSourceGenerator.create()
						.addModifier(Modifier.PUBLIC)
						.addParameter(VariableSourceGenerator.create(String.class, "linha"))
						.addParameter(VariableSourceGenerator.create(Long.class, "id"))
						.addParameter(VariableSourceGenerator.create(Long.class, "idRegistroPai"))
						.addParameter(VariableSourceGenerator.create(Date.class, "dataPart"))
						.addBodyCodeLine("super(linha, id, idRegistroPai, dataPart);"))
						.expands(RegistroBase.class);
			}

			// cria construtor com TipoOcorrencia.MULTIPLA sem dataPart
			if (registroMetadados.getOcorrencia().equals(TipoOcorrencia.MULTIPLA)
					&& !registroMetadados.isPossuiDataPart()) {
				registro.addConstructor(FunctionSourceGenerator.create()
						.addModifier(Modifier.PUBLIC)
						.addParameter(VariableSourceGenerator.create(String.class, "linha"))
						.addParameter(VariableSourceGenerator.create(Long.class, "id"))
						.addParameter(VariableSourceGenerator.create(Long.class, "idRegistroPai"))
						.addBodyCodeLine("super(linha, id, idRegistroPai);"))
						.expands(RegistroBase.class);
			}

			gerador.addClass(registro);

			// compartilha UnitSourceGenerator com outras classes
			SourceGeneratorFactory.set(registroMetadados.getNome(), gerador);

			String caminhoPastaRegistros = System.getProperty("user.dir") + "/src/main/java/";
			gerador.storeToClassPath(caminhoPastaRegistros);

		}
	}

	private static void criaColunas(Registro registroMetadados, ClassSourceGenerator registro) {
		for (Campo campo : registroMetadados.getCampos()) {
			Class<?> tipoCampo = StringUtils.obterTipoDoCampo(campo.getTipoDeDado());

			VariableSourceGenerator field = VariableSourceGenerator
					.create(TypeDeclarationSourceGenerator.create(tipoCampo),
							campo.getNomeAtributo())
					.addModifier(Modifier.PRIVATE)
					.addAnnotation(AnnotationSourceGenerator.create(Column.class)
							.addParameter("name",
									VariableSourceGenerator.create(
											String.format(FORMATO_STRING_CAMPOS, campo.getNome())))
							.addParameter("columnDefinition", VariableSourceGenerator.create(
									String.format(FORMATO_STRING_CAMPOS, campo.getTipoDeDado())))

					)
					.addAnnotation(AnnotationSourceGenerator.create(Indice.class).addParameter(
							"valor",
							VariableSourceGenerator.create(String.valueOf(campo.getSequencial()))));

			registro.addField(field);
		}

		registro.addField(VariableSourceGenerator
				.create(TypeDeclarationSourceGenerator.create(Long.class), "id")
				.addModifier(Modifier.PRIVATE)
				.addAnnotation(AnnotationSourceGenerator.create(Id.class))
				.addAnnotation(AnnotationSourceGenerator.create(Column.class)
						.addParameter("name",
								VariableSourceGenerator
										.create(String.format(FORMATO_STRING_CAMPOS, "ID")))
						.addParameter("columnDefinition", VariableSourceGenerator
								.create(String.format(FORMATO_STRING_CAMPOS, TIPO_DADO_ID)))));

		if (registroMetadados.isPossuiDataPart()) {
			registro.addField(VariableSourceGenerator
					.create(TypeDeclarationSourceGenerator.create(Date.class), "dataPart")
					.addModifier(Modifier.PRIVATE)
					.addAnnotation(AnnotationSourceGenerator.create(Column.class)
							.addParameter("name",
									VariableSourceGenerator.create(
											String.format(FORMATO_STRING_CAMPOS, "DATA_PART")))
							.addParameter("columnDefinition", VariableSourceGenerator
									.create(String.format(FORMATO_STRING_CAMPOS, "DATE")))

					));
		}

		if (registroMetadados.getOcorrencia().equals(TipoOcorrencia.MULTIPLA)) {
			var nomeColunaRegistroPai = String.format("%s%s_ID", PREFIXO_TABELAS,
					registroMetadados.getNomeRegistroPai());
			var nomeClasseRegistroPai =
					new StringBuilder(PREFIXO).append(registroMetadados.getNomeRegistroPai());

			registro.addField(VariableSourceGenerator
					.create(TypeDeclarationSourceGenerator.create(Long.class), "idRegistroPai")
					.addModifier(Modifier.PRIVATE)
					.addAnnotation(AnnotationSourceGenerator.create(Column.class)
							.addParameter("name", VariableSourceGenerator.create(
									String.format(FORMATO_STRING_CAMPOS, nomeColunaRegistroPai)))
							.addParameter("columnDefinition", VariableSourceGenerator
									.create(String.format(FORMATO_STRING_CAMPOS, TIPO_DADO_ID)))

					))
					.addField(VariableSourceGenerator
							.create(TypeDeclarationSourceGenerator
									.create(nomeClasseRegistroPai.toString()), "registroPai")
							.addModifier(Modifier.PRIVATE)
							.addAnnotation(AnnotationSourceGenerator.create(JoinColumn.class)
									.addParameter("name",
											VariableSourceGenerator.create(String.format(
													FORMATO_STRING_CAMPOS, nomeColunaRegistroPai)))
									.addParameter("insertable",
											VariableSourceGenerator.create("false"))
									.addParameter("updatable",
											VariableSourceGenerator.create("false"))
									.addParameter("foreignKey",
											VariableSourceGenerator.create(String.format(
													FORMATO_STRING_FK, registroMetadados.getNome(),
													registroMetadados.getNomeRegistroPai()))))
							.addAnnotation(AnnotationSourceGenerator.create(ManyToOne.class)
									.addParameter("targetEntity",
											VariableSourceGenerator.create(nomeClasseRegistroPai
													.append(".class").toString()))
									.addParameter("fetch", VariableSourceGenerator
											.create("javax.persistence.FetchType.LAZY"))));
		}
	}
}
