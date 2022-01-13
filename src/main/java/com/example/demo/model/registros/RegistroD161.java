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
@Table(name = "TAB_EFD_D161", schema = "APL_EFD")
public class RegistroD161 extends Registro {

	@Column(name = "IND_CARGA")
	@Indice(valor = 2)
	private String indCarga;
	@Column(name = "CNPJ_CPF_COL")
	@Indice(valor = 3)
	private String cnpjCpfCol;
	@Column(name = "IE_COL")
	@Indice(valor = 4)
	private String ieCol;
	@Column(name = "COD_MUN_COL")
	@Indice(valor = 5)
	private String codMunCol;
	@Column(name = "CNPJ_CPF_ENTG")
	@Indice(valor = 6)
	private String cnpjCpfEntg;
	@Column(name = "IE_ENTG")
	@Indice(valor = 7)
	private String ieEntg;
	@Column(name = "COD_MUN_ENTG")
	@Indice(valor = 8)
	private String codMunEntg;

	public RegistroD161(String linha) {
		super(linha);
	}

}
