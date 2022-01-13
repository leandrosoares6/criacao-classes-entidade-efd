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
@Table(name = "TAB_EFD_C810", schema = "APL_EFD")
public class RegistroC810 extends Registro {

	@Column(name = "NUM_ITEM")
	@Indice(valor = 3)
	private String numItem;
	@Column(name = "COD_ITEM")
	@Indice(valor = 4)
	private String codItem;
	@Column(name = "QTDE")
	@Indice(valor = 5)
	private String qtde;
	@Column(name = "UNID")
	@Indice(valor = 6)
	private String unid;
	@Column(name = "VL_ITEM")
	@Indice(valor = 7)
	private String vlItem;
	@Column(name = "CST_ICMS")
	@Indice(valor = 8)
	private String cstIcms;
	@Column(name = "CFOP")
	@Indice(valor = 9)
	private String cfop;

	public RegistroC810(String linha) {
		super(linha);
	}

}
