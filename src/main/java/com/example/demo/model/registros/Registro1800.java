package com.example.demo.model.registros;

import com.example.demo.model.Registro;
import com.example.demo.util.CampoTipoId;
import com.example.demo.util.Indice;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "TAB_EFD_1800", schema = "APL_EFD")
public class Registro1800 extends Registro {

	@Column(name = "VL_CARGA")
	@Indice(valor = 2)
	private String vlCarga;
	@Column(name = "VL_PASS")
	@Indice(valor = 3)
	private String vlPass;
	@Column(name = "VL_FAT")
	@Indice(valor = 4)
	private String vlFat;
	@Column(name = "IND_RAT")
	@Indice(valor = 5)
	private String indRat;
	@Column(name = "VL_ICMS_ANT")
	@Indice(valor = 6)
	private String vlIcmsAnt;
	@Column(name = "VL_BC_ICMS")
	@Indice(valor = 7)
	private String vlBcIcms;
	@Column(name = "VL_ICMS_APUR")
	@Indice(valor = 8)
	private String vlIcmsApur;
	@Column(name = "VL_BC_ICMS_APUR")
	@Indice(valor = 9)
	private String vlBcIcmsApur;
	@Column(name = "VL_DIF")
	@Indice(valor = 10)
	private String vlDif;
	@Column(name = "ID")
	@Indice(valor = 100)
	@Id
	@CampoTipoId
	private String id;

	public Registro1800(String linha) {
		super(linha);
	}

}
