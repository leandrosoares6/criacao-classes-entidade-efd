package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
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
@Table(name = "TAB_EFD_K220", schema = "APL_EFD")
public class RegistroK220 extends Registro {

	@Column(name = "DT_MOV")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtMov;
	@Column(name = "COD_ITEM_ORI")
	@Indice(valor = 4)
	private String codItemOri;
	@Column(name = "COD_ITEM_DEST")
	@Indice(valor = 5)
	private String codItemDest;
	@Column(name = "QTD")
	@Indice(valor = 6)
	private String qtd;
	@Column(name = "QTD_DEST")
	@Indice(valor = 7)
	private String qtdDest;

	public RegistroK220(String linha) {
		super(linha);
	}

}
