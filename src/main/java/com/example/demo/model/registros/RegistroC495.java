package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoId;
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
@Table(name = "TAB_EFD_C495", schema = "APL_EFD")
public class RegistroC495 extends Registro {

	@Column(name = "ALIQ_ICMS")
	@Indice(valor = 3)
	private String aliqIcms;
	@Column(name = "COD_ITEM")
	@Indice(valor = 4)
	private String codItem;
	@Column(name = "QTD")
	@Indice(valor = 5)
	private String qtd;
	@Column(name = "QTD_CANC")
	@Indice(valor = 6)
	private String qtdCanc;
	@Column(name = "UNID")
	@Indice(valor = 7)
	private String unid;
	@Column(name = "VL_ITEM")
	@Indice(valor = 8)
	private String vlItem;
	@Column(name = "VL_DESC")
	@Indice(valor = 9)
	private String vlDesc;
	@Column(name = "VL_CANC")
	@Indice(valor = 10)
	private String vlCanc;
	@Column(name = "VL_ACMO")
	@Indice(valor = 11)
	private String vlAcmo;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 12)
	private String vlBcIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 13)
	private String vlIcms;
	@Column(name = "VL_ISEN")
	@Indice(valor = 14)
	private String vlIsen;
	@Column(name = "VL_NT")
	@Indice(valor = 15)
	private String vlNt;
	@Column(name = "VL_ICMS_ST")
	@Indice(valor = 16)
	private String vlIcmsSt;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public RegistroC495(String linha) {
		super(linha);
	}

}
