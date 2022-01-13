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
@Table(name = "TAB_EFD_D390", schema = "APL_EFD")
public class RegistroD390 extends Registro {

	@Column(name = "CST_ICMS")
	@Indice(valor = 3)
	private String cstIcms;
	@Column(name = "CFOP")
	@Indice(valor = 4)
	private String cfop;
	@Column(name = "ALIQ_ICMS")
	@Indice(valor = 5)
	private String aliqIcms;
	@Column(name = "VL_OPR")
	@Indice(valor = 6)
	private String vlOpr;
	@Column(name = "VL_BC_ISSQN")
	@Indice(valor = 7)
	private String vlBcIssqn;
	@Column(name = "ALIQ_ISSQN")
	@Indice(valor = 8)
	private String aliqIssqn;
	@Column(name = "VL_ISSQN")
	@Indice(valor = 9)
	private String vlIssqn;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 10)
	private String vlBcIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 11)
	private String vlIcms;
	@Column(name = "COD_OBS")
	@Indice(valor = 12)
	private String codObs;

	public RegistroD390(String linha) {
		super(linha);
	}

}
