package com.example.demo.model.registros;

import com.example.demo.model.Registro;
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
@Table(name = "TAB_EFD_C480", schema = "APL_EFD")
public class RegistroC480 extends Registro {

	@Column(name = "COD_MOT_REST_COMPL")
	@Indice(valor = 4)
	private String codMotRestCompl;
	@Column(name = "QUANT_CONV")
	@Indice(valor = 6)
	private String quantConv;
	@Column(name = "UNID")
	@Indice(valor = 4)
	private String unid;
	@Column(name = "VL_UNIT_CONV")
	@Indice(valor = 6)
	private String vlUnitConv;
	@Column(name = "VL_UNIT_ICMS_NA_OPERACAO_CONV")
	@Indice(valor = 6)
	private String vlUnitIcmsNaOperacaoConv;
	@Column(name = "VL_UNIT_ICMS_OP_CONV")
	@Indice(valor = 6)
	private String vlUnitIcmsOpConv;
	@Column(name = "VL_UNIT_ICMS_OP_ESTOQUE_CONV")
	@Indice(valor = 6)
	private String vlUnitIcmsOpEstoqueConv;
	@Column(name = "VL_UNIT_ICMS_ST_ESTOQUE_CONV")
	@Indice(valor = 6)
	private String vlUnitIcmsStEstoqueConv;
	@Column(name = "VL_UNIT_FCP_ICMS_ST_ESTOQUE_CONV")
	@Indice(valor = 6)
	private String vlUnitFcpIcmsStEstoqueConv;
	@Column(name = "VL_UNIT_ICMS_ST_CONV_REST")
	@Indice(valor = 6)
	private String vlUnitIcmsStConvRest;
	@Column(name = "VL_UNIT_FCP_ST_CONV_REST")
	@Indice(valor = 6)
	private String vlUnitFcpStConvRest;
	@Column(name = "VL_UNIT_ICMS_ST_CONV_COMPL")
	@Indice(valor = 6)
	private String vlUnitIcmsStConvCompl;
	@Column(name = "VL_UNIT_FCP_ST_CONV_COMPL")
	@Indice(valor = 6)
	private String vlUnitFcpStConvCompl;
	@Column(name = "CST_ICMS")
	@Indice(valor = 6)
	private String cstIcms;
	@Column(name = "CFOP")
	@Indice(valor = 6)
	private String cfop;

	public RegistroC480(String linha) {
		super(linha);
	}

}
