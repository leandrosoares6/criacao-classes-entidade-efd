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
@Table(name = "TAB_EFD_0206", schema = "APL_EFD")
public class Registro0206 extends Registro {

	@Column(name = "COD_COMB")
	@Indice(valor = 2)
	private String codComb;

	public Registro0206(String linha) {
		super(linha);
	}

}
