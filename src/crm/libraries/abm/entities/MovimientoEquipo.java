package crm.libraries.abm.entities;

import java.util.Vector;

public class MovimientoEquipo implements ABMEntity {
	private String codigo;
	private String codEquipo;
	private String fecha;
	private String tipo;
	private String deposito;
	private String operador;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCodEquipo() {
		return codEquipo;
	}
	public void setCodEquipo(String codEquipo) {
		this.codEquipo = codEquipo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDeposito() {
		return deposito;
	}
	public void setDeposito(String deposito) {
		this.deposito = deposito;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public String getNroOrden() {
		return nroOrden;
	}
	public void setNroOrden(String nroOrden) {
		this.nroOrden = nroOrden;
	}
	private String nroOrden;
	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}
}
