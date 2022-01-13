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
@Table(name = "TAB_EFD_B030", schema = "APL_EFD")
public class RegistroB030 extends Registro {

	@Column(name = "COD_MOD")
	@Indice(valor = 6)
	private String codMod;
	@Column(name = "SER")
	@Indice(valor = 8)
	private String ser;
	@Column(name = "NUM_DOC_INI")
	@Indice(valor = 9)
	private String numDocIni;
	@Column(name = "NUM_DOC_FIN")
	@Indice(valor = 9)
	private String numDocFin;
	@Column(name = "DT_DOC")
	@Indice(valor = 11)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "QTD_CANC")
	@Indice(valor = 5)
	private String qtdCanc;
	@Column(name = "VL_CONT")
	@Indice(valor = 5)
	private String vlCont;
	@Column(name = "VL_ISNT_ISS")
	@Indice(valor = 5)
	private String vlIsntIss;
	@Column(name = "VL_BC_ISS")
	@Indice(valor = 5)
	private String vlBcIss;
	@Column(name = "VL_ISS")
	@Indice(valor = 5)
	private String vlIss;
	@Column(name = "COD_INF_OBS")
	@Indice(valor = 2)
	private String codInfObs;

	public RegistroB030(String linha) {
		super(linha);
	}

}
