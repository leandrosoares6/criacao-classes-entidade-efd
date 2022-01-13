package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.Indice;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "TAB_EFD_C176 ", schema = "APL_EFD")
public class RegistroC176 extends Registro {

	@Column(name = "COD_MOD_ULT_E")
	@Indice(valor = 3)
	private String codModUltE;
	@Column(name = "NUM_DOC_ULT_E")
	@Indice(valor = 4)
	private String numDocUltE;
	@Column(name = "SER_ULT_E")
	@Indice(valor = 5)
	private String serUltE;
	@Column(name = "DT_ULT_E")
	@Indice(valor = 6)
	@CampoTipoData
	private String dtUltE;
	@Column(name = "COD_PART_ULT_E")
	@Indice(valor = 7)
	private String codPartUltE;
	@Column(name = "QUANT_ULT_E")
	@Indice(valor = 8)
	private String quantUltE;
	@Column(name = "VL_UNIT_ULT_E")
	@Indice(valor = 9)
	private String vlUnitUltE;
	@Column(name = "VL_UNIT_BC_ST")
	@Indice(valor = 10)
	private String vlUnitBcSt;
	@Column(name = "CHAVE_NFE_ULT_E")
	@Indice(valor = 11)
	private String chaveNfeUltE;
	@Column(name = "NUM_ITEM_ULT_E")
	@Indice(valor = 12)
	private String numItemUltE;
	@Column(name = "VL_UNIT_BC_ICMS_ULT_E")
	@Indice(valor = 13)
	private String vlUnitBcIcmsUltE;
	@Column(name = "ALIQ_ICMS_ULT_E")
	@Indice(valor = 14)
	private String aliqIcmsUltE;
	@Column(name = "VL_UNIT_LIMITE_BC_ICMS_ULT_E")
	@Indice(valor = 15)
	private String vlUnitLimiteBcIcmsUltE;
	@Column(name = "VL_UNIT_ICMS_ULT_E")
	@Indice(valor = 16)
	private String vlUnitIcmsUltE;
	@Column(name = "ALIQ_ST_ULT_E")
	@Indice(valor = 17)
	private String aliqStUltE;
	@Column(name = "VL_UNIT_RES")
	@Indice(valor = 18)
	private String vlUnitRes;
	@Column(name = "COD_RESP_RET")
	@Indice(valor = 19)
	private String codRespRet;
	@Column(name = "COD_MOT_RES")
	@Indice(valor = 20)
	private String codMotRes;
	@Column(name = "CHAVE_NFE_RET")
	@Indice(valor = 21)
	private String chaveNfeRet;
	@Column(name = "COD_PART_NFE_RET")
	@Indice(valor = 22)
	private String codPartNfeRet;
	@Column(name = "SER_NFE_RET")
	@Indice(valor = 23)
	private String serNfeRet;
	@Column(name = "NUM_NFE_RET")
	@Indice(valor = 24)
	private String numNfeRet;
	@Column(name = "ITEM_NFE_RET")
	@Indice(valor = 25)
	private String itemNfeRet;
	@Column(name = "COD_DA")
	@Indice(valor = 26)
	private String codDa;
	@Column(name = "NUM_DA")
	@Indice(valor = 27)
	private String numDa;
	@Column(name = "VL_UNIT_RES_FCP_ST")
	@Indice(valor = 28)
	private String vlUnitResFcpSt;

	public RegistroC176(String linha) {
		super(linha);
	}

}
