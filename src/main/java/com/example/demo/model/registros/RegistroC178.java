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
@Table(name = "TAB_EFD_C178", schema = "APL_EFD")
public class RegistroC178 extends Registro {

	@Column(name = "CL_ENQ")
	@Indice(valor = 2)
	private String clEnq;
	@Column(name = "VL_UNID")
	@Indice(valor = 3)
	private String vlUnid;
	@Column(name = "QUANT_PAD")
	@Indice(valor = 4)
	private String quantPad;

	public RegistroC178(String linha) {
		super(linha);
	}

}
