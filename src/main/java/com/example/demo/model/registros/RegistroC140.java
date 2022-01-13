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
@Table(name = "TAB_EFD_C140", schema = "APL_EFD")
public class RegistroC140 extends Registro {

	@Column(name = "IND_EMIT")
	@Indice(valor = 2)
	private String indEmit;
	@Column(name = "IND_TIT")
	@Indice(valor = 3)
	private String indTit;
	@Column(name = "DESC_TIT")
	@Indice(valor = 4)
	private String descTit;
	@Column(name = "NUM_TIT")
	@Indice(valor = 5)
	private String numTit;
	@Column(name = "QTD_PARC")
	@Indice(valor = 6)
	private String qtdParc;
	@Column(name = "VL_TIT")
	@Indice(valor = 7)
	private String vlTit;

	public RegistroC140(String linha) {
		super(linha);
	}

}
