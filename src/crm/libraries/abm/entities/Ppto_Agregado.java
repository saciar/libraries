package crm.libraries.abm.entities;

import java.io.Serializable;
import java.util.Vector;

public class Ppto_Agregado implements Serializable{
	private Long id;
	private Presupuesto presupuesto;
	private String modoIngreso;
	private String categoriaEvento;
	private String seguridadIngreso;
	private String tipoVenta;
	
	public Ppto_Agregado(){
		modoIngreso = "0";
		seguridadIngreso = "0";
		categoriaEvento = "0";
		tipoVenta = "0";
	}
	
	public String getTipoVenta() {
		return tipoVenta;
	}

	public void setTipoVenta(String tipoVenta) {
		this.tipoVenta = tipoVenta;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Presupuesto getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}
	public String getModoIngreso() {
		return modoIngreso;
	}
	public void setModoIngreso(String modoIngreso) {
		this.modoIngreso = modoIngreso;
	}
	public String getSeguridadIngreso() {
		return seguridadIngreso;
	}
	public void setSeguridadIngreso(String seguridad) {
		this.seguridadIngreso = seguridad;
	}
	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getCategoriaEvento() {
		return categoriaEvento;
	}
	public void setCategoriaEvento(String categoriaEvento) {
		this.categoriaEvento = categoriaEvento;
	}
}
