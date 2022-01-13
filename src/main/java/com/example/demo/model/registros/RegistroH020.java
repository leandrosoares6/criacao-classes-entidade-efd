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
@Table(name = "TAB_EFD_H020", schema = "APL_EFD")
public class RegistroH020 extends Registro {

	@Column(name = "CST_ICMS")
	@Indice(valor = 3)
	private String cstIcms;
	@Column(name = "BC_ICMS")
	@Indice(valor = 4)
	private String bcIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 5)
	private String vlIcms;

	public RegistroH020(String linha) {
		super(linha);
	}

}
