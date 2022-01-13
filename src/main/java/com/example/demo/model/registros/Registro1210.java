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
@Table(name = "TAB_EFD_1210", schema = "APL_EFD")
public class Registro1210 extends Registro {

	@Column(name = "TIPO_UTIL")
	@Indice(valor = 3)
	private String tipoUtil;
	@Column(name = "NR_DOC")
	@Indice(valor = 4)
	private String nrDoc;
	@Column(name = "VL_CRED_UTIL")
	@Indice(valor = 5)
	private String vlCredUtil;
	@Column(name = "CHV_DOCE")
	@Indice(valor = 6)
	private String chvDoce;

	public Registro1210(String linha) {
		super(linha);
	}

}
