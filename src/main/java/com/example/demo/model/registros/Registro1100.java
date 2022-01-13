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
@Table(name = "TAB_EFD_1100", schema = "APL_EFD")
public class Registro1100 extends Registro {

	@Column(name = "IND_DOC")
	@Indice(valor = 3)
	private String indDoc;
	@Column(name = "NRO_DE")
	@Indice(valor = 4)
	private String nroDe;
	@Column(name = "DT_DE")
	@Indice(valor = 5)
	@CampoTipoData
	private String dtDe;
	@Column(name = "NAT_EXP")
	@Indice(valor = 6)
	private String natExp;
	@Column(name = "NRO_RE")
	@Indice(valor = 7)
	private String nroRe;
	@Column(name = "DT_RE")
	@Indice(valor = 8)
	@CampoTipoData
	private String dtRe;
	@Column(name = "CHC_EMB")
	@Indice(valor = 9)
	private String chcEmb;
	@Column(name = "DT_CHC")
	@Indice(valor = 10)
	@CampoTipoData
	private String dtChc;
	@Column(name = "DT_AVB")
	@Indice(valor = 11)
	@CampoTipoData
	private String dtAvb;
	@Column(name = "TP_CHC")
	@Indice(valor = 12)
	private String tpChc;
	@Column(name = "PAIS")
	@Indice(valor = 13)
	private String pais;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro1100(String linha) {
		super(linha);
	}

}
