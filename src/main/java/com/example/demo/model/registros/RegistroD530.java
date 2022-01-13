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
@Table(name = "TAB_EFD_D530", schema = "APL_EFD")
public class RegistroD530 extends Registro {

	@Column(name = "IND_SERV")
	@Indice(valor = 3)
	private String indServ;
	@Column(name = "DT_INI_SERV")
	@Indice(valor = 4)
	@CampoTipoData
	private String dtIniServ;
	@Column(name = "DT_FIN_SERV")
	@Indice(valor = 5)
	@CampoTipoData
	private String dtFinServ;
	@Column(name = "PER_FISCAL")
	@Indice(valor = 6)
	private String perFiscal;
	@Column(name = "COD_AREA")
	@Indice(valor = 7)
	private String codArea;
	@Column(name = "TERMINAL")
	@Indice(valor = 8)
	private String terminal;

	public RegistroD530(String linha) {
		super(linha);
	}

}
