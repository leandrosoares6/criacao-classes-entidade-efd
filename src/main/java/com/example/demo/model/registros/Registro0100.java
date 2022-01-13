package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.example.demo.model.Registro;
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
@Table(name = "TAB_EFD_0100", schema = "APL_EFD")
public class Registro0100 extends Registro {

	@Column(name = "NOME")
	@Indice(valor = 2)
	private String nome;
	@Column(name = "CPF")
	@Indice(valor = 3)
	private String cpf;
	@Column(name = "CRC")
	@Indice(valor = 4)
	private String crc;
	@Column(name = "CNPJ")
	@Indice(valor = 5)
	private String cnpj;
	@Column(name = "CEP")
	@Indice(valor = 6)
	private String cep;
	@Column(name = "END")
	@Indice(valor = 7)
	private String end;
	@Column(name = "NUM")
	@Indice(valor = 8)
	private String num;
	@Column(name = "COMPL")
	@Indice(valor = 9)
	private String compl;
	@Column(name = "BAIRRO")
	@Indice(valor = 10)
	private String bairro;
	@Column(name = "FONE")
	@Indice(valor = 11)
	private String fone;
	@Column(name = "FAX")
	@Indice(valor = 12)
	private String fax;
	@Column(name = "EMAIL")
	@Indice(valor = 13)
	private String email;
	@Column(name = "COD_MUN")
	@Indice(valor = 14)
	private String codMun;
	@Column(name = "ID")
	@Indice(valor = 100)
	@Id
	@CampoTipoId
	private String id;

	public Registro0100(String linha) {
		super(linha);
	}

}
