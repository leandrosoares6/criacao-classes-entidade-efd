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
@Table(name = "TAB_EFD_1350", schema = "APL_EFD")
public class Registro1350 extends Registro {

	@Column(name = "SERIE")
	@Indice(valor = 3)
	private String serie;
	@Column(name = "FABRICANTE")
	@Indice(valor = 4)
	private String fabricante;
	@Column(name = "MODELO")
	@Indice(valor = 5)
	private String modelo;
	@Column(name = "TIPO_MEDICAO")
	@Indice(valor = 6)
	private String tipoMedicao;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro1350(String linha) {
		super(linha);
	}

}
