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
@Table(name = "TAB_EFD_C171", schema = "APL_EFD")
public class RegistroC171 extends Registro {

	@Column(name = "NUM_TANQUE")
	@Indice(valor = 3)
	private String numTanque;
	@Column(name = "QTDE")
	@Indice(valor = 4)
	private String qtde;

	public RegistroC171(String linha) {
		super(linha);
	}

}
