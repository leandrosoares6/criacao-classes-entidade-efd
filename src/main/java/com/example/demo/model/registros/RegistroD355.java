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
@Table(name = "TAB_EFD_D355", schema = "APL_EFD")
public class RegistroD355 extends Registro {

	@Column(name = "DT_DOC")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "CRO")
	@Indice(valor = 4)
	private String cro;
	@Column(name = "CRZ")
	@Indice(valor = 5)
	private String crz;
	@Column(name = "NUM_COO_FIN")
	@Indice(valor = 6)
	private String numCooFin;
	@Column(name = "GT_FIN")
	@Indice(valor = 7)
	private String gtFin;
	@Column(name = "VL_BRT")
	@Indice(valor = 8)
	private String vlBrt;

	public RegistroD355(String linha) {
		super(linha);
	}

}