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
@Table(name = "TAB_EFD_0500", schema = "APL_EFD")
public class Registro0500 extends Registro {

	@Column(name = "DT_ALT")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtAlt;
	@Column(name = "COD_NAT_CC")
	@Indice(valor = 4)
	private String codNatCc;
	@Column(name = "IND_CTA")
	@Indice(valor = 5)
	private String indCta;
	@Column(name = "NIVEL")
	@Indice(valor = 6)
	private String nivel;
	@Column(name = "COD_CTA")
	@Indice(valor = 7)
	private String codCta;
	@Column(name = "NOME_CTA")
	@Indice(valor = 8)
	private String nomeCta;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro0500(String linha) {
		super(linha);
	}

}
