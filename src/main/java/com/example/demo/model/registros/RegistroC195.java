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
@Table(name = "TAB_EFD_C195", schema = "APL_EFD")
public class RegistroC195 extends Registro {

	@Column(name = "COD_OBS")
	@Indice(valor = 3)
	private String codObs;
	@Column(name = "TXT_COMPL")
	@Indice(valor = 4)
	private String txtCompl;

	public RegistroC195(String linha) {
		super(linha);
	}

}
