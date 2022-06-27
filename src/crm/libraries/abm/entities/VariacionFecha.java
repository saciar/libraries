package crm.libraries.abm.entities;

import java.util.Vector;

public class VariacionFecha implements ABMEntity{

	private String codigo;
	private String variacion;
	private String fecha;
		
	public VariacionFecha( String codigo, String mes, String porcentaje) {
		this.codigo = codigo;
		this.fecha = mes;
		this.variacion = porcentaje;
	}

	public VariacionFecha() {
		// TODO Auto-generated constructor stub
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fech) {
		this.fecha = fech;
	}

	public String getVariacion() {
		return variacion;
	}

	public void setVariacion(String porcentaje) {
		this.variacion = porcentaje;
	}

	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}


}
