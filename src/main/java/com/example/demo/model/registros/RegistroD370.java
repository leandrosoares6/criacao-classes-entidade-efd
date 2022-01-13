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
@Table(name = "TAB_EFD_D370", schema = "APL_EFD")
public class RegistroD370 extends Registro {

	@Column(name = "COD_MUN_ORIG")
	@Indice(valor = 3)
	private String codMunOrig;
	@Column(name = "VL_SERV")
	@Indice(valor = 4)
	private String vlServ;
	@Column(name = "QTD_BILH")
	@Indice(valor = 5)
	private String qtdBilh;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 6)
	private String vlBcIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 7)
	private String vlIcms;

	public RegistroD370(String linha) {
		super(linha);
	}

}
