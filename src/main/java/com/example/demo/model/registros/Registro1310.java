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
@Table(name = "TAB_EFD_1310", schema = "APL_EFD")
public class Registro1310 extends Registro {

	@Column(name = "NUM_TANQUE")
	@Indice(valor = 3)
	private String numTanque;
	@Column(name = "ESTQ_ABERT")
	@Indice(valor = 4)
	private String estqAbert;
	@Column(name = "VOL_ENTR")
	@Indice(valor = 5)
	private String volEntr;
	@Column(name = "VOL_DISP")
	@Indice(valor = 6)
	private String volDisp;
	@Column(name = "VOL_SAIDAS")
	@Indice(valor = 7)
	private String volSaidas;
	@Column(name = "ESTQ_ESCR")
	@Indice(valor = 8)
	private String estqEscr;
	@Column(name = "VAL_AJ_PERDA")
	@Indice(valor = 9)
	private String valAjPerda;
	@Column(name = "VAL_AJ_GANHO")
	@Indice(valor = 10)
	private String valAjGanho;
	@Column(name = "FECH_FISICO")
	@Indice(valor = 11)
	private String fechFisico;

	public Registro1310(String linha) {
		super(linha);
	}

}
