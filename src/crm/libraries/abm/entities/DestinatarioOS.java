package crm.libraries.abm.entities;

import java.util.Vector;

public class DestinatarioOS implements ABMEntity{
	private String codigo;
	private String nombre;
	private String email;
	private String activo;
	
	public DestinatarioOS(){
		
	}
	
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	public DestinatarioOS(String codigo, String email, String nombre) {
		this.codigo = codigo;
		this.email = email;
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}
	public String toString(){
		return this.nombre;
	}
	
	
}
