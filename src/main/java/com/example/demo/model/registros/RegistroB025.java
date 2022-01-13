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
@Table(name = "TAB_EFD_B025", schema = "APL_EFD")
public class RegistroB025 extends Registro {

	@Column(name = "VL_CONT_P")
	@Indice(valor = 5)
	private String vlContP;
	@Column(name = "VL_BC_ISS_P")
	@Indice(valor = 5)
	private String vlBcIssP;
	@Column(name = "ALIQ_ISS")
	@Indice(valor = 5)
	private String aliqIss;
	@Column(name = "VL_ISS_P")
	@Indice(valor = 5)
	private String vlIssP;
	@Column(name = "VL_ISNT_ISS_P")
	@Indice(valor = 5)
	private String vlIsntIssP;
	@Column(name = "COD_SERV")
	@Indice(valor = 2)
	private String codServ;

	public RegistroB025(String linha) {
		super(linha);
	}

}
