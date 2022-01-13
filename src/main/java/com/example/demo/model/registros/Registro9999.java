package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoId;
import com.example.demo.util.Indice;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "TAB_EFD_9999", schema = "APL_EFD")
public class Registro9999 extends Registro {

	@Column(name = "qtd_lin")
	@Indice(valor = 4)
	private String qtdLin;
	@Column(name = "ID")
	@Indice(valor = 200)
	@Id
	@CampoTipoId
	private String id;

	public Registro9999(String linha) {
		super(linha);
	}

}
