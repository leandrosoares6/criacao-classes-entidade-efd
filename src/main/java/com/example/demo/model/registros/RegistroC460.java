package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
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
@Table(name = "TAB_EFD_C460", schema = "APL_EFD")
public class RegistroC460 extends Registro {

	@Column(name = "COD_MOD")
	@Indice(valor = 3)
	private String codMod;
	@Column(name = "COD_SIT")
	@Indice(valor = 4)
	private String codSit;
	@Column(name = "NUM_DOC")
	@Indice(valor = 5)
	private String numDoc;
	@Column(name = "DT_DOC")
	@Indice(valor = 6)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "VL_DOC")
	@Indice(valor = 7)
	private String vlDoc;
	@Column(name = "VL_PIS")
	@Indice(valor = 8)
	private String vlPis;
	@Column(name = "VL_COFINS")
	@Indice(valor = 9)
	private String vlCofins;
	@Column(name = "CPFCNPJ")
	@Indice(valor = 10)
	private String cpfcnpj;
	@Column(name = "NOM_ADQ")
	@Indice(valor = 11)
	private String nomAdq;
	@Column(name = "DATA_PART")
	@Indice(valor = 12)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;

	public RegistroC460(String linha) {
		super(linha);
	}

}
