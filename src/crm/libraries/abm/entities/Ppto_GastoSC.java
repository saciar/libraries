package crm.libraries.abm.entities;

import java.io.Serializable;

import crm.libraries.abm.helper.ServicioHelper;

public class Ppto_GastoSC implements Serializable {
	
	private long id;	
	private String detalle;
	private String proveedor;
	private String costo;
	private String precio;
	private String sala;
	private int cantidad;
	private String estado;
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	private Ppto_Sala_Servicio ppto_Sala_Servicio;
	
	public Ppto_GastoSC(){}

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

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public Ppto_Sala_Servicio getPpto_Sala_Servicio() {
		return ppto_Sala_Servicio;
	}

	public void setPpto_Sala_Servicio(Ppto_Sala_Servicio ppto_Sala_Servicio) {
		this.ppto_Sala_Servicio = ppto_Sala_Servicio;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
}
