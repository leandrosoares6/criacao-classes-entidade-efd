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
@Table(name = "TAB_EFD_D162", schema = "APL_EFD")
public class RegistroD162 extends Registro {

	@Column(name = "COD_MOD")
	@Indice(valor = 3)
	private String codMod;
	@Column(name = "SER")
	@Indice(valor = 4)
	private String ser;
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
	@Column(name = "VL_MERC")
	@Indice(valor = 8)
	private String vlMerc;
	@Column(name = "QTD_VOL")
	@Indice(valor = 9)
	private String qtdVol;
	@Column(name = "PESO_BRT")
	@Indice(valor = 10)
	private String pesoBrt;
	@Column(name = "PESO_LIQ")
	@Indice(valor = 11)
	private String pesoLiq;

	public RegistroD162(String linha) {
		super(linha);
	}

}
