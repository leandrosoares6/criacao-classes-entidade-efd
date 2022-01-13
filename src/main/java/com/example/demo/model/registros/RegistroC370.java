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
@Table(name = "TAB_EFD_C370", schema = "APL_EFD")
public class RegistroC370 extends Registro {

	@Column(name = "NUM_ITEM")
	@Indice(valor = 3)
	private String numItem;
	@Column(name = "COD_ITEM")
	@Indice(valor = 4)
	private String codItem;
	@Column(name = "QTD")
	@Indice(valor = 5)
	private String qtd;
	@Column(name = "UNID")
	@Indice(valor = 6)
	private String unid;
	@Column(name = "VL_ITEM")
	@Indice(valor = 7)
	private String vlItem;
	@Column(name = "VL_DESC")
	@Indice(valor = 8)
	private String vlDesc;

	public RegistroC370(String linha) {
		super(linha);
	}

}
