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
@Table(name = "TAB_EFD_C175", schema = "APL_EFD")
public class RegistroC175 extends Registro {

	@Column(name = "IND_VEIC_OPER")
	@Indice(valor = 3)
	private String indVeicOper;
	@Column(name = "CNPJ")
	@Indice(valor = 4)
	private String cnpj;
	@Column(name = "UF")
	@Indice(valor = 5)
	private String uf;
	@Column(name = "CHASSI_VEIC")
	@Indice(valor = 6)
	private String chassiVeic;

	public RegistroC175(String linha) {
		super(linha);
	}

}
