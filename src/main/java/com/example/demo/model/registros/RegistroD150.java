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
@Table(name = "TAB_EFD_D150", schema = "APL_EFD")
public class RegistroD150 extends Registro {

	@Column(name = "COD_MUN_ORIG")
	@Indice(valor = 2)
	private String codMunOrig;
	@Column(name = "COD_MUN_DEST")
	@Indice(valor = 3)
	private String codMunDest;
	@Column(name = "VEIC_ID")
	@Indice(valor = 4)
	private String veicId;
	@Column(name = "VIAGEM")
	@Indice(valor = 5)
	private String viagem;
	@Column(name = "IND_TFA")
	@Indice(valor = 6)
	private String indTfa;
	@Column(name = "VL_PESO_TX")
	@Indice(valor = 7)
	private String vlPesoTx;
	@Column(name = "VL_TX_TERR")
	@Indice(valor = 8)
	private String vlTxTerr;
	@Column(name = "VL_TX_RED")
	@Indice(valor = 9)
	private String vlTxRed;
	@Column(name = "VL_OUT")
	@Indice(valor = 10)
	private String vlOut;
	@Column(name = "VL_TX_ADV")
	@Indice(valor = 11)
	private String vlTxAdv;

	public RegistroD150(String linha) {
		super(linha);
	}

}
