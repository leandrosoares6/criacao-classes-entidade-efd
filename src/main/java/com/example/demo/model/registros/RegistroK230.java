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
@Table(name = "TAB_EFD_K230", schema = "APL_EFD")
public class RegistroK230 extends Registro {

	@Column(name = "DT_INI_OP")
	@Indice(valor = 3)
	@CampoTipoData
	private String dtIniOp;
	@Column(name = "DT_FIN_OP")
	@Indice(valor = 4)
	@CampoTipoData
	private String dtFinOp;
	@Column(name = "COD_DOC_OP")
	@Indice(valor = 5)
	private String codDocOp;
	@Column(name = "COD_ITEM")
	@Indice(valor = 6)
	private String codItem;
	@Column(name = "QTD_ENC")
	@Indice(valor = 7)
	private String qtdEnc;

	public RegistroK230(String linha) {
		super(linha);
	}

}
