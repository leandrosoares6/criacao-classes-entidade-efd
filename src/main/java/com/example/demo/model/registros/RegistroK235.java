package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
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
@Table(name = "TAB_EFD_K235", schema = "APL_EFD")
public class RegistroK235 extends Registro {

	@Column(name = "DT_SAIDA")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtSaida;
	@Column(name = "COD_ITEM")
	@Indice(valor = 4)
	private String codItem;
	@Column(name = "QTD")
	@Indice(valor = 5)
	private String qtd;
	@Column(name = "COD_INS_SUBST")
	@Indice(valor = 6)
	private String codInsSubst;

	public RegistroK235(String linha) {
		super(linha);
	}

}
