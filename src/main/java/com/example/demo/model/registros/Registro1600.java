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
@Table(name = "TAB_EFD_1600", schema = "APL_EFD")
public class Registro1600 extends Registro {

	@Column(name = "COD_PART")
	@Indice(valor = 3)
	private String codPart;
	@Column(name = "TOT_CREDITO")
	@Indice(valor = 4)
	private String totCredito;
	@Column(name = "TOT_DEBITO")
	@Indice(valor = 5)
	private String totDebito;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro1600(String linha) {
		super(linha);
	}

}
