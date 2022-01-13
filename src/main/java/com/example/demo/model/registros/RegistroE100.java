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
@Table(name = "TAB_EFD_E100", schema = "APL_EFD")
public class RegistroE100 extends Registro {

	@Column(name = "DT_INI")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtIni;
	@Column(name = "DT_FIN")
	@Indice(valor = 4)
	@CampoTipoData
	private String dtFin;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public RegistroE100(String linha) {
		super(linha);
	}

}
