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
@Table(name = "TAB_EFD_B350", schema = "APL_EFD")
public class RegistroB350 extends Registro {

	@Column(name = "COD_CTD")
	@Indice(valor = 6)
	private String codCtd;
	@Column(name = "CTA_ISS")
	@Indice(valor = 8)
	private String ctaIss;
	@Column(name = "CTA_COSIF")
	@Indice(valor = 9)
	private String ctaCosif;
	@Column(name = "QTD_OCOR")
	@Indice(valor = 9)
	private String qtdOcor;
	@Column(name = "COD_SERV")
	@Indice(valor = 11)
	@CampoTipoData
	private String codServ;
	@Column(name = "VL_CONT")
	@Indice(valor = 5)
	private String vlCont;
	@Column(name = "VL_BC_ISS")
	@Indice(valor = 5)
	private String vlBcIss;
	@Column(name = "ALIQ_ISS")
	@Indice(valor = 5)
	private String aliqIss;
	@Column(name = "VL_ISS")
	@Indice(valor = 5)
	private String vlIss;
	@Column(name = "COD_INF_OBS")
	@Indice(valor = 2)
	private String codInfObs;

	public RegistroB350(String linha) {
		super(linha);
	}

}
