package crm.libraries.abm.entities;

import java.util.Date;
import java.util.Vector;

public class NuevoCliente implements ABMEntity{
	
	private String codigo;
	private String fechaAlta;
	private String nuevo;
	
	public NuevoCliente(){
	}
	
	public NuevoCliente(String codCliente, String fecha, String act){
		codigo = codCliente;
		fechaAlta =fecha;
		nuevo = act;
	}

	public String getNuevo() {
		return nuevo;
	}

	public void setNuevo(String nuevo) {
		this.nuevo = nuevo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigoCliente) {
		this.codigo = codigoCliente;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
