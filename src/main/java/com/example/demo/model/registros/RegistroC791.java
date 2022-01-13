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
@Table(name = "TAB_EFD_C791", schema = "APL_EFD")
public class RegistroC791 extends Registro {

	@Column(name = "UF")
	@Indice(valor = 3)
	private String uf;
	@Column(name = "VL_BC_ICMS_ST")
	@Indice(valor = 4)
	private String vlBcIcmsSt;
	@Column(name = "VL_ICMS_ST")
	@Indice(valor = 5)
	private String vlIcmsSt;

	public RegistroC791(String linha) {
		super(linha);
	}

}
