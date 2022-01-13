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
@Table(name = "TAB_EFD_E520", schema = "APL_EFD")
public class RegistroE520 extends Registro {

	@Column(name = "VL_SD_ANT_IPI")
	@Indice(valor = 2)
	private String vlSdAntIpi;
	@Column(name = "VL_DEB_IPI")
	@Indice(valor = 3)
	private String vlDebIpi;
	@Column(name = "VL_CRED_IPI")
	@Indice(valor = 4)
	private String vlCredIpi;
	@Column(name = "VL_OD_IPI")
	@Indice(valor = 5)
	private String vlOdIpi;
	@Column(name = "VL_OC_IPI")
	@Indice(valor = 6)
	private String vlOcIpi;
	@Column(name = "VL_SC_IPI")
	@Indice(valor = 7)
	private String vlScIpi;
	@Column(name = "VL_SD_IPI")
	@Indice(valor = 8)
	private String vlSdIpi;

	public RegistroE520(String linha) {
		super(linha);
	}

}
