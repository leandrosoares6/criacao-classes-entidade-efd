package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
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
@Table(name = "TAB_EFD_C870", schema = "APL_EFD")
public class RegistroC870 extends Registro {

	@Column(name = "COD_ITEM")
	@Indice(valor = 3)
	private String codItem;
	@Column(name = "QTD")
	@Indice(valor = 4)
	private String qtd;
	@Column(name = "UNID")
	@Indice(valor = 6)
	private String unid;
	@Column(name = "CST_ICMS")
	@Indice(valor = 8)
	private String cstIcms;
	@Column(name = "CFOP")
	@Indice(valor = 9)
	private String cfop;
	@Column(name = "DATA_PART")
	@Indice(valor = 13)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;

	public RegistroC870(String linha) {
		super(linha);
	}

}
