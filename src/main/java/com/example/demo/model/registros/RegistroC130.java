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
@Table(name = "TAB_EFD_C130", schema = "APL_EFD")
public class RegistroC130 extends Registro {

	@Column(name = "VL_SERV_NT")
	@Indice(valor = 2)
	private String vlServNt;
	@Column(name = "VL_BC_ISSQN")
	@Indice(valor = 3)
	private String vlBcIssqn;
	@Column(name = "VL_ISSQN")
	@Indice(valor = 4)
	private String vlIssqn;
	@Column(name = "VL_BC_IRRF")
	@Indice(valor = 5)
	private String vlBcIrrf;
	@Column(name = "VL_IRRF")
	@Indice(valor = 6)
	private String vlIrrf;
	@Column(name = "VL_BC_PREV")
	@Indice(valor = 7)
	private String vlBcPrev;
	@Column(name = "VL_PREV")
	@Indice(valor = 8)
	private String vlPrev;

	public RegistroC130(String linha) {
		super(linha);
	}

}
