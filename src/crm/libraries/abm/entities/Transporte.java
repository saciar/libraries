package crm.libraries.abm.entities;

import java.util.Vector;

public class Transporte implements ABMEntity{

    private String codigo;
    private String descripcion;
    private String matricula;
    private String activo;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public void setCodigo(String codigo) {
		this.codigo=codigo;
		
	}

	public String getCodigo() {
		// TODO Auto-generated method stub
		return this.codigo;
	}

	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}

}
