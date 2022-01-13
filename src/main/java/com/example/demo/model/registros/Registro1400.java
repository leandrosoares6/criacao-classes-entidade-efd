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
@Table(name = "TAB_EFD_1400", schema = "APL_EFD")
public class Registro1400 extends Registro {

	@Column(name = "COD_ITEM_IPM")
	@Indice(valor = 3)
	private String codItemIpm;
	@Column(name = "MUN")
	@Indice(valor = 4)
	private String mun;
	@Column(name = "VALOR")
	@Indice(valor = 5)
	private String valor;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro1400(String linha) {
		super(linha);
	}

}
