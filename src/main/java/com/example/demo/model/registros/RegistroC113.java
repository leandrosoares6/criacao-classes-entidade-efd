package com.example.demo.model.registros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoData;
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
@Table(name = "TAB_EFD_C113", schema = "APL_EFD")
public class RegistroC113 extends Registro {

	@Column(name = "IND_OPER")
	@Indice(valor = 3)
	private String indOper;
	@Column(name = "IND_EMIT")
	@Indice(valor = 4)
	private String indEmit;
	@Column(name = "COD_PART")
	@Indice(valor = 5)
	private String codPart;
	@Column(name = "COD_MOD")
	@Indice(valor = 6)
	private String codMod;
	@Column(name = "SER")
	@Indice(valor = 7)
	private String ser;
	@Column(name = "SUB")
	@Indice(valor = 8)
	private String sub;
	@Column(name = "NUM_DOC")
	@Indice(valor = 9)
	private String numDoc;
	@Column(name = "DT_DOC")
	@Indice(valor = 10)
	@CampoTipoData
	private String dtDoc;
	@Column(name = "CHV_DOCE")
	@Indice(valor = 11)
	private String chvDoce;

	public RegistroC113(String linha) {
		super(linha);
	}

}
