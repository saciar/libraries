package crm.libraries.abm.entities;

import java.util.Vector;

public class Subcontratado implements ABMEntity  {
	
	private String codigo;	
	private String detalle;
	private String proveedor;
	private String costo;
	private String precio;
	private String sala;
	private int cantidad;
	private int estado;
	private long nroPpto;
	
	public long getNroPpto() {
		return nroPpto;
	}

	public void setNroPpto(long nroPpto) {
		this.nroPpto = nroPpto;
	}

	public String getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	public void setCodigo(String codigo) {
		// TODO Auto-generated method stub
		this.codigo= codigo;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
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

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
