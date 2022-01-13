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
@Table(name = "TAB_EFD_D120", schema = "APL_EFD")
public class RegistroD120 extends Registro {

	@Column(name = "COD_MUN_ORIG")
	@Indice(valor = 3)
	private String codMunOrig;
	@Column(name = "COD_MUN_DEST")
	@Indice(valor = 4)
	private String codMunDest;
	@Column(name = "VEIC_ID")
	@Indice(valor = 5)
	private String veicId;
	@Column(name = "UF_ID")
	@Indice(valor = 6)
	private String ufId;

	public RegistroD120(String linha) {
		super(linha);
	}

}
