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
@Table(name = "TAB_EFD_C179", schema = "APL_EFD")
public class RegistroC179 extends Registro {

	@Column(name = "BC_ST_ORIG_DEST")
	@Indice(valor = 2)
	private String bcStOrigDest;
	@Column(name = "ICMS_ST_REP")
	@Indice(valor = 3)
	private String icmsStRep;
	@Column(name = "ICMS_ST_COMPL")
	@Indice(valor = 4)
	private String icmsStCompl;
	@Column(name = "BC_RET")
	@Indice(valor = 5)
	private String bcRet;
	@Column(name = "ICMS_RET")
	@Indice(valor = 6)
	private String icmsRet;

	public RegistroC179(String linha) {
		super(linha);
	}

}
