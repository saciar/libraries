package crm.libraries.abm.entities;

import java.io.Serializable;

/**
 * @hibernate.class table="TX_SERVICIO_DESC_DETALLADA"
 */
public class Ppto_Sala_Servicio_Desc_Detallada implements Serializable{
	private Long id;
	private Ppto_Sala_Servicio servicio;
	private String descripcion;
	
	public Ppto_Sala_Servicio_Desc_Detallada(){
		
	}

	/**
	 * @hibernate.property column="psdd_descripcion"
	 * @return
	 */
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @hibernate.property column="psdd_id"
	 * @return
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @hibernate.many-to-one column="psdd_servicio"
	 * @return
	 */
	public Ppto_Sala_Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Ppto_Sala_Servicio servicio) {
		this.servicio = servicio;
	}
	
}
