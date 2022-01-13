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
@Table(name = "TAB_EFD_K265", schema = "APL_EFD")
public class RegistroK265 extends Registro {

	@Column(name = "COD_ITEM")
	@Indice(valor = 3)
	private String codItem;
	@Column(name = "QTD_CONS")
	@Indice(valor = 4)
	private String qtdCons;
	@Column(name = "QTD_RET")
	@Indice(valor = 5)
	private String qtdRet;

	public RegistroK265(String linha) {
		super(linha);
	}

}
