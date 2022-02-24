package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.enums.TipoOcorrencia;

public class RegistroMetadataFactory {
	private static final boolean possuiDataPart = true;
	private static List<Registro> registros = new ArrayList<>();

	private RegistroMetadataFactory() {
	}

	public static List<Registro> criaMetadados() {
		List<Campo> campos = new ArrayList<>();

		// ----- ######## 0000 ########
		campos.add(new Campo("COD_VER", "NUMBER(3,0)", 2));
		campos.add(new Campo("COD_FIN", "NUMBER(1,0)", 3));
		campos.add(new Campo("DT_INI", "DATE", 4)); // to_date(?, 'DD/MM/YYYY')
		campos.add(new Campo("DT_FIN", "DATE", 5));
		campos.add(new Campo("NOME", "VARCHAR2(100)", 6));
		campos.add(new Campo("CNPJ", "NUMBER(14,0)", 7));
		campos.add(new Campo("CPF", "NUMBER(11,0)", 8));
		campos.add(new Campo("UF", "VARCHAR2(2)", 9));
		campos.add(new Campo("IE", "VARCHAR2(14)", 10));
		campos.add(new Campo("COD_MUN", "NUMBER(7,0)", 11));
		campos.add(new Campo("IM", "VARCHAR2(255)", 12));
		campos.add(new Campo("SUFRAMA", "VARCHAR2(9)", 13));
		campos.add(new Campo("IND_PERFIL", "VARCHAR2(1)", 14));
		campos.add(new Campo("IND_ATIV", "NUMBER(1,0)", 15));
		registros.add(new Registro("0000", "0000", TipoOcorrencia.UNICA, List.copyOf(campos),
				possuiDataPart));
		campos.clear();

		// ----- ######## 0005 ########
		campos.add(new Campo("FANTASIA", "VARCHAR2(60)", 2));
		campos.add(new Campo("CEP", "NUMBER(8,0)", 3));
		campos.add(new Campo("END", "VARCHAR2(60)", 4));
		campos.add(new Campo("NUM", "VARCHAR2(10)", 5));
		campos.add(new Campo("COMPL", "VARCHAR2(60)", 6));
		campos.add(new Campo("BAIRRO", "VARCHAR2(60)", 7));
		campos.add(new Campo("FONE", "VARCHAR2(11)", 8));
		campos.add(new Campo("FAX", "VARCHAR2(11)", 9));
		campos.add(new Campo("EMAIL", "VARCHAR2(255)", 10));
		registros.add(new Registro("0005", "0000", TipoOcorrencia.UNICA, List.copyOf(campos),
				possuiDataPart));
		campos.clear();
		// ------------------------------------------------------------

		// ----- ######## 0015 ########
		campos.add(new Campo("UF_ST", "VARCHAR2(2)", 3));
		campos.add(new Campo("IE_ST", "VARCHAR2(14)", 4));
		registros.add(new Registro("0015", "0000", TipoOcorrencia.MULTIPLA, List.copyOf(campos),
				!possuiDataPart));
		campos.clear();
		// ------------------------------------------------------------

		// ----- ######## 0100 ########
		campos.add(new Campo("NOME", "VARCHAR2(100)", 2));
		campos.add(new Campo("CPF", "NUMBER(11,0)", 3));
		campos.add(new Campo("CRC", "VARCHAR2(15)", 4));
		campos.add(new Campo("CNPJ", "NUMBER(14,0)", 5));
		campos.add(new Campo("CEP", "NUMBER(8,0)", 6));
		campos.add(new Campo("END", "VARCHAR2(60)", 7));
		campos.add(new Campo("NUM", "VARCHAR2(10)", 8));
		campos.add(new Campo("COMPL", "VARCHAR2(60)", 9));
		campos.add(new Campo("BAIRRO", "VARCHAR2(60)", 10));
		campos.add(new Campo("FONE", "VARCHAR2(11)", 11));
		campos.add(new Campo("FAX", "VARCHAR2(11)", 12));
		campos.add(new Campo("EMAIL", "VARCHAR2(255)", 13));
		campos.add(new Campo("COD_MUN", "NUMBER(7,0)", 14));
		registros.add(new Registro("0100", "0000", TipoOcorrencia.UNICA, List.copyOf(campos),
				!possuiDataPart));
		campos.clear();
		// ------------------------------------------------------------

		// ----- ######## 0150 ########
		campos.add(new Campo("COD_PART", "VARCHAR2(60)", 3));
		campos.add(new Campo("NOME", "VARCHAR2(100)", 4));
		campos.add(new Campo("COD_PAIS", "NUMBER(5,0)", 5));
		campos.add(new Campo("CNPJ", "NUMBER(14,0)", 6));
		campos.add(new Campo("CPF", "NUMBER(11,0)", 7));
		campos.add(new Campo("IE", "VARCHAR2(14)", 8));
		campos.add(new Campo("COD_MUN", "NUMBER(7,0)", 9));
		campos.add(new Campo("SUFRAMA", "VARCHAR2(9)", 10));
		campos.add(new Campo("END", "VARCHAR2(60)", 11));
		campos.add(new Campo("NUM", "VARCHAR2(10)", 12));
		campos.add(new Campo("COMPL", "VARCHAR2(60)", 13));
		campos.add(new Campo("BAIRRO", "VARCHAR2(60)", 14));
		registros.add(new Registro("0150", "0000", TipoOcorrencia.MULTIPLA, List.copyOf(campos),
				possuiDataPart));
		campos.clear();
		// ------------------------------------------------------------

		// ----- ######## 0175 ########
		campos.add(new Campo("DT_ALT", "DATE", 3));
		campos.add(new Campo("NR_CAMPO", "VARCHAR2(2)", 4));
		campos.add(new Campo("CONT_ANT", "VARCHAR2(100)", 5));
		registros.add(new Registro("0175", "0150", TipoOcorrencia.MULTIPLA, List.copyOf(campos),
				!possuiDataPart));
		campos.clear();
		// ------------------------------------------------------------

		// ----- ######## 0190 ########
		campos.add(new Campo("UNID", "VARCHAR2(6)", 3));
		campos.add(new Campo("DESCR", "VARCHAR2(255)", 4));
		registros.add(new Registro("0190", "0000", TipoOcorrencia.MULTIPLA, List.copyOf(campos),
				!possuiDataPart));
		campos.clear();
		// ------------------------------------------------------------

		// ----- ######## 0200 ########
		campos.add(new Campo("COD_ITEM", "VARCHAR2(60)", 3));
		campos.add(new Campo("DESCR_ITEM", "VARCHAR2(255)", 4));
		campos.add(new Campo("COD_BARRA", "VARCHAR2(255)", 5));
		campos.add(new Campo("COD_ANT_ITEM", "VARCHAR2(60)", 6));
		campos.add(new Campo("UNID_INV", "VARCHAR2(6)", 7));
		campos.add(new Campo("TIPO_ITEM", "NUMBER(2,0)", 8));
		campos.add(new Campo("COD_NCM", "VARCHAR2(8)", 9));
		campos.add(new Campo("EX_IPI", "VARCHAR2(3)", 10));
		campos.add(new Campo("COD_GEN", "NUMBER(2,0)", 11));
		campos.add(new Campo("COD_LST", "VARCHAR2(5)", 12));
		campos.add(new Campo("ALIQ_ICMS", "NUMBER(6,0)", 13));
		campos.add(new Campo("CEST", "NUMBER(7,0)", 14));
		registros.add(new Registro("0200", "0000", TipoOcorrencia.MULTIPLA, List.copyOf(campos),
				possuiDataPart));
		campos.clear();
		// ------------------------------------------------------------

		// ----- ######## 0205 ########
		campos.add(new Campo("DESCR_ANT_ITEM", "VARCHAR2(255)", 3));
		campos.add(new Campo("DT_INI", "DATE", 4));
		campos.add(new Campo("DT_FIM", "DATE", 5));
		campos.add(new Campo("COD_ANT_ITEM", "VARCHAR2(60)", 6));
		registros.add(new Registro("0205", "0200", TipoOcorrencia.MULTIPLA, List.copyOf(campos),
				!possuiDataPart));
		campos.clear();
		// ------------------------------------------------------------

		// ----- ######## 0206 ########
		campos.add(new Campo("COD_COMB", "VARCHAR2(255)", 2));
		registros.add(new Registro("0206", "0200", TipoOcorrencia.MULTIPLA, List.copyOf(campos),
				!possuiDataPart));
		campos.clear();
		// ------------------------------------------------------------

		// ----- ######## 0220 ########
		campos.add(new Campo("UNID_CONV", "VARCHAR2(6)", 3));
		campos.add(new Campo("FAT_CONV", "NUMBER(19,6)", 4));
		registros.add(new Registro("0220", "0200", TipoOcorrencia.MULTIPLA, List.copyOf(campos),
				possuiDataPart));
		campos.clear();
		// ------------------------------------------------------------

		// ----- ######## 0300 ########
		campos.add(new Campo("COD_IND_BEM", "VARCHAR2(60)", 3));
		campos.add(new Campo("IDENT_MERC", "VARCHAR2(1)", 4));
		campos.add(new Campo("DESCR_ITEM", "VARCHAR2(255)", 5));
		campos.add(new Campo("COD_PRNC", "VARCHAR2(60)", 6));
		campos.add(new Campo("COD_CTA", "VARCHAR2(60)", 7));
		campos.add(new Campo("NR_PARC", "NUMBER(3,0)", 8));
		registros.add(new Registro("0300", "0000", TipoOcorrencia.MULTIPLA, List.copyOf(campos),
				possuiDataPart));
		campos.clear();
		// ------------------------------------------------------------

		// ----- ######## 0305 ########
		campos.add(new Campo("COD_CCUS", "VARCHAR2(60)", 2));
		campos.add(new Campo("FUNC", "VARCHAR2(255)", 3));
		campos.add(new Campo("VIDA_UTIL", "NUMBER(3,0)", 4));
		registros.add(new Registro("0305", "0300", TipoOcorrencia.UNICA, List.copyOf(campos),
				possuiDataPart));
		campos.clear();
		// ------------------------------------------------------------

		// ----- ######## 0400 ########
		campos.add(new Campo("COD_NAT", "VARCHAR2(10)", 3));
		campos.add(new Campo("DESCR_NAT", "VARCHAR2(255)", 4));
		registros.add(new Registro("0400", "0000", TipoOcorrencia.UNICA, List.copyOf(campos),
				!possuiDataPart));
		campos.clear();
		// ------------------------------------------------------------

		return registros;
	}
}
