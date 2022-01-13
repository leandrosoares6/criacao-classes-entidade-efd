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
@Table(name = "TAB_EFD_B510", schema = "APL_EFD")
public class RegistroB510 extends Registro {

	@Column(name = "IND_PROF")
	@Indice(valor = 5)
	private String indProf;
	@Column(name = "IND_ESC")
	@Indice(valor = 5)
	private String indEsc;
	@Column(name = "IND_SOC")
	@Indice(valor = 5)
	private String indSoc;
	@Column(name = "CPF")
	@Indice(valor = 11)
	private String cpf;
	@Column(name = "NOME")
	@Indice(valor = 100)
	private String nome;

	public RegistroB510(String linha) {
		super(linha);
	}

}
