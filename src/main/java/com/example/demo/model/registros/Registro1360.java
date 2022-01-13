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
@Table(name = "TAB_EFD_1360", schema = "APL_EFD")
public class Registro1360 extends Registro {

	@Column(name = "NUM_LACRE")
	@Indice(valor = 3)
	private String numLacre;
	@Column(name = "DT_APLICACAO")
	@Indice(valor = 4)
	@CampoTipoData
	private String dtAplicacao;

	public Registro1360(String linha) {
		super(linha);
	}

}
