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
@Table(name = "TAB_EFD_C465", schema = "APL_EFD")
public class RegistroC465 extends Registro {

	@Column(name = "CHV_CFE")
	@Indice(valor = 2)
	private String chvCfe;
	@Column(name = "NUM_CCF")
	@Indice(valor = 3)
	private String numCcf;

	public RegistroC465(String linha) {
		super(linha);
	}

}
