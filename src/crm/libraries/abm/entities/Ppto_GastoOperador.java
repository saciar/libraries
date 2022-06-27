package crm.libraries.abm.entities;

import java.io.Serializable;

import crm.libraries.abm.helper.ServicioHelper;

public class Ppto_GastoOperador implements Serializable {
	
	private long id;	
	private String operador;
	private String cargo;
	private String horario;
	private String costo;

	public Ppto_GastoOperador(){		
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


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getOperador() {
		return operador;
	}


	public void setOperador(String operador) {
		this.operador = operador;
	}

}
