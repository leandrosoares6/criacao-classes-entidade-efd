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
@Table(name = "TAB_EFD_0220", schema = "APL_EFD")
public class Registro0220 extends Registro {

	@Column(name = "UNID_CONV")
	@Indice(valor = 3)
	private String unidConv;
	@Column(name = "FAT_CONV")
	@Indice(valor = 4)
	private String fatConv;
	@Column(name = "DATA_PART")
	@Indice(valor = 5)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;

	public Registro0220(String linha) {
		super(linha);
	}

}
