package com.example.demo.model.registros;

import com.example.demo.model.Registro;
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
@Table(name = "TAB_EFD_C400", schema = "APL_EFD")
public class RegistroC400 extends Registro {

	@Column(name = "COD_MOD")
	@Indice(valor = 3)
	private String codMod;
	@Column(name = "ECF_MOD")
	@Indice(valor = 4)
	private String ecfMod;
	@Column(name = "ECF_FAB")
	@Indice(valor = 5)
	private String ecfFab;
	@Column(name = "ECF_CX")
	@Indice(valor = 6)
	private String ecfCx;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public RegistroC400(String linha) {
		super(linha);
	}

}
