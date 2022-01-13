package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
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
@Table(name = "TAB_EFD_0305", schema = "APL_EFD")
public class Registro0305 extends Registro {

	@Column(name = "COD_CCUS")
	@Indice(valor = 2)
	private String codCcus;
	@Column(name = "FUNC")
	@Indice(valor = 3)
	private String func;
	@Column(name = "VIDA_UTIL")
	@Indice(valor = 4)
	private String vidaUtil;
	@Column(name = "DATA_PART")
	@Indice(valor = 5)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;

	public Registro0305(String linha) {
		super(linha);
	}

}
