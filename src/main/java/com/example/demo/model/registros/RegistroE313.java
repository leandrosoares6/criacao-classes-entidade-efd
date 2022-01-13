package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
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
@Table(name = "TAB_EFD_E313", schema = "APL_EFD")
public class RegistroE313 extends Registro {

	@Column(name = "COD_PART")
	@Indice(valor = 3)
	private String codPart;
	@Column(name = "COD_MOD")
	@Indice(valor = 4)
	private String codMod;
	@Column(name = "SER")
	@Indice(valor = 5)
	private String ser;
	@Column(name = "SUB")
	@Indice(valor = 6)
	private String sub;
	@Column(name = "NUM_DOC")
	@Indice(valor = 7)
	private String numDoc;
	@Column(name = "CHV_DOCE")
	@Indice(valor = 8)
	private String chvDoce;
	@Column(name = "DT_DOC")
	@Indice(valor = 9)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "COD_ITEM")
	@Indice(valor = 10)
	private String codItem;
	@Column(name = "VL_AJ_ITEM")
	@Indice(valor = 11)
	private String vlAjItem;

	public RegistroE313(String linha) {
		super(linha);
	}

}
