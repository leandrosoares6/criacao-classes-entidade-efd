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
@Table(name = "TAB_EFD_C172", schema = "APL_EFD")
public class RegistroC172 extends Registro {

	@Column(name = "VL_BC_ISSQN")
	@Indice(valor = 2)
	private String vlBcIssqn;
	@Column(name = "ALIQ_ISSQN")
	@Indice(valor = 3)
	private String aliqIssqn;
	@Column(name = "VL_ISSQN")
	@Indice(valor = 4)
	private String vlIssqn;

	public RegistroC172(String linha) {
		super(linha);
	}

}
