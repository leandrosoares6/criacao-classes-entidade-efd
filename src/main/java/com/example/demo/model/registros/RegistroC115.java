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
@Table(name = "TAB_EFD_C115", schema = "APL_EFD")
public class RegistroC115 extends Registro {

	@Column(name = "IND_CARGA")
	@Indice(valor = 3)
	private String indCarga;
	@Column(name = "CNPJ_COL")
	@Indice(valor = 4)
	private String cnpjCol;
	@Column(name = "IE_COL")
	@Indice(valor = 5)
	private String ieCol;
	@Column(name = "CPF_COL")
	@Indice(valor = 6)
	private String cpfCol;
	@Column(name = "COD_MUN_COL")
	@Indice(valor = 7)
	private String codMunCol;
	@Column(name = "CNPJ_ENTG")
	@Indice(valor = 8)
	private String cnpjEntg;
	@Column(name = "IE_ENTG")
	@Indice(valor = 9)
	private String ieEntg;
	@Column(name = "CPF_ENTG")
	@Indice(valor = 10)
	private String cpfEntg;
	@Column(name = "COD_MUN_ENTG")
	@Indice(valor = 11)
	private String codMunEntg;

	public RegistroC115(String linha) {
		super(linha);
	}

}
