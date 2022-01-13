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
@Table(name = "TAB_EFD_D170", schema = "APL_EFD")
public class RegistroD170 extends Registro {

	@Column(name = "COD_PART_CONSG")
	@Indice(valor = 2)
	private String codPartConsg;
	@Column(name = "COD_PART_RED")
	@Indice(valor = 3)
	private String codPartRed;
	@Column(name = "COD_MUN_ORIG")
	@Indice(valor = 4)
	private String codMunOrig;
	@Column(name = "COD_MUN_DEST")
	@Indice(valor = 5)
	private String codMunDest;
	@Column(name = "OTM")
	@Indice(valor = 6)
	private String otm;
	@Column(name = "IND_NAT_FRT")
	@Indice(valor = 7)
	private String indNatFrt;
	@Column(name = "VL_LIQ_FRT")
	@Indice(valor = 8)
	private String vlLiqFrt;
	@Column(name = "VL_GRIS")
	@Indice(valor = 9)
	private String vlGris;
	@Column(name = "VL_PDG")
	@Indice(valor = 10)
	private String vlPdg;
	@Column(name = "VL_OUT")
	@Indice(valor = 11)
	private String vlOut;
	@Column(name = "VL_FRT")
	@Indice(valor = 12)
	private String vlFrt;
	@Column(name = "VEIC_ID")
	@Indice(valor = 13)
	private String veicId;
	@Column(name = "UF_ID")
	@Indice(valor = 14)
	private String ufId;

	public RegistroD170(String linha) {
		super(linha);
	}

}
