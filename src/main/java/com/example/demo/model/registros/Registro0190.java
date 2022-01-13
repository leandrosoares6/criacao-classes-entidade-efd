package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoId;
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
@Table(name = "TAB_EFD_0190", schema = "APL_EFD")
public class Registro0190 extends Registro {

	@Column(name = "UNID")
	@Indice(valor = 3)
	private String unid;
	@Column(name = "DESCR")
	@Indice(valor = 4)
	private String descr;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro0190(String linha) {
		super(linha);
	}

}
