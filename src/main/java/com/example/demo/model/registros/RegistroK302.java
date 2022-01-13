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
@Table(name = "TAB_EFD_K302", schema = "APL_EFD")
public class RegistroK302 extends Registro {

	@Column(name = "COD_ITEM")
	@Indice(valor = 6)
	private String codItem;
	@Column(name = "QTD")
	@Indice(valor = 7)
	private String qtd;

	public RegistroK302(String linha) {
		super(linha);
	}

}
