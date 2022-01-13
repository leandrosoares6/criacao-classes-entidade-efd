package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
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
@Table(name = "TAB_EFD_G130", schema = "APL_EFD")
public class RegistroG130 extends Registro {

	@Column(name = "IND_EMIT")
	@Indice(valor = 3)
	private String indEmit;
	@Column(name = "COD_PART")
	@Indice(valor = 4)
	private String codPart;
	@Column(name = "COD_MOD")
	@Indice(valor = 5)
	private String codMod;
	@Column(name = "SERIE")
	@Indice(valor = 6)
	private String serie;
	@Column(name = "NUM_DOC")
	@Indice(valor = 7)
	private String numDoc;
	@Column(name = "CHV_NFE_CTE")
	@Indice(valor = 8)
	private String chvNfeCte;
	@Column(name = "DT_DOC")
	@Indice(valor = 9)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "NUM_DA")
	@Indice(valor = 10)
	@CampoTipoData
	private String numDa;

	public RegistroG130(String linha) {
		super(linha);
	}

}
