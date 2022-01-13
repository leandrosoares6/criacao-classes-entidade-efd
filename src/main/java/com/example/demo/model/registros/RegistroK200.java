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
@Table(name = "TAB_EFD_K200", schema = "APL_EFD")
public class RegistroK200 extends Registro {

	@Column(name = "DT_EST")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtEst;
	@Column(name = "COD_ITEM")
	@Indice(valor = 4)
	private String codItem;
	@Column(name = "QTD")
	@Indice(valor = 5)
	private String qtd;
	@Column(name = "IND_EST")
	@Indice(valor = 6)
	private String indEst;
	@Column(name = "COD_PART")
	@Indice(valor = 7)
	private String codPart;

	public RegistroK200(String linha) {
		super(linha);
	}

}
