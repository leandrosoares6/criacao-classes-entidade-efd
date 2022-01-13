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
@Table(name = "TAB_EFD_1710", schema = "APL_EFD")
public class Registro1710 extends Registro {

	@Column(name = "NUM_DOC_INI")
	@Indice(valor = 3)
	private String numDocIni;
	@Column(name = "NUM_DOC_FIN")
	@Indice(valor = 4)
	private String numDocFin;

	public Registro1710(String linha) {
		super(linha);
	}

}
