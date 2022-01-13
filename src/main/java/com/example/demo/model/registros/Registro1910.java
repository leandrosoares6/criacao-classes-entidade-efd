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
@Table(name = "TAB_EFD_1910", schema = "APL_EFD")
public class Registro1910 extends Registro {

	@Column(name = "DT_INI")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtIni;
	@Column(name = "DT_FIN")
	@Indice(valor = 4)
	@CampoTipoData
	private String dtFin;

	public Registro1910(String linha) {
		super(linha);
	}

}
