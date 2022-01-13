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
@Table(name = "TAB_EFD_C350", schema = "APL_EFD")
public class RegistroC350 extends Registro {

	@Column(name = "SER")
	@Indice(valor = 3)
	private String ser;
	@Column(name = "SUB_SER")
	@Indice(valor = 4)
	private String subSer;
	@Column(name = "NUM_DOC")
	@Indice(valor = 5)
	private String numDoc;
	@Column(name = "DT_DOC")
	@Indice(valor = 6)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "CNPJ_CPF")
	@Indice(valor = 7)
	private String cnpjCpf;
	@Column(name = "VL_MERC")
	@Indice(valor = 8)
	private String vlMerc;
	@Column(name = "VL_DOC")
	@Indice(valor = 9)
	private String vlDoc;
	@Column(name = "VL_DESC")
	@Indice(valor = 10)
	private String vlDesc;
	@Column(name = "VL_PIS")
	@Indice(valor = 11)
	private String vlPis;
	@Column(name = "VL_COFINS")
	@Indice(valor = 12)
	private String vlCofins;
	@Column(name = "COD_CTA")
	@Indice(valor = 13)
	private String codCta;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public RegistroC350(String linha) {
		super(linha);
	}

}
