package crm.libraries.abm.entities;

import java.io.Serializable;

public class Ppto_Contacto implements Serializable{
	private Long id;
	private Presupuesto presupuesto;
	private String codContacto;
	
	
	public Ppto_Contacto(){
		
	}
	
	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto numeroDePresupuesto) {
		this.presupuesto = numeroDePresupuesto;
	}

	public String getCodContacto() {
		return codContacto;
	}

	public void setCodContacto(String codContacto) {
		this.codContacto = codContacto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
