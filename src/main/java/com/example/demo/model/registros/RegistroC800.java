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
@Table(name = "TAB_EFD_C800", schema = "APL_EFD")
public class RegistroC800 extends Registro {

	@Column(name = "COD_MOD")
	@Indice(valor = 3)
	private String codMod;
	@Column(name = "COD_SIT")
	@Indice(valor = 4)
	private String codSit;
	@Column(name = "NUM_CFE")
	@Indice(valor = 5)
	private String numCfe;
	@Column(name = "DT_DOC")
	@Indice(valor = 6)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "VL_CFE")
	@Indice(valor = 7)
	private String vlCfe;
	@Column(name = "VL_PIS")
	@Indice(valor = 8)
	private String vlPis;
	@Column(name = "VL_COFINS")
	@Indice(valor = 9)
	private String vlCofins;
	@Column(name = "CNPJ_CPF")
	@Indice(valor = 10)
	private String cnpjCpf;
	@Column(name = "NR_SAT")
	@Indice(valor = 11)
	private String nrSat;
	@Column(name = "CHV_CFE")
	@Indice(valor = 12)
	private String chvCfe;
	@Column(name = "VL_DESC")
	@Indice(valor = 13)
	private String vlDesc;
	@Column(name = "VL_MERC")
	@Indice(valor = 14)
	private String vlMerc;
	@Column(name = "VL_OUT_DA")
	@Indice(valor = 15)
	private String vlOutDa;
	@Column(name = "VL_ICMS")
	@Indice(valor = 16)
	private String vlIcms;
	@Column(name = "VL_PIS_ST")
	@Indice(valor = 17)
	private String vlPisSt;
	@Column(name = "VL_COFINS_ST")
	@Indice(valor = 18)
	private String vlCofinsSt;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public RegistroC800(String linha) {
		super(linha);
	}

}
