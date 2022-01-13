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
@Table(name = "TAB_EFD_C320", schema = "APL_EFD")
public class RegistroC320 extends Registro {

	@Column(name = "CST_ICMS")
	@Indice(valor = 3)
	private String cstIcms;
	@Column(name = "CFOP")
	@Indice(valor = 4)
	private String cfop;
	@Column(name = "ALIQ_ICMS")
	@Indice(valor = 5)
	private String aliqIcms;
	@Column(name = "VL_OPER")
	@Indice(valor = 6)
	private String vlOper;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 7)
	private String vlBcIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 8)
	private String vlIcms;
	@Column(name = "VL_RED_BC")
	@Indice(valor = 9)
	private String vlRedBc;
	@Column(name = "COD_OBS")
	@Indice(valor = 10)
	private String codObs;
	@Column(name = "DATA_PART")
	@Indice(valor = 11)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;

	public RegistroC320(String linha) {
		super(linha);
	}

}
