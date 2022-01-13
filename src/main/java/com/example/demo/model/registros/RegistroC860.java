package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoId;
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
@Table(name = "TAB_EFD_C860", schema = "APL_EFD")
public class RegistroC860 extends Registro {

	@Column(name = "COD_MOD")
	@Indice(valor = 3)
	private String codMod;
	@Column(name = "NR_SAT")
	@Indice(valor = 4)
	private String nrSat;
	@Column(name = "DT_DOC")
	@Indice(valor = 5)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "DOC_INI")
	@Indice(valor = 6)
	private String docIni;
	@Column(name = "DOC_FIM")
	@Indice(valor = 7)
	private String docFim;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public RegistroC860(String linha) {
		super(linha);
	}

}
