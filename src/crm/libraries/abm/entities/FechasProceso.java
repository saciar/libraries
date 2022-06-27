package crm.libraries.abm.entities;

import java.util.Vector;

public class FechasProceso implements ABMEntity{
	
	private String codigo;
	
	private String fechaProceso;
	
	public FechasProceso(){
	}
	
	public FechasProceso(String cod, String fecha){
		codigo = cod;
		fechaProceso = fecha;
	}

	public void setCodigo(String cod) {
		codigo = cod;
	}

	public String getCodigo() {
		return codigo;
	}

	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFechaProceso() {
		return fechaProceso;
	}

	public void setFechaProceso(String fechaProceso) {
		this.fechaProceso = fechaProceso;
	}
	
	
}
