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
@Table(name = "TAB_EFD_E110", schema = "APL_EFD")
public class RegistroE110 extends Registro {

	@Column(name = "VL_TOT_DEBITOS")
	@Indice(valor = 3)
	private String vlTotDebitos;
	@Column(name = "VL_AJ_DEBITOS")
	@Indice(valor = 4)
	private String vlAjDebitos;
	@Column(name = "VL_TOT_AJ_DEBITOS")
	@Indice(valor = 5)
	private String vlTotAjDebitos;
	@Column(name = "VL_ESTORNOS_CRED")
	@Indice(valor = 6)
	private String vlEstornosCred;
	@Column(name = "VL_TOT_CREDITOS")
	@Indice(valor = 7)
	private String vlTotCreditos;
	@Column(name = "VL_AJ_CREDITOS")
	@Indice(valor = 8)
	private String vlAjCreditos;
	@Column(name = "VL_TOT_AJ_CREDITOS")
	@Indice(valor = 9)
	private String vlTotAjCreditos;
	@Column(name = "VL_ESTORNOS_DEB")
	@Indice(valor = 10)
	private String vlEstornosDeb;
	@Column(name = "VL_SLD_CREDOR_ANT")
	@Indice(valor = 11)
	private String vlSldCredorAnt;
	@Column(name = "VL_SLD_APURADO")
	@Indice(valor = 12)
	private String vlSldApurado;
	@Column(name = "VL_TOT_DED")
	@Indice(valor = 13)
	private String vlTotDed;
	@Column(name = "VL_ICMS_RECOLHER")
	@Indice(valor = 14)
	private String vlIcmsRecolher;
	@Column(name = "VL_SLD_CREDOR_TRANSPORTAR")
	@Indice(valor = 15)
	private String vlSldCredorTransportar;
	@Column(name = "DEB_ESP")
	@Indice(valor = 16)
	private String debEsp;

	public RegistroE110(String linha) {
		super(linha);
	}

}
