package crm.libraries.abm.entities;

import java.io.Serializable;

public class Ppto_Facturas implements Serializable{
	private Long id;
	private Presupuesto presupuesto;
	private String factura;
	private String fechaAppend;
	private String estado;

	/**
	 * @return Returns the fechaAppend.
	 */
	public String getFechaAppend() {
		return fechaAppend;
	}
	/**
	 * @param fechaAppend The fechaAppend to set.
	 */
	public void setFechaAppend(String fechaAppend) {
		this.fechaAppend = fechaAppend;
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
	 * @return Returns the factura.
	 */
	public String getFactura() {
		return factura;
	}
	/**
	 * @param factura The factura to set.
	 */
	public void setFactura(String factura) {
		this.factura = factura;
	}
	/**
	 * @return Returns the estado.
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado The estado to set.
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
