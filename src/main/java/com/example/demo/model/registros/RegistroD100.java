package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
import com.example.demo.util.CampoTipoId;
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
@Table(name = "TAB_EFD_D100", schema = "APL_EFD")
public class RegistroD100 extends Registro {

	@Column(name = "IND_OPER")
	@Indice(valor = 3)
	private String indOper;
	@Column(name = "IND_EMIT")
	@Indice(valor = 4)
	private String indEmit;
	@Column(name = "COD_PART")
	@Indice(valor = 5)
	private String codPart;
	@Column(name = "COD_MOD")
	@Indice(valor = 6)
	private String codMod;
	@Column(name = "COD_SIT")
	@Indice(valor = 7)
	private String codSit;
	@Column(name = "SER")
	@Indice(valor = 8)
	private String ser;
	@Column(name = "SUB")
	@Indice(valor = 9)
	private String sub;
	@Column(name = "NUM_DOC")
	@Indice(valor = 10)
	private String numDoc;
	@Column(name = "CHV_CTE")
	@Indice(valor = 11)
	private String chvCte;
	@Column(name = "DT_DOC")
	@Indice(valor = 12)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "DT_A_P")
	@Indice(valor = 13)
	@CampoTipoData
	private String dtAP;
	@Column(name = "TP_CT_E")
	@Indice(valor = 14)
	private String tpCtE;
	@Column(name = "CHV_CTE_REF")
	@Indice(valor = 15)
	private String chvCteRef;
	@Column(name = "VL_DOC")
	@Indice(valor = 16)
	private String vlDoc;
	@Column(name = "VL_DESC")
	@Indice(valor = 17)
	private String vlDesc;
	@Column(name = "IND_FRT")
	@Indice(valor = 18)
	private String indFrt;
	@Column(name = "VL_SERV")
	@Indice(valor = 19)
	private String vlServ;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 20)
	private String vlBcIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 21)
	private String vlIcms;
	@Column(name = "VL_NT")
	@Indice(valor = 22)
	private String vlNt;
	@Column(name = "COD_INF")
	@Indice(valor = 23)
	private String codInf;
	@Column(name = "COD_CTA")
	@Indice(valor = 24)
	private String codCta;
	@Column(name = "COD_MUN_ORIG")
	@Indice(valor = 25)
	private String codMunOrig;
	@Column(name = "COD_MUN_DEST")
	@Indice(valor = 26)
	private String codMunDest;
	@Column(name = "DATA_PART")
	@Indice(valor = 27)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public RegistroD100(String linha) {
		super(linha);
	}

}
