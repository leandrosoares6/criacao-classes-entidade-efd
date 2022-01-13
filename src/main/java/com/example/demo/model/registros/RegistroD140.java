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
@Table(name = "TAB_EFD_D140", schema = "APL_EFD")
public class RegistroD140 extends Registro {

	@Column(name = "COD_PART_CONSG")
	@Indice(valor = 2)
	private String codPartConsg;
	@Column(name = "COD_MUN_ORIG")
	@Indice(valor = 3)
	private String codMunOrig;
	@Column(name = "COD_MUN_DEST")
	@Indice(valor = 4)
	private String codMunDest;
	@Column(name = "IND_VEIC")
	@Indice(valor = 5)
	private String indVeic;
	@Column(name = "VEIC_ID")
	@Indice(valor = 6)
	private String veicId;
	@Column(name = "IND_NAV")
	@Indice(valor = 7)
	private String indNav;
	@Column(name = "VIAGEM")
	@Indice(valor = 8)
	private String viagem;
	@Column(name = "VL_FRT_LIQ")
	@Indice(valor = 9)
	private String vlFrtLiq;
	@Column(name = "VL_DESP_PORT")
	@Indice(valor = 10)
	private String vlDespPort;
	@Column(name = "VL_DESP_CAR_DESC")
	@Indice(valor = 11)
	private String vlDespCarDesc;
	@Column(name = "VL_OUT")
	@Indice(valor = 12)
	private String vlOut;
	@Column(name = "VL_FRT_BRT")
	@Indice(valor = 13)
	private String vlFrtBrt;
	@Column(name = "VL_FRT_MM")
	@Indice(valor = 14)
	private String vlFrtMm;

	public RegistroD140(String linha) {
		super(linha);
	}

}
