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
@Table(name = "TAB_EFD_C114", schema = "APL_EFD")
public class RegistroC114 extends Registro {

	@Column(name = "COD_MOD")
	@Indice(valor = 3)
	private String codMod;
	@Column(name = "ECF_FAB")
	@Indice(valor = 4)
	private String ecfFab;
	@Column(name = "ECF_CX")
	@Indice(valor = 5)
	private String ecfCx;
	@Column(name = "NUM_DOC")
	@Indice(valor = 6)
	private String numDoc;
	@Column(name = "DT_DOC")
	@Indice(valor = 7)
	@CampoTipoData
	private String dtDoc;

	public RegistroC114(String linha) {
		super(linha);
	}

}
