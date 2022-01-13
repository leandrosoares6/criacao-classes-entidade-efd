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
@Table(name = "TAB_EFD_0210", schema = "APL_EFD")
public class Registro0210 extends Registro {

	@Column(name = "COD_ITEM_COMP")
	@Indice(valor = 3)
	private String codItemComp;
	@Column(name = "QTD_COMP")
	@Indice(valor = 4)
	private String qtdComp;
	@Column(name = "PERDA")
	@Indice(valor = 5)
	private String perda;

	public Registro0210(String linha) {
		super(linha);
	}

}
