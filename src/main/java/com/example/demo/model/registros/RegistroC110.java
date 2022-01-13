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
@Table(name = "TAB_EFD_C110", schema = "APL_EFD")
public class RegistroC110 extends Registro {

	@Column(name = "COD_INF")
	@Indice(valor = 3)
	private String codInf;
	@Column(name = "TXT_COMPL")
	@Indice(valor = 4)
	private String txtCompl;
	@Column(name = "DATA_PART")
	@Indice(valor = 5)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;

	public RegistroC110(String linha) {
		super(linha);
	}

}
