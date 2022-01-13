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
@Table(name = "TAB_EFD_C141", schema = "APL_EFD")
public class RegistroC141 extends Registro {

	@Column(name = "NUM_PARC")
	@Indice(valor = 3)
	private String numParc;
	@Column(name = "DT_VCTO")
	@Indice(valor = 4)
	@CampoTipoData
	private String dtVcto;
	@Column(name = "VL_PARC")
	@Indice(valor = 5)
	private String vlParc;

	public RegistroC141(String linha) {
		super(linha);
	}

}
