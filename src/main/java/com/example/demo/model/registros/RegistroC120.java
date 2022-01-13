package com.example.demo.model.registros;

import com.example.demo.model.Registro;
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
@Table(name = "TAB_EFD_C120", schema = "APL_EFD")
public class RegistroC120 extends Registro {

	@Column(name = "COD_DOC_IMP")
	@Indice(valor = 3)
	private String codDocImp;
	@Column(name = "NUM_DOC_IMP")
	@Indice(valor = 4)
	private String numDocImp;
	@Column(name = "PIS_IMP")
	@Indice(valor = 5)
	private String pisImp;
	@Column(name = "COFINS_IMP")
	@Indice(valor = 6)
	private String cofinsImp;
	@Column(name = "NUM_ACDRAW")
	@Indice(valor = 7)
	private String numAcdraw;

	public RegistroC120(String linha) {
		super(linha);
	}

}
