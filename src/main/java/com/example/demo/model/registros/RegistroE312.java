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
@Table(name = "TAB_EFD_E312", schema = "APL_EFD")
public class RegistroE312 extends Registro {

	@Column(name = "NUM_DA")
	@Indice(valor = 3)
	private String numDa;
	@Column(name = "NUM_PROC")
	@Indice(valor = 4)
	private String numProc;
	@Column(name = "IND_PROC")
	@Indice(valor = 5)
	private String indProc;
	@Column(name = "PROC")
	@Indice(valor = 6)
	private String proc;
	@Column(name = "TXT_COMPL")
	@Indice(valor = 7)
	private String txtCompl;

	public RegistroE312(String linha) {
		super(linha);
	}

}
