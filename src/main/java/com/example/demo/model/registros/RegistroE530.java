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
@Table(name = "TAB_EFD_E530", schema = "APL_EFD")
public class RegistroE530 extends Registro {

	@Column(name = "IND_AJ")
	@Indice(valor = 3)
	private String indAj;
	@Column(name = "VL_AJ")
	@Indice(valor = 4)
	private String vlAj;
	@Column(name = "COD_AJ")
	@Indice(valor = 5)
	private String codAj;
	@Column(name = "IND_DOC")
	@Indice(valor = 6)
	private String indDoc;
	@Column(name = "NUM_DOC")
	@Indice(valor = 7)
	private String numDoc;
	@Column(name = "DESCR_AJ")
	@Indice(valor = 8)
	private String descrAj;

	public RegistroE530(String linha) {
		super(linha);
	}

}
