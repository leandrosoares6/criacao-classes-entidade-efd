package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
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
@Table(name = "TAB_EFD_K260", schema = "APL_EFD")
public class RegistroK260 extends Registro {

	@Column(name = "COD_OP_OS")
	@Indice(valor = 3)
	private String codOpOs;
	@Column(name = "COD_ITEM")
	@Indice(valor = 4)
	private String codItem;
	@Column(name = "DT_SAIDA")
	@Indice(valor = 5)
	@CampoTipoData
	private String dtSaida;
	@Column(name = "QTD_SAIDA")
	@Indice(valor = 6)
	private String qtdSaida;
	@Column(name = "DT_RET")
	@Indice(valor = 7)
	@CampoTipoData
	private String dtRet;
	@Column(name = "QTD_RET")
	@Indice(valor = 8)
	private String qtdRet;

	public RegistroK260(String linha) {
		super(linha);
	}

}
