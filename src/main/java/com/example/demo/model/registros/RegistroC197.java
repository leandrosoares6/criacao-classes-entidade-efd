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
@Table(name = "TAB_EFD_C197", schema = "APL_EFD")
public class RegistroC197 extends Registro {

	@Column(name = "COD_AJ")
	@Indice(valor = 3)
	private String codAj;
	@Column(name = "DESCR_COMPL_AJ")
	@Indice(valor = 4)
	private String descrComplAj;
	@Column(name = "COD_ITEM")
	@Indice(valor = 5)
	private String codItem;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 6)
	private String vlBcIcms;
	@Column(name = "ALIQ_ICMS")
	@Indice(valor = 7)
	private String aliqIcms;
	@Column(name = "VL_ICMS")
	@Indice(valor = 8)
	private String vlIcms;
	@Column(name = "VL_OUTROS")
	@Indice(valor = 9)
	private String vlOutros;

	public RegistroC197(String linha) {
		super(linha);
	}

}
