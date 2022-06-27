package crm.libraries.abm.entities;

import java.util.Vector;


public class EstadoEvento implements ABMEntity {

	private String codigo;
	private String descripcion;
	private String activo = "S";
	
	public EstadoEvento(){}
	
	public EstadoEvento(String activo, String descripcion) {
		this.activo = activo;
		this.descripcion = descripcion;
	}

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
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(descripcion); 
    	vector.add(activo); 
    	
    	return vector;
	}

	public String getProtocolAddString() {
		return null;
	}

	public String getProtocolListString() {
		return null;
	}
	
}
