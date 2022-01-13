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
@Table(name = "TAB_EFD_C100", schema = "APL_EFD")
public class RegistroC100 extends Registro {

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
	@Column(name = "NUM_DOC")
	@Indice(valor = 9)
	private String numDoc;
	@Column(name = "CHV_NFE")
	@Indice(valor = 10)
	private String chvNfe;
	@Column(name = "DT_DOC")
	@Indice(valor = 11)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "DT_E_S")
	@Indice(valor = 12)
	@CampoTipoData
	private String dtES;
	@Column(name = "VL_DOC")
	@Indice(valor = 13)
	private String vlDoc;
	@Column(name = "IND_PGTO")
	@Indice(valor = 14)
	private String indPgto;
	@Column(name = "VL_DESC")
	@Indice(valor = 15)
	private String vlDesc;
	@Column(name = "VL_ABAT_NT")
	@Indice(valor = 16)
	private String vlAbatNt;
	@Column(name = "VL_MERC")
	@Indice(valor = 17)
	private String vlMerc;
	@Column(name = "IND_FRT")
	@Indice(valor = 18)
	private String indFrt;
	@Column(name = "VL_FRT")
	@Indice(valor = 19)
	private String vlFrt;
	@Column(name = "VL_SEG")
	@Indice(valor = 20)
	private String vlSeg;
	@Column(name = "VL_OUT_DA")
	@Indice(valor = 21)
	private String vlOutDa;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 22)
	private String vlBcIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 23)
	private String vlIcms;
	@Column(name = "VL_BC_ICMS_ST")
	@Indice(valor = 24)
	private String vlBcIcmsSt;
	@Column(name = "VL_ICMS_ST")
	@Indice(valor = 25)
	private String vlIcmsSt;
	@Column(name = "VL_IPI")
	@Indice(valor = 26)
	private String vlIpi;
	@Column(name = "VL_PIS")
	@Indice(valor = 27)
	private String vlPis;
	@Column(name = "VL_COFINS")
	@Indice(valor = 28)
	private String vlCofins;
	@Column(name = "VL_PIS_ST")
	@Indice(valor = 29)
	private String vlPisSt;
	@Column(name = "VL_COFINS_ST")
	@Indice(valor = 30)
	private String vlCofinsSt;
	@Column(name = "DATA_PART")
	@Indice(valor = 31)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;
	@Column(name = "TCN_ID_NFE")
	@Indice(valor = 32)
	private String tcnIdNfe;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public RegistroC100(String linha) {
		super(linha);
	}

}
