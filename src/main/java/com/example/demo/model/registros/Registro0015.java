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
@Table(name = "TAB_EFD_0015", schema = "APL_EFD")
public class Registro0015 extends Registro {

	@Column(name = "UF_ST")
	@Indice(valor = 3)
	private String ufSt;
	@Column(name = "IE_ST")
	@Indice(valor = 4)
	private String ieSt;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro0015(String linha) {
		super(linha);
	}

}
