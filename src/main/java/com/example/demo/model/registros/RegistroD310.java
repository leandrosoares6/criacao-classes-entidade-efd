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
@Table(name = "TAB_EFD_D310", schema = "APL_EFD")
public class RegistroD310 extends Registro {

	@Column(name = "COD_MUN_ORIG")
	@Indice(valor = 3)
	private String codMunOrig;
	@Column(name = "VL_SERV")
	@Indice(valor = 4)
	private String vlServ;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 5)
	private String vlBcIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 6)
	private String vlIcms;

	public RegistroD310(String linha) {
		super(linha);
	}

}
