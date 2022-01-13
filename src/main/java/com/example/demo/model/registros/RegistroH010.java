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
@Table(name = "TAB_EFD_H010", schema = "APL_EFD")
public class RegistroH010 extends Registro {

	@Column(name = "COD_ITEM")
	@Indice(valor = 3)
	private String codItem;
	@Column(name = "UNID")
	@Indice(valor = 4)
	private String unid;
	@Column(name = "QTD")
	@Indice(valor = 5)
	private String qtd;
	@Column(name = "VL_UNIT")
	@Indice(valor = 6)
	private String vlUnit;
	@Column(name = "VL_ITEM")
	@Indice(valor = 7)
	private String vlItem;
	@Column(name = "IND_PROP")
	@Indice(valor = 8)
	private String indProp;
	@Column(name = "COD_PART")
	@Indice(valor = 9)
	private String codPart;
	@Column(name = "TXT_COMPL")
	@Indice(valor = 10)
	private String txtCompl;
	@Column(name = "COD_CTA")
	@Indice(valor = 11)
	private String codCta;
	@Column(name = "VL_ITEM_IR")
	@Indice(valor = 12)
	private String vlItemIr;

	public RegistroH010(String linha) {
		super(linha);
	}

}
