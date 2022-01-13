package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.Indice;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "TAB_EFD_D130", schema = "APL_EFD")
public class RegistroD130 extends Registro {

	@Column(name = "COD_PART_CONSG")
	@Indice(valor = 3)
	private String codPartConsg;
	@Column(name = "COD_PART_RED")
	@Indice(valor = 4)
	private String codPartRed;
	@Column(name = "IND_FRT_RED")
	@Indice(valor = 5)
	private String indFrtRed;
	@Column(name = "COD_MUN_ORIG")
	@Indice(valor = 6)
	private String codMunOrig;
	@Column(name = "COD_MUN_DEST")
	@Indice(valor = 7)
	private String codMunDest;
	@Column(name = "VEIC_ID")
	@Indice(valor = 8)
	private String veicId;
	@Column(name = "VL_LIQ_FRT")
	@Indice(valor = 9)
	private String vlLiqFrt;
	@Column(name = "VL_SEC_CAT")
	@Indice(valor = 10)
	private String vlSecCat;
	@Column(name = "VL_DESP")
	@Indice(valor = 11)
	private String vlDesp;
	@Column(name = "VL_PEDG")
	@Indice(valor = 12)
	private String vlPedg;
	@Column(name = "VL_OUT")
	@Indice(valor = 13)
	private String vlOut;
	@Column(name = "VL_FRT")
	@Indice(valor = 14)
	private String vlFrt;
	@Column(name = "UF_ID")
	@Indice(valor = 15)
	private String ufId;

	public RegistroD130(String linha) {
		super(linha);
	}

}
