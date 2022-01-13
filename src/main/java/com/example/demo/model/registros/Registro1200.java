package com.example.demo.model.registros;

import com.example.demo.model.Registro;
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
@Table(name = "TAB_EFD_1200", schema = "APL_EFD")
public class Registro1200 extends Registro {

	@Column(name = "COD_AJ_APUR")
	@Indice(valor = 3)
	private String codAjApur;
	@Column(name = "SLD_CRED")
	@Indice(valor = 4)
	private String sldCred;
	@Column(name = "CRED_APR")
	@Indice(valor = 5)
	private String credApr;
	@Column(name = "CRED_RECEB")
	@Indice(valor = 6)
	private String credReceb;
	@Column(name = "CRED_UTIL")
	@Indice(valor = 7)
	private String credUtil;
	@Column(name = "SLD_CRED_FIM")
	@Indice(valor = 8)
	private String sldCredFim;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro1200(String linha) {
		super(linha);
	}

}
