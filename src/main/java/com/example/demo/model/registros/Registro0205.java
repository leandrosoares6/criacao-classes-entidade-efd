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
@Table(name = "TAB_EFD_0205", schema = "APL_EFD")
public class Registro0205 extends Registro {

	@Column(name = "DESCR_ANT_ITEM")
	@Indice(valor = 3)
	private String descrAntItem;
	@Column(name = "DT_INI")
	@Indice(valor = 4)
	@CampoTipoData
	private String dtIni;
	@Column(name = "DT_FIM")
	@Indice(valor = 5)
	@CampoTipoData
	private String dtFim;
	@Column(name = "COD_ANT_ITEM")
	@Indice(valor = 6)
	private String codAntItem;

	public Registro0205(String linha) {
		super(linha);
	}

}
