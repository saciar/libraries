package crm.libraries.report;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EventoSala {
	private long salaId;
	private String nombreSala;
	private String fechaInicio;
	private String fechaFin;
	//private Date fechaInstalacion;
	private long totalPersonas;

	private EventoServicio[] servicios;

	/**
	 * @return Returns the fechaInicio.
	 */
	public String getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio The fechaInicio to set.
	 */
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return Returns the nombreSala.
	 */
	public String getNombreSala() {
		return nombreSala;
	}

	/**
	 * @param nombreSala The nombreSala to set.
	 */
	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}

	/**
	 * @return Returns the salaId.
	 */
	public long getSalaId() {
		return salaId;
	}

	/**
	 * @param salaId The salaId to set.
	 */
	public void setSalaId(long salaId) {
		this.salaId = salaId;
	}

	/**
	 * @return Returns the servicios.
	 */
	public EventoServicio[] getServicios() {
		return servicios;
	}

	/**
	 * @param servicios The servicios to set.
	 */
	public void setServicios(EventoServicio[] servicios) {
		this.servicios = servicios;
	}

	/**
	 * @return Returns the fechaFin.
	 */
	public String getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin The fechaFin to set.
	 */
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * @return Returns the fechaInstalacion.
	 */
	/*public Date getFechaInstalacion() {
		return fechaInstalacion;
	}*/

	/**
	 * @param fechaInstalacion The fechaInstalacion to set.
	 */
	/*public void setFechaInstalacion(Date fechaInstalacion) {
		this.fechaInstalacion = fechaInstalacion;
	}*/

	/**
	 * @return Returns the totalPersonas.
	 */
	public long getTotalPersonas() {
		return totalPersonas;
	}

	/**
	 * @param totalPersonas The totalPersonas to set.
	 */
	public void setTotalPersonas(long totalPersonas) {
		this.totalPersonas = totalPersonas;
	}
}
