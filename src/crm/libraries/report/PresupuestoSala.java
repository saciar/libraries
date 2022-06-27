package crm.libraries.report;

public class PresupuestoSala {
	private long salaId;
	private String nombreSala;
	private String fechaInicio;
	private String fechaFin;

	private PresupuestoServicio[] servicios;
	
	private PresupuestoOpcional[] opcionales;

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

	public PresupuestoServicio[] getServicios() {
		return servicios;
	}

	public void setServicios(PresupuestoServicio[] servicios) {
		this.servicios = servicios;
	}

	/**
	 * @return Returns the opcionales.
	 */
	public PresupuestoOpcional[] getOpcionales() {
		return opcionales;
	}

	/**
	 * @param opcionales The opcionales to set.
	 */
	public void setOpcionales(PresupuestoOpcional[] opcionales) {
		this.opcionales = opcionales;
	}
}
