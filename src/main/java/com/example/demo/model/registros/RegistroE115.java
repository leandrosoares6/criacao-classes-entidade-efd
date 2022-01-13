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
@Table(name = "TAB_EFD_E115", schema = "APL_EFD")
public class RegistroE115 extends Registro {

	@Column(name = "COD_INF_ADIC")
	@Indice(valor = 3)
	private String codInfAdic;
	@Column(name = "VL_INF_ADIC")
	@Indice(valor = 4)
	private String vlInfAdic;
	@Column(name = "DESCR_COMPL_AJ")
	@Indice(valor = 5)
	private String descrComplAj;

	public RegistroE115(String linha) {
		super(linha);
	}

}