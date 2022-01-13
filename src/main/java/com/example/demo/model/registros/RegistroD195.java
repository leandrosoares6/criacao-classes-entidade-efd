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
@Table(name = "TAB_EFD_D195", schema = "APL_EFD")
public class RegistroD195 extends Registro {

	@Column(name = "COD_OBS")
	@Indice(valor = 3)
	private String codObs;
	@Column(name = "TXT_COMPL")
	@Indice(valor = 4)
	private String txtCompl;

	public RegistroD195(String linha) {
		super(linha);
	}

}
