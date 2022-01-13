package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
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
@Table(name = "TAB_EFD_1970", schema = "APL_EFD")
public class Registro1970 extends Registro {

	@Column(name = "IND_AP")
	@Indice(valor = 4)
	private String indAp;
	@Column(name = "G3_01")
	@Indice(valor = 4)
	private String g301;
	@Column(name = "G3_02")
	@Indice(valor = 4)
	private String g302;
	@Column(name = "G3_03")
	@Indice(valor = 4)
	private String g303;
	@Column(name = "G3_04")
	@Indice(valor = 4)
	private String g304;
	@Column(name = "G3_05")
	@Indice(valor = 4)
	private String g305;
	@Column(name = "G3_06")
	@Indice(valor = 4)
	private String g306;
	@Column(name = "G3_07")
	@Indice(valor = 4)
	private String g307;
	@Column(name = "G3_T")
	@Indice(valor = 4)
	private String g3T;
	@Column(name = "G3_08")
	@Indice(valor = 4)
	private String g308;
	@Column(name = "G3_09")
	@Indice(valor = 4)
	private String g309;

	public Registro1970(String linha) {
		super(linha);
	}

}
