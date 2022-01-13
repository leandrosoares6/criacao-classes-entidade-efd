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
@Table(name = "TAB_EFD_C595", schema = "APL_EFD")
public class RegistroC595 extends Registro {

	@Column(name = "COD_OBS")
	@Indice(valor = 6)
	private String codObs;
	@Column(name = "TXT_COMPL")
	@Indice(valor = 4)
	private String txtCompl;

	public RegistroC595(String linha) {
		super(linha);
	}

}
