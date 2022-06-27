package crm.libraries.abm.entities;

import java.io.Serializable;

public class Ppto_Sala_Agregado implements Serializable{
	private long id;
	private Ppto_Sala sala;
	private String fechaPrueba;
	private String fechaDesarme;
	private Integer tipoArmado;
	
	public Ppto_Sala_Agregado(){}
	
	
	
	public Ppto_Sala_Agregado(String desarme, String prueba, Ppto_Sala sala, Integer armado) {
		fechaDesarme = desarme;
		fechaPrueba = prueba;
		this.sala = sala;
		tipoArmado = armado;
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Ppto_Sala getSala() {
		return sala;
	}
	public void setSala(Ppto_Sala sala) {
		this.sala = sala;
	}
	public Integer getTipoArmado() {
		return tipoArmado;
	}

	public void setTipoArmado(Integer tipoArmado) {
		this.tipoArmado = tipoArmado;
	}
	
}
