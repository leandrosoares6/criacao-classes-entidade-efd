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
@Table(name = "TAB_EFD_D360", schema = "APL_EFD")
public class RegistroD360 extends Registro {

	@Column(name = "VL_PIS")
	@Indice(valor = 2)
	private String vlPis;
	@Column(name = "VL_COFINS")
	@Indice(valor = 3)
	private String vlCofins;

	public RegistroD360(String linha) {
		super(linha);
	}

}
