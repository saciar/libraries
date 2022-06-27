package crm.libraries.report;

public class OrdenCompraServicio {
	private long servicioId;
	private long cantidad;
	private String servicio;
	private int dias;
	private String familia;
	private double importe;

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
}
