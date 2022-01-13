package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
import com.example.demo.util.CampoTipoId;
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
@Table(name = "TAB_EFD_C300", schema = "APL_EFD")
public class RegistroC300 extends Registro {

	@Column(name = "COD_MOD")
	@Indice(valor = 3)
	private String codMod;
	@Column(name = "SER")
	@Indice(valor = 4)
	private String ser;
	@Column(name = "SUB")
	@Indice(valor = 5)
	private String sub;
	@Column(name = "NUM_DOC_INI")
	@Indice(valor = 6)
	private String numDocIni;
	@Column(name = "NUM_DOC_FIN")
	@Indice(valor = 7)
	private String numDocFin;
	@Column(name = "DT_DOC")
	@Indice(valor = 8)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "VL_DOC")
	@Indice(valor = 9)
	private String vlDoc;
	@Column(name = "VL_PIS")
	@Indice(valor = 10)
	private String vlPis;
	@Column(name = "VL_COFINS")
	@Indice(valor = 11)
	private String vlCofins;
	@Column(name = "COD_CTA")
	@Indice(valor = 12)
	private String codCta;
	@Column(name = "DATA_PART")
	@Indice(valor = 13)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public RegistroC300(String linha) {
		super(linha);
	}

}
