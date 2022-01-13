package com.example.demo.model.registros;

import com.example.demo.model.Registro;
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
@Table(name = "TAB_EFD_B460", schema = "APL_EFD")
public class RegistroB460 extends Registro {

	@Column(name = "IND_DED")
	@Indice(valor = 5)
	private String indDed;
	@Column(name = "VL_DED")
	@Indice(valor = 5)
	private String vlDed;
	@Column(name = "NUM_PROC")
	@Indice(valor = 5)
	private String numProc;
	@Column(name = "IND_PROC")
	@Indice(valor = 5)
	private String indProc;
	@Column(name = "PROC")
	@Indice(valor = 5)
	private String proc;
	@Column(name = "COD_INF_OBS")
	@Indice(valor = 5)
	private String codInfObs;
	@Column(name = "IND_OBR")
	@Indice(valor = 5)
	private String indObr;

	public RegistroB460(String linha) {
		super(linha);
	}

}
