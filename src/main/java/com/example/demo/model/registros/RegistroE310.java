package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
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
@Table(name = "TAB_EFD_E310", schema = "APL_EFD")
public class RegistroE310 extends Registro {

	@Column(name = "IND_MOV_FCP_DIFAL")
	@Indice(valor = 3)
	private String indMovFcpDifal;
	@Column(name = "VL_SLD_CRED_ANT_DIFAL")
	@Indice(valor = 4)
	private String vlSldCredAntDifal;
	@Column(name = "VL_TOT_DEBITOS_DIFAL")
	@Indice(valor = 5)
	private String vlTotDebitosDifal;
	@Column(name = "VL_OUT_DEB_DIFAL")
	@Indice(valor = 6)
	private String vlOutDebDifal;
	@Column(name = "VL_TOT_CREDITOS_DIFAL")
	@Indice(valor = 7)
	private String vlTotCreditosDifal;
	@Column(name = "VL_OUT_CRED_DIFAL")
	@Indice(valor = 8)
	private String vlOutCredDifal;
	@Column(name = "VL_SLD_DEV_ANT_DIFAL")
	@Indice(valor = 9)
	private String vlSldDevAntDifal;
	@Column(name = "VL_DEDUCOES_DIFAL")
	@Indice(valor = 10)
	private String vlDeducoesDifal;
	@Column(name = "VL_RECOL_DIFAL")
	@Indice(valor = 11)
	private String vlRecolDifal;
	@Column(name = "VL_SLD_CRED_TRANSPORTAR_DIFAL")
	@Indice(valor = 12)
	private String vlSldCredTransportarDifal;
	@Column(name = "DEB_ESP_DIFAL")
	@Indice(valor = 13)
	private String debEspDifal;
	@Column(name = "VL_SLD_CRED_ANT_FCP")
	@Indice(valor = 14)
	private String vlSldCredAntFcp;
	@Column(name = "VL_TOT_DEB_FCP")
	@Indice(valor = 15)
	private String vlTotDebFcp;
	@Column(name = "VL_OUT_DEB_FCP")
	@Indice(valor = 16)
	private String vlOutDebFcp;
	@Column(name = "VL_TOT_CRED_FCP")
	@Indice(valor = 17)
	private String vlTotCredFcp;
	@Column(name = "VL_OUT_CRED_FCP")
	@Indice(valor = 18)
	private String vlOutCredFcp;
	@Column(name = "VL_SLD_DEV_ANT_FCP")
	@Indice(valor = 19)
	private String vlSldDevAntFcp;
	@Column(name = "VL_DEDUCOES_FCP")
	@Indice(valor = 20)
	private String vlDeducoesFcp;
	@Column(name = "VL_RECOL_FCP")
	@Indice(valor = 21)
	private String vlRecolFcp;
	@Column(name = "VL_SLD_CRED_TRANSPORTAR_FCP")
	@Indice(valor = 22)
	private String vlSldCredTransportarFcp;
	@Column(name = "DEB_ESP_FCP")
	@Indice(valor = 23)
	private String debEspFcp;

	public RegistroE310(String linha) {
		super(linha);
	}

}
