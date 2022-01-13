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
@Table(name = "TAB_EFD_C425", schema = "APL_EFD")
public class RegistroC425 extends Registro {

	@Column(name = "COD_ITEM")
	@Indice(valor = 3)
	private String codItem;
	@Column(name = "QTD")
	@Indice(valor = 4)
	private String qtd;
	@Column(name = "UNID")
	@Indice(valor = 5)
	private String unid;
	@Column(name = "VL_ITEM")
	@Indice(valor = 6)
	private String vlItem;
	@Column(name = "VL_PIS")
	@Indice(valor = 7)
	private String vlPis;
	@Column(name = "VL_COFINS")
	@Indice(valor = 8)
	private String vlCofins;
	@Column(name = "DATA_PART")
	@Indice(valor = 9)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;

	public RegistroC425(String linha) {
		super(linha);
	}

}
