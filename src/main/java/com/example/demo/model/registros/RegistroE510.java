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
@Table(name = "TAB_EFD_E510", schema = "APL_EFD")
public class RegistroE510 extends Registro {

	@Column(name = "CFOP")
	@Indice(valor = 3)
	private String cfop;
	@Column(name = "CST_IPI")
	@Indice(valor = 4)
	private String cstIpi;
	@Column(name = "VL_CONT_IPI")
	@Indice(valor = 5)
	private String vlContIpi;
	@Column(name = "VL_BC_IPI")
	@Indice(valor = 6)
	private String vlBcIpi;
	@Column(name = "VL_IPI")
	@Indice(valor = 7)
	private String vlIpi;

	public RegistroE510(String linha) {
		super(linha);
	}

}
