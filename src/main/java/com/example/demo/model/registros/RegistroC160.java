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
@Table(name = "TAB_EFD_C160", schema = "APL_EFD")
public class RegistroC160 extends Registro {

	@Column(name = "COD_PART")
	@Indice(valor = 2)
	private String codPart;
	@Column(name = "VEIC_ID")
	@Indice(valor = 3)
	private String veicId;
	@Column(name = "QTD_VOL")
	@Indice(valor = 4)
	private String qtdVol;
	@Column(name = "PESO_BRT")
	@Indice(valor = 5)
	private String pesoBrt;
	@Column(name = "PESO_LIQ")
	@Indice(valor = 6)
	private String pesoLiq;
	@Column(name = "UF_ID")
	@Indice(valor = 7)
	private String ufId;

	public RegistroC160(String linha) {
		super(linha);
	}

}
