package crm.libraries.report;

import java.util.HashMap;
import java.util.Map;

public class EventoAccesorio {
	private long accesorioId;
	private long cantidad;
	private String accesorio;
	
	/**
	 * @return Returns the accesorio.
	 */
	public String getAccesorio() {
		return accesorio;
	}
	/**
	 * @param accesorio The accesorio to set.
	 */
	public void setAccesorio(String accesorio) {
		this.accesorio = accesorio;
	}
	/**
	 * @return Returns the accesorioId.
	 */
	public long getAccesorioId() {
		return accesorioId;
	}
	/**
	 * @param accesorioId The accesorioId to set.
	 */
	public void setAccesorioId(long accesorioId) {
		this.accesorioId = accesorioId;
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
}
