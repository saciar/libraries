package crm.libraries.abm.entities;

import java.util.Vector;

public class EgresoEquipo implements ABMEntity {
	
	private String codigo;
	private String codEquipo;
	private String codEgreso;

	public String getCodEquipo() {
		return codEquipo;
	}
	public void setCodEquipo(String codEquipo) {
		this.codEquipo = codEquipo;
	}

	public String getCodEgreso() {
		return codEgreso;
	}
	public void setCodEgreso(String codEgreso) {
		this.codEgreso = codEgreso;
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

}
