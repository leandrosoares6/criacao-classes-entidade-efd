package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
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
@Table(name = "TAB_EFD_0150", schema = "APL_EFD")
public class Registro0150 extends Registro {

	@Column(name = "COD_PART")
	@Indice(valor = 3)
	private String codPart;
	@Column(name = "NOME")
	@Indice(valor = 4)
	private String nome;
	@Column(name = "COD_PAIS")
	@Indice(valor = 5)
	private String codPais;
	@Column(name = "CNPJ")
	@Indice(valor = 6)
	private String cnpj;
	@Column(name = "CPF")
	@Indice(valor = 7)
	private String cpf;
	@Column(name = "IE")
	@Indice(valor = 8)
	private String ie;
	@Column(name = "COD_MUN")
	@Indice(valor = 9)
	private String codMun;
	@Column(name = "SUFRAMA")
	@Indice(valor = 10)
	private String suframa;
	@Column(name = "END")
	@Indice(valor = 11)
	private String end;
	@Column(name = "NUM")
	@Indice(valor = 12)
	private String num;
	@Column(name = "COMPL")
	@Indice(valor = 13)
	private String compl;
	@Column(name = "BAIRRO")
	@Indice(valor = 14)
	private String bairro;
	@Column(name = "DATA_PART")
	@Indice(valor = 15)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro0150(String linha) {
		super(linha);
	}

}
