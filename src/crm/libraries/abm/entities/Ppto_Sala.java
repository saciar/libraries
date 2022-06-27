package crm.libraries.abm.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import crm.libraries.abm.helper.ServicioHelper;

public class Ppto_Sala implements Serializable {
	
	private long id;
	private Presupuesto presupuesto;
	private SalaLugar sala;
	private String fechaDeInicio;
	private String fechaDeFinalizacion;
	private String fechaDeInstalacion;
	private String totalDePersonas;
	private String observaciones;
	private String orden;
	
	private String fechaPrueba;
	private String fechaDesarme;
	private TipoArmado tipoArmado;
	
	private Set<Ppto_Sala_Servicio> servicios;
	//private Ppto_Sala_Agregado agregados;
	private Set<Ppto_Sala_Horario> horario;
	
	public Set<Ppto_Sala_Horario> getHorario() {
		return horario;
	}

	public void setHorario(Set<Ppto_Sala_Horario> horario) {
		this.horario = horario;
	}

public void addHorario ( Ppto_Sala_Horario hor ) {
		
		if ( this.horario == null ) {
			
			this.horario = new HashSet<Ppto_Sala_Horario>();

		}
		
		this.horario.add( hor );
		
		hor.setSala(this);
		
	}
	
	private String nombreSalaUnico;
	
	public Ppto_Sala(){}
	
	public Ppto_Sala(String finalizacion, String inicio, String instalacion, 
			Presupuesto presupuesto, SalaLugar sala, String personas, String observaciones, String orden) {

		this.fechaDeFinalizacion = finalizacion;
		this.fechaDeInicio = inicio;
		this.fechaDeInstalacion = instalacion;
		this.presupuesto = presupuesto;
		this.orden = orden;
		this.sala = sala;
		this.totalDePersonas = personas;
		this.observaciones=observaciones;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Presupuesto getPresupuesto() {
		return this.presupuesto;
	}

	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}

	public SalaLugar getSala() {
		return sala;
	}

	public void setSala(SalaLugar sala) {
		this.sala = sala;
	}

	public String getTotalDePersonas() {
		return totalDePersonas;
	}

	public void setTotalDePersonas(String totalDePersonas) {
		this.totalDePersonas = totalDePersonas;
	}

	public Set<Ppto_Sala_Servicio> getServicios() {
		return servicios;
	}	
	
	public Object[] getServiciosArray() {
		return ordenarServicios(servicios);
	}
	
	private Object[] ordenarServicios(Set<Ppto_Sala_Servicio> servicios){
		int i,j;
		Object[] array = servicios.toArray();
		Ppto_Sala_Servicio temp;
		
		for (i=1; i<servicios.size(); i++)
            for (j=0; j<servicios.size() - i; j++){
            	if ((Integer.parseInt(((Ppto_Sala_Servicio)array[j]).getOrden())) > Integer.parseInt(((Ppto_Sala_Servicio)array[j+1]).getOrden()))
                {
                temp = (Ppto_Sala_Servicio)array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                }
        }
		return array;
		
	}
	
	public void setServicios(Set<Ppto_Sala_Servicio> servicios) {
		this.servicios = servicios;
	}
	
	public void addServicio ( Ppto_Sala_Servicio servicio ) {
		
		if ( this.servicios == null ) {
			
			this.servicios = new HashSet<Ppto_Sala_Servicio>();

		}
		
		this.servicios.add( servicio );
		
		servicio.setSala(this);
		
	}

	/*public Ppto_Sala_Agregado getAgregados() {
		return agregados;
	}

	public void setAgregados(Ppto_Sala_Agregado agregados) {
		this.agregados = agregados;
	}*/
		
	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	/**
	 * @return Returns the orden.
	 */
	public String getOrden() {
		return orden;
	}

	/**
	 * @param orden The orden to set.
	 */
	public void setOrden(String orden) {
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

	public TipoArmado getTipoArmado() {
		return tipoArmado;
	}

	public void setTipoArmado(TipoArmado tipoArmado) {
		this.tipoArmado = tipoArmado;
	}

	public String getNombreSalaUnico() {
		return nombreSalaUnico;
	}

	public void setNombreSalaUnico(String nombreSalaUnico) {
		this.nombreSalaUnico = nombreSalaUnico;
	}
		
}
