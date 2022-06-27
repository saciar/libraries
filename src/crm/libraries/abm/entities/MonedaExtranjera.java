package crm.libraries.abm.entities;

import java.util.Vector;

public class MonedaExtranjera implements ABMEntity{
	
	private String codigo;
	private String descripcion;
	private String valor;
	private String activo;
	
	public MonedaExtranjera(){
		this.activo = "S";
	}

	public MonedaExtranjera(String activo, String codigo, String descripcion, String valor) {
		super();
		// TODO Auto-generated constructor stub
		this.activo = activo;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.valor = valor;
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

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Vector toVector() {		
		Vector vector = new Vector();
    	
    	vector.add(codigo);    	
    	vector.add(descripcion);
    	vector.add(valor);
    	
    	return vector;
	}
	
	
}
