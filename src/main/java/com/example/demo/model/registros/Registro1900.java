package com.example.demo.model.registros;

import com.example.demo.model.Registro;
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
@Table(name = "TAB_EFD_1900", schema = "APL_EFD")
public class Registro1900 extends Registro {

	@Column(name = "IND_APUR_ICMS")
	@Indice(valor = 3)
	private String indApurIcms;
	@Column(name = "DESCR_COMPL_OUT_APUR")
	@Indice(valor = 4)
	private String descrComplOutApur;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro1900(String linha) {
		super(linha);
	}

}
