package crm.libraries.report;

public class OrdenServiciosDesconfirmadaServicios {
	private long servicioId;
	private long cantidad;
	private String servicio;
	private int dias;
	//
	private String familia;
	private boolean subcontratado;
	
	private EventoAccesorio[] accesorios;

	public EventoAccesorio[] getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(EventoAccesorio[] accesorios) {
		this.accesorios = accesorios;
	}

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

	public boolean isSubcontratado() {
		return subcontratado;
	}

	public void setSubcontratado(boolean subcontratado) {
		this.subcontratado = subcontratado;
	}
}
