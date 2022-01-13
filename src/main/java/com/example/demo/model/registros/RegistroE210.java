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
@Table(name = "TAB_EFD_E210", schema = "APL_EFD")
public class RegistroE210 extends Registro {

	@Column(name = "IND_MOV_ST")
	@Indice(valor = 3)
	private String indMovSt;
	@Column(name = "VL_SLD_CRED_ANT_ST")
	@Indice(valor = 4)
	private String vlSldCredAntSt;
	@Column(name = "VL_DEVOL_ST")
	@Indice(valor = 5)
	private String vlDevolSt;
	@Column(name = "VL_RESSARC_ST")
	@Indice(valor = 6)
	private String vlRessarcSt;
	@Column(name = "VL_OUT_CRED_ST")
	@Indice(valor = 7)
	private String vlOutCredSt;
	@Column(name = "VL_AJ_CREDITOS_ST")
	@Indice(valor = 8)
	private String vlAjCreditosSt;
	@Column(name = "VL_RETENCAO_ST")
	@Indice(valor = 9)
	private String vlRetencaoSt;
	@Column(name = "VL_OUT_DEB_ST")
	@Indice(valor = 10)
	private String vlOutDebSt;
	@Column(name = "VL_AJ_DEBITOS_ST")
	@Indice(valor = 11)
	private String vlAjDebitosSt;
	@Column(name = "VL_SLD_DEV_ANT_ST")
	@Indice(valor = 12)
	private String vlSldDevAntSt;
	@Column(name = "VL_DEDUCOES_ST")
	@Indice(valor = 13)
	private String vlDeducoesSt;
	@Column(name = "VL_ICMS_RECOL_ST")
	@Indice(valor = 14)
	private String vlIcmsRecolSt;
	@Column(name = "VL_SLD_CRED_ST_TRANSPORTAR")
	@Indice(valor = 15)
	private String vlSldCredStTransportar;
	@Column(name = "DEB_ESP_ST")
	@Indice(valor = 16)
	private String debEspSt;

	public RegistroE210(String linha) {
		super(linha);
	}

}
