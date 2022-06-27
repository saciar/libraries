package crm.libraries.abm.entities;

import java.util.Vector;

public class Feriados implements ABMEntity{
	private String codigo;
	private String fecha;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String id) {
		this.codigo = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}
}
