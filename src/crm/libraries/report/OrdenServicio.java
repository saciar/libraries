package crm.libraries.report;

import java.util.Date;

public class OrdenServicio {
	private String nombreFantasia;
	private String nombreEvento;
	private long ordenServicio;
	private String lugarEvento;
	private String domicilio;
	private String tipoEvento;
	private String fechaInicialEvento;
	private String fechaFinalEvento;	
	private long cantidadSalas;
	private String fechaInstalacion;
	private String unidad;
	private String vendedor;
	private String fechaEmision;
	private long totalPersonas;
	private String telefonosLugar;
	private String responsableEvento;
	private String telefonosRespEvento;
	private String responsableLugar;
	private String telefonosRespLugar;
	private String seguridadEquipos;
	private String ingresoEquipos;
	private String tipoUniforme;
	private String tipoLugar;
	private String observaciones;
	private String categoria;
	
	private EventoProveedor[] proveedores;
	
	private OrdenServicioSala[] salas;
	private EventoOperador[] operadores;
	
	public long getCantidadSalas() {
		return cantidadSalas;
	}
	public void setCantidadSalas(long cantidadSalas) {
		this.cantidadSalas = cantidadSalas;
	}
	public String getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public String getFechaFinalEvento() {
		return fechaFinalEvento;
	}
	public void setFechaFinalEvento(String fechaFinalEvento) {
		this.fechaFinalEvento = fechaFinalEvento;
	}
	public String getFechaInicialEvento() {
		return fechaInicialEvento;
	}
	public void setFechaInicialEvento(String fechaInicialEvento) {
		this.fechaInicialEvento = fechaInicialEvento;
	}
	public String getFechaInstalacion() {
		return fechaInstalacion;
	}
	public void setFechaInstalacion(String fechaInstalacion) {
		this.fechaInstalacion = fechaInstalacion;
	}
	public String getIngresoEquipos() {
		return ingresoEquipos;
	}
	public void setIngresoEquipos(String ingresoEquipos) {
		this.ingresoEquipos = ingresoEquipos;
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
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public EventoOperador[] getOperadores() {
		return operadores;
	}
	public void setOperadores(EventoOperador[] operadores) {
		this.operadores = operadores;
	}
	public long getOrdenServicio() {
		return ordenServicio;
	}
	public void setOrdenServicio(long ordenServicio) {
		this.ordenServicio = ordenServicio;
	}
	public String getResponsableEvento() {
		return responsableEvento;
	}
	public void setResponsableEvento(String responsableEvento) {
		this.responsableEvento = responsableEvento;
	}
	public String getResponsableLugar() {
		return responsableLugar;
	}
	public void setResponsableLugar(String responsableLugar) {
		this.responsableLugar = responsableLugar;
	}
	public OrdenServicioSala[] getSalas() {
		return salas;
	}
	public void setSalas(OrdenServicioSala[] salas) {
		this.salas = salas;
	}
	public String getSeguridadEquipos() {
		return seguridadEquipos;
	}
	public void setSeguridadEquipos(String seguridadEquipos) {
		this.seguridadEquipos = seguridadEquipos;
	}
	public String getTelefonosLugar() {
		return telefonosLugar;
	}
	public void setTelefonosLugar(String telefonosLugar) {
		this.telefonosLugar = telefonosLugar;
	}
	public String getTelefonosRespEvento() {
		return telefonosRespEvento;
	}
	public void setTelefonosRespEvento(String telefonosRespEvento) {
		this.telefonosRespEvento = telefonosRespEvento;
	}
	public String getTelefonosRespLugar() {
		return telefonosRespLugar;
	}
	public void setTelefonosRespLugar(String telefonosRespLugar) {
		this.telefonosRespLugar = telefonosRespLugar;
	}
	public String getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public String getTipoLugar() {
		return tipoLugar;
	}
	public void setTipoLugar(String tipoLugar) {
		this.tipoLugar = tipoLugar;
	}
	public String getTipoUniforme() {
		return tipoUniforme;
	}
	public void setTipoUniforme(String tipoUniforme) {
		this.tipoUniforme = tipoUniforme;
	}
	public long getTotalPersonas() {
		return totalPersonas;
	}
	public void setTotalPersonas(long totalPersonas) {
		this.totalPersonas = totalPersonas;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public EventoProveedor[] getProveedores() {
		return proveedores;
	}
	public void setProveedores(EventoProveedor[] proveedores) {
		this.proveedores = proveedores;
	}
	/**
	 * @return Returns the categoria.
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria The categoria to set.
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
