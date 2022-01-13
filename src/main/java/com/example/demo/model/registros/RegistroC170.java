package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
import com.example.demo.util.Indice;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "TAB_EFD_C170", schema = "APL_EFD")
public class RegistroC170 extends Registro {

	@Column(name = "NUM_ITEM")
	@Indice(valor = 3)
	private String numItem;
	@Column(name = "COD_ITEM")
	@Indice(valor = 4)
	private String codItem;
	@Column(name = "DESC_COMPL")
	@Indice(valor = 5)
	private String descCompl;
	@Column(name = "QTD")
	@Indice(valor = 6)
	private String qtd;
	@Column(name = "UNID")
	@Indice(valor = 7)
	private String unid;
	@Column(name = "VL_ITEM")
	@Indice(valor = 8)
	private String vlItem;
	@Column(name = "VL_DESC")
	@Indice(valor = 9)
	private String vlDesc;
	@Column(name = "IND_MOV")
	@Indice(valor = 10)
	private String indMov;
	@Column(name = "CST_ICMS")
	@Indice(valor = 11)
	private String cstIcms;
	@Column(name = "CFOP")
	@Indice(valor = 12)
	private String cfop;
	@Column(name = "COD_NAT")
	@Indice(valor = 13)
	private String codNat;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 14)
	private String vlBcIcms;
	@Column(name = "ALIQ_ICMS")
	@Indice(valor = 15)
	private String aliqIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 16)
	private String vlIcms;
	@Column(name = "VL_BC_ICMS_ST")
	@Indice(valor = 17)
	private String vlBcIcmsSt;
	@Column(name = "ALIQ_ST")
	@Indice(valor = 18)
	private String aliqSt;
	@Column(name = "VL_ICMS_ST")
	@Indice(valor = 19)
	private String vlIcmsSt;
	@Column(name = "IND_APUR")
	@Indice(valor = 20)
	private String indApur;
	@Column(name = "CST_IPI")
	@Indice(valor = 21)
	private String cstIpi;
	@Column(name = "COD_ENQ")
	@Indice(valor = 22)
	private String codEnq;
	@Column(name = "VL_BC_IPI")
	@Indice(valor = 23)
	private String vlBcIpi;
	@Column(name = "ALIQ_IPI")
	@Indice(valor = 24)
	private String aliqIpi;
	@Column(name = "VL_IPI")
	@Indice(valor = 25)
	private String vlIpi;
	@Column(name = "CST_PIS")
	@Indice(valor = 26)
	private String cstPis;
	@Column(name = "VL_BC_PIS")
	@Indice(valor = 27)
	private String vlBcPis;
	@Column(name = "ALIQ_PIS_P")
	@Indice(valor = 28)
	private String aliqPisP;
	@Column(name = "QUANT_BC_PIS")
	@Indice(valor = 29)
	private String quantBcPis;
	@Column(name = "ALIQ_PIS_R")
	@Indice(valor = 30)
	private String aliqPisR;
	@Column(name = "VL_PIS")
	@Indice(valor = 31)
	private String vlPis;
	@Column(name = "CST_COFINS")
	@Indice(valor = 32)
	private String cstCofins;
	@Column(name = "VL_BC_COFINS")
	@Indice(valor = 33)
	private String vlBcCofins;
	@Column(name = "ALIQ_COFINS_P")
	@Indice(valor = 34)
	private String aliqCofinsP;
	@Column(name = "QUANT_BC_COFINS")
	@Indice(valor = 35)
	private String quantBcCofins;
	@Column(name = "ALIQ_COFINS_R")
	@Indice(valor = 36)
	private String aliqCofinsR;
	@Column(name = "VL_COFINS")
	@Indice(valor = 37)
	private String vlCofins;
	@Column(name = "COD_CTA")
	@Indice(valor = 38)
	private String codCta;
	@Column(name = "VL_ABAT_NT")
	@Indice(valor = 39)
	private String vlAbatNt;
	@Column(name = "DATA_PART")
	@Indice(valor = 40)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;

	public RegistroC170(String linha) {
		super(linha);
	}

}
