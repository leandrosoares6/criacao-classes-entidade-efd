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
@Table(name = "TAB_EFD_G125", schema = "APL_EFD")
public class RegistroG125 extends Registro {

	@Column(name = "COD_IND_BEM")
	@Indice(valor = 3)
	private String codIndBem;
	@Column(name = "DT_MOV")
	@Indice(valor = 4)
	@CampoTipoData
	private String dtMov;
	@Column(name = "TIPO_MOV")
	@Indice(valor = 5)
	private String tipoMov;
	@Column(name = "VL_IMOB_ICMS_OP")
	@Indice(valor = 6)
	private String vlImobIcmsOp;
	@Column(name = "VL_IMOB_ICMS_ST")
	@Indice(valor = 7)
	private String vlImobIcmsSt;
	@Column(name = "VL_IMOB_ICMS_FRT")
	@Indice(valor = 8)
	private String vlImobIcmsFrt;
	@Column(name = "VL_IMOB_ICMS_DIF")
	@Indice(valor = 9)
	private String vlImobIcmsDif;
	@Column(name = "NUM_PARC")
	@Indice(valor = 10)
	private String numParc;
	@Column(name = "VL_PARC_PASS")
	@Indice(valor = 11)
	private String vlParcPass;
	@Column(name = "DATA_PART")
	@Indice(valor = 12)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;

	public RegistroG125(String linha) {
		super(linha);
	}

}
