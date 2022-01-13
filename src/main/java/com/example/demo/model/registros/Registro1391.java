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
@Table(name = "TAB_EFD_1391", schema = "APL_EFD")
public class Registro1391 extends Registro {

	@Column(name = "DT_REGISTRO")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtRegistro;
	@Column(name = "QTD_MOID")
	@Indice(valor = 4)
	private String qtdMoid;
	@Column(name = "ESTQ_INI")
	@Indice(valor = 5)
	private String estqIni;
	@Column(name = "QTD_PRODUZ")
	@Indice(valor = 6)
	private String qtdProduz;
	@Column(name = "ENT_ANID_HID")
	@Indice(valor = 7)
	private String entAnidHid;
	@Column(name = "OUTR_ENTR")
	@Indice(valor = 8)
	private String outrEntr;
	@Column(name = "PERDA")
	@Indice(valor = 9)
	private String perda;
	@Column(name = "CONS")
	@Indice(valor = 10)
	private String cons;
	@Column(name = "SAI_ANI_HID")
	@Indice(valor = 11)
	private String saiAniHid;
	@Column(name = "SAIDAS")
	@Indice(valor = 12)
	private String saidas;
	@Column(name = "ESTQ_FIN")
	@Indice(valor = 13)
	private String estqFin;
	@Column(name = "ESTQ_INI_MEL")
	@Indice(valor = 14)
	private String estqIniMel;
	@Column(name = "PROD_DIA_MEL")
	@Indice(valor = 15)
	private String prodDiaMel;
	@Column(name = "UTIL_MEL")
	@Indice(valor = 16)
	private String utilMel;
	@Column(name = "PROD_ALC_MEL")
	@Indice(valor = 17)
	private String prodAlcMel;
	@Column(name = "OBS")
	@Indice(valor = 18)
	private String obs;
	@Column(name = "COD_ITEM")
	@Indice(valor = 19)
	private String codItem;
	@Column(name = "TP_RESIDUO")
	@Indice(valor = 20)
	private String tpResiduo;
	@Column(name = "QTD_RESIDUO")
	@Indice(valor = 21)
	private String qtdResiduo;

	public Registro1391(String linha) {
		super(linha);
	}

}
