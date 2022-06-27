package crm.libraries.abm.entities;

import java.util.Vector;

public class DiasAVencer implements ABMEntity{
	private String codigo;
	private String dias;
	
	public DiasAVencer(String cod, String dias) {
		codigo = cod;
		this.dias = dias;
	}
	
	public DiasAVencer() {
	}
	
	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}



	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getProtocolAddString() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getProtocolListString() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
