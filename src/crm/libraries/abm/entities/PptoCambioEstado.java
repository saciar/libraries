package crm.libraries.abm.entities;

import java.io.Serializable;

public class PptoCambioEstado implements Serializable {
	private Long id;
	private Presupuesto presupuesto;
	private EstadoEvento estado;
	private Usuario usuario;
	private String fecha;
	
	public PptoCambioEstado() {}

	public EstadoEvento getEstado() {
		return estado;
	}

	public void setEstado(EstadoEvento estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto numeroDePresupuesto) {
		this.presupuesto = numeroDePresupuesto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
