package crm.libraries.abm.helper;
import java.util.Set;


public class SalaHelper {
	
	private ServicioHelper[] servicios;
	//private AgregadoSalaHelper agregado;	
	
	private HorariosHelper[] horarios;
	
	private String codigoSalaLugar;
	private String fechaDeInicio;
	private String fechaDeFinalizacion;
	private String fechaDeInstalacion;
	private String totalDePersonas;
	private String observaciones;
	
	private String fechaPrueba;
	private String fechaDesarme;
	private String tipoArmado;
	
	private int orden;
	
	private String nombreSalaUnico;
	
	public String getNombreSalaUnico() {
		return nombreSalaUnico;
	}

	public void setNombreSalaUnico(String nombreSalaUnico) {
		this.nombreSalaUnico = nombreSalaUnico;
	}

	public String getCodigoSalaLugar() {
		return codigoSalaLugar;
	}

	public void setCodigoSalaLugar(String codigoSalaLugar) {
		this.codigoSalaLugar = codigoSalaLugar;
	}

	public String getFechaDeFinalizacion() {
		return fechaDeFinalizacion;
	}

	public void setFechaDeFinalizacion(String fechaDeFinalizacion) {
		this.fechaDeFinalizacion = fechaDeFinalizacion;
	}

	public String getFechaDeInicio() {
		return fechaDeInicio;
	}

	public void setFechaDeInicio(String fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}

	public String getFechaDeInstalacion() {
		return fechaDeInstalacion;
	}

	public void setFechaDeInstalacion(String fechaDeInstalacion) {
		this.fechaDeInstalacion = fechaDeInstalacion;
	}

	public ServicioHelper[] getServicios() {
		return servicios;
	}

	public void setServicios(ServicioHelper[] servicios) {
		this.servicios = servicios;
	}

	public String getTotalDePersonas() {
		return totalDePersonas;
	}

	public void setTotalDePersonas(String totalDePersonas) {
		this.totalDePersonas = totalDePersonas;
	}

	/*public AgregadoSalaHelper getAgregado() {
		return agregado;
	}

	public void setAgregado(AgregadoSalaHelper agregado) {
		this.agregado = agregado;
	}*/

	public String toString(){
		String result = "Sala " + codigoSalaLugar + "\n";
		if (servicios != null){
			for (ServicioHelper servicio : servicios) {
				result += servicio.toString();
			}
		}
		return result;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	/**
	 * @return Returns the orden.
	 */
	public int getOrden() {
		return orden;
	}

	/**
	 * @param orden The orden to set.
	 */
	public void setOrden(int orden) {
		this.orden = orden;
	}

	public String getFechaDesarme() {
		return fechaDesarme;
	}

	public void setFechaDesarme(String fechaDesarme) {
		this.fechaDesarme = fechaDesarme;
	}

	public String getFechaPrueba() {
		return fechaPrueba;
	}

	public void setFechaPrueba(String fechaPrueba) {
		this.fechaPrueba = fechaPrueba;
	}

	public String getTipoArmado() {
		return tipoArmado;
	}

	public void setTipoArmado(String tipoArmado) {
		this.tipoArmado = tipoArmado;
	}
	public HorariosHelper[] getHorarios() {
		return horarios;
	}

	public void setHorarios(HorariosHelper[] horarios) {
		this.horarios = horarios;
	}

}
