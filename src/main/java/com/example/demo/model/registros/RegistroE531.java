package com.example.demo.model.registros;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "TAB_EFD_E531 (COD_PART, COD_MOD, SER, SUB, NUM_DOC, DT_DOC, COD_ITEM, VL_AJ_ITEM, CHV_ITEM)  VALUES (?, ?, ?, to_number(?), to_number(?), ?, ?, to_number(?), ?)",
		schema = "APL_EFD")
public class RegistroE531 extends Registro {

	public RegistroE531(String linha) {
		super(linha);
	}

}
