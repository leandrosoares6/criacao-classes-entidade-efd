package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoId;
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
@Table(name = "TAB_EFD_G110", schema = "APL_EFD")
public class RegistroG110 extends Registro {

	@Column(name = "DT_INI")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtIni;
	@Column(name = "DT_FIN")
	@Indice(valor = 4)
	@CampoTipoData
	private String dtFin;
	@Column(name = "SALDO_IN_ICMS")
	@Indice(valor = 5)
	private String saldoInIcms;
	@Column(name = "SOM_PARC")
	@Indice(valor = 6)
	private String somParc;
	@Column(name = "VL_TRIB_EXP")
	@Indice(valor = 7)
	private String vlTribExp;
	@Column(name = "VL_TOTAL")
	@Indice(valor = 8)
	private String vlTotal;
	@Column(name = "IND_PER_SAI")
	@Indice(valor = 9)
	private String indPerSai;
	@Column(name = "ICMS_APROP")
	@Indice(valor = 10)
	private String icmsAprop;
	@Column(name = "SOM_ICMS_OC")
	@Indice(valor = 11)
	private String somIcmsOc;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public RegistroG110(String linha) {
		super(linha);
	}

}
