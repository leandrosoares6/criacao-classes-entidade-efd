package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoDataPart;
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
@Table(name = "TAB_EFD_C101", schema = "APL_EFD")
public class RegistroC101 extends Registro {

	@Column(name = "VL_FCP_UF_DEST")
	@Indice(valor = 2)
	private String vlFcpUfDest;
	@Column(name = "VL_ICMS_UF_DEST")
	@Indice(valor = 3)
	private String vlIcmsUfDest;
	@Column(name = "VL_ICMS_UF_REM")
	@Indice(valor = 4)
	private String vlIcmsUfRem;
	@Column(name = "DATA_PART")
	@Indice(valor = 5)
	@CampoTipoData
	@CampoTipoDataPart
	private String dataPart;

	public RegistroC101(String linha) {
		super(linha);
	}

}
