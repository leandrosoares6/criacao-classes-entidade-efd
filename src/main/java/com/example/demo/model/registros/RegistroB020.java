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
@Table(name = "TAB_EFD_B020", schema = "APL_EFD")
public class RegistroB020 extends Registro {

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
	@Column(name = "COD_MUN_SERV")
	@Indice(valor = 11)
	private String codMunServ;
	@Column(name = "VL_CONT")
	@Indice(valor = 5)
	private String vlCont;
	@Column(name = "VL_MAT_TERC")
	@Indice(valor = 5)
	private String vlMatTerc;
	@Column(name = "VL_SUB")
	@Indice(valor = 5)
	private String vlSub;
	@Column(name = "VL_ISNT_ISS")
	@Indice(valor = 5)
	private String vlIsntIss;
	@Column(name = "VL_DED_BC")
	@Indice(valor = 5)
	private String vlDedBc;
	@Column(name = "VL_BC_ISS")
	@Indice(valor = 5)
	private String vlBcIss;
	@Column(name = "VL_BC_ISS_RT")
	@Indice(valor = 5)
	private String vlBcIssRt;
	@Column(name = "VL_ISS_RT")
	@Indice(valor = 5)
	private String vlIssRt;
	@Column(name = "VL_ISS ")
	@Indice(valor = 5)
	private String vlIss;
	@Column(name = "COD_INF_OBS")
	@Indice(valor = 2)
	private String codInfObs;

	public RegistroB020(String linha) {
		super(linha);
	}

}
