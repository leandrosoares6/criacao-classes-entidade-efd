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
@Table(name = "TAB_EFD_B440", schema = "APL_EFD")
public class RegistroB440 extends Registro {

	@Column(name = "IND_OPER")
	@Indice(valor = 5)
	private String indOper;
	@Column(name = "COD_PART")
	@Indice(valor = 5)
	private String codPart;
	@Column(name = "VL_CONT_RT")
	@Indice(valor = 5)
	private String vlContRt;
	@Column(name = "VL_BC_ISS_RT")
	@Indice(valor = 5)
	private String vlBcIssRt;
	@Column(name = "VL_ISS_RT")
	@Indice(valor = 5)
	private String vlIssRt;

	public RegistroB440(String linha) {
		super(linha);
	}

}
