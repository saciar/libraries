package crm.libraries.abm.entities;

import java.io.Serializable;

public class Ppto_Seguimiento implements Serializable{
	private Long id;
	private Presupuesto presupuesto;
	private String fechaYHora;
	private String codigoUsuario;
    private String codigoSeguimiento;
    private String codigoSeguimientoRespuesta;
    private String observaciones;
	
    public String getCodigoSeguimiento() {
		return codigoSeguimiento;
	}
	public void setCodigoSeguimiento(String codigoSeguimiento) {
		this.codigoSeguimiento = codigoSeguimiento;
	}
	public String getCodigoSeguimientoRespuesta() {
		return codigoSeguimientoRespuesta;
	}
	public void setCodigoSeguimientoRespuesta(String codigoSeguimientoRespuesta) {
		this.codigoSeguimientoRespuesta = codigoSeguimientoRespuesta;
	}
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getFechaYHora() {
		return fechaYHora;
	}
	public void setFechaYHora(String fechaYHora) {
		this.fechaYHora = fechaYHora;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Presupuesto getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}
}
