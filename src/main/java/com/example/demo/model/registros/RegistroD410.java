package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
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
@Table(name = "TAB_EFD_D410", schema = "APL_EFD")
public class RegistroD410 extends Registro {

	@Column(name = "COD_MOD")
	@Indice(valor = 3)
	private String codMod;
	@Column(name = "SER")
	@Indice(valor = 4)
	private String ser;
	@Column(name = "SUB")
	@Indice(valor = 5)
	private String sub;
	@Column(name = "NUM_DOC_INI")
	@Indice(valor = 6)
	private String numDocIni;
	@Column(name = "NUM_DOC_FIN")
	@Indice(valor = 7)
	private String numDocFin;
	@Column(name = "DT_DOC")
	@Indice(valor = 8)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "CST_ICMS")
	@Indice(valor = 9)
	private String cstIcms;
	@Column(name = "CFOP")
	@Indice(valor = 10)
	private String cfop;
	@Column(name = "ALIQ_ICMS")
	@Indice(valor = 11)
	private String aliqIcms;
	@Column(name = "VL_OPR")
	@Indice(valor = 12)
	private String vlOpr;
	@Column(name = "VL_DESC")
	@Indice(valor = 13)
	private String vlDesc;
	@Column(name = "VL_SERV")
	@Indice(valor = 14)
	private String vlServ;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 15)
	private String vlBcIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 16)
	private String vlIcms;

	public RegistroD410(String linha) {
		super(linha);
	}

}
