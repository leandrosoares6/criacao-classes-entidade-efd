package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
import com.example.demo.util.CampoTipoId;
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
@Table(name = "TAB_EFD_0300", schema = "APL_EFD")
public class Registro0300 extends Registro {

	@Column(name = "COD_IND_BEM")
	@Indice(valor = 3)
	private String codIndBem;
	@Column(name = "IDENT_MERC")
	@Indice(valor = 4)
	private String identMerc;
	@Column(name = "DESCR_ITEM")
	@Indice(valor = 5)
	private String descrItem;
	@Column(name = "COD_PRNC")
	@Indice(valor = 6)
	private String codPrnc;
	@Column(name = "COD_CTA")
	@Indice(valor = 7)
	private String codCta;
	@Column(name = "NR_PARC")
	@Indice(valor = 8)
	private String nrParc;
	@Column(name = "DATA_PART")
	@Indice(valor = 9)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro0300(String linha) {
		super(linha);
	}

}
