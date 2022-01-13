package com.example.demo.model.registros;

import com.example.demo.model.Registro;
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
@Table(name = "TAB_EFD_1920", schema = "APL_EFD")
public class Registro1920 extends Registro {

	@Column(name = "VL_TOT_TRANSF_DEBITOS_OA")
	@Indice(valor = 2)
	private String vlTotTransfDebitosOa;
	@Column(name = "VL_TOT_AJ_DEBITOS_OA")
	@Indice(valor = 3)
	private String vlTotAjDebitosOa;
	@Column(name = "VL_ESTORNOS_CRED_OA")
	@Indice(valor = 4)
	private String vlEstornosCredOa;
	@Column(name = "VL_TOT_TRANSF_CREDITOS_OA")
	@Indice(valor = 5)
	private String vlTotTransfCreditosOa;
	@Column(name = "VL_TOT_AJ_CREDITOS_OA")
	@Indice(valor = 6)
	private String vlTotAjCreditosOa;
	@Column(name = "VL_ESTORNOS_DEB_OA")
	@Indice(valor = 7)
	private String vlEstornosDebOa;
	@Column(name = "VL_SLD_CREDOR_ANT_OA")
	@Indice(valor = 8)
	private String vlSldCredorAntOa;
	@Column(name = "VL_SLD_APURADO_OA")
	@Indice(valor = 9)
	private String vlSldApuradoOa;
	@Column(name = "VL_TOT_DED")
	@Indice(valor = 10)
	private String vlTotDed;
	@Column(name = "VL_ICMS_RECOLHER_OA")
	@Indice(valor = 11)
	private String vlIcmsRecolherOa;
	@Column(name = "VL_SLD_CREDOR_TRANSP_OA")
	@Indice(valor = 12)
	private String vlSldCredorTranspOa;
	@Column(name = "DEB_ESP_OA")
	@Indice(valor = 13)
	private String debEspOa;

	public Registro1920(String linha) {
		super(linha);
	}

}
