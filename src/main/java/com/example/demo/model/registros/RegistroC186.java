package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
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
@Table(name = "TAB_EFD_C186", schema = "APL_EFD")
public class RegistroC186 extends Registro {

	@Column(name = "NUM_ITEM")
	@Indice(valor = 3)
	private String numItem;
	@Column(name = "COD_ITEM")
	@Indice(valor = 4)
	private String codItem;
	@Column(name = "CST_ICMS")
	@Indice(valor = 5)
	private String cstIcms;
	@Column(name = "CFOP")
	@Indice(valor = 6)
	private String cfop;
	@Column(name = "COD_MOT_REST_COMPL")
	@Indice(valor = 7)
	private String codMotRestCompl;
	@Column(name = "QUANT_CONV")
	@Indice(valor = 8)
	private String quantConv;
	@Column(name = "UNID")
	@Indice(valor = 9)
	private String unid;
	@Column(name = "COD_MOD_ENTRADA")
	@Indice(valor = 10)
	private String codModEntrada;
	@Column(name = "SERIE_ENTRADA")
	@Indice(valor = 11)
	private String serieEntrada;
	@Column(name = "NUM_DOC_ENTRADA")
	@Indice(valor = 12)
	private String numDocEntrada;
	@Column(name = "CHV_DFE_ENTRADA")
	@Indice(valor = 13)
	private String chvDfeEntrada;
	@Column(name = "DT_DOC_ENTRADA")
	@Indice(valor = 13)
	private String dtDocEntrada;
	@Column(name = "NUM_ITEM_ENTRADA")
	@Indice(valor = 13)
	private String numItemEntrada;
	@Column(name = "VL_UNIT_CONV_ENTRADA")
	@Indice(valor = 13)
	private String vlUnitConvEntrada;
	@Column(name = "VL_UNIT_ICMS_OP_CONV_ENTRADA")
	@Indice(valor = 13)
	private String vlUnitIcmsOpConvEntrada;
	@Column(name = "VL_UNIT_BC_ICMS_ST_CONV_ENTRADA")
	@Indice(valor = 13)
	private String vlUnitBcIcmsStConvEntrada;
	@Column(name = "VL_UNIT_ICMS_ST_CONV_ENTRADA")
	@Indice(valor = 13)
	private String vlUnitIcmsStConvEntrada;
	@Column(name = "VL_UNIT_FCP_ST_CONV_ENTRADA")
	@Indice(valor = 13)
	private String vlUnitFcpStConvEntrada;

	public RegistroC186(String linha) {
		super(linha);
	}

}
