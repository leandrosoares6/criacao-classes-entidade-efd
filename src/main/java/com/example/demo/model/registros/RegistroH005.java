package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
import com.example.demo.util.CampoTipoId;
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
@Table(name = "TAB_EFD_H005", schema = "APL_EFD")
public class RegistroH005 extends Registro {

	@Column(name = "DT_INV")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtInv;
	@Column(name = "VL_INV")
	@Indice(valor = 4)
	private String vlInv;
	@Column(name = "MOT_INV")
	@Indice(valor = 5)
	private String motInv;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public RegistroH005(String linha) {
		super(linha);
	}

}
