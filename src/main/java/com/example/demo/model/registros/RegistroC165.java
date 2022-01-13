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
@Table(name = "TAB_EFD_C165", schema = "APL_EFD")
public class RegistroC165 extends Registro {

	@Column(name = "COD_PART")
	@Indice(valor = 3)
	private String codPart;
	@Column(name = "VEIC_ID")
	@Indice(valor = 4)
	private String veicId;
	@Column(name = "COD_AUT")
	@Indice(valor = 5)
	private String codAut;
	@Column(name = "NR_PASSE")
	@Indice(valor = 6)
	private String nrPasse;
	@Column(name = "HORA")
	@Indice(valor = 7)
	private String hora;
	@Column(name = "TEMPER")
	@Indice(valor = 8)
	private String temper;
	@Column(name = "QTD_VOL")
	@Indice(valor = 9)
	private String qtdVol;
	@Column(name = "PESO_BRT")
	@Indice(valor = 10)
	private String pesoBrt;
	@Column(name = "PESO_LIQ")
	@Indice(valor = 11)
	private String pesoLiq;
	@Column(name = "NOM_MOT")
	@Indice(valor = 12)
	private String nomMot;
	@Column(name = "CPF")
	@Indice(valor = 13)
	private String cpf;
	@Column(name = "UF_ID")
	@Indice(valor = 14)
	private String ufId;

	public RegistroC165(String linha) {
		super(linha);
	}

}
