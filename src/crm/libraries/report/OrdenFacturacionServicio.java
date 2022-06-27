package crm.libraries.report;

public class OrdenFacturacionServicio {
	private long servicioId;
	private long cantidad;
	private String servicio;
	private int dias;
	private String familia;
	private double importe;
	private int descuento;

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public long getServicioId() {
		return servicioId;
	}

	public void setServicioId(long servicioId) {
		this.servicioId = servicioId;
	}

	/**
	 * @return Returns the descuento.
	 */
	public int getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento The descuento to set.
	 */
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
}
