package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
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
@Table(name = "TAB_EFD_G126", schema = "APL_EFD")
public class RegistroG126 extends Registro {

	@Column(name = "DT_INI")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtIni;
	@Column(name = "DT_FIM")
	@Indice(valor = 4)
	@CampoTipoData
	private String dtFim;
	@Column(name = "NUM_PARC")
	@Indice(valor = 5)
	private String numParc;
	@Column(name = "VL_PARC_PASS")
	@Indice(valor = 6)
	private String vlParcPass;
	@Column(name = "VL_TRIB_OC")
	@Indice(valor = 7)
	private String vlTribOc;
	@Column(name = "VL_TOTAL")
	@Indice(valor = 8)
	private String vlTotal;
	@Column(name = "IND_PER_SAI")
	@Indice(valor = 9)
	private String indPerSai;
	@Column(name = "VL_PARC_APROP")
	@Indice(valor = 10)
	private String vlParcAprop;

	public RegistroG126(String linha) {
		super(linha);
	}

}
