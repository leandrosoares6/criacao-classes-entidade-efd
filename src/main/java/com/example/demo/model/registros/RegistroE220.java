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
@Table(name = "TAB_EFD_E220", schema = "APL_EFD")
public class RegistroE220 extends Registro {

	@Column(name = "COD_AJ_APUR")
	@Indice(valor = 3)
	private String codAjApur;
	@Column(name = "DESCR_COMPL_AJ")
	@Indice(valor = 4)
	private String descrComplAj;
	@Column(name = "VL_AJ_APUR")
	@Indice(valor = 5)
	private String vlAjApur;

	public RegistroE220(String linha) {
		super(linha);
	}

}
