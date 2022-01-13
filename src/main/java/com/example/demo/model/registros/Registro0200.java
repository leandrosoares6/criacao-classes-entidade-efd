package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
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
@Table(name = "TAB_EFD_0200", schema = "APL_EFD")
public class Registro0200 extends Registro {

	@Column(name = "COD_ITEM")
	@Indice(valor = 3)
	private String codItem;
	@Column(name = "DESCR_ITEM")
	@Indice(valor = 4)
	private String descrItem;
	@Column(name = "COD_BARRA")
	@Indice(valor = 5)
	private String codBarra;
	@Column(name = "COD_ANT_ITEM")
	@Indice(valor = 6)
	private String codAntItem;
	@Column(name = "UNID_INV")
	@Indice(valor = 7)
	private String unidInv;
	@Column(name = "TIPO_ITEM")
	@Indice(valor = 8)
	private String tipoItem;
	@Column(name = "COD_NCM")
	@Indice(valor = 9)
	private String codNcm;
	@Column(name = "EX_IPI")
	@Indice(valor = 10)
	private String exIpi;
	@Column(name = "COD_GEN")
	@Indice(valor = 11)
	private String codGen;
	@Column(name = "COD_LST")
	@Indice(valor = 12)
	private String codLst;
	@Column(name = "ALIQ_ICMS")
	@Indice(valor = 13)
	private String aliqIcms;
	@Column(name = "CEST")
	@Indice(valor = 14)
	private String cest;
	@Column(name = "DATA_PART")
	@Indice(valor = 15)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro0200(String linha) {
		super(linha);
	}

}
