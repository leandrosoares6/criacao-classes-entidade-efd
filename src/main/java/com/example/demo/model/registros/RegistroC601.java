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
@Table(name = "TAB_EFD_C601", schema = "APL_EFD")
public class RegistroC601 extends Registro {

	@Column(name = "NUM_DOC_CANC")
	@Indice(valor = 3)
	private String numDocCanc;

	public RegistroC601(String linha) {
		super(linha);
	}

}
