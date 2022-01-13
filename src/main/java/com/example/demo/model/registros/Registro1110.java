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
@Table(name = "TAB_EFD_1110", schema = "APL_EFD")
public class Registro1110 extends Registro {

	@Column(name = "COD_PART")
	@Indice(valor = 3)
	private String codPart;
	@Column(name = "COD_MOD")
	@Indice(valor = 4)
	private String codMod;
	@Column(name = "SER")
	@Indice(valor = 5)
	private String ser;
	@Column(name = "NUM_DOC")
	@Indice(valor = 6)
	private String numDoc;
	@Column(name = "DT_DOC")
	@Indice(valor = 7)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "CHV_NFE")
	@Indice(valor = 8)
	private String chvNfe;
	@Column(name = "NR_MEMO")
	@Indice(valor = 9)
	private String nrMemo;
	@Column(name = "QTD")
	@Indice(valor = 10)
	private String qtd;
	@Column(name = "UNID")
	@Indice(valor = 11)
	private String unid;

	public Registro1110(String linha) {
		super(linha);
	}

}
