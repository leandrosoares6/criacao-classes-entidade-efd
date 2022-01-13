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
@Table(name = "TAB_EFD_D180", schema = "APL_EFD")
public class RegistroD180 extends Registro {

	@Column(name = "NUM_SEQ")
	@Indice(valor = 3)
	private String numSeq;
	@Column(name = "IND_EMIT")
	@Indice(valor = 4)
	private String indEmit;
	@Column(name = "CNPJ_CPF_EMIT")
	@Indice(valor = 5)
	private String cnpjCpfEmit;
	@Column(name = "UF_EMIT")
	@Indice(valor = 6)
	private String ufEmit;
	@Column(name = "IE_EMIT")
	@Indice(valor = 7)
	private String ieEmit;
	@Column(name = "COD_MUN_ORIG")
	@Indice(valor = 8)
	private String codMunOrig;
	@Column(name = "CNPJ_CPF_TOM")
	@Indice(valor = 9)
	private String cnpjCpfTom;
	@Column(name = "UF_TOM")
	@Indice(valor = 10)
	private String ufTom;
	@Column(name = "IE_TOM")
	@Indice(valor = 11)
	private String ieTom;
	@Column(name = "COD_MUN_DEST")
	@Indice(valor = 12)
	private String codMunDest;
	@Column(name = "COD_MOD")
	@Indice(valor = 13)
	private String codMod;
	@Column(name = "SER")
	@Indice(valor = 14)
	private String ser;
	@Column(name = "SUB")
	@Indice(valor = 15)
	private String sub;
	@Column(name = "NUM_DOC")
	@Indice(valor = 16)
	private String numDoc;
	@Column(name = "DT_DOC")
	@Indice(valor = 17)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "VL_DOC")
	@Indice(valor = 18)
	private String vlDoc;

	public RegistroD180(String linha) {
		super(linha);
	}

}
