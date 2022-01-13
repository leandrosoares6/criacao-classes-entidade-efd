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
@Table(name = "TAB_EFD_1975", schema = "APL_EFD")
public class Registro1975 extends Registro {

	@Column(name = "ALIQ_IMP_BASE")
	@Indice(valor = 4)
	private String aliqImpBase;
	@Column(name = "G3_10")
	@Indice(valor = 4)
	private String g310;
	@Column(name = "G3_11")
	@Indice(valor = 4)
	private String g311;
	@Column(name = "G3_12")
	@Indice(valor = 4)
	private String g312;

	public Registro1975(String linha) {
		super(linha);
	}

}
