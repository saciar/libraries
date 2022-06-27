package crm.libraries.report;

public class OrdenFacturacionSalas {
	private long salaId;
	private String nombreSala;
	private String fechaInicio;
	private String fechaFin;

	private OrdenFacturacionServicio[] servicios;

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}

	public long getSalaId() {
		return salaId;
	}

	public void setSalaId(long salaId) {
		this.salaId = salaId;
	}

	public OrdenFacturacionServicio[] getServicios() {
		return servicios;
	}

	public void setServicios(OrdenFacturacionServicio[] servicios) {
		this.servicios = servicios;
	}
}
