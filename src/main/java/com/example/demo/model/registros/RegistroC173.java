package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
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
@Table(name = "TAB_EFD_C173", schema = "APL_EFD")
public class RegistroC173 extends Registro {

	@Column(name = "LOTE_MED")
	@Indice(valor = 3)
	private String loteMed;
	@Column(name = "QTD_ITEM")
	@Indice(valor = 4)
	private String qtdItem;
	@Column(name = "DT_FAB")
	@Indice(valor = 5)
	@CampoTipoData
	private String dtFab;
	@Column(name = "DT_VAL")
	@Indice(valor = 6)
	@CampoTipoData
	private String dtVal;
	@Column(name = "IND_MED")
	@Indice(valor = 7)
	private String indMed;
	@Column(name = "TP_PROD")
	@Indice(valor = 8)
	private String tpProd;
	@Column(name = "VL_TAB_MAX")
	@Indice(valor = 9)
	private String vlTabMax;
	@Column(name = "DATA_PART")
	@Indice(valor = 10)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;

	public RegistroC173(String linha) {
		super(linha);
	}

}
