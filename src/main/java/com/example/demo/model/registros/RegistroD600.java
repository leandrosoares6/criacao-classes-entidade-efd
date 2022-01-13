package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoId;
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
@Table(name = "TAB_EFD_D600", schema = "APL_EFD")
public class RegistroD600 extends Registro {

	@Column(name = "COD_MOD")
	@Indice(valor = 3)
	private String codMod;
	@Column(name = "COD_MUN")
	@Indice(valor = 4)
	private String codMun;
	@Column(name = "SER")
	@Indice(valor = 5)
	private String ser;
	@Column(name = "SUB")
	@Indice(valor = 6)
	private String sub;
	@Column(name = "COD_CONS")
	@Indice(valor = 7)
	private String codCons;
	@Column(name = "QTD_CONS")
	@Indice(valor = 8)
	private String qtdCons;
	@Column(name = "DT_DOC")
	@Indice(valor = 9)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "VL_DOC")
	@Indice(valor = 10)
	private String vlDoc;
	@Column(name = "VL_DESC")
	@Indice(valor = 11)
	private String vlDesc;
	@Column(name = "VL_SERV")
	@Indice(valor = 12)
	private String vlServ;
	@Column(name = "VL_SERV_NT")
	@Indice(valor = 13)
	private String vlServNt;
	@Column(name = "VL_TERC")
	@Indice(valor = 14)
	private String vlTerc;
	@Column(name = "VL_DA")
	@Indice(valor = 15)
	private String vlDa;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 16)
	private String vlBcIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 17)
	private String vlIcms;
	@Column(name = "VL_PIS")
	@Indice(valor = 18)
	private String vlPis;
	@Column(name = "VL_COFINS")
	@Indice(valor = 19)
	private String vlCofins;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public RegistroD600(String linha) {
		super(linha);
	}

}
