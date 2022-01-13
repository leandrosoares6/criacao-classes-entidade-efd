package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
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
@Table(name = "TAB_EFD_1500", schema = "APL_EFD")
public class Registro1500 extends Registro {

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
	@Column(name = "COD_CONS")
	@Indice(valor = 10)
	private String codCons;
	@Column(name = "NUM_DOC")
	@Indice(valor = 11)
	private String numDoc;
	@Column(name = "DT_DOC")
	@Indice(valor = 12)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "DT_E_S")
	@Indice(valor = 13)
	@CampoTipoData
	private String dtES;
	@Column(name = "VL_DOC")
	@Indice(valor = 14)
	private String vlDoc;
	@Column(name = "VL_DESC")
	@Indice(valor = 15)
	private String vlDesc;
	@Column(name = "VL_FORN")
	@Indice(valor = 16)
	private String vlForn;
	@Column(name = "VL_SERV_NT")
	@Indice(valor = 17)
	private String vlServNt;
	@Column(name = "VL_TERC")
	@Indice(valor = 18)
	private String vlTerc;
	@Column(name = "VL_DA")
	@Indice(valor = 19)
	private String vlDa;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 20)
	private String vlBcIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 21)
	private String vlIcms;
	@Column(name = "VL_BC_ICMS_ST")
	@Indice(valor = 22)
	private String vlBcIcmsSt;
	@Column(name = "VL_ICMS_ST")
	@Indice(valor = 23)
	private String vlIcmsSt;
	@Column(name = "COD_INF")
	@Indice(valor = 24)
	private String codInf;
	@Column(name = "VL_PIS")
	@Indice(valor = 25)
	private String vlPis;
	@Column(name = "VL_COFINS")
	@Indice(valor = 26)
	private String vlCofins;
	@Column(name = "TP_LIGACAO")
	@Indice(valor = 27)
	private String tpLigacao;
	@Column(name = "COD_GRUPO_TENSAO")
	@Indice(valor = 28)
	private String codGrupoTensao;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro1500(String linha) {
		super(linha);
	}

}
