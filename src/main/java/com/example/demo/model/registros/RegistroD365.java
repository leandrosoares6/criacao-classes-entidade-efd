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
@Table(name = "TAB_EFD_D365", schema = "APL_EFD")
public class RegistroD365 extends Registro {

	@Column(name = "COD_TOT_PAR")
	@Indice(valor = 3)
	private String codTotPar;
	@Column(name = "VLR_ACUM_TOT")
	@Indice(valor = 4)
	private String vlrAcumTot;
	@Column(name = "NR_TOT")
	@Indice(valor = 5)
	private String nrTot;
	@Column(name = "DESCR_NR_TOT")
	@Indice(valor = 6)
	private String descrNrTot;

	public RegistroD365(String linha) {
		super(linha);
	}

}
