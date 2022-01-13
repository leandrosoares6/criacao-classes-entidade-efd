package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
import com.example.demo.util.CampoTipoId;
import com.example.demo.util.Indice;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "TAB_EFD_0000", schema = "APL_EFD")
public class Registro0000 extends Registro {

	@Column(name = "COD_VER")
	@Indice(valor = 2)
	private String codVer;
	@Column(name = "COD_FIN")
	@Indice(valor = 3)
	private String codFin;
	@Column(name = "DT_INI")
	@Indice(valor = 4)
	@CampoTipoData
	private String dtIni;
	@Column(name = "DT_FIN")
	@Indice(valor = 5)
	@CampoTipoData
	private String dtFin;
	@Column(name = "NOME")
	@Indice(valor = 6)
	private String nome;
	@Column(name = "CNPJ")
	@Indice(valor = 7)
	private String cnpj;
	@Column(name = "CPF")
	@Indice(valor = 8)
	private String cpf;
	@Column(name = "UF")
	@Indice(valor = 9)
	private String uf;
	@Column(name = "IE")
	@Indice(valor = 10)
	private String ie;
	@Column(name = "COD_MUN")
	@Indice(valor = 11)
	private String codMun;
	@Column(name = "IM")
	@Indice(valor = 12)
	private String im;
	@Column(name = "SUFRAMA")
	@Indice(valor = 13)
	private String suframa;
	@Column(name = "IND_PERFIL")
	@Indice(valor = 14)
	private String indPerfil;
	@Column(name = "IND_ATIV")
	@Indice(valor = 15)
	private String indAtiv;
	@Column(name = "DATA_PART")
	@Indice(valor = 16)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;
	@Column(name = "ID")
	@Indice(valor = 100)
	@Id
	@CampoTipoId
	private String id;

	public Registro0000(String linha) {
		super(linha);
	}

}
