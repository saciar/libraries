package crm.libraries.report;

public class OrdenServiciosDesconfirmadaSala {
	private long salaId;
	private String nombreSala;
	private String fechaInicio;
	private String fechaFin;
	private long totalPersonas;
	//
	private double ancho;
	private double alto;
	private double largo;
	private long capacidad;
	private String fechaDesarme;
	private String fechaPruebas;
	private String tipoArmado;
	private String observaciones;

	private OrdenServiciosDesconfirmadaServicios[] servicios;

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public long getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(long capacidad) {
		this.capacidad = capacidad;
	}

	public String getFechaDesarme() {
		return fechaDesarme;
	}

	public void setFechaDesarme(String fechaDesarme) {
		this.fechaDesarme = fechaDesarme;
	}

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

	public String getFechaPruebas() {
		return fechaPruebas;
	}

	public void setFechaPruebas(String fechaPruebas) {
		this.fechaPruebas = fechaPruebas;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public long getSalaId() {
		return salaId;
	}

	public void setSalaId(long salaId) {
		this.salaId = salaId;
	}

	public OrdenServiciosDesconfirmadaServicios[] getServicios() {
		return servicios;
	}

	public void setServicios(OrdenServiciosDesconfirmadaServicios[] servicios) {
		this.servicios = servicios;
	}

	public String getTipoArmado() {
		return tipoArmado;
	}

	public void setTipoArmado(String tipoArmado) {
		this.tipoArmado = tipoArmado;
	}

	public long getTotalPersonas() {
		return totalPersonas;
	}

	public void setTotalPersonas(long totalPersonas) {
		this.totalPersonas = totalPersonas;
	}
}
