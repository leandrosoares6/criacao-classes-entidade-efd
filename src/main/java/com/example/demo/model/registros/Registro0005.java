package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
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
@Table(name = "TAB_EFD_0005", schema = "APL_EFD")
public class Registro0005 extends Registro {

	@Column(name = "FANTASIA")
	@Indice(valor = 2)
	private String fantasia;
	@Column(name = "CEP")
	@Indice(valor = 3)
	private String cep;
	@Column(name = "ENDERECO")
	@Indice(valor = 4)
	private String endereco;
	@Column(name = "NUMERO")
	@Indice(valor = 5)
	private String numero;
	@Column(name = "COMPL")
	@Indice(valor = 6)
	private String compl;
	@Column(name = "BAIRRO")
	@Indice(valor = 7)
	private String bairro;
	@Column(name = "FONE")
	@Indice(valor = 8)
	private String fone;
	@Column(name = "FAX")
	@Indice(valor = 9)
	private String fax;
	@Column(name = "EMAIL")
	@Indice(valor = 10)
	private String email;
	@Column(name = "DATA_PART")
	@Indice(valor = 11)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;
	@Column(name = "ID")
	@Indice(valor = 100)
	@Id
	@CampoTipoId
	private String id;

	public Registro0005(String linha) {
		super(linha);
	}

}
