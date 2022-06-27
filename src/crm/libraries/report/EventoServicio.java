package crm.libraries.report;

import java.util.HashMap;
import java.util.Map;

public class EventoServicio {
	private long servicioId;
	private long cantidad;
	private String servicio;
	private int dias;
	
	private EventoAccesorio[] accesorios;

	/**
	 * @return Returns the accesorios.
	 */
	public EventoAccesorio[] getAccesorios() {
		return accesorios;
	}

	/**
	 * @param accesorios The accesorios to set.
	 */
	public void setAccesorios(EventoAccesorio[] accesorios) {
		this.accesorios = accesorios;
	}

	/**
	 * @return Returns the cantidad.
	 */
	public long getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad The cantidad to set.
	 */
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return Returns the servicio.
	 */
	public String getServicio() {
		return servicio;
	}

	/**
	 * @param servicio The servicio to set.
	 */
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	/**
	 * @return Returns the servicioId.
	 */
	public long getServicioId() {
		return servicioId;
	}

	/**
	 * @param servicioId The servicioId to set.
	 */
	public void setServicioId(long servicioId) {
		this.servicioId = servicioId;
	}

	/**
	 * @return Returns the dias.
	 */
	public int getDias() {
		return dias;
	}

	/**
	 * @param dias The dias to set.
	 */
	public void setDias(int dias) {
		this.dias = dias;
	}
}
