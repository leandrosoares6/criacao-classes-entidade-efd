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
@Table(name = "TAB_EFD_D400", schema = "APL_EFD")
public class RegistroD400 extends Registro {

	@Column(name = "COD_PART")
	@Indice(valor = 3)
	private String codPart;
	@Column(name = "COD_MOD")
	@Indice(valor = 4)
	private String codMod;
	@Column(name = "COD_SIT")
	@Indice(valor = 5)
	private String codSit;
	@Column(name = "SER")
	@Indice(valor = 6)
	private String ser;
	@Column(name = "SUB")
	@Indice(valor = 7)
	private String sub;
	@Column(name = "NUM_DOC")
	@Indice(valor = 8)
	private String numDoc;
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
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 13)
	private String vlBcIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 14)
	private String vlIcms;
	@Column(name = "VL_PIS")
	@Indice(valor = 15)
	private String vlPis;
	@Column(name = "VL_COFINS")
	@Indice(valor = 16)
	private String vlCofins;
	@Column(name = "COD_CTA")
	@Indice(valor = 17)
	private String codCta;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public RegistroD400(String linha) {
		super(linha);
	}

}
