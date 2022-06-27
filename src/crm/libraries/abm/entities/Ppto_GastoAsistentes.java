package crm.libraries.abm.entities;

import java.io.Serializable;

import crm.libraries.abm.helper.ServicioHelper;

public class Ppto_GastoAsistentes implements Serializable {
	
	private long id;	
	private String asistente;
	private String cargo;
	private String jornada;
	private String costo;

	public Ppto_GastoAsistentes(){		
	}

	
	public String getAsistente() {
		return asistente;
	}


	public void setAsistente(String asistente) {
		this.asistente = asistente;
	}


	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getJornada() {
		return jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}



}
