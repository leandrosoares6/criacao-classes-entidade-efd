package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
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
@Table(name = "TAB_EFD_1700", schema = "APL_EFD")
public class Registro1700 extends Registro {

	@Column(name = "COD_DISP")
	@Indice(valor = 3)
	private String codDisp;
	@Column(name = "COD_MOD")
	@Indice(valor = 4)
	private String codMod;
	@Column(name = "SER")
	@Indice(valor = 5)
	private String ser;
	@Column(name = "SUB")
	@Indice(valor = 6)
	private String sub;
	@Column(name = "NUM_DOC_INI")
	@Indice(valor = 7)
	private String numDocIni;
	@Column(name = "NUM_DOC_FIN")
	@Indice(valor = 8)
	private String numDocFin;
	@Column(name = "NUM_AUT")
	@Indice(valor = 9)
	private String numAut;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro1700(String linha) {
		super(linha);
	}

}
