package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
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
@Table(name = "TAB_EFD_C420", schema = "APL_EFD")
public class RegistroC420 extends Registro {

	@Column(name = "COD_TOT_PAR")
	@Indice(valor = 3)
	private String codTotPar;
	@Column(name = "VLR_ACUM_TOT")
	@Indice(valor = 4)
	private String vlrAcumTot;
	@Column(name = "NR_TOT")
	@Indice(valor = 5)
	private String nrTot;
	@Column(name = "DESC_NR_TOT")
	@Indice(valor = 6)
	private String descNrTot;
	@Column(name = "DATA_PART")
	@Indice(valor = 7)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;

	public RegistroC420(String linha) {
		super(linha);
	}

}
