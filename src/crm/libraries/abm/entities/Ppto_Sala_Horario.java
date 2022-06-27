package crm.libraries.abm.entities;

import java.io.Serializable;

public class Ppto_Sala_Horario implements Serializable {
	
	private long id;
	private Ppto_Sala sala;
	private String fecha;
	private String horaDesde;
	private String horaHasta;
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHoraDesde() {
		return horaDesde;
	}
	public void setHoraDesde(String horaDesde) {
		this.horaDesde = horaDesde;
	}
	public String getHoraHasta() {
		return horaHasta;
	}
	public void setHoraHasta(String horaHasta) {
		this.horaHasta = horaHasta;
	}

	
}
