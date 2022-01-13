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
@Table(name = "TAB_EFD_C380", schema = "APL_EFD")
public class RegistroC380 extends Registro {

	@Column(name = "COD_MOT_REST_COMPL")
	@Indice(valor = 5)
	private String codMotRestCompl;
	@Column(name = "QUANT_CONV")
	@Indice(valor = 4)
	private String quantConv;
	@Column(name = "UNID")
	@Indice(valor = 5)
	private String unid;
	@Column(name = "VL_UNIT_CONV")
	@Indice(valor = 6)
	private String vlUnitConv;
	@Column(name = "VL_UNIT_ICMS_NA_OPERACAO_CONV")
	@Indice(valor = 7)
	private String vlUnitIcmsNaOperacaoConv;
	@Column(name = "VL_UNIT_ICMS_OP_CONV")
	@Indice(valor = 8)
	private String vlUnitIcmsOpConv;
	@Column(name = "VL_UNIT_ICMS_OP_ESTOQUE_CONV")
	@Indice(valor = 9)
	private String vlUnitIcmsOpEstoqueConv;
	@Column(name = "VL_UNIT_ICMS_ST_ESTOQUE_CONV")
	@Indice(valor = 10)
	private String vlUnitIcmsStEstoqueConv;
	@Column(name = "VL_UNIT_FCP_ICMS_ST_ESTOQUE_CONV")
	@Indice(valor = 11)
	private String vlUnitFcpIcmsStEstoqueConv;
	@Column(name = "VL_UNIT_ICMS_ST_CONV_REST")
	@Indice(valor = 11)
	private String vlUnitIcmsStConvRest;
	@Column(name = "VL_UNIT_FCP_ST_CONV_REST")
	@Indice(valor = 11)
	private String vlUnitFcpStConvRest;
	@Column(name = "VL_UNIT_ICMS_ST_CONV_COMPL")
	@Indice(valor = 11)
	private String vlUnitIcmsStConvCompl;
	@Column(name = "VL_UNIT_FCP_ST_CONV_COMPL")
	@Indice(valor = 11)
	private String vlUnitFcpStConvCompl;
	@Column(name = "CST_ICMS")
	@Indice(valor = 11)
	private String cstIcms;
	@Column(name = "CFOP")
	@Indice(valor = 11)
	private String cfop;
	@Column(name = "DATA_PART")
	@Indice(valor = 12)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;

	public RegistroC380(String linha) {
		super(linha);
	}

}
