package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
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
@Table(name = "TAB_EFD_D160", schema = "APL_EFD")
public class RegistroD160 extends Registro {

	@Column(name = "DESPACHO")
	@Indice(valor = 3)
	private String despacho;
	@Column(name = "CNPJ_CPF_REM")
	@Indice(valor = 4)
	private String cnpjCpfRem;
	@Column(name = "IE_REM")
	@Indice(valor = 5)
	private String ieRem;
	@Column(name = "COD_MUN_ORI")
	@Indice(valor = 6)
	private String codMunOri;
	@Column(name = "CNPJ_CPF_DEST")
	@Indice(valor = 7)
	private String cnpjCpfDest;
	@Column(name = "IE_DEST")
	@Indice(valor = 8)
	private String ieDest;
	@Column(name = "COD_MUN_DEST")
	@Indice(valor = 9)
	private String codMunDest;

	public RegistroD160(String linha) {
		super(linha);
	}

}
