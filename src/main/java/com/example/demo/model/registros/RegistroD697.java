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
@Table(name = "TAB_EFD_D697", schema = "APL_EFD")
public class RegistroD697 extends Registro {

	@Column(name = "UF")
	@Indice(valor = 3)
	private String uf;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 4)
	private String vlBcIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 5)
	private String vlIcms;

	public RegistroD697(String linha) {
		super(linha);
	}

}
