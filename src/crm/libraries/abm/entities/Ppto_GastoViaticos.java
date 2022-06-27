package crm.libraries.abm.entities;

import java.io.Serializable;

import crm.libraries.abm.helper.ServicioHelper;

public class Ppto_GastoViaticos implements Serializable {
	
	private long id;	
	private String detalle;
	private String costo;

	public Ppto_GastoViaticos(){		
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



}
