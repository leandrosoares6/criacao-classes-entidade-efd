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
@Table(name = "TAB_EFD_C105", schema = "APL_EFD")
public class RegistroC105 extends Registro {

	@Column(name = "OPER")
	@Indice(valor = 2)
	private String oper;
	@Column(name = "UF")
	@Indice(valor = 3)
	private String uf;

	public RegistroC105(String linha) {
		super(linha);
	}

}
