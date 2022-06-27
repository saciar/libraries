package crm.libraries.abm.helper;

import crm.libraries.abm.entities.PptoCambioEstado;
import crm.libraries.abm.entities.Ppto_Facturas;
import crm.libraries.abm.entities.Ppto_Sala;
import crm.libraries.abm.entities.Ppto_Sala_Agregado;
import crm.libraries.abm.entities.Ppto_Sala_Horario;
import crm.libraries.abm.entities.Ppto_Sala_Servicio;
import crm.libraries.abm.entities.Ppto_Sala_Servicio_Desc_Detallada;

/**
 * Esta clase es muy importante, la idea que que le diga al puto wscompile que genere los
 * serializers para estas clases.
 * 
 * @author hernux
 *
 */
public class Dummy {
	private Ppto_Sala ps = null;
	private PptoCambioEstado pce = null;
	private Ppto_Sala_Servicio pss;
	private Ppto_Sala_Agregado pas;
	private Ppto_Sala_Horario psh;
	private Ppto_Sala_Servicio_Desc_Detallada pssdd;
	private Ppto_Facturas fact;
	
	public Ppto_Sala_Horario getPsh() {
		return psh;
	}
	public void setPsh(Ppto_Sala_Horario psh) {
		this.psh = psh;
	}
	public Ppto_Sala_Servicio_Desc_Detallada getPssdd() {
		return pssdd;
	}
	public void setPssdd(Ppto_Sala_Servicio_Desc_Detallada pssdd) {
		this.pssdd = pssdd;
	}
	public PptoCambioEstado getPce() {
		return pce;
	}
	public void setPce(PptoCambioEstado pce) {
		this.pce = pce;
	}
	public Ppto_Sala getPs() {
		return ps;
	}
	public void setPs(Ppto_Sala ps) {
		this.ps = ps;
	}
	public Ppto_Sala_Servicio getPss() {
		return pss;
	}
	public void setPss(Ppto_Sala_Servicio pss) {
		this.pss = pss;
	}

	public Ppto_Sala_Agregado getPas() {
		return pas;
	}
	public void setPas(Ppto_Sala_Agregado pas) {
		this.pas = pas;
	}
	/**
	 * @return Returns the fact.
	 */
	public Ppto_Facturas getFact() {
		return fact;
	}
	/**
	 * @param fact The fact to set.
	 */
	public void setFact(Ppto_Facturas fact) {
		this.fact = fact;
	}
}
