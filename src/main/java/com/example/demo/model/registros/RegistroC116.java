package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
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
@Table(name = "TAB_EFD_C116", schema = "APL_EFD")
public class RegistroC116 extends Registro {

	@Column(name = "COD_MOD")
	@Indice(valor = 3)
	private String codMod;
	@Column(name = "NR_SAT")
	@Indice(valor = 4)
	private String nrSat;
	@Column(name = "CHV_CFE")
	@Indice(valor = 5)
	private String chvCfe;
	@Column(name = "NUM_CFE")
	@Indice(valor = 6)
	private String numCfe;
	@Column(name = "DT_DOC")
	@Indice(valor = 7)
	@CampoTipoData
	private String dtDoc;

	public RegistroC116(String linha) {
		super(linha);
	}

}
