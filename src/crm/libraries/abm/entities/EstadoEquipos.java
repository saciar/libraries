package crm.libraries.abm.entities;

import java.util.Vector;

public class EstadoEquipos implements ABMEntity  {

	private String codigo;
	private String descripcion;
	private String activo;
	
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
