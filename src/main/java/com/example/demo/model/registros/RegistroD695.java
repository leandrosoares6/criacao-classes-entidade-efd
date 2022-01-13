package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoId;
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
@Table(name = "TAB_EFD_D695", schema = "APL_EFD")
public class RegistroD695 extends Registro {

	@Column(name = "COD_MOD")
	@Indice(valor = 3)
	private String codMod;
	@Column(name = "SER")
	@Indice(valor = 4)
	private String ser;
	@Column(name = "NRO_ORD_INI")
	@Indice(valor = 5)
	private String nroOrdIni;
	@Column(name = "NRO_ORD_FIN")
	@Indice(valor = 6)
	private String nroOrdFin;
	@Column(name = "DT_DOC_INI")
	@Indice(valor = 7)
	@CampoTipoData
	private String dtDocIni;
	@Column(name = "DT_DOC_FIN")
	@Indice(valor = 8)
	@CampoTipoData
	private String dtDocFin;
	@Column(name = "NOM_MEST")
	@Indice(valor = 9)
	private String nomMest;
	@Column(name = "CHV_COD_DIG")
	@Indice(valor = 10)
	private String chvCodDig;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public RegistroD695(String linha) {
		super(linha);
	}

}
