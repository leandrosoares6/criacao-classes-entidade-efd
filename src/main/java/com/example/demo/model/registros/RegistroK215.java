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
@Table(name = "TAB_EFD_K215", schema = "APL_EFD")
public class RegistroK215 extends Registro {

	@Column(name = "COD_ITEM_DES")
	@Indice(valor = 3)
	private String codItemDes;
	@Column(name = "QTD_DES")
	@Indice(valor = 4)
	private String qtdDes;

	public RegistroK215(String linha) {
		super(linha);
	}

}
