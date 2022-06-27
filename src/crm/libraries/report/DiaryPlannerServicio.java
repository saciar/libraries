package crm.libraries.report;

public class DiaryPlannerServicio {
	private long servicioId;
	private long cantidad;
	private String servicio;
	private int dias;
	
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
