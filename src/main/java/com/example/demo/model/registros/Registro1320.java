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
@Table(name = "TAB_EFD_1320", schema = "APL_EFD")
public class Registro1320 extends Registro {

	@Column(name = "NUM_BICO")
	@Indice(valor = 3)
	private String numBico;
	@Column(name = "NR_INTERV")
	@Indice(valor = 4)
	private String nrInterv;
	@Column(name = "MOT_INTERV")
	@Indice(valor = 5)
	private String motInterv;
	@Column(name = "NOM_INTERV")
	@Indice(valor = 6)
	private String nomInterv;
	@Column(name = "CNPJ_INTERV")
	@Indice(valor = 7)
	private String cnpjInterv;
	@Column(name = "CPF_INTERV")
	@Indice(valor = 8)
	private String cpfInterv;
	@Column(name = "VAL_FECHA")
	@Indice(valor = 9)
	private String valFecha;
	@Column(name = "VAL_ABERT")
	@Indice(valor = 10)
	private String valAbert;
	@Column(name = "VOL_AFERI")
	@Indice(valor = 11)
	private String volAferi;
	@Column(name = "VOL_VENDAS")
	@Indice(valor = 12)
	private String volVendas;

	public Registro1320(String linha) {
		super(linha);
	}

}
