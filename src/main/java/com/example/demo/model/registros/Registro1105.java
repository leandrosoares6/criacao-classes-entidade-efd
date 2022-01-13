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
@Table(name = "TAB_EFD_1105", schema = "APL_EFD")
public class Registro1105 extends Registro {

	@Column(name = "COD_MOD")
	@Indice(valor = 3)
	private String codMod;
	@Column(name = "SERIE")
	@Indice(valor = 4)
	private String serie;
	@Column(name = "NUM_DOC")
	@Indice(valor = 5)
	private String numDoc;
	@Column(name = "CHV_NFE")
	@Indice(valor = 6)
	private String chvNfe;
	@Column(name = "DT_DOC")
	@Indice(valor = 7)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "COD_ITEM")
	@Indice(valor = 8)
	private String codItem;

	public Registro1105(String linha) {
		super(linha);
	}

}
