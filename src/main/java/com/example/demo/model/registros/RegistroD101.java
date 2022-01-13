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
@Table(name = "TAB_EFD_D101", schema = "APL_EFD")
public class RegistroD101 extends Registro {

	@Column(name = "VL_FCP_UF_DEST")
	@Indice(valor = 2)
	private String vlFcpUfDest;
	@Column(name = "VL_ICMS_UF_DEST")
	@Indice(valor = 3)
	private String vlIcmsUfDest;
	@Column(name = "VL_ICMS_UF_REM")
	@Indice(valor = 4)
	private String vlIcmsUfRem;

	public RegistroD101(String linha) {
		super(linha);
	}

}
