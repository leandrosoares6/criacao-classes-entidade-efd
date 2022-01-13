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
@Table(name = "TAB_EFD_K210", schema = "APL_EFD")
public class RegistroK210 extends Registro {

	@Column(name = "DT_INI_OS")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtIniOs;
	@Column(name = "DT_FIN_OS")
	@Indice(valor = 4)
	@CampoTipoData
	private String dtFinOs;
	@Column(name = "COD_DOC_OS")
	@Indice(valor = 5)
	private String codDocOs;
	@Column(name = "COD_ITEM_ORI")
	@Indice(valor = 6)
	private String codItemOri;
	@Column(name = "QTD_ORI")
	@Indice(valor = 7)
	private String qtdOri;

	public RegistroK210(String linha) {
		super(linha);
	}

}
