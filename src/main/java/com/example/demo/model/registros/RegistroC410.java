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
@Table(name = "TAB_EFD_C410", schema = "APL_EFD")
public class RegistroC410 extends Registro {

	@Column(name = "VL_PIS")
	@Indice(valor = 2)
	private String vlPis;
	@Column(name = "VL_COFINS")
	@Indice(valor = 3)
	private String vlCofins;

	public RegistroC410(String linha) {
		super(linha);
	}

}
