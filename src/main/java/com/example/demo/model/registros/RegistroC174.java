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
@Table(name = "TAB_EFD_C174", schema = "APL_EFD")
public class RegistroC174 extends Registro {

	@Column(name = "IND_ARM")
	@Indice(valor = 3)
	private String indArm;
	@Column(name = "NUM_ARM")
	@Indice(valor = 4)
	private String numArm;
	@Column(name = "DESCR_COMPL")
	@Indice(valor = 5)
	private String descrCompl;

	public RegistroC174(String linha) {
		super(linha);
	}

}
