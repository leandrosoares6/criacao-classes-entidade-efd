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
@Table(name = "TAB_EFD_K270", schema = "APL_EFD")
public class RegistroK270 extends Registro {

	@Column(name = "DT_INI_AP")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtIniAp;
	@Column(name = "DT_FIN_AP")
	@Indice(valor = 4)
	@CampoTipoData
	private String dtFinAp;
	@Column(name = "COD_OP_OS")
	@Indice(valor = 5)
	private String codOpOs;
	@Column(name = "COD_ITEM")
	@Indice(valor = 6)
	private String codItem;
	@Column(name = "QTD_COR_POS")
	@Indice(valor = 7)
	private String qtdCorPos;
	@Column(name = "QTD_COR_NEG")
	@Indice(valor = 8)
	private String qtdCorNeg;
	@Column(name = "ORIGEM")
	@Indice(valor = 9)
	private String origem;

	public RegistroK270(String linha) {
		super(linha);
	}

}
