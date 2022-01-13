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
@Table(name = "TAB_EFD_B470", schema = "APL_EFD")
public class RegistroB470 extends Registro {

	@Column(name = "VL_CONT")
	@Indice(valor = 5)
	private String vlCont;
	@Column(name = "VL_MAT_TERC")
	@Indice(valor = 5)
	private String vlMatTerc;
	@Column(name = "VL_MAT_PROP")
	@Indice(valor = 7)
	private String vlMatProp;
	@Column(name = "VL_SUB")
	@Indice(valor = 5)
	private String vlSub;
	@Column(name = "VL_ISNT")
	@Indice(valor = 5)
	private String vlIsnt;
	@Column(name = "VL_DED_BC")
	@Indice(valor = 5)
	private String vlDedBc;
	@Column(name = "VL_BC_ISS")
	@Indice(valor = 5)
	private String vlBcIss;
	@Column(name = "VL_BC_ISS_RT")
	@Indice(valor = 5)
	private String vlBcIssRt;
	@Column(name = "VL_ISS ")
	@Indice(valor = 5)
	private String vlIss;
	@Column(name = "VL_ISS_RT")
	@Indice(valor = 5)
	private String vlIssRt;
	@Column(name = "VL_DED")
	@Indice(valor = 5)
	private String vlDed;
	@Column(name = "VL_ISS_REC")
	@Indice(valor = 5)
	private String vlIssRec;
	@Column(name = "VL_ISS_ST")
	@Indice(valor = 5)
	private String vlIssSt;
	@Column(name = "VL_ISS_REC_UNI")
	@Indice(valor = 5)
	private String vlIssRecUni;

	public RegistroB470(String linha) {
		super(linha);
	}

}
