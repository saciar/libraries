package crm.libraries.abm.entities;

import java.util.Vector;

public class GastoSubcontratacion implements ABMEntity{
	private String codigo;	
	private String detalle;
	private String proveedor;
	private String costo;
	private String precio;
	private String sala;
	private int cantidad;
	private long nroPpto;
	
	public GastoSubcontratacion(){
		
	}
	
	public long getNroPpto() {
		return nroPpto;
	}
	public void setNroPpto(long nroPpto) {
		this.nroPpto = nroPpto;
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

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}
}
