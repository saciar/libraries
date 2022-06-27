package crm.libraries.abm.entities;

import java.util.Vector;

public class VariacionMes implements ABMEntity{

	private String codigo;
	private String variacion;
	private String mes;
	private String activo;	
		
	public VariacionMes(String activo, String codigo, String mes, String porcentaje) {
		this.activo = activo;
		this.codigo = codigo;
		this.mes = mes;
		this.variacion = porcentaje;
	}

	public VariacionMes() {
		// TODO Auto-generated constructor stub
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

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
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
