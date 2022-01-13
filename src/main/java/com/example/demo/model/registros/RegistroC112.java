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
@Table(name = "TAB_EFD_C112", schema = "APL_EFD")
public class RegistroC112 extends Registro {

	@Column(name = "COD_DA")
	@Indice(valor = 3)
	private String codDa;
	@Column(name = "UF")
	@Indice(valor = 4)
	private String uf;
	@Column(name = "NUM_DA")
	@Indice(valor = 5)
	private String numDa;
	@Column(name = "COD_AUT")
	@Indice(valor = 6)
	private String codAut;
	@Column(name = "VL_DA")
	@Indice(valor = 7)
	private String vlDa;
	@Column(name = "DT_VCTO")
	@Indice(valor = 8)
	@CampoTipoData
	private String dtVcto;
	@Column(name = "DT_PGTO")
	@Indice(valor = 9)
	@CampoTipoData
	private String dtPgto;

	public RegistroC112(String linha) {
		super(linha);
	}

}
