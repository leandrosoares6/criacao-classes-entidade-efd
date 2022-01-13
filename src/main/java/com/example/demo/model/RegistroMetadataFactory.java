package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class RegistroMetadataFactory {
        private RegistroMetadataFactory() {}

        public static List<RegistroTest> criaMetadados() {
                List<RegistroTest> registros = new ArrayList<RegistroTest>();
                List<Campo> campos = new ArrayList<Campo>();

                // ----- ######## 0000 ########
                campos.add(new Campo("COD_VER", "to_number(?)", false, false, false, 2));
                campos.add(new Campo("COD_FIN", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("DT_INI", "to_date(?, 'DD/MM/YYYY')", false, true, false, 4));
                campos.add(new Campo("DT_FIN", "to_date(?, 'DD/MM/YYYY')", false, true, false, 5));
                campos.add(new Campo("NOME", "?", false, false, false, 6));
                campos.add(new Campo("CNPJ", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("CPF", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("UF", "?", false, false, false, 9));
                campos.add(new Campo("IE", "?", false, false, false, 10));
                campos.add(new Campo("COD_MUN", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("IM", "?", false, false, false, 12));
                campos.add(new Campo("SUFRAMA", "?", false, false, false, 13));
                campos.add(new Campo("IND_PERFIL", "?", false, false, false, 14));
                campos.add(new Campo("IND_ATIV", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 16));
                campos.add(new Campo("ID", "?", true, false, false, 100));
                registros.add(new RegistroTest("0000", "TAB_EFD_0000", List.copyOf(campos)));
                campos.clear();

                // ----- ######## 0005 ########
                campos.add(new Campo("FANTASIA", "?", false, false, false, 2));
                campos.add(new Campo("CEP", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("ENDERECO", "?", false, false, false, 4));
                campos.add(new Campo("NUMERO", "?", false, false, false, 5));
                campos.add(new Campo("COMPL", "?", false, false, false, 6));
                campos.add(new Campo("BAIRRO", "?", false, false, false, 7));
                campos.add(new Campo("FONE", "?", false, false, false, 8));
                campos.add(new Campo("FAX", "?", false, false, false, 9));
                campos.add(new Campo("EMAIL", "?", false, false, false, 10));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 11));
                campos.add(new Campo("ID", "?", true, false, false, 100));
                registros.add(new RegistroTest("0005", "TAB_EFD_0005", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0015 ########
                campos.add(new Campo("UF_ST", "?", false, false, false, 3));
                campos.add(new Campo("IE_ST", "?", false, false, false, 4));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("0015", "TAB_EFD_0015", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0100 ########
                campos.add(new Campo("NOME", "?", false, false, false, 2));
                campos.add(new Campo("CPF", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CRC", "?", false, false, false, 4));
                campos.add(new Campo("CNPJ", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("CEP", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("END", "?", false, false, false, 7));
                campos.add(new Campo("NUM", "?", false, false, false, 8));
                campos.add(new Campo("COMPL", "?", false, false, false, 9));
                campos.add(new Campo("BAIRRO", "?", false, false, false, 10));
                campos.add(new Campo("FONE", "?", false, false, false, 11));
                campos.add(new Campo("FAX", "?", false, false, false, 12));
                campos.add(new Campo("EMAIL", "?", false, false, false, 13));
                campos.add(new Campo("COD_MUN", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("ID", "?", true, false, false, 100));
                registros.add(new RegistroTest("0100", "TAB_EFD_0100", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0150 ########
                campos.add(new Campo("COD_PART", "?", false, false, false, 3));
                campos.add(new Campo("NOME", "?", false, false, false, 4));
                campos.add(new Campo("COD_PAIS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("CNPJ", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("CPF", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("IE", "?", false, false, false, 8));
                campos.add(new Campo("COD_MUN", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("SUFRAMA", "?", false, false, false, 10));
                campos.add(new Campo("END", "?", false, false, false, 11));
                campos.add(new Campo("NUM", "?", false, false, false, 12));
                campos.add(new Campo("COMPL", "?", false, false, false, 13));
                campos.add(new Campo("BAIRRO", "?", false, false, false, 14));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 15));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("0150", "TAB_EFD_0150", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0175 ########
                campos.add(new Campo("DT_ALT", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("NR_CAMPO", "?", false, false, false, 4));
                campos.add(new Campo("CONT_ANT", "?", false, false, false, 5));
                registros.add(new RegistroTest("0175", "TAB_EFD_0175", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0190 ########
                campos.add(new Campo("UNID", "?", false, false, false, 3));
                campos.add(new Campo("DESCR", "?", false, false, false, 4));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("0190", "TAB_EFD_0190", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0200 ########
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 3));
                campos.add(new Campo("DESCR_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("COD_BARRA", "?", false, false, false, 5));
                campos.add(new Campo("COD_ANT_ITEM", "?", false, false, false, 6));
                campos.add(new Campo("UNID_INV", "?", false, false, false, 7));
                campos.add(new Campo("TIPO_ITEM", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("COD_NCM", "?", false, false, false, 9));
                campos.add(new Campo("EX_IPI", "?", false, false, false, 10));
                campos.add(new Campo("COD_GEN", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("COD_LST", "?", false, false, false, 12));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("CEST", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 15));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("0200", "TAB_EFD_0200", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0205 ########
                campos.add(new Campo("DESCR_ANT_ITEM", "?", false, false, false, 3));
                campos.add(new Campo("DT_INI", "to_date(?, 'DD/MM/YYYY')", false, true, false, 4));
                campos.add(new Campo("DT_FIM", "to_date(?, 'DD/MM/YYYY')", false, true, false, 5));
                campos.add(new Campo("COD_ANT_ITEM", "?", false, false, false, 6));
                registros.add(new RegistroTest("0205", "TAB_EFD_0205", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0206 ########
                campos.add(new Campo("COD_COMB", "?", false, false, false, 2));
                registros.add(new RegistroTest("0206", "TAB_EFD_0206", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0210 ########
                campos.add(new Campo("COD_ITEM_COMP", "?", false, false, false, 3));
                campos.add(new Campo("QTD_COMP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("PERDA", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("0210", "TAB_EFD_0210", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0220 ########
                campos.add(new Campo("UNID_CONV", "?", false, false, false, 3));
                campos.add(new Campo("FAT_CONV", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 5));
                registros.add(new RegistroTest("0220", "TAB_EFD_0220", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0300 ########
                campos.add(new Campo("COD_IND_BEM", "?", false, false, false, 3));
                campos.add(new Campo("IDENT_MERC", "?", false, false, false, 4));
                campos.add(new Campo("DESCR_ITEM", "?", false, false, false, 5));
                campos.add(new Campo("COD_PRNC", "?", false, false, false, 6));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 7));
                campos.add(new Campo("NR_PARC", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("DATA_PART", "to_date(?,'YYYY/MM/DD HH24:MI:SS')", false, true,
                                true, 9));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("0300", "TAB_EFD_0300", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0305 ########
                campos.add(new Campo("COD_CCUS", "?", false, false, false, 2));
                campos.add(new Campo("FUNC", "?", false, false, false, 3));
                campos.add(new Campo("VIDA_UTIL", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 5));
                registros.add(new RegistroTest("0305", "TAB_EFD_0305", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0400 ########
                campos.add(new Campo("COD_NAT", "?", false, false, false, 3));
                campos.add(new Campo("DESCR_NAT", "?", false, false, false, 4));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("0400", "TAB_EFD_0400", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0450 ########
                campos.add(new Campo("COD_INF", "?", false, false, false, 3));
                campos.add(new Campo("TXT", "?", false, false, false, 4));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("0450", "TAB_EFD_0450", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0460 ########
                campos.add(new Campo("COD_OBS", "?", false, false, false, 3));
                campos.add(new Campo("TXT", "?", false, false, false, 4));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("0460", "TAB_EFD_0460", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0500 ########
                campos.add(new Campo("DT_ALT", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("COD_NAT_CC", "?", false, false, false, 4));
                campos.add(new Campo("IND_CTA", "?", false, false, false, 5));
                campos.add(new Campo("NIVEL", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 7));
                campos.add(new Campo("NOME_CTA", "?", false, false, false, 8));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("0500", "TAB_EFD_0500", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 0600 ########
                campos.add(new Campo("DT_ALT", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("COD_CCUS", "?", false, false, false, 4));
                campos.add(new Campo("CCUS", "?", false, false, false, 5));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("0600", "TAB_EFD_0600", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## B020 ########
                campos.add(new Campo("IND_OPER", "?", false, false, false, 3));
                campos.add(new Campo("IND_EMIT", "?", false, false, false, 4));
                campos.add(new Campo("COD_PART", "?", false, false, false, 5));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 6));
                campos.add(new Campo("COD_SIT", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("SER", "?", false, false, false, 8));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("CHV_NFE", "?", false, false, false, 10));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 11));
                campos.add(new Campo("COD_MUN_SERV", "?", false, false, false, 11));
                campos.add(new Campo("VL_CONT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_MAT_TERC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_SUB", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISNT_ISS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_DED_BC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_BC_ISS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_BC_ISS_RT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISS_RT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISS ", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("COD_INF_OBS", "to_number(?)", false, false, false, 2));
                registros.add(new RegistroTest("B020", "TAB_EFD_B020", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## B025 ########
                campos.add(new Campo("VL_CONT_P", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_BC_ISS_P", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("ALIQ_ISS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISS_P", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISNT_ISS_P", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("COD_SERV", "to_number(?)", false, false, false, 2));
                registros.add(new RegistroTest("B025", "TAB_EFD_B025", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## B030 ########

                campos.add(new Campo("COD_MOD", "?", false, false, false, 6));
                campos.add(new Campo("SER", "?", false, false, false, 8));
                campos.add(new Campo("NUM_DOC_INI", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("NUM_DOC_FIN", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 11));
                campos.add(new Campo("QTD_CANC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_CONT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISNT_ISS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_BC_ISS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("COD_INF_OBS", "to_number(?)", false, false, false, 2));
                registros.add(new RegistroTest("B030", "TAB_EFD_B030", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## B350 ########

                campos.add(new Campo("COD_CTD", "?", false, false, false, 6));
                campos.add(new Campo("CTA_ISS", "?", false, false, false, 8));
                campos.add(new Campo("CTA_COSIF", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("QTD_OCOR", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("COD_SERV", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                11));
                campos.add(new Campo("VL_CONT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_BC_ISS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("ALIQ_ISS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("COD_INF_OBS", "to_number(?)", false, false, false, 2));
                registros.add(new RegistroTest("B350", "TAB_EFD_B350", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## B420 ########
                campos.add(new Campo("VL_CONT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_BC_ISS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("ALIQ_ISS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISNT_ISS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("COD_SERV", "to_number(?)", false, false, false, 2));
                registros.add(new RegistroTest("B420", "TAB_EFD_B420", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## B440 ########
                campos.add(new Campo("IND_OPER", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("COD_PART", "?", false, false, false, 5));
                campos.add(new Campo("VL_CONT_RT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_BC_ISS_RT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISS_RT", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("B440", "TAB_EFD_B440", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## B460 ########
                campos.add(new Campo("IND_DED", "?", false, false, false, 5));
                campos.add(new Campo("VL_DED", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("NUM_PROC", "?", false, false, false, 5));
                campos.add(new Campo("IND_PROC", "?", false, false, false, 5));
                campos.add(new Campo("PROC", "?", false, false, false, 5));
                campos.add(new Campo("COD_INF_OBS", "?", false, false, false, 5));
                campos.add(new Campo("IND_OBR", "?", false, false, false, 5));
                registros.add(new RegistroTest("B460", "TAB_EFD_B460", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## B470 ########
                campos.add(new Campo("VL_CONT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_MAT_TERC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_MAT_PROP", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_SUB", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISNT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_DED_BC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_BC_ISS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_BC_ISS_RT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISS ", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISS_RT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_DED", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISS_REC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISS_ST", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ISS_REC_UNI", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("B470", "TAB_EFD_B470", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## B500 ########
                campos.add(new Campo("VL_REC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("QTD_PROF", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OR", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("B500", "TAB_EFD_B500", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## B510 ########
                campos.add(new Campo("IND_PROF", "?", false, false, false, 5));
                campos.add(new Campo("IND_ESC", "?", false, false, false, 5));
                campos.add(new Campo("IND_SOC", "?", false, false, false, 5));
                campos.add(new Campo("CPF", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("NOME", "?", false, false, false, 100));
                registros.add(new RegistroTest("B510", "TAB_EFD_B510", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C100 ########
                campos.add(new Campo("IND_OPER", "?", false, false, false, 3));
                campos.add(new Campo("IND_EMIT", "?", false, false, false, 4));
                campos.add(new Campo("COD_PART", "?", false, false, false, 5));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 6));
                campos.add(new Campo("COD_SIT", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("SER", "?", false, false, false, 8));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("CHV_NFE", "?", false, false, false, 10));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 11));
                campos.add(new Campo("DT_E_S", "to_date(?, 'DD/MM/YYYY')", false, true, false, 12));
                campos.add(new Campo("VL_DOC", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("IND_PGTO", "?", false, false, false, 14));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_ABAT_NT", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_MERC", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("IND_FRT", "?", false, false, false, 18));
                campos.add(new Campo("VL_FRT", "to_number(?)", false, false, false, 19));
                campos.add(new Campo("VL_SEG", "to_number(?)", false, false, false, 20));
                campos.add(new Campo("VL_OUT_DA", "to_number(?)", false, false, false, 21));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 22));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 23));
                campos.add(new Campo("VL_BC_ICMS_ST", "to_number(?)", false, false, false, 24));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 25));
                campos.add(new Campo("VL_IPI", "to_number(?)", false, false, false, 26));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 27));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 28));
                campos.add(new Campo("VL_PIS_ST", "to_number(?)", false, false, false, 29));
                campos.add(new Campo("VL_COFINS_ST", "to_number(?)", false, false, false, 30));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 31));
                campos.add(new Campo("TCN_ID_NFE", "to_number(?)", false, false, false, 32));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("C100", "TAB_EFD_C100", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C101 ########
                campos.add(new Campo("VL_FCP_UF_DEST", "to_number(?)", false, false, false, 2));
                campos.add(new Campo("VL_ICMS_UF_DEST", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("VL_ICMS_UF_REM", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 5));
                registros.add(new RegistroTest("C101", "TAB_EFD_C101", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C105 ########
                campos.add(new Campo("OPER", "to_number(?)", false, false, false, 2));
                campos.add(new Campo("UF", "?", false, false, false, 3));
                registros.add(new RegistroTest("C105", "TAB_EFD_C105", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C110 ########
                campos.add(new Campo("COD_INF", "?", false, false, false, 3));
                campos.add(new Campo("TXT_COMPL", "?", false, false, false, 4));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 5));
                registros.add(new RegistroTest("C110", "TAB_EFD_C110", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C111 ########
                campos.add(new Campo("NUM_PROC", "?", false, false, false, 3));
                campos.add(new Campo("IND_PROC", "?", false, false, false, 4));
                registros.add(new RegistroTest("C111", "TAB_EFD_C111", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C112 ########
                campos.add(new Campo("COD_DA", "?", false, false, false, 3));
                campos.add(new Campo("UF", "?", false, false, false, 4));
                campos.add(new Campo("NUM_DA", "?", false, false, false, 5));
                campos.add(new Campo("COD_AUT", "?", false, false, false, 6));
                campos.add(new Campo("VL_DA", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("DT_VCTO", "to_date(?, 'DD/MM/YYYY')", false, true, false, 8));
                campos.add(new Campo("DT_PGTO", "to_date(?, 'DD/MM/YYYY')", false, true, false, 9));
                registros.add(new RegistroTest("C112", "TAB_EFD_C112", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C113 ########
                campos.add(new Campo("IND_OPER", "?", false, false, false, 3));
                campos.add(new Campo("IND_EMIT", "?", false, false, false, 4));
                campos.add(new Campo("COD_PART", "?", false, false, false, 5));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 6));
                campos.add(new Campo("SER", "?", false, false, false, 7));
                campos.add(new Campo("SUB", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 10));
                campos.add(new Campo("CHV_DOCE", "?", false, false, false, 11));
                registros.add(new RegistroTest("C113", "TAB_EFD_C113", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C114 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("ECF_FAB", "?", false, false, false, 4));
                campos.add(new Campo("ECF_CX", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 7));
                registros.add(new RegistroTest("C114", "TAB_EFD_C114", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C115 ########
                campos.add(new Campo("IND_CARGA", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CNPJ_COL", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("IE_COL", "?", false, false, false, 5));
                campos.add(new Campo("CPF_COL", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("COD_MUN_COL", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("CNPJ_ENTG", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("IE_ENTG", "?", false, false, false, 9));
                campos.add(new Campo("CPF_ENTG", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("COD_MUN_ENTG", "to_number(?)", false, false, false, 11));
                registros.add(new RegistroTest("C115", "TAB_EFD_C115", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C116 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("NR_SAT", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("CHV_CFE", "?", false, false, false, 5));
                campos.add(new Campo("NUM_CFE", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 7));
                registros.add(new RegistroTest("C116", "TAB_EFD_C116", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C120 ########
                campos.add(new Campo("COD_DOC_IMP", "?", false, false, false, 3));
                campos.add(new Campo("NUM_DOC_IMP", "?", false, false, false, 4));
                campos.add(new Campo("PIS_IMP", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("COFINS_IMP", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("NUM_ACDRAW", "?", false, false, false, 7));
                registros.add(new RegistroTest("C120", "TAB_EFD_C120", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C130 ########
                campos.add(new Campo("VL_SERV_NT", "to_number(?)", false, false, false, 2));
                campos.add(new Campo("VL_BC_ISSQN", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("VL_ISSQN", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("VL_BC_IRRF", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_IRRF", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_PREV", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_PREV", "to_number(?)", false, false, false, 8));
                registros.add(new RegistroTest("C130", "TAB_EFD_C130", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C140 ########
                campos.add(new Campo("IND_EMIT", "?", false, false, false, 2));
                campos.add(new Campo("IND_TIT", "?", false, false, false, 3));
                campos.add(new Campo("DESC_TIT", "?", false, false, false, 4));
                campos.add(new Campo("NUM_TIT", "?", false, false, false, 5));
                campos.add(new Campo("QTD_PARC", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_TIT", "to_number(?)", false, false, false, 7));
                registros.add(new RegistroTest("C140", "TAB_EFD_C140", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C141 ########
                campos.add(new Campo("NUM_PARC", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("DT_VCTO", "to_date(?, 'DD/MM/YYYY')", false, true, false, 4));
                campos.add(new Campo("VL_PARC", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("C141", "TAB_EFD_C141", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C160 ########
                campos.add(new Campo("COD_PART", "?", false, false, false, 2));
                campos.add(new Campo("VEIC_ID", "?", false, false, false, 3));
                campos.add(new Campo("QTD_VOL", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("PESO_BRT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("PESO_LIQ", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("UF_ID", "?", false, false, false, 7));
                registros.add(new RegistroTest("C160", "TAB_EFD_C160", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C165 ########
                campos.add(new Campo("COD_PART", "?", false, false, false, 3));
                campos.add(new Campo("VEIC_ID", "?", false, false, false, 4));
                campos.add(new Campo("COD_AUT", "?", false, false, false, 5));
                campos.add(new Campo("NR_PASSE", "?", false, false, false, 6));
                campos.add(new Campo("HORA", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("TEMPER", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("QTD_VOL", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("PESO_BRT", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("PESO_LIQ", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("NOM_MOT", "?", false, false, false, 12));
                campos.add(new Campo("CPF", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("UF_ID", "?", false, false, false, 14));
                registros.add(new RegistroTest("C165", "TAB_EFD_C165", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C170 ########
                // nome, valor (? ou to_number(?)), ehID, ehData, data_part, seq)
                campos.add(new Campo("NUM_ITEM", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("DESC_COMPL", "?", false, false, false, 5));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("UNID", "?", false, false, false, 7));
                campos.add(new Campo("VL_ITEM", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("IND_MOV", "?", false, false, false, 10));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("COD_NAT", "?", false, false, false, 13));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_BC_ICMS_ST", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("ALIQ_ST", "to_number(?)", false, false, false, 18));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 19));
                campos.add(new Campo("IND_APUR", "?", false, false, false, 20));
                campos.add(new Campo("CST_IPI", "?", false, false, false, 21));
                campos.add(new Campo("COD_ENQ", "?", false, false, false, 22));
                campos.add(new Campo("VL_BC_IPI", "to_number(?)", false, false, false, 23));
                campos.add(new Campo("ALIQ_IPI", "to_number(?)", false, false, false, 24));
                campos.add(new Campo("VL_IPI", "to_number(?)", false, false, false, 25));
                campos.add(new Campo("CST_PIS", "to_number(?)", false, false, false, 26));
                campos.add(new Campo("VL_BC_PIS", "to_number(?)", false, false, false, 27));
                campos.add(new Campo("ALIQ_PIS_P", "to_number(?)", false, false, false, 28));
                campos.add(new Campo("QUANT_BC_PIS", "to_number(?)", false, false, false, 29));
                campos.add(new Campo("ALIQ_PIS_R", "to_number(?)", false, false, false, 30));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 31));
                campos.add(new Campo("CST_COFINS", "to_number(?)", false, false, false, 32));
                campos.add(new Campo("VL_BC_COFINS", "to_number(?)", false, false, false, 33));
                campos.add(new Campo("ALIQ_COFINS_P", "to_number(?)", false, false, false, 34));
                campos.add(new Campo("QUANT_BC_COFINS", "to_number(?)", false, false, false, 35));
                campos.add(new Campo("ALIQ_COFINS_R", "to_number(?)", false, false, false, 36));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 37));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 38));
                campos.add(new Campo("VL_ABAT_NT", "to_number(?)", false, false, false, 39));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 40));
                registros.add(new RegistroTest("C170", "TAB_EFD_C170", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C171 ########
                campos.add(new Campo("NUM_TANQUE", "?", false, false, false, 3));
                campos.add(new Campo("QTDE", "to_number(?)", false, false, false, 4));
                registros.add(new RegistroTest("C171", "TAB_EFD_C171", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C172 ########
                campos.add(new Campo("VL_BC_ISSQN", "to_number(?)", false, false, false, 2));
                campos.add(new Campo("ALIQ_ISSQN", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("VL_ISSQN", "to_number(?)", false, false, false, 4));
                registros.add(new RegistroTest("C172", "TAB_EFD_C172", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C173 ########
                campos.add(new Campo("LOTE_MED", "?", false, false, false, 3));
                campos.add(new Campo("QTD_ITEM", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("DT_FAB", "to_date(?, 'DD/MM/YYYY')", false, true, false, 5));
                campos.add(new Campo("DT_VAL", "to_date(?, 'DD/MM/YYYY')", false, true, false, 6));
                campos.add(new Campo("IND_MED", "?", false, false, false, 7));
                campos.add(new Campo("TP_PROD", "?", false, false, false, 8));
                campos.add(new Campo("VL_TAB_MAX", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 10));
                registros.add(new RegistroTest("C173", "TAB_EFD_C173", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C174 ########
                campos.add(new Campo("IND_ARM", "?", false, false, false, 3));
                campos.add(new Campo("NUM_ARM", "?", false, false, false, 4));
                campos.add(new Campo("DESCR_COMPL", "?", false, false, false, 5));
                registros.add(new RegistroTest("C174", "TAB_EFD_C174", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C175 ########
                campos.add(new Campo("IND_VEIC_OPER", "?", false, false, false, 3));
                campos.add(new Campo("CNPJ", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("UF", "?", false, false, false, 5));
                campos.add(new Campo("CHASSI_VEIC", "?", false, false, false, 6));
                registros.add(new RegistroTest("C175", "TAB_EFD_C175", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C176 ########
                // nome, valor (? ou to_number(?), ehID, ehData, data_part, seq)
                campos.add(new Campo("COD_MOD_ULT_E", "?", false, false, false, 3));
                campos.add(new Campo("NUM_DOC_ULT_E", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("SER_ULT_E", "?", false, false, false, 5));
                campos.add(new Campo("DT_ULT_E", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                6));
                campos.add(new Campo("COD_PART_ULT_E", "?", false, false, false, 7));
                campos.add(new Campo("QUANT_ULT_E", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_UNIT_ULT_E", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_UNIT_BC_ST", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("CHAVE_NFE_ULT_E", "?", false, false, false, 11));
                campos.add(new Campo("NUM_ITEM_ULT_E", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("VL_UNIT_BC_ICMS_ULT_E", "to_number(?)", false, false, false,
                                13));
                campos.add(new Campo("ALIQ_ICMS_ULT_E", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_UNIT_LIMITE_BC_ICMS_ULT_E", "to_number(?)", false, false,
                                false, 15));
                campos.add(new Campo("VL_UNIT_ICMS_ULT_E", "to_number(?)", false, false, false,
                                16));
                campos.add(new Campo("ALIQ_ST_ULT_E", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("VL_UNIT_RES", "to_number(?)", false, false, false, 18));
                campos.add(new Campo("COD_RESP_RET", "to_number(?)", false, false, false, 19));
                campos.add(new Campo("COD_MOT_RES", "to_number(?)", false, false, false, 20));
                campos.add(new Campo("CHAVE_NFE_RET", "?", false, false, false, 21));
                campos.add(new Campo("COD_PART_NFE_RET", "?", false, false, false, 22));
                campos.add(new Campo("SER_NFE_RET", "?", false, false, false, 23));
                campos.add(new Campo("NUM_NFE_RET", "to_number(?)", false, false, false, 24));
                campos.add(new Campo("ITEM_NFE_RET", "to_number(?)", false, false, false, 25));
                campos.add(new Campo("COD_DA", "?", false, false, false, 26));
                campos.add(new Campo("NUM_DA", "?", false, false, false, 27));
                campos.add(new Campo("VL_UNIT_RES_FCP_ST", "to_number(?)", false, false, false,
                                28));
                registros.add(new RegistroTest("C176", "TAB_EFD_C176 ", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C177 ########
                // campos.add(new Campo("COD_SELO_IPI", "?", false, false, false, 2));
                // campos.add(new Campo("QT_SELO_IPI", "to_number(?)", false, false, false, 3));
                // //saiu no novo leuaite. Atualizado jan 2020
                campos.add(new Campo("COD_INF_ITEM", "?", false, false, false, 2));
                registros.add(new RegistroTest("C177", "TAB_EFD_C177", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C178 ########
                campos.add(new Campo("CL_ENQ", "?", false, false, false, 2));
                campos.add(new Campo("VL_UNID", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("QUANT_PAD", "to_number(?)", false, false, false, 4));
                registros.add(new RegistroTest("C178", "TAB_EFD_C178", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C179 ########
                campos.add(new Campo("BC_ST_ORIG_DEST", "to_number(?)", false, false, false, 2));
                campos.add(new Campo("ICMS_ST_REP", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("ICMS_ST_COMPL", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("BC_RET", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("ICMS_RET", "to_number(?)", false, false, false, 6));
                registros.add(new RegistroTest("C179", "TAB_EFD_C179", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C186 ########
                campos.add(new Campo("NUM_ITEM", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("COD_MOT_REST_COMPL", "?", false, false, false, 7));
                campos.add(new Campo("QUANT_CONV", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("UNID", "?", false, false, false, 9));
                campos.add(new Campo("COD_MOD_ENTRADA", "?", false, false, false, 10));
                campos.add(new Campo("SERIE_ENTRADA", "?", false, false, false, 11));
                campos.add(new Campo("NUM_DOC_ENTRADA", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("CHV_DFE_ENTRADA", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("DT_DOC_ENTRADA", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("NUM_ITEM_ENTRADA", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_UNIT_CONV_ENTRADA", "to_number(?)", false, false, false,
                                13));
                campos.add(new Campo("VL_UNIT_ICMS_OP_CONV_ENTRADA", "to_number(?)", false, false,
                                false, 13));
                campos.add(new Campo("VL_UNIT_BC_ICMS_ST_CONV_ENTRADA", "to_number(?)", false,
                                false, false, 13));
                campos.add(new Campo("VL_UNIT_ICMS_ST_CONV_ENTRADA", "to_number(?)", false, false,
                                false, 13));
                campos.add(new Campo("VL_UNIT_FCP_ST_CONV_ENTRADA", "to_number(?)", false, false,
                                false, 13));
                registros.add(new RegistroTest("C186", "TAB_EFD_C186", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C190 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_BC_ICMS_ST", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_RED_BC", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_IPI", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 13));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 14));
                registros.add(new RegistroTest("C190", "TAB_EFD_C190", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C191 ########
                campos.add(new Campo("VL_FCP_OP", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("VL_FCP_ST", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("VL_FCP_RET", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("C191", "TAB_EFD_c191", List.copyOf(campos)));
                campos.clear();
                // --------------------------------------------------------------------------------------------------

                // ----- ######## C195 ########
                campos.add(new Campo("COD_OBS", "?", false, false, false, 3));
                campos.add(new Campo("TXT_COMPL", "?", false, false, false, 4));
                registros.add(new RegistroTest("C195", "TAB_EFD_C195", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C197 ########
                campos.add(new Campo("COD_AJ", "?", false, false, false, 3));
                campos.add(new Campo("DESCR_COMPL_AJ", "?", false, false, false, 4));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 5));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_OUTROS", "to_number(?)", false, false, false, 9));
                registros.add(new RegistroTest("C197", "TAB_EFD_C197", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C300 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("SER", "?", false, false, false, 4));
                campos.add(new Campo("SUB", "?", false, false, false, 5));
                campos.add(new Campo("NUM_DOC_INI", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("NUM_DOC_FIN", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 8));
                campos.add(new Campo("VL_DOC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 12));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 13));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("C300", "TAB_EFD_C300", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C310 ########
                campos.add(new Campo("NUM_DOC_CANC", "to_number(?)", false, false, false, 3));
                registros.add(new RegistroTest("C310", "TAB_EFD_C310", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C320 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OPER", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_RED_BC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 10));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 11));
                registros.add(new RegistroTest("C320", "TAB_EFD_C320", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C321 ########
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 3));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("UNID", "?", false, false, false, 5));
                campos.add(new Campo("VL_ITEM", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 12));
                registros.add(new RegistroTest("C321", "TAB_EFD_C321", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C330 ########
                campos.add(new Campo("COD_MOT_REST_COMPL", "?", false, false, false, 5));
                campos.add(new Campo("QUANT_CONV", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("UNID", "?", false, false, false, 5));
                campos.add(new Campo("VL_UNIT_CONV", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_NA_OPERACAO_CONV", "to_number(?)", false, false,
                                false, 7));
                campos.add(new Campo("VL_UNIT_ICMS_OP_CONV", "to_number(?)", false, false, false,
                                8));
                campos.add(new Campo("VL_UNIT_ICMS_OP_ESTOQUE_CONV", "to_number(?)", false, false,
                                false, 9));
                campos.add(new Campo("VL_UNIT_ICMS_ST_ESTOQUE_CONV", "to_number(?)", false, false,
                                false, 10));
                campos.add(new Campo("VL_UNIT_FCP_ICMS_ST_ESTOQUE_CONV", "to_number(?)", false,
                                false, false, 11));
                campos.add(new Campo("VL_UNIT_ICMS_ST_CONV_REST", "to_number(?)", false, false,
                                false, 11));
                campos.add(new Campo("VL_UNIT_FCP_ST_CONV_REST", "to_number(?)", false, false,
                                false, 11));
                campos.add(new Campo("VL_UNIT_ICMS_ST_CONV_COMPL", "to_number(?)", false, false,
                                false, 11));
                campos.add(new Campo("VL_UNIT_FCP_ST_CONV_COMPL", "to_number(?)", false, false,
                                false, 11));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 12));
                registros.add(new RegistroTest("C330", "TAB_EFD_C330", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C350 ########
                campos.add(new Campo("SER", "?", false, false, false, 3));
                campos.add(new Campo("SUB_SER", "?", false, false, false, 4));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 6));
                campos.add(new Campo("CNPJ_CPF", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_MERC", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_DOC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 13));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("C350", "TAB_EFD_C350", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C370 ########
                campos.add(new Campo("NUM_ITEM", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("UNID", "?", false, false, false, 6));
                campos.add(new Campo("VL_ITEM", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 8));
                registros.add(new RegistroTest("C370", "TAB_EFD_C370", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C380 ########
                campos.add(new Campo("COD_MOT_REST_COMPL", "?", false, false, false, 5));
                campos.add(new Campo("QUANT_CONV", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("UNID", "?", false, false, false, 5));
                campos.add(new Campo("VL_UNIT_CONV", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_NA_OPERACAO_CONV", "to_number(?)", false, false,
                                false, 7));
                campos.add(new Campo("VL_UNIT_ICMS_OP_CONV", "to_number(?)", false, false, false,
                                8));
                campos.add(new Campo("VL_UNIT_ICMS_OP_ESTOQUE_CONV", "to_number(?)", false, false,
                                false, 9));
                campos.add(new Campo("VL_UNIT_ICMS_ST_ESTOQUE_CONV", "to_number(?)", false, false,
                                false, 10));
                campos.add(new Campo("VL_UNIT_FCP_ICMS_ST_ESTOQUE_CONV", "to_number(?)", false,
                                false, false, 11));
                campos.add(new Campo("VL_UNIT_ICMS_ST_CONV_REST", "to_number(?)", false, false,
                                false, 11));
                campos.add(new Campo("VL_UNIT_FCP_ST_CONV_REST", "to_number(?)", false, false,
                                false, 11));
                campos.add(new Campo("VL_UNIT_ICMS_ST_CONV_COMPL", "to_number(?)", false, false,
                                false, 11));
                campos.add(new Campo("VL_UNIT_FCP_ST_CONV_COMPL", "to_number(?)", false, false,
                                false, 11));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 12));
                registros.add(new RegistroTest("C380", "TAB_EFD_C380", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C390 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_RED_BC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 10));
                registros.add(new RegistroTest("C390", "TAB_EFD_C390", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C400 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("ECF_MOD", "?", false, false, false, 4));
                campos.add(new Campo("ECF_FAB", "?", false, false, false, 5));
                campos.add(new Campo("ECF_CX", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("C400", "TAB_EFD_C400", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C405 ########
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("CRO", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("CRZ", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("NUM_DOC_FIN", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("GT_FIN", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_BRT", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 9));
                registros.add(new RegistroTest("C405", "TAB_EFD_C405", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C410 ########
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 2));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 3));
                registros.add(new RegistroTest("C410", "TAB_EFD_C410", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C420 ########
                campos.add(new Campo("COD_TOT_PAR", "?", false, false, false, 3));
                campos.add(new Campo("VLR_ACUM_TOT", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("NR_TOT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("DESC_NR_TOT", "?", false, false, false, 6));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 7));
                registros.add(new RegistroTest("C420", "TAB_EFD_C420", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C425 ########
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 3));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("UNID", "?", false, false, false, 5));
                campos.add(new Campo("VL_ITEM", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 9));
                registros.add(new RegistroTest("C425", "TAB_EFD_C425", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C430 ########
                campos.add(new Campo("COD_MOT_REST_COMPL", "?", false, false, false, 4));
                campos.add(new Campo("QUANT_CONV", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("UNID", "?", false, false, false, 4));
                campos.add(new Campo("VL_UNIT_CONV", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_NA_OPERACAO_CONV", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_OP_CONV", "to_number(?)", false, false, false,
                                6));
                campos.add(new Campo("VL_UNIT_ICMS_OP_ESTOQUE_CONV", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_ST_ESTOQUE_CONV", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_FCP_ICMS_ST_ESTOQUE_CONV", "to_number(?)", false,
                                false, false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_ST_CONV_REST", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_FCP_ST_CONV_REST", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_ST_CONV_COMPL", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_FCP_ST_CONV_COMPL", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 6));
                registros.add(new RegistroTest("C430", "TAB_EFD_C430", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------------------

                // ----- ######## C460 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("COD_SIT", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 6));
                campos.add(new Campo("VL_DOC", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("CPFCNPJ", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("NOM_ADQ", "?", false, false, false, 11));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 12));
                registros.add(new RegistroTest("C460", "TAB_EFD_C460", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C465 ########
                campos.add(new Campo("CHV_CFE", "?", false, false, false, 2));
                campos.add(new Campo("NUM_CCF", "to_number(?)", false, false, false, 3));
                registros.add(new RegistroTest("C465", "TAB_EFD_C465", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C470 ########
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 3));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("QTD_CANC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("UNID", "?", false, false, false, 6));
                campos.add(new Campo("VL_ITEM", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 13));
                registros.add(new RegistroTest("C470", "TAB_EFD_C470", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C480 ########
                campos.add(new Campo("COD_MOT_REST_COMPL", "?", false, false, false, 4));
                campos.add(new Campo("QUANT_CONV", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("UNID", "?", false, false, false, 4));
                campos.add(new Campo("VL_UNIT_CONV", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_NA_OPERACAO_CONV", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_OP_CONV", "to_number(?)", false, false, false,
                                6));
                campos.add(new Campo("VL_UNIT_ICMS_OP_ESTOQUE_CONV", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_ST_ESTOQUE_CONV", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_FCP_ICMS_ST_ESTOQUE_CONV", "to_number(?)", false,
                                false, false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_ST_CONV_REST", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_FCP_ST_CONV_REST", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_ST_CONV_COMPL", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_FCP_ST_CONV_COMPL", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 6));
                registros.add(new RegistroTest("C480", "TAB_EFD_C480", List.copyOf(campos)));
                campos.clear();
                // ---------------------------------------------------------------------------------------------

                // ----- ######## C490 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 9));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 10));
                registros.add(new RegistroTest("C490", "TAB_EFD_C490", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C495 ########
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("QTD_CANC", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("UNID", "?", false, false, false, 7));
                campos.add(new Campo("VL_ITEM", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_CANC", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_ACMO", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_ISEN", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_NT", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("C495", "TAB_EFD_C495", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C500 ########
                campos.add(new Campo("IND_OPER", "?", false, false, false, 3));
                campos.add(new Campo("IND_EMIT", "?", false, false, false, 4));
                campos.add(new Campo("COD_PART", "?", false, false, false, 5));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 6));
                campos.add(new Campo("COD_SIT", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("SER", "?", false, false, false, 8));
                campos.add(new Campo("SUB", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("COD_CONS", "?", false, false, false, 10));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 12));
                campos.add(new Campo("DT_E_S", "to_date(?, 'DD/MM/YYYY')", false, true, false, 13));
                campos.add(new Campo("VL_DOC", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_FORN", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_SERV_NT", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("VL_TERC", "to_number(?)", false, false, false, 18));
                campos.add(new Campo("VL_DA", "to_number(?)", false, false, false, 19));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 20));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 21));
                campos.add(new Campo("VL_BC_ICMS_ST", "to_number(?)", false, false, false, 22));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 23));
                campos.add(new Campo("COD_INF", "?", false, false, false, 24));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 25));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 26));
                campos.add(new Campo("TP_LIGACAO", "to_number(?)", false, false, false, 27));
                campos.add(new Campo("COD_GRUPO_TENSAO", "?", false, false, false, 28));
                campos.add(new Campo("CHV_DOCE", "?", false, false, false, 29));
                campos.add(new Campo("FIN_DOCE", "to_number(?)", false, false, false, 30));
                campos.add(new Campo("CHV_DOCE_REF", "?", false, false, false, 31));
                campos.add(new Campo("IND_DEST", "to_number(?)", false, false, false, 32));
                campos.add(new Campo("COD_MUN_DEST", "to_number(?)", false, false, false, 33));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 34));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("C500", "TAB_EFD_C500", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C510 ########
                campos.add(new Campo("NUM_ITEM", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("COD_CLASS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("UNID", "?", false, false, false, 7));
                campos.add(new Campo("VL_ITEM", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_BC_ICMS_ST", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("ALIQ_ST", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("IND_REC", "?", false, false, false, 18));
                campos.add(new Campo("COD_PART", "?", false, false, false, 19));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 20));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 21));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 22));
                registros.add(new RegistroTest("C510", "TAB_EFD_C510", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C590 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_BC_ICMS_ST", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_RED_BC", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 12));
                registros.add(new RegistroTest("C590", "TAB_EFD_C590", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C591 ########
                campos.add(new Campo("VL_FCP_OP", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("VL_FCP_ST", "to_number(?)", false, false, false, 4));
                registros.add(new RegistroTest("C591", "TAB_EFD_c591", List.copyOf(campos)));
                campos.clear();
                // --------------------------------------------------------------------------------------------------

                // ----- ######## C595 ########
                campos.add(new Campo("COD_OBS", "?", false, false, false, 6));
                campos.add(new Campo("TXT_COMPL", "?", false, false, false, 4));
                registros.add(new RegistroTest("C595", "TAB_EFD_C595", List.copyOf(campos)));
                campos.clear();
                // --------------------------------------------------------------------------------------------------

                // ----- ######## C597 ########
                campos.add(new Campo("COD_AJ", "?", false, false, false, 3));
                campos.add(new Campo("DESCR_COMPL_AJ", "?", false, false, false, 4));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 5));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_OUTROS", "to_number(?)", false, false, false, 9));
                registros.add(new RegistroTest("C597", "TAB_EFD_C597", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C600 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("COD_MUN", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("SER", "?", false, false, false, 5));
                campos.add(new Campo("SUB", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("COD_CONS", "?", false, false, false, 7));
                campos.add(new Campo("QTD_CONS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("QTD_CANC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 10));
                campos.add(new Campo("VL_DOC", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("CONS", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_FORN", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_SERV_NT", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_TERC", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_DA", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 18));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 19));
                campos.add(new Campo("VL_BC_ICMS_ST", "to_number(?)", false, false, false, 20));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 21));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 22));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 23));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("C600", "TAB_EFD_C600", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C601 ########
                campos.add(new Campo("NUM_DOC_CANC", "to_number(?)", false, false, false, 3));
                registros.add(new RegistroTest("C601", "TAB_EFD_C601", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C610 ########
                campos.add(new Campo("COD_CLASS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("UNID", "?", false, false, false, 6));
                campos.add(new Campo("VL_ITEM", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_BC_ICMS_ST", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 18));
                registros.add(new RegistroTest("C610", "TAB_EFD_C610", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C690 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_RED_BC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_BC_ICMS_ST", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 12));
                registros.add(new RegistroTest("C690", "TAB_EFD_C690", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C700 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("SER", "?", false, false, false, 4));
                campos.add(new Campo("NRO_ORD_INI", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("NRO_ORD_FIN", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("DT_DOC_INI", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                7));
                campos.add(new Campo("DT_DOC_FIN", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                8));
                campos.add(new Campo("NOM_MEST", "?", false, false, false, 9));
                campos.add(new Campo("CHV_COD_DIG", "?", false, false, false, 10));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("C700", "TAB_EFD_C700", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C790 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_BC_ICMS_ST", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_RED_BC", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 12));
                registros.add(new RegistroTest("C790", "TAB_EFD_C790", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C791 ########
                campos.add(new Campo("UF", "?", false, false, false, 3));
                campos.add(new Campo("VL_BC_ICMS_ST", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("C791", "TAB_EFD_C791", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C800 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("COD_SIT", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("NUM_CFE", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 6));
                campos.add(new Campo("VL_CFE", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("CNPJ_CPF", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("NR_SAT", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("CHV_CFE", "?", false, false, false, 12));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_MERC", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_OUT_DA", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_PIS_ST", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("VL_COFINS_ST", "to_number(?)", false, false, false, 18));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("C800", "TAB_EFD_C800", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C810 ########
                campos.add(new Campo("NUM_ITEM", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("QTDE", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("UNID", "?", false, false, false, 6));
                campos.add(new Campo("VL_ITEM", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 9));
                registros.add(new RegistroTest("C810", "TAB_EFD_C810", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C815 ########
                campos.add(new Campo("COD_MOT_REST_COMPL", "?", false, false, false, 5));
                campos.add(new Campo("QUANT_CONV", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("UNID", "?", false, false, false, 5));
                campos.add(new Campo("VL_UNIT_CONV", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_NA_OPERACAO_CONV", "to_number(?)", false, false,
                                false, 7));
                campos.add(new Campo("VL_UNIT_ICMS_OP_CONV", "to_number(?)", false, false, false,
                                8));
                campos.add(new Campo("VL_UNIT_ICMS_OP_ESTOQUE_CONV", "to_number(?)", false, false,
                                false, 9));
                campos.add(new Campo("VL_UNIT_ICMS_ST_ESTOQUE_CONV", "to_number(?)", false, false,
                                false, 10));
                campos.add(new Campo("VL_UNIT_FCP_ICMS_ST_ESTOQUE_CONV", "to_number(?)", false,
                                false, false, 11));
                campos.add(new Campo("VL_UNIT_ICMS_ST_CONV_REST", "to_number(?)", false, false,
                                false, 11));
                campos.add(new Campo("VL_UNIT_FCP_ST_CONV_REST", "to_number(?)", false, false,
                                false, 11));
                campos.add(new Campo("VL_UNIT_ICMS_ST_CONV_COMPL", "to_number(?)", false, false,
                                false, 11));
                campos.add(new Campo("VL_UNIT_FCP_ST_CONV_COMPL", "to_number(?)", false, false,
                                false, 11));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 12));
                registros.add(new RegistroTest("C815", "TAB_EFD_C815", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C850 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 9));
                registros.add(new RegistroTest("C850", "TAB_EFD_C850", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C860 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("NR_SAT", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 5));
                campos.add(new Campo("DOC_INI", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("DOC_FIM", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("C860", "TAB_EFD_C860", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C870 ########
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 3));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("UNID", "?", false, false, false, 6));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 13));
                registros.add(new RegistroTest("C870", "TAB_EFD_C870", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## C880 ########
                campos.add(new Campo("COD_MOT_REST_COMPL", "?", false, false, false, 4));
                campos.add(new Campo("QUANT_CONV", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("UNID", "?", false, false, false, 4));
                campos.add(new Campo("VL_UNIT_CONV", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_NA_OPERACAO_CONV", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_BC_ICMS_ST_ESTOQUE_CONV", "to_number(?)", false,
                                false, false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_ST_ESTOQUE_CONV", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_FCP_ICMS_ST_ESTOQUE_CONV", "to_number(?)", false,
                                false, false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_ST_CONV_REST", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_FCP_ST_CONV_REST", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_ICMS_ST_CONV_COMPL", "to_number(?)", false, false,
                                false, 6));
                campos.add(new Campo("VL_UNIT_FCP_ST_CONV_COMPL", "to_number(?)", false, false,
                                false, 6));
                registros.add(new RegistroTest("C880", "TAB_EFD_C880", List.copyOf(campos)));
                campos.clear();
                // ---------------------------------------------------------------------------------------------

                // ----- ######## C890 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 9));
                registros.add(new RegistroTest("C890", "TAB_EFD_C890", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D100 ########
                campos.add(new Campo("IND_OPER", "?", false, false, false, 3));
                campos.add(new Campo("IND_EMIT", "?", false, false, false, 4));
                campos.add(new Campo("COD_PART", "?", false, false, false, 5));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 6));
                campos.add(new Campo("COD_SIT", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("SER", "?", false, false, false, 8));
                campos.add(new Campo("SUB", "?", false, false, false, 9));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("CHV_CTE", "?", false, false, false, 11));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 12));
                campos.add(new Campo("DT_A_P", "to_date(?, 'DD/MM/YYYY')", false, true, false, 13));
                campos.add(new Campo("TP_CT_E", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("CHV_CTE_REF", "?", false, false, false, 15));
                campos.add(new Campo("VL_DOC", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("IND_FRT", "?", false, false, false, 18));
                campos.add(new Campo("VL_SERV", "to_number(?)", false, false, false, 19));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 20));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 21));
                campos.add(new Campo("VL_NT", "to_number(?)", false, false, false, 22));
                campos.add(new Campo("COD_INF", "?", false, false, false, 23));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 24));
                campos.add(new Campo("COD_MUN_ORIG", "to_number(?)", false, false, false, 25));
                campos.add(new Campo("COD_MUN_DEST", "to_number(?)", false, false, false, 26));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 27));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("D100", "TAB_EFD_D100", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D101 ########
                campos.add(new Campo("VL_FCP_UF_DEST", "to_number(?)", false, false, false, 2));
                campos.add(new Campo("VL_ICMS_UF_DEST", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("VL_ICMS_UF_REM", "to_number(?)", false, false, false, 4));
                registros.add(new RegistroTest("D101", "TAB_EFD_D101", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D110 ########
                campos.add(new Campo("NUM_ITEM", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("VL_SERV", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OUT", "to_number(?)", false, false, false, 6));
                registros.add(new RegistroTest("D110", "TAB_EFD_D110", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D120 ########
                campos.add(new Campo("COD_MUN_ORIG", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_MUN_DEST", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("VEIC_ID", "?", false, false, false, 5));
                campos.add(new Campo("UF_ID", "?", false, false, false, 6));
                registros.add(new RegistroTest("D120", "TAB_EFD_D120", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D130 ########
                campos.add(new Campo("COD_PART_CONSG", "?", false, false, false, 3));
                campos.add(new Campo("COD_PART_RED", "?", false, false, false, 4));
                campos.add(new Campo("IND_FRT_RED", "?", false, false, false, 5));
                campos.add(new Campo("COD_MUN_ORIG", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("COD_MUN_DEST", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VEIC_ID", "?", false, false, false, 8));
                campos.add(new Campo("VL_LIQ_FRT", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_SEC_CAT", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_DESP", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_PEDG", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("VL_OUT", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_FRT", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("UF_ID", "?", false, false, false, 15));
                registros.add(new RegistroTest("D130", "TAB_EFD_D130", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D140 ########
                campos.add(new Campo("COD_PART_CONSG", "?", false, false, false, 2));
                campos.add(new Campo("COD_MUN_ORIG", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_MUN_DEST", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("IND_VEIC", "?", false, false, false, 5));
                campos.add(new Campo("VEIC_ID", "?", false, false, false, 6));
                campos.add(new Campo("IND_NAV", "?", false, false, false, 7));
                campos.add(new Campo("VIAGEM", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_FRT_LIQ", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_DESP_PORT", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_DESP_CAR_DESC", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_OUT", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("VL_FRT_BRT", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_FRT_MM", "to_number(?)", false, false, false, 14));
                registros.add(new RegistroTest("D140", "TAB_EFD_D140", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D150 ########
                campos.add(new Campo("COD_MUN_ORIG", "to_number(?)", false, false, false, 2));
                campos.add(new Campo("COD_MUN_DEST", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("VEIC_ID", "?", false, false, false, 4));
                campos.add(new Campo("VIAGEM", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("IND_TFA", "?", false, false, false, 6));
                campos.add(new Campo("VL_PESO_TX", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_TX_TERR", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_TX_RED", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_OUT", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_TX_ADV", "to_number(?)", false, false, false, 11));
                registros.add(new RegistroTest("D150", "TAB_EFD_D150", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D160 ########
                campos.add(new Campo("DESPACHO", "?", false, false, false, 3));
                campos.add(new Campo("CNPJ_CPF_REM", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("IE_REM", "?", false, false, false, 5));
                campos.add(new Campo("COD_MUN_ORI", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("CNPJ_CPF_DEST", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("IE_DEST", "?", false, false, false, 8));
                campos.add(new Campo("COD_MUN_DEST", "to_number(?)", false, false, false, 9));
                registros.add(new RegistroTest("D160", "TAB_EFD_D160", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D161 ########
                campos.add(new Campo("IND_CARGA", "to_number(?)", false, false, false, 2));
                campos.add(new Campo("CNPJ_CPF_COL", "?", false, false, false, 3));
                campos.add(new Campo("IE_COL", "?", false, false, false, 4));
                campos.add(new Campo("COD_MUN_COL", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("CNPJ_CPF_ENTG", "?", false, false, false, 6));
                campos.add(new Campo("IE_ENTG", "?", false, false, false, 7));
                campos.add(new Campo("COD_MUN_ENTG", "to_number(?)", false, false, false, 8));
                registros.add(new RegistroTest("D161", "TAB_EFD_D161", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D162 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("SER", "?", false, false, false, 4));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 6));
                campos.add(new Campo("VL_DOC", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_MERC", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("QTD_VOL", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("PESO_BRT", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("PESO_LIQ", "to_number(?)", false, false, false, 11));
                registros.add(new RegistroTest("D162", "TAB_EFD_D162", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D170 ########
                campos.add(new Campo("COD_PART_CONSG", "?", false, false, false, 2));
                campos.add(new Campo("COD_PART_RED", "?", false, false, false, 3));
                campos.add(new Campo("COD_MUN_ORIG", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("COD_MUN_DEST", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("OTM", "?", false, false, false, 6));
                campos.add(new Campo("IND_NAT_FRT", "?", false, false, false, 7));
                campos.add(new Campo("VL_LIQ_FRT", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_GRIS", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_PDG", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_OUT", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_FRT", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("VEIC_ID", "?", false, false, false, 13));
                campos.add(new Campo("UF_ID", "?", false, false, false, 14));
                registros.add(new RegistroTest("D170", "TAB_EFD_D170", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D180 ########
                campos.add(new Campo("NUM_SEQ", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("IND_EMIT", "?", false, false, false, 4));
                campos.add(new Campo("CNPJ_CPF_EMIT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("UF_EMIT", "?", false, false, false, 6));
                campos.add(new Campo("IE_EMIT", "?", false, false, false, 7));
                campos.add(new Campo("COD_MUN_ORIG", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("CNPJ_CPF_TOM", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("UF_TOM", "?", false, false, false, 10));
                campos.add(new Campo("IE_TOM", "?", false, false, false, 11));
                campos.add(new Campo("COD_MUN_DEST", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 13));
                campos.add(new Campo("SER", "?", false, false, false, 14));
                campos.add(new Campo("SUB", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 17));
                campos.add(new Campo("VL_DOC", "to_number(?)", false, false, false, 18));
                registros.add(new RegistroTest("D180", "TAB_EFD_D180", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D190 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_RED_BC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 10));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 11));
                registros.add(new RegistroTest("D190", "TAB_EFD_D190", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D195 ########
                campos.add(new Campo("COD_OBS", "?", false, false, false, 3));
                campos.add(new Campo("TXT_COMPL", "?", false, false, false, 4));
                registros.add(new RegistroTest("D195", "TAB_EFD_D195", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D197 ########
                campos.add(new Campo("COD_AJ", "?", false, false, false, 3));
                campos.add(new Campo("DESCR_COMPL_AJ", "?", false, false, false, 4));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 5));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_OUTROS", "to_number(?)", false, false, false, 9));
                registros.add(new RegistroTest("D197", "TAB_EFD_D197", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D300 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("SER", "?", false, false, false, 4));
                campos.add(new Campo("SUB", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("NUM_DOC_INI", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("NUM_DOC_FIN", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 11));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_SERV", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_SEG", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_OUTDESP", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 18));
                campos.add(new Campo("VL_RED_BC", "to_number(?)", false, false, false, 19));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 20));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 21));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("D300", "TAB_EFD_D300", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D301 ########
                campos.add(new Campo("NUM_DOC_CANC", "to_number(?)", false, false, false, 3));
                registros.add(new RegistroTest("D301", "TAB_EFD_D301", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D310 ########
                campos.add(new Campo("COD_MUN_ORIG", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("VL_SERV", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 6));
                registros.add(new RegistroTest("D310", "TAB_EFD_D310", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D350 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("ECF_MOD", "?", false, false, false, 4));
                campos.add(new Campo("ECF_FAB", "?", false, false, false, 5));
                campos.add(new Campo("ECF_CX", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("D350", "TAB_EFD_D350", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D355 ########
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("CRO", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("CRZ", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("NUM_COO_FIN", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("GT_FIN", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_BRT", "to_number(?)", false, false, false, 8));
                registros.add(new RegistroTest("D355", "TAB_EFD_D355", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D360 ########
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 2));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 3));
                registros.add(new RegistroTest("D360", "TAB_EFD_D360", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D365 ########
                campos.add(new Campo("COD_TOT_PAR", "?", false, false, false, 3));
                campos.add(new Campo("VLR_ACUM_TOT", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("NR_TOT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("DESCR_NR_TOT", "?", false, false, false, 6));
                registros.add(new RegistroTest("D365", "TAB_EFD_D365", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D370 ########
                campos.add(new Campo("COD_MUN_ORIG", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("VL_SERV", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("QTD_BILH", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 7));
                registros.add(new RegistroTest("D370", "TAB_EFD_D370", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D390 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ISSQN", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("ALIQ_ISSQN", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_ISSQN", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 12));
                registros.add(new RegistroTest("D390", "TAB_EFD_D390", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D400 ########
                campos.add(new Campo("COD_PART", "?", false, false, false, 3));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 4));
                campos.add(new Campo("COD_SIT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("SER", "?", false, false, false, 6));
                campos.add(new Campo("SUB", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 9));
                campos.add(new Campo("VL_DOC", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_SERV", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 17));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("D400", "TAB_EFD_D400", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D410 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("SER", "?", false, false, false, 4));
                campos.add(new Campo("SUB", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("NUM_DOC_INI", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("NUM_DOC_FIN", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 8));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_SERV", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 16));
                registros.add(new RegistroTest("D410", "TAB_EFD_D410", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D411 ########
                campos.add(new Campo("NUM_DOC_CANC", "to_number(?)", false, false, false, 3));
                registros.add(new RegistroTest("D411", "TAB_EFD_D411", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D420 ########
                campos.add(new Campo("COD_MUN_ORIG", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("VL_SERV", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 6));
                registros.add(new RegistroTest("D420", "TAB_EFD_D420", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D500 ########
                campos.add(new Campo("IND_OPER", "?", false, false, false, 3));
                campos.add(new Campo("IND_EMIT", "?", false, false, false, 4));
                campos.add(new Campo("COD_PART", "?", false, false, false, 5));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 6));
                campos.add(new Campo("COD_SIT", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("SER", "?", false, false, false, 8));
                campos.add(new Campo("SUB", "?", false, false, false, 9));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 11));
                campos.add(new Campo("DT_A_P", "to_date(?, 'DD/MM/YYYY')", false, true, false, 12));
                campos.add(new Campo("VL_DOC", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_SERV", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_SERV_NT", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_TERC", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("VL_DA", "to_number(?)", false, false, false, 18));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 19));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 20));
                campos.add(new Campo("COD_INF", "?", false, false, false, 21));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 22));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 23));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 24));
                campos.add(new Campo("TP_ASSINANTE", "to_number(?)", false, false, false, 25));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("D500", "TAB_EFD_D500", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D510 ########
                campos.add(new Campo("NUM_ITEM", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("COD_CLASS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("UNID", "?", false, false, false, 7));
                campos.add(new Campo("VL_ITEM", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_BC_ICMS_UF", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_ICMS_UF", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("IND_REC", "?", false, false, false, 17));
                campos.add(new Campo("COD_PART", "?", false, false, false, 18));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 19));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 20));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 21));
                registros.add(new RegistroTest("D510", "TAB_EFD_D510", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D530 ########
                campos.add(new Campo("IND_SERV", "?", false, false, false, 3));
                campos.add(new Campo("DT_INI_SERV", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                4));
                campos.add(new Campo("DT_FIN_SERV", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                5));
                campos.add(new Campo("PER_FISCAL", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("COD_AREA", "?", false, false, false, 7));
                campos.add(new Campo("TERMINAL", "to_number(?)", false, false, false, 8));
                registros.add(new RegistroTest("D530", "TAB_EFD_D530", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D590 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_BC_ICMS_UF", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_ICMS_UF", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_RED_BC", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 12));
                registros.add(new RegistroTest("D590", "TAB_EFD_D590", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D600 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("COD_MUN", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("SER", "?", false, false, false, 5));
                campos.add(new Campo("SUB", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("COD_CONS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("QTD_CONS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 9));
                campos.add(new Campo("VL_DOC", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_SERV", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("VL_SERV_NT", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_TERC", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_DA", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 18));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 19));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("D600", "TAB_EFD_D600", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D610 ########
                campos.add(new Campo("COD_CLASS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("UNID", "?", false, false, false, 6));
                campos.add(new Campo("VL_ITEM", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_BC_ICMS_UF", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_ICMS_UF", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_RED_BC", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 18));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 19));
                registros.add(new RegistroTest("D610", "TAB_EFD_D610", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D690 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_BC_ICMS_UF", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_ICMS_UF", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_RED_BC", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 12));
                registros.add(new RegistroTest("D690", "TAB_EFD_D690", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D695 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("SER", "?", false, false, false, 4));
                campos.add(new Campo("NRO_ORD_INI", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("NRO_ORD_FIN", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("DT_DOC_INI", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                7));
                campos.add(new Campo("DT_DOC_FIN", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                8));
                campos.add(new Campo("NOM_MEST", "?", false, false, false, 9));
                campos.add(new Campo("CHV_COD_DIG", "?", false, false, false, 10));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("D695", "TAB_EFD_D695", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D696 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OPR", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_BC_ICMS_UF", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_ICMS_UF", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_RED_BC", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("COD_OBS", "?", false, false, false, 12));
                registros.add(new RegistroTest("D696", "TAB_EFD_D696", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## D697 ########
                campos.add(new Campo("UF", "?", false, false, false, 3));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("D697", "TAB_EFD_D697", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E100 ########
                campos.add(new Campo("DT_INI", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("DT_FIN", "to_date(?, 'DD/MM/YYYY')", false, true, false, 4));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("E100", "TAB_EFD_E100", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E110 ########
                campos.add(new Campo("VL_TOT_DEBITOS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("VL_AJ_DEBITOS", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("VL_TOT_AJ_DEBITOS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ESTORNOS_CRED", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_TOT_CREDITOS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_AJ_CREDITOS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_TOT_AJ_CREDITOS", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_ESTORNOS_DEB", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_SLD_CREDOR_ANT", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_SLD_APURADO", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("VL_TOT_DED", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_ICMS_RECOLHER", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_SLD_CREDOR_TRANSPORTAR", "to_number(?)", false, false,
                                false, 15));
                campos.add(new Campo("DEB_ESP", "to_number(?)", false, false, false, 16));
                registros.add(new RegistroTest("E110", "TAB_EFD_E110", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E111 ########
                campos.add(new Campo("COD_AJ_APUR", "?", false, false, false, 3));
                campos.add(new Campo("DESCR_COMPL_AJ", "?", false, false, false, 4));
                campos.add(new Campo("VL_AJ_APUR", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("E111", "TAB_EFD_E111", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E112 ########
                campos.add(new Campo("NUM_DA", "?", false, false, false, 3));
                campos.add(new Campo("NUM_PROC", "?", false, false, false, 4));
                campos.add(new Campo("IND_PROC", "?", false, false, false, 5));
                campos.add(new Campo("PROC", "?", false, false, false, 6));
                campos.add(new Campo("TXT_COMPL", "?", false, false, false, 7));
                registros.add(new RegistroTest("E112", "TAB_EFD_E112", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E113 ########
                campos.add(new Campo("COD_PART", "?", false, false, false, 3));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 4));
                campos.add(new Campo("SER", "?", false, false, false, 5));
                campos.add(new Campo("SUB", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 8));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 9));
                campos.add(new Campo("VL_AJ_ITEM", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("CHV_DOCE", "?", false, false, false, 11));
                registros.add(new RegistroTest("E113", "TAB_EFD_E113", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E115 ########
                campos.add(new Campo("COD_INF_ADIC", "?", false, false, false, 3));
                campos.add(new Campo("VL_INF_ADIC", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("DESCR_COMPL_AJ", "?", false, false, false, 5));
                registros.add(new RegistroTest("E115", "TAB_EFD_E115", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E116 ########
                campos.add(new Campo("COD_OR", "?", false, false, false, 3));
                campos.add(new Campo("VL_OR", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("DT_VCTO", "to_date(?, 'DD/MM/YYYY')", false, true, false, 5));
                campos.add(new Campo("COD_REC", "?", false, false, false, 6));
                campos.add(new Campo("NUM_PROC", "?", false, false, false, 7));
                campos.add(new Campo("IND_PROC", "?", false, false, false, 8));
                campos.add(new Campo("PROC", "?", false, false, false, 9));
                campos.add(new Campo("TXT_COMPL", "?", false, false, false, 10));
                campos.add(new Campo("MES_REF", "to_number(?)", false, false, false, 11));
                registros.add(new RegistroTest("E116", "TAB_EFD_E116", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E200 ########
                campos.add(new Campo("UF", "?", false, false, false, 3));
                campos.add(new Campo("DT_INI", "to_date(?, 'DD/MM/YYYY')", false, true, false, 4));
                campos.add(new Campo("DT_FIM", "to_date(?, 'DD/MM/YYYY')", false, true, false, 5));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("E200", "TAB_EFD_E200", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E210 ########
                campos.add(new Campo("IND_MOV_ST", "?", false, false, false, 3));
                campos.add(new Campo("VL_SLD_CRED_ANT_ST", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("VL_DEVOL_ST", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_RESSARC_ST", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_OUT_CRED_ST", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_AJ_CREDITOS_ST", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_RETENCAO_ST", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_OUT_DEB_ST", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_AJ_DEBITOS_ST", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_SLD_DEV_ANT_ST", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("VL_DEDUCOES_ST", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_ICMS_RECOL_ST", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_SLD_CRED_ST_TRANSPORTAR", "to_number(?)", false, false,
                                false, 15));
                campos.add(new Campo("DEB_ESP_ST", "to_number(?)", false, false, false, 16));
                registros.add(new RegistroTest("E210", "TAB_EFD_E210", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E220 ########
                campos.add(new Campo("COD_AJ_APUR", "?", false, false, false, 3));
                campos.add(new Campo("DESCR_COMPL_AJ", "?", false, false, false, 4));
                campos.add(new Campo("VL_AJ_APUR", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("E220", "TAB_EFD_E220", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E230 ########
                campos.add(new Campo("NUM_DA", "?", false, false, false, 3));
                campos.add(new Campo("NUM_PROC", "?", false, false, false, 4));
                campos.add(new Campo("IND_PROC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("PROC", "?", false, false, false, 6));
                campos.add(new Campo("TXT_COMPL", "?", false, false, false, 7));
                registros.add(new RegistroTest("E230", "TAB_EFD_E230", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E240 ########
                campos.add(new Campo("COD_PART", "?", false, false, false, 3));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 4));
                campos.add(new Campo("SER", "?", false, false, false, 5));
                campos.add(new Campo("SUB", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 8));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 9));
                campos.add(new Campo("VL_AJ_ITEM", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("CHV_DOCE", "?", false, false, false, 11));
                registros.add(new RegistroTest("E240", "TAB_EFD_E240", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E250 ########
                campos.add(new Campo("COD_OR", "?", false, false, false, 3));
                campos.add(new Campo("VL_OR", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("DT_VCTO", "to_date(?, 'DD/MM/YYYY')", false, true, false, 5));
                campos.add(new Campo("COD_REC", "?", false, false, false, 6));
                campos.add(new Campo("NUM_PROC", "?", false, false, false, 7));
                campos.add(new Campo("IND_PROC", "?", false, false, false, 8));
                campos.add(new Campo("PROC", "?", false, false, false, 9));
                campos.add(new Campo("TXT_COMPL", "?", false, false, false, 10));
                campos.add(new Campo("MES_REF", "to_number(?)", false, false, false, 11));
                registros.add(new RegistroTest("E250", "TAB_EFD_E250", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E300 ########
                campos.add(new Campo("UF", "?", false, false, false, 3));
                campos.add(new Campo("DT_INI", "to_date(?, 'DD/MM/YYYY')", false, true, false, 4));
                campos.add(new Campo("DT_FIN", "to_date(?, 'DD/MM/YYYY')", false, true, false, 5));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("E300", "TAB_EFD_E300", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E310 ########
                campos.add(new Campo("IND_MOV_FCP_DIFAL", "?", false, false, false, 3));
                campos.add(new Campo("VL_SLD_CRED_ANT_DIFAL", "to_number(?)", false, false, false,
                                4));
                campos.add(new Campo("VL_TOT_DEBITOS_DIFAL", "to_number(?)", false, false, false,
                                5));
                campos.add(new Campo("VL_OUT_DEB_DIFAL", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_TOT_CREDITOS_DIFAL", "to_number(?)", false, false, false,
                                7));
                campos.add(new Campo("VL_OUT_CRED_DIFAL", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_SLD_DEV_ANT_DIFAL", "to_number(?)", false, false, false,
                                9));
                campos.add(new Campo("VL_DEDUCOES_DIFAL", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_RECOL_DIFAL", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_SLD_CRED_TRANSPORTAR_DIFAL", "to_number(?)", false, false,
                                false, 12));
                campos.add(new Campo("DEB_ESP_DIFAL", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_SLD_CRED_ANT_FCP", "to_number(?)", false, false, false,
                                14));
                campos.add(new Campo("VL_TOT_DEB_FCP", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_OUT_DEB_FCP", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_TOT_CRED_FCP", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("VL_OUT_CRED_FCP", "to_number(?)", false, false, false, 18));
                campos.add(new Campo("VL_SLD_DEV_ANT_FCP", "to_number(?)", false, false, false,
                                19));
                campos.add(new Campo("VL_DEDUCOES_FCP", "to_number(?)", false, false, false, 20));
                campos.add(new Campo("VL_RECOL_FCP", "to_number(?)", false, false, false, 21));
                campos.add(new Campo("VL_SLD_CRED_TRANSPORTAR_FCP", "to_number(?)", false, false,
                                false, 22));
                campos.add(new Campo("DEB_ESP_FCP", "to_number(?)", false, false, false, 23));
                registros.add(new RegistroTest("E310", "TAB_EFD_E310", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E311 ########
                campos.add(new Campo("COD_AJ_APUR", "?", false, false, false, 3));
                campos.add(new Campo("DESCR_COMPL_AJ", "?", false, false, false, 4));
                campos.add(new Campo("VL_AJ_APUR", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("E311", "TAB_EFD_E311", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E312 ########
                campos.add(new Campo("NUM_DA", "?", false, false, false, 3));
                campos.add(new Campo("NUM_PROC", "?", false, false, false, 4));
                campos.add(new Campo("IND_PROC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("PROC", "?", false, false, false, 6));
                campos.add(new Campo("TXT_COMPL", "?", false, false, false, 7));
                registros.add(new RegistroTest("E312", "TAB_EFD_E312", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E313 ########
                campos.add(new Campo("COD_PART", "?", false, false, false, 3));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 4));
                campos.add(new Campo("SER", "?", false, false, false, 5));
                campos.add(new Campo("SUB", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("CHV_DOCE", "?", false, false, false, 8));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 9));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 10));
                campos.add(new Campo("VL_AJ_ITEM", "to_number(?)", false, false, false, 11));
                registros.add(new RegistroTest("E313", "TAB_EFD_E313", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E316 ########
                campos.add(new Campo("COD_OR", "?", false, false, false, 3));
                campos.add(new Campo("VL_OR", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("DT_VCTO", "to_date(?, 'DD/MM/YYYY')", false, true, false, 5));
                campos.add(new Campo("COD_REC", "?", false, false, false, 6));
                campos.add(new Campo("NUM_PROC", "?", false, false, false, 7));
                campos.add(new Campo("IND_PROC", "?", false, false, false, 8));
                campos.add(new Campo("PROC", "?", false, false, false, 9));
                campos.add(new Campo("TXT_COMPL", "?", false, false, false, 10));
                campos.add(new Campo("MES_REF", "to_number(?)", false, false, false, 11));
                registros.add(new RegistroTest("E316", "TAB_EFD_E316", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E500 ########
                campos.add(new Campo("IND_APUR", "?", false, false, false, 3));
                campos.add(new Campo("DT_INI", "to_date(?, 'DD/MM/YYYY')", false, true, false, 4));
                campos.add(new Campo("DT_FIN", "to_date(?, 'DD/MM/YYYY')", false, true, false, 5));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("E500", "TAB_EFD_E500", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E510 ########
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("CST_IPI", "?", false, false, false, 4));
                campos.add(new Campo("VL_CONT_IPI", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_BC_IPI", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_IPI", "to_number(?)", false, false, false, 7));
                registros.add(new RegistroTest("E510", "TAB_EFD_E510", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E520 ########
                campos.add(new Campo("VL_SD_ANT_IPI", "to_number(?)", false, false, false, 2));
                campos.add(new Campo("VL_DEB_IPI", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("VL_CRED_IPI", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("VL_OD_IPI", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_OC_IPI", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_SC_IPI", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_SD_IPI", "to_number(?)", false, false, false, 8));
                registros.add(new RegistroTest("E520", "TAB_EFD_E520", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E530 ########
                campos.add(new Campo("IND_AJ", "?", false, false, false, 3));
                campos.add(new Campo("VL_AJ", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("COD_AJ", "?", false, false, false, 5));
                campos.add(new Campo("IND_DOC", "?", false, false, false, 6));
                campos.add(new Campo("NUM_DOC", "?", false, false, false, 7));
                campos.add(new Campo("DESCR_AJ", "?", false, false, false, 8));
                registros.add(new RegistroTest("E530", "TAB_EFD_E530", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## E531 ########
                campos.add(new Campo("COD_PART", "?", false, false, false, 3));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 4));
                campos.add(new Campo("SER", "?", false, false, false, 5));
                campos.add(new Campo("SUB", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 8));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 8));
                campos.add(new Campo("VL_AJ_ITEM", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("CHV_ITEM", "?", false, false, false, 8));
                registros.add(new RegistroTest("E531",
                                "TAB_EFD_E531 (COD_PART, COD_MOD, SER, SUB, NUM_DOC, DT_DOC, COD_ITEM, VL_AJ_ITEM, CHV_ITEM) "
                                                + " VALUES (?, ?, ?, to_number(?), to_number(?), ?, ?, to_number(?), ?)",
                                campos));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## G110 ########
                campos.add(new Campo("DT_INI", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("DT_FIN", "to_date(?, 'DD/MM/YYYY')", false, true, false, 4));
                campos.add(new Campo("SALDO_IN_ICMS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("SOM_PARC", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_TRIB_EXP", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_TOTAL", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("IND_PER_SAI", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("ICMS_APROP", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("SOM_ICMS_OC", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("G110", "TAB_EFD_G110", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## G125 ########
                campos.add(new Campo("COD_IND_BEM", "?", false, false, false, 3));
                campos.add(new Campo("DT_MOV", "to_date(?, 'DD/MM/YYYY')", false, true, false, 4));
                campos.add(new Campo("TIPO_MOV", "?", false, false, false, 5));
                campos.add(new Campo("VL_IMOB_ICMS_OP", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_IMOB_ICMS_ST", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_IMOB_ICMS_FRT", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_IMOB_ICMS_DIF", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("NUM_PARC", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_PARC_PASS", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("DATA_PART", "?", false, true, true, 12));
                registros.add(new RegistroTest("G125", "TAB_EFD_G125", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## G126 ########
                campos.add(new Campo("DT_INI", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("DT_FIM", "to_date(?, 'DD/MM/YYYY')", false, true, false, 4));
                campos.add(new Campo("NUM_PARC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_PARC_PASS", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_TRIB_OC", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_TOTAL", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("IND_PER_SAI", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_PARC_APROP", "to_number(?)", false, false, false, 10));
                registros.add(new RegistroTest("G126", "TAB_EFD_G126", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## G130 ########
                campos.add(new Campo("IND_EMIT", "?", false, false, false, 3));
                campos.add(new Campo("COD_PART", "?", false, false, false, 4));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 5));
                campos.add(new Campo("SERIE", "?", false, false, false, 6));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("CHV_NFE_CTE", "?", false, false, false, 8));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 9));
                campos.add(new Campo("NUM_DA", "to_date(?, 'DD/MM/YYYY')", false, true, false, 10));
                registros.add(new RegistroTest("G130", "TAB_EFD_G130", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## G140 ########
                campos.add(new Campo("NUM_ITEM", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("QTDE", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("UNID", "?", false, false, false, 6));
                campos.add(new Campo("VL_ICMS_OP_APLICADO", "to_number(?)", false, false, false,
                                7));
                campos.add(new Campo("VL_ICMS_ST_APLICADO", "to_number(?)", false, false, false,
                                8));
                campos.add(new Campo("VL_ICMS_FRT_APLICADO", "to_number(?)", false, false, false,
                                9));
                campos.add(new Campo("VL_ICMS_DIF_APLICADO", "to_number(?)", false, false, false,
                                10));
                registros.add(new RegistroTest("G140", "TAB_EFD_G140", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## H005 ########
                campos.add(new Campo("DT_INV", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("VL_INV", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("MOT_INV", "?", false, false, false, 5));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("H005", "TAB_EFD_H005", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## H010 ########
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 3));
                campos.add(new Campo("UNID", "?", false, false, false, 4));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_UNIT", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_ITEM", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("IND_PROP", "?", false, false, false, 8));
                campos.add(new Campo("COD_PART", "?", false, false, false, 9));
                campos.add(new Campo("TXT_COMPL", "?", false, false, false, 10));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 11));
                campos.add(new Campo("VL_ITEM_IR", "to_number(?)", false, false, false, 12));
                registros.add(new RegistroTest("H010", "TAB_EFD_H010", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## H020 ########
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("BC_ICMS", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("H020", "TAB_EFD_H020", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## H030 ########
                campos.add(new Campo("VL_ICMS_OP", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_BC_ICMS_ST", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_FCP", "to_number(?)", false, false, false, 10));
                registros.add(new RegistroTest("H030", "TAB_EFD_H030", List.copyOf(campos)));
                campos.clear();
                // -------------------------------------------------------------------

                // ----- ######## K100 ########
                campos.add(new Campo("DT_INI", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("DT_FIN", "to_date(?, 'DD/MM/YYYY')", false, true, false, 4));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("K100", "TAB_EFD_K100", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K200 ########
                campos.add(new Campo("DT_EST", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("IND_EST", "?", false, false, false, 6));
                campos.add(new Campo("COD_PART", "?", false, false, false, 7));
                registros.add(new RegistroTest("K200", "TAB_EFD_K200", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K210 ########
                campos.add(new Campo("DT_INI_OS", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                3));
                campos.add(new Campo("DT_FIN_OS", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                4));
                campos.add(new Campo("COD_DOC_OS", "?", false, false, false, 5));
                campos.add(new Campo("COD_ITEM_ORI", "?", false, false, false, 6));
                campos.add(new Campo("QTD_ORI", "to_number(?)", false, false, false, 7));
                registros.add(new RegistroTest("K210", "TAB_EFD_K210", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K215 ########
                campos.add(new Campo("COD_ITEM_DES", "?", false, false, false, 3));
                campos.add(new Campo("QTD_DES", "to_number(?)", false, false, false, 4));
                registros.add(new RegistroTest("K215", "TAB_EFD_K215", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K220 ########
                campos.add(new Campo("DT_MOV", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("COD_ITEM_ORI", "?", false, false, false, 4));
                campos.add(new Campo("COD_ITEM_DEST", "?", false, false, false, 5));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("QTD_DEST", "to_number(?)", false, false, false, 7));
                registros.add(new RegistroTest("K220", "TAB_EFD_K220", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K230 ########
                campos.add(new Campo("DT_INI_OP", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                3));
                campos.add(new Campo("DT_FIN_OP", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                4));
                campos.add(new Campo("COD_DOC_OP", "?", false, false, false, 5));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 6));
                campos.add(new Campo("QTD_ENC", "to_number(?)", false, false, false, 7));
                registros.add(new RegistroTest("K230", "TAB_EFD_K230", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K235 ########
                campos.add(new Campo("DT_SAIDA", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("COD_INS_SUBST", "?", false, false, false, 6));
                registros.add(new RegistroTest("K235", "TAB_EFD_K235", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K250 ########
                campos.add(new Campo("DT_PROD", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("K250", "TAB_EFD_K250", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K255 ########
                campos.add(new Campo("DT_CONS", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("COD_INS_SUBST", "?", false, false, false, 6));
                registros.add(new RegistroTest("K255", "TAB_EFD_K255", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K260 ########
                campos.add(new Campo("COD_OP_OS", "?", false, false, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("DT_SAIDA", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                5));
                campos.add(new Campo("QTD_SAIDA", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("DT_RET", "to_date(?, 'DD/MM/YYYY')", false, true, false, 7));
                campos.add(new Campo("QTD_RET", "to_number(?)", false, false, false, 8));
                registros.add(new RegistroTest("K260", "TAB_EFD_K260", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K265 ########
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 3));
                campos.add(new Campo("QTD_CONS", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("QTD_RET", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("K265", "TAB_EFD_K265", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K270 ########
                campos.add(new Campo("DT_INI_AP", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                3));
                campos.add(new Campo("DT_FIN_AP", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                4));
                campos.add(new Campo("COD_OP_OS", "?", false, false, false, 5));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 6));
                campos.add(new Campo("QTD_COR_POS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("QTD_COR_NEG", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("ORIGEM", "?", false, false, false, 9));
                registros.add(new RegistroTest("K270", "TAB_EFD_K270", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K275 ########
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 3));
                campos.add(new Campo("QTD_COR_POS", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("QTD_COR_NEG", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("COD_INST_SUBST", "?", false, false, false, 6));
                registros.add(new RegistroTest("K275", "TAB_EFD_K275", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K280 ########
                campos.add(new Campo("DT_EST", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("QTD_COR_POS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("QTD_COR_NEG", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("IND_EST", "?", false, false, false, 7));
                campos.add(new Campo("COD_PART", "?", false, false, false, 8));
                registros.add(new RegistroTest("K280", "TAB_EFD_K280", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K290 ########
                campos.add(new Campo("DT_INI_OP", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                3));
                campos.add(new Campo("DT_FIN_OP", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                4));
                campos.add(new Campo("COD_DOC_OP", "?", false, false, false, 5));
                registros.add(new RegistroTest("K290", "TAB_EFD_K290", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K291 ########
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 6));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 7));
                registros.add(new RegistroTest("K291", "TAB_EFD_K291", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K300 #######
                campos.add(new Campo("DT_PROD", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                registros.add(new RegistroTest("K300", "TAB_EFD_K300", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K301 ########
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 6));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 7));
                registros.add(new RegistroTest("K301", "TAB_EFD_K301", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## K302 ########
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 6));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 7));
                registros.add(new RegistroTest("K302", "TAB_EFD_K302", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1010 ########
                campos.add(new Campo("IND_EXP", "?", false, false, false, 2));
                campos.add(new Campo("IND_CCRF", "?", false, false, false, 3));
                campos.add(new Campo("IND_COMB", "?", false, false, false, 4));
                campos.add(new Campo("IND_USINA", "?", false, false, false, 5));
                campos.add(new Campo("IND_VA", "?", false, false, false, 6));
                campos.add(new Campo("IND_EE", "?", false, false, false, 7));
                campos.add(new Campo("IND_CART", "?", false, false, false, 8));
                campos.add(new Campo("IND_FORM", "?", false, false, false, 9));
                campos.add(new Campo("IND_AER", "?", false, false, false, 10));
                campos.add(new Campo("IND_GIAF1", "?", false, false, false, 11));
                campos.add(new Campo("IND_GIAF3", "?", false, false, false, 12));
                campos.add(new Campo("IND_GIAF4", "?", false, false, false, 13));
                campos.add(new Campo("IND_REST_RESSARC_COMPL_ICMS", "?", false, false, false, 14));
                campos.add(new Campo("ID", "?", true, false, false, 100));
                registros.add(new RegistroTest("1010", "TAB_EFD_1010", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1100 ########
                campos.add(new Campo("IND_DOC", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("NRO_DE", "?", false, false, false, 4));
                campos.add(new Campo("DT_DE", "to_date(?, 'DD/MM/YYYY')", false, true, false, 5));
                campos.add(new Campo("NAT_EXP", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("NRO_RE", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("DT_RE", "to_date(?, 'DD/MM/YYYY')", false, true, false, 8));
                campos.add(new Campo("CHC_EMB", "?", false, false, false, 9));
                campos.add(new Campo("DT_CHC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 10));
                campos.add(new Campo("DT_AVB", "to_date(?, 'DD/MM/YYYY')", false, true, false, 11));
                campos.add(new Campo("TP_CHC", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("PAIS", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("1100", "TAB_EFD_1100", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1105 ########
                campos.add(new Campo("COD_MOD", "?", false, false, false, 3));
                campos.add(new Campo("SERIE", "?", false, false, false, 4));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("CHV_NFE", "?", false, false, false, 6));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 7));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 8));
                registros.add(new RegistroTest("1105", "TAB_EFD_1105", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1110 ########
                campos.add(new Campo("COD_PART", "?", false, false, false, 3));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 4));
                campos.add(new Campo("SER", "?", false, false, false, 5));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 7));
                campos.add(new Campo("CHV_NFE", "?", false, false, false, 8));
                campos.add(new Campo("NR_MEMO", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("UNID", "?", false, false, false, 11));
                registros.add(new RegistroTest("1110", "TAB_EFD_1110", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1200 ########
                campos.add(new Campo("COD_AJ_APUR", "?", false, false, false, 3));
                campos.add(new Campo("SLD_CRED", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("CRED_APR", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("CRED_RECEB", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("CRED_UTIL", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("SLD_CRED_FIM", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("1200", "TAB_EFD_1200", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1210 ########
                campos.add(new Campo("TIPO_UTIL", "?", false, false, false, 3));
                campos.add(new Campo("NR_DOC", "?", false, false, false, 4));
                campos.add(new Campo("VL_CRED_UTIL", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("CHV_DOCE", "?", false, false, false, 6));
                registros.add(new RegistroTest("1210", "TAB_EFD_1210", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1300 ########
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 3));
                campos.add(new Campo("DT_FECH", "to_date(?, 'DD/MM/YYYY')", false, true, false, 4));
                campos.add(new Campo("ESTQ_ABERT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VOL_ENTR", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VOL_DISP", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VOL_SAIDAS", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("ESTQ_ESCR", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VAL_AJ_PERDA", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VAL_AJ_GANHO", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("FECH_FISICO", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("1300", "TAB_EFD_1300", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1310 ########
                campos.add(new Campo("NUM_TANQUE", "?", false, false, false, 3));
                campos.add(new Campo("ESTQ_ABERT", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("VOL_ENTR", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VOL_DISP", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VOL_SAIDAS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("ESTQ_ESCR", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VAL_AJ_PERDA", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VAL_AJ_GANHO", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("FECH_FISICO", "to_number(?)", false, false, false, 11));
                registros.add(new RegistroTest("1310", "TAB_EFD_1310", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1320 ########
                campos.add(new Campo("NUM_BICO", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("NR_INTERV", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("MOT_INTERV", "?", false, false, false, 5));
                campos.add(new Campo("NOM_INTERV", "?", false, false, false, 6));
                campos.add(new Campo("CNPJ_INTERV", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("CPF_INTERV", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VAL_FECHA", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VAL_ABERT", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VOL_AFERI", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VOL_VENDAS", "to_number(?)", false, false, false, 12));
                registros.add(new RegistroTest("1320", "TAB_EFD_1320", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1350 ########
                campos.add(new Campo("SERIE", "?", false, false, false, 3));
                campos.add(new Campo("FABRICANTE", "?", false, false, false, 4));
                campos.add(new Campo("MODELO", "?", false, false, false, 5));
                campos.add(new Campo("TIPO_MEDICAO", "?", false, false, false, 6));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("1350", "TAB_EFD_1350", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1360 ########
                campos.add(new Campo("NUM_LACRE", "?", false, false, false, 3));
                campos.add(new Campo("DT_APLICACAO", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                4));
                registros.add(new RegistroTest("1360", "TAB_EFD_1360", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1370 ########
                campos.add(new Campo("NUM_BICO", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("NUM_TANQUE", "?", false, false, false, 5));
                registros.add(new RegistroTest("1370", "TAB_EFD_1370", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1390 ########
                campos.add(new Campo("COD_PROD", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("1390", "TAB_EFD_1390", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1391 ########
                campos.add(new Campo("DT_REGISTRO", "to_date(?, 'DD/MM/YYYY')", false, true, false,
                                3));
                campos.add(new Campo("QTD_MOID", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("ESTQ_INI", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("QTD_PRODUZ", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("ENT_ANID_HID", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("OUTR_ENTR", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("PERDA", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("CONS", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("SAI_ANI_HID", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("SAIDAS", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("ESTQ_FIN", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("ESTQ_INI_MEL", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("PROD_DIA_MEL", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("UTIL_MEL", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("PROD_ALC_MEL", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("OBS", "?", false, false, false, 18));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 19));
                campos.add(new Campo("TP_RESIDUO", "to_number(?)", false, false, false, 20));
                campos.add(new Campo("QTD_RESIDUO", "to_number(?)", false, false, false, 21));

                registros.add(new RegistroTest("1391", "TAB_EFD_1391", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1400 ########
                campos.add(new Campo("COD_ITEM_IPM", "?", false, false, false, 3));
                campos.add(new Campo("MUN", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("VALOR", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("1400", "TAB_EFD_1400", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                registros.addAll(getRegistrosRestantes(registros));

                return registros;
        }

        private static List<RegistroTest> getRegistrosRestantes(List<RegistroTest> registros) {
                List<Campo> campos = new ArrayList<Campo>();

                // ----- ######## 1500 ########
                campos.add(new Campo("IND_OPER", "?", false, false, false, 3));
                campos.add(new Campo("IND_EMIT", "?", false, false, false, 4));
                campos.add(new Campo("COD_PART", "?", false, false, false, 5));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 6));
                campos.add(new Campo("COD_SIT", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("SER", "?", false, false, false, 8));
                campos.add(new Campo("SUB", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("COD_CONS", "?", false, false, false, 10));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 12));
                campos.add(new Campo("DT_E_S", "to_date(?, 'DD/MM/YYYY')", false, true, false, 13));
                campos.add(new Campo("VL_DOC", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("VL_FORN", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_SERV_NT", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("VL_TERC", "to_number(?)", false, false, false, 18));
                campos.add(new Campo("VL_DA", "to_number(?)", false, false, false, 19));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 20));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 21));
                campos.add(new Campo("VL_BC_ICMS_ST", "to_number(?)", false, false, false, 22));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 23));
                campos.add(new Campo("COD_INF", "?", false, false, false, 24));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 25));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 26));
                campos.add(new Campo("TP_LIGACAO", "to_number(?)", false, false, false, 27));
                campos.add(new Campo("COD_GRUPO_TENSAO", "?", false, false, false, 28));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("1500", "TAB_EFD_1500", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // // ----- ######## 1510 ########
                campos.add(new Campo("NUM_ITEM", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 4));
                campos.add(new Campo("COD_CLASS", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("QTD", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("UNID", "?", false, false, false, 7));
                campos.add(new Campo("VL_ITEM", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_DESC", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("CST_ICMS", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("CFOP", "to_number(?)", false, false, false, 11));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 12));
                campos.add(new Campo("ALIQ_ICMS", "to_number(?)", false, false, false, 13));
                campos.add(new Campo("VL_ICMS", "to_number(?)", false, false, false, 14));
                campos.add(new Campo("VL_BC_ICMS_ST", "to_number(?)", false, false, false, 15));
                campos.add(new Campo("ALIQ_ST", "to_number(?)", false, false, false, 16));
                campos.add(new Campo("VL_ICMS_ST", "to_number(?)", false, false, false, 17));
                campos.add(new Campo("IND_REC", "?", false, false, false, 18));
                campos.add(new Campo("COD_PART", "?", false, false, false, 19));
                campos.add(new Campo("VL_PIS", "to_number(?)", false, false, false, 20));
                campos.add(new Campo("VL_COFINS", "to_number(?)", false, false, false, 21));
                campos.add(new Campo("COD_CTA", "?", false, false, false, 22));
                registros.add(new RegistroTest("1510", "TAB_EFD_1510", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1600 ########
                campos.add(new Campo("COD_PART", "?", false, false, false, 3));
                campos.add(new Campo("TOT_CREDITO", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("TOT_DEBITO", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("1600", "TAB_EFD_1600", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1700 ########
                campos.add(new Campo("COD_DISP", "?", false, false, false, 3));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 4));
                campos.add(new Campo("SER", "?", false, false, false, 5));
                campos.add(new Campo("SUB", "?", false, false, false, 6));
                campos.add(new Campo("NUM_DOC_INI", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("NUM_DOC_FIN", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("NUM_AUT", "?", false, false, false, 9));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("1700", "TAB_EFD_1700", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1710 ########
                campos.add(new Campo("NUM_DOC_INI", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("NUM_DOC_FIN", "to_number(?)", false, false, false, 4));
                registros.add(new RegistroTest("1710", "TAB_EFD_1710", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1800 ########
                campos.add(new Campo("VL_CARGA", "to_number(?)", false, false, false, 2));
                campos.add(new Campo("VL_PASS", "to_number(?)", false, false, false, 3));
                campos.add(new Campo("VL_FAT", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("IND_RAT", "to_number(?)", false, false, false, 5));
                campos.add(new Campo("VL_ICMS_ANT", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("VL_BC_ICMS", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_ICMS_APUR", "to_number(?)", false, false, false, 8));
                campos.add(new Campo("VL_BC_ICMS_APUR", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_DIF", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("ID", "?", true, false, false, 100));
                registros.add(new RegistroTest("1800", "TAB_EFD_1800", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1900 ########
                campos.add(new Campo("IND_APUR_ICMS", "?", false, false, false, 3));
                campos.add(new Campo("DESCR_COMPL_OUT_APUR", "?", false, false, false, 4));
                campos.add(new Campo("TAB_EFD_0000_ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("1900", "TAB_EFD_1900", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1910 ########
                campos.add(new Campo("DT_INI", "to_date(?, 'DD/MM/YYYY')", false, true, false, 3));
                campos.add(new Campo("DT_FIN", "to_date(?, 'DD/MM/YYYY')", false, true, false, 4));
                registros.add(new RegistroTest("1910", "TAB_EFD_1910", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1920 ########
                campos.add(new Campo("VL_TOT_TRANSF_DEBITOS_OA", "to_number(?)", false, false,
                                false, 2));
                campos.add(new Campo("VL_TOT_AJ_DEBITOS_OA", "to_number(?)", false, false, false,
                                3));
                campos.add(new Campo("VL_ESTORNOS_CRED_OA", "to_number(?)", false, false, false,
                                4));
                campos.add(new Campo("VL_TOT_TRANSF_CREDITOS_OA", "to_number(?)", false, false,
                                false, 5));
                campos.add(new Campo("VL_TOT_AJ_CREDITOS_OA", "to_number(?)", false, false, false,
                                6));
                campos.add(new Campo("VL_ESTORNOS_DEB_OA", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("VL_SLD_CREDOR_ANT_OA", "to_number(?)", false, false, false,
                                8));
                campos.add(new Campo("VL_SLD_APURADO_OA", "to_number(?)", false, false, false, 9));
                campos.add(new Campo("VL_TOT_DED", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("VL_ICMS_RECOLHER_OA", "to_number(?)", false, false, false,
                                11));
                campos.add(new Campo("VL_SLD_CREDOR_TRANSP_OA", "to_number(?)", false, false, false,
                                12));
                campos.add(new Campo("DEB_ESP_OA", "to_number(?)", false, false, false, 13));
                registros.add(new RegistroTest("1920", "TAB_EFD_1920", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1921 ########
                campos.add(new Campo("COD_AJ_APUR", "?", false, false, false, 3));
                campos.add(new Campo("DESCR_COMPL_AJ", "?", false, false, false, 4));
                campos.add(new Campo("VL_AJ_APUR", "to_number(?)", false, false, false, 5));
                registros.add(new RegistroTest("1921", "TAB_EFD_1921", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1922 ########
                campos.add(new Campo("NUM_DA", "?", false, false, false, 3));
                campos.add(new Campo("NUM_PROC", "?", false, false, false, 4));
                campos.add(new Campo("IND_PROC", "?", false, false, false, 5));
                campos.add(new Campo("PROC", "?", false, false, false, 6));
                campos.add(new Campo("TXT_COMPL", "?", false, false, false, 7));
                registros.add(new RegistroTest("1922", "TAB_EFD_1922", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1923 ########
                campos.add(new Campo("COD_PART", "?", false, false, false, 3));
                campos.add(new Campo("COD_MOD", "?", false, false, false, 4));
                campos.add(new Campo("SER", "?", false, false, false, 5));
                campos.add(new Campo("SUB", "to_number(?)", false, false, false, 6));
                campos.add(new Campo("NUM_DOC", "to_number(?)", false, false, false, 7));
                campos.add(new Campo("DT_DOC", "to_date(?, 'DD/MM/YYYY')", false, true, false, 8));
                campos.add(new Campo("COD_ITEM", "?", false, false, false, 9));
                campos.add(new Campo("VL_AJ_ITEM", "to_number(?)", false, false, false, 10));
                campos.add(new Campo("CHV_DOCE", "?", false, false, false, 11));
                registros.add(new RegistroTest("1923", "TAB_EFD_1923", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1925 ########
                campos.add(new Campo("COD_INF_ADIC", "?", false, false, false, 3));
                campos.add(new Campo("VL_INF_ADIC", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("DESCR_COMPL_AJ", "?", false, false, false, 5));
                registros.add(new RegistroTest("1925", "TAB_EFD_1925", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1926 ########
                campos.add(new Campo("COD_OR", "?", false, false, false, 3));
                campos.add(new Campo("VL_OR", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("DT_VCTO", "to_date(?, 'DD/MM/YYYY')", false, true, false, 5));
                campos.add(new Campo("COD_REC", "?", false, false, false, 6));
                campos.add(new Campo("NUM_PROC", "?", false, false, false, 7));
                campos.add(new Campo("IND_PROC", "?", false, false, false, 8));
                campos.add(new Campo("PROC", "?", false, false, false, 9));
                campos.add(new Campo("TXT_COMPL", "?", false, false, false, 10));
                campos.add(new Campo("MES_REF", "?", false, false, false, 11));
                registros.add(new RegistroTest("1926", "TAB_EFD_1926", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1960 ########
                // campos.add(new Campo("IND_AP", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G1_01", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G1_02", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G1_03", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G1_04", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G1_05", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G1_06", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G1_07", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G1_08", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G1_09", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G1_10", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G1_11", "to_number(?)", false, false, false, 4));
                // registros.add(new RegistroTest("1960", "TAB_EFD_1960", List.copyOf(campos)));
                // campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1970 ########
                campos.add(new Campo("IND_AP", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("G3_01", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("G3_02", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("G3_03", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("G3_04", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("G3_05", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("G3_06", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("G3_07", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("G3_T", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("G3_08", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("G3_09", "to_number(?)", false, false, false, 4));
                registros.add(new RegistroTest("1970", "TAB_EFD_1970", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1975 ########
                campos.add(new Campo("ALIQ_IMP_BASE", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("G3_10", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("G3_11", "to_number(?)", false, false, false, 4));
                campos.add(new Campo("G3_12", "to_number(?)", false, false, false, 4));
                registros.add(new RegistroTest("1975", "TAB_EFD_1975", List.copyOf(campos)));
                campos.clear();
                // ------------------------------------------------------------

                // ----- ######## 1980 ########
                // campos.add(new Campo("IND_AP", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G4_01", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G4_02", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G4_03", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G4_03", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G4_04", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G4_05", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G4_06", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G4_07", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G4_08", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G4_09", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G4_10", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G4_11", "to_number(?)", false, false, false, 4));
                // campos.add(new Campo("G4_12", "to_number(?)", false, false, false, 4));
                // registros.add(new RegistroTest("1960", "TAB_EFD_1960", List.copyOf(campos)));
                // campos.clear();
                // -----------------------------------------------------------

                // ----- ######## 9999 ########
                campos.add(new Campo("qtd_lin", "?", false, false, false, 4));
                campos.add(new Campo("ID", "?", true, false, false, 200));
                registros.add(new RegistroTest("9999", "TAB_EFD_9999", List.copyOf(campos)));
                campos.clear();
                return registros;
        }
}
