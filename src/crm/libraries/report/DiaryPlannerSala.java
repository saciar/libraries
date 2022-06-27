package crm.libraries.report;

public class DiaryPlannerSala {
	private String nombreFantasia;
	private String nombreEvento;
	private String nombreSala;
	private long numeroPresupuesto;
	private String lugarEvento;
	private String fechaInicialSala;
	private String fechaFinalSala;
	private String fechaInicialEvento;
	private String fechaFinalEvento;
	private String fechaInstalacion;
	private String vendedor;
	private String estado;
	
	private DiaryPlannerServicio[] servicios;
	private DiaryPlannerOperador[] operadores;
	
	public String getFechaFinalSala() {
		return fechaFinalSala;
	}
	public void setFechaFinalSala(String fechaFinalSala) {
		this.fechaFinalSala = fechaFinalSala;
	}
	public String getFechaInicialSala() {
		return fechaInicialSala;
	}
	public void setFechaInicialSala(String fechaInicialSala) {
		this.fechaInicialSala = fechaInicialSala;
	}
	public String getFechaInstalacion() {
		return fechaInstalacion;
	}
	public void setFechaInstalacion(String fechaInstalacion) {
		this.fechaInstalacion = fechaInstalacion;
	}
	public String getLugarEvento() {
		return lugarEvento;
	}
	public void setLugarEvento(String lugarEvento) {
		this.lugarEvento = lugarEvento;
	}
	public String getNombreEvento() {
		return nombreEvento;
	}
	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}
	public String getNombreFantasia() {
		return nombreFantasia;
	}
	public void setNombreFantasia(String nombreFantasia) {
		this.nombreFantasia = nombreFantasia;
	}
	public long getNumeroPresupuesto() {
		return numeroPresupuesto;
	}
	public void setNumeroPresupuesto(long numeroPresupuesto) {
		this.numeroPresupuesto = numeroPresupuesto;
	}
	public DiaryPlannerOperador[] getOperadores() {
		return operadores;
	}
	public void setOperadores(DiaryPlannerOperador[] operadores) {
		this.operadores = operadores;
	}
	public DiaryPlannerServicio[] getServicios() {
		return servicios;
	}
	public void setServicios(DiaryPlannerServicio[] servicios) {
		this.servicios = servicios;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public String getNombreSala() {
		return nombreSala;
	}
	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}
	public String getFechaInicialEvento() {
		return fechaInicialEvento;
	}
	public void setFechaInicialEvento(String fechaInicialEvento) {
		this.fechaInicialEvento = fechaInicialEvento;
	}
	public String getFechaFinalEvento() {
		return fechaFinalEvento;
	}
	public void setFechaFinalEvento(String fechaFinalEvento) {
		this.fechaFinalEvento = fechaFinalEvento;
	}
	/**
	 * @return Returns the estado.
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado The estado to set.
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
