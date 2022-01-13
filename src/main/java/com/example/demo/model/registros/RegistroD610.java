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
@Table(name = "TAB_EFD_D610", schema = "APL_EFD")
public class RegistroD610 extends Registro {

	@Column(name = "COD_CLASS")
	@Indice(valor = 3)
	private String codClass;
	@Column(name = "COD_ITEM")
	@Indice(valor = 4)
	private String codItem;
	@Column(name = "QTD")
	@Indice(valor = 5)
	private String qtd;
	@Column(name = "UNID")
	@Indice(valor = 6)
	private String unid;
	@Column(name = "VL_ITEM")
	@Indice(valor = 7)
	private String vlItem;
	@Column(name = "VL_DESC")
	@Indice(valor = 8)
	private String vlDesc;
	@Column(name = "CST_ICMS")
	@Indice(valor = 9)
	private String cstIcms;
	@Column(name = "CFOP")
	@Indice(valor = 10)
	private String cfop;
	@Column(name = "ALIQ_ICMS")
	@Indice(valor = 11)
	private String aliqIcms;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 12)
	private String vlBcIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 13)
	private String vlIcms;
	@Column(name = "VL_BC_ICMS_UF")
	@Indice(valor = 14)
	private String vlBcIcmsUf;
	@Column(name = "VL_ICMS_UF")
	@Indice(valor = 15)
	private String vlIcmsUf;
	@Column(name = "VL_RED_BC")
	@Indice(valor = 16)
	private String vlRedBc;
	@Column(name = "VL_PIS")
	@Indice(valor = 17)
	private String vlPis;
	@Column(name = "VL_COFINS")
	@Indice(valor = 18)
	private String vlCofins;
	@Column(name = "COD_CTA")
	@Indice(valor = 19)
	private String codCta;

	public RegistroD610(String linha) {
		super(linha);
	}

}
