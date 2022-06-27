package crm.libraries.abm.entities;

import java.util.Vector;

public class CostoOperativo implements ABMEntity{
	private String codigo;
	private String costo;

	public CostoOperativo() {
	}
	
	
	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
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
