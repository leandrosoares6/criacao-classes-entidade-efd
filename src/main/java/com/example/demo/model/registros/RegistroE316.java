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
@Table(name = "TAB_EFD_E316", schema = "APL_EFD")
public class RegistroE316 extends Registro {

	@Column(name = "COD_OR")
	@Indice(valor = 3)
	private String codOr;
	@Column(name = "VL_OR")
	@Indice(valor = 4)
	private String vlOr;
	@Column(name = "DT_VCTO")
	@Indice(valor = 5)
	@CampoTipoData
	private String dtVcto;
	@Column(name = "COD_REC")
	@Indice(valor = 6)
	private String codRec;
	@Column(name = "NUM_PROC")
	@Indice(valor = 7)
	private String numProc;
	@Column(name = "IND_PROC")
	@Indice(valor = 8)
	private String indProc;
	@Column(name = "PROC")
	@Indice(valor = 9)
	private String proc;
	@Column(name = "TXT_COMPL")
	@Indice(valor = 10)
	private String txtCompl;
	@Column(name = "MES_REF")
	@Indice(valor = 11)
	private String mesRef;

	public RegistroE316(String linha) {
		super(linha);
	}

}
