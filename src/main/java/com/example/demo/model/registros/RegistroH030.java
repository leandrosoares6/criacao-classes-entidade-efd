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
@Table(name = "TAB_EFD_H030", schema = "APL_EFD")
public class RegistroH030 extends Registro {

	@Column(name = "VL_ICMS_OP")
	@Indice(valor = 8)
	private String vlIcmsOp;
	@Column(name = "VL_BC_ICMS_ST")
	@Indice(valor = 9)
	private String vlBcIcmsSt;
	@Column(name = "VL_ICMS_ST")
	@Indice(valor = 10)
	private String vlIcmsSt;
	@Column(name = "VL_FCP")
	@Indice(valor = 10)
	private String vlFcp;

	public RegistroH030(String linha) {
		super(linha);
	}

}