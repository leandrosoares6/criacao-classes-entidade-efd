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
@Table(name = "TAB_EFD_C177", schema = "APL_EFD")
public class RegistroC177 extends Registro {

	@Column(name = "COD_INF_ITEM")
	@Indice(valor = 2)
	private String codInfItem;

	public RegistroC177(String linha) {
		super(linha);
	}

}
