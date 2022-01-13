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
@Table(name = "TAB_EFD_K275", schema = "APL_EFD")
public class RegistroK275 extends Registro {

	@Column(name = "COD_ITEM")
	@Indice(valor = 3)
	private String codItem;
	@Column(name = "QTD_COR_POS")
	@Indice(valor = 4)
	private String qtdCorPos;
	@Column(name = "QTD_COR_NEG")
	@Indice(valor = 5)
	private String qtdCorNeg;
	@Column(name = "COD_INST_SUBST")
	@Indice(valor = 6)
	private String codInstSubst;

	public RegistroK275(String linha) {
		super(linha);
	}

}
