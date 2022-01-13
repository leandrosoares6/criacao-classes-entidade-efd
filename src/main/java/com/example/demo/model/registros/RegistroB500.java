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
@Table(name = "TAB_EFD_B500", schema = "APL_EFD")
public class RegistroB500 extends Registro {

	@Column(name = "VL_REC")
	@Indice(valor = 5)
	private String vlRec;
	@Column(name = "QTD_PROF")
	@Indice(valor = 5)
	private String qtdProf;
	@Column(name = "VL_OR")
	@Indice(valor = 5)
	private String vlOr;

	public RegistroB500(String linha) {
		super(linha);
	}

}
