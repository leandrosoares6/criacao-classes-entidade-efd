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
@Table(name = "TAB_EFD_0175", schema = "APL_EFD")
public class Registro0175 extends Registro {

	@Column(name = "DT_ALT")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtAlt;
	@Column(name = "NR_CAMPO")
	@Indice(valor = 4)
	private String nrCampo;
	@Column(name = "CONT_ANT")
	@Indice(valor = 5)
	private String contAnt;

	public Registro0175(String linha) {
		super(linha);
	}

}
