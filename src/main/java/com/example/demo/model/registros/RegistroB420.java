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
@Table(name = "TAB_EFD_B420", schema = "APL_EFD")
public class RegistroB420 extends Registro {

	@Column(name = "VL_CONT")
	@Indice(valor = 5)
	private String vlCont;
	@Column(name = "VL_BC_ISS")
	@Indice(valor = 5)
	private String vlBcIss;
	@Column(name = "ALIQ_ISS")
	@Indice(valor = 5)
	private String aliqIss;
	@Column(name = "VL_ISNT_ISS")
	@Indice(valor = 5)
	private String vlIsntIss;
	@Column(name = "VL_ISS")
	@Indice(valor = 5)
	private String vlIss;
	@Column(name = "COD_SERV")
	@Indice(valor = 2)
	private String codServ;

	public RegistroB420(String linha) {
		super(linha);
	}

}
