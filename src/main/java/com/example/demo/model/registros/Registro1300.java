package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
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
@Table(name = "TAB_EFD_1300", schema = "APL_EFD")
public class Registro1300 extends Registro {

	@Column(name = "COD_ITEM")
	@Indice(valor = 3)
	private String codItem;
	@Column(name = "DT_FECH")
	@Indice(valor = 4)
	@CampoTipoData
	private String dtFech;
	@Column(name = "ESTQ_ABERT")
	@Indice(valor = 5)
	private String estqAbert;
	@Column(name = "VOL_ENTR")
	@Indice(valor = 6)
	private String volEntr;
	@Column(name = "VOL_DISP")
	@Indice(valor = 7)
	private String volDisp;
	@Column(name = "VOL_SAIDAS")
	@Indice(valor = 8)
	private String volSaidas;
	@Column(name = "ESTQ_ESCR")
	@Indice(valor = 9)
	private String estqEscr;
	@Column(name = "VAL_AJ_PERDA")
	@Indice(valor = 10)
	private String valAjPerda;
	@Column(name = "VAL_AJ_GANHO")
	@Indice(valor = 11)
	private String valAjGanho;
	@Column(name = "FECH_FISICO")
	@Indice(valor = 12)
	private String fechFisico;
	@Column(name = "TAB_EFD_0000_ID")
	@Indice(valor = 200)
	@CampoTipoId
	private String tabEfd0000Id;

	public Registro1300(String linha) {
		super(linha);
	}

}
