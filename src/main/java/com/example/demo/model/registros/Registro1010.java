package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoId;
import com.example.demo.util.Indice;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "TAB_EFD_1010", schema = "APL_EFD")
public class Registro1010 extends Registro {

	@Column(name = "IND_EXP")
	@Indice(valor = 2)
	private String indExp;
	@Column(name = "IND_CCRF")
	@Indice(valor = 3)
	private String indCcrf;
	@Column(name = "IND_COMB")
	@Indice(valor = 4)
	private String indComb;
	@Column(name = "IND_USINA")
	@Indice(valor = 5)
	private String indUsina;
	@Column(name = "IND_VA")
	@Indice(valor = 6)
	private String indVa;
	@Column(name = "IND_EE")
	@Indice(valor = 7)
	private String indEe;
	@Column(name = "IND_CART")
	@Indice(valor = 8)
	private String indCart;
	@Column(name = "IND_FORM")
	@Indice(valor = 9)
	private String indForm;
	@Column(name = "IND_AER")
	@Indice(valor = 10)
	private String indAer;
	@Column(name = "IND_GIAF1")
	@Indice(valor = 11)
	private String indGiaf1;
	@Column(name = "IND_GIAF3")
	@Indice(valor = 12)
	private String indGiaf3;
	@Column(name = "IND_GIAF4")
	@Indice(valor = 13)
	private String indGiaf4;
	@Column(name = "IND_REST_RESSARC_COMPL_ICMS")
	@Indice(valor = 14)
	private String indRestRessarcComplIcms;
	@Column(name = "ID")
	@Indice(valor = 100)
	@Id
	@CampoTipoId
	private String id;

	public Registro1010(String linha) {
		super(linha);
	}

}
