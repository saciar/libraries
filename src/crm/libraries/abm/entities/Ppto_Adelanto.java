package crm.libraries.abm.entities;

import java.io.Serializable;

public class Ppto_Adelanto implements Serializable{
	private Long id;
	private Presupuesto presupuesto;
	private String valor;
	private String porcentaje;
	
	public Ppto_Adelanto(){
		valor = "0.00";
		porcentaje = "0";
	}
	
	/**
	 * @return Returns the id.
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id The id to set.
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return Returns the presupuesto.
	 */
	public Presupuesto getPresupuesto() {
		return presupuesto;
	}
	/**
	 * @param presupuesto The presupuesto to set.
	 */
	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}
	/**
	 * @return Returns the porcentaje.
	 */
	public String getPorcentaje() {
		return porcentaje;
	}

	/**
	 * @param porcentaje The porcentaje to set.
	 */
	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}

	/**
	 * @param valor The valor to set.
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * @return Returns the valor.
	 */
	public String getValor() {
		return valor;
	} 

}
