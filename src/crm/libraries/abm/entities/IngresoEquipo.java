package crm.libraries.abm.entities;

import java.util.Vector;

public class IngresoEquipo implements ABMEntity {
	
	private String codigo;
	private String codEquipo;
	private String codDeposito;

	public String getCodEquipo() {
		return codEquipo;
	}
	public void setCodEquipo(String codEquipo) {
		this.codEquipo = codEquipo;
	}

	public String getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo=codigo;
		
	}
	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getCodDeposito() {
		return codDeposito;
	}
	public void setCodDeposito(String codDeposito) {
		this.codDeposito = codDeposito;
	}


}
