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
@Table(name = "TAB_EFD_c191", schema = "APL_EFD")
public class RegistroC191 extends Registro {

	@Column(name = "VL_FCP_OP")
	@Indice(valor = 3)
	private String vlFcpOp;
	@Column(name = "VL_FCP_ST")
	@Indice(valor = 4)
	private String vlFcpSt;
	@Column(name = "VL_FCP_RET")
	@Indice(valor = 5)
	private String vlFcpRet;

	public RegistroC191(String linha) {
		super(linha);
	}

}
