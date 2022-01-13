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
@Table(name = "TAB_EFD_K290", schema = "APL_EFD")
public class RegistroK290 extends Registro {

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

	public RegistroK290(String linha) {
		super(linha);
	}

}
