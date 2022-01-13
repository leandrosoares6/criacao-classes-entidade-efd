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
@Table(name = "TAB_EFD_1370", schema = "APL_EFD")
public class Registro1370 extends Registro {

	@Column(name = "NUM_BICO")
	@Indice(valor = 3)
	private String numBico;
	@Column(name = "COD_ITEM")
	@Indice(valor = 4)
	private String codItem;
	@Column(name = "NUM_TANQUE")
	@Indice(valor = 5)
	private String numTanque;

	public Registro1370(String linha) {
		super(linha);
	}

}
