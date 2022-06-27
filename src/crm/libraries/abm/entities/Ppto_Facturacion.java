package crm.libraries.abm.entities;

import java.io.Serializable;

public class Ppto_Facturacion implements Serializable{
	private Long id;
	private Presupuesto presupuesto;
	private String codCliente = null;
	private String codUnidadAdm;
	
	public Ppto_Facturacion(){
		
	}
	
	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto numeroDePresupuesto) {
		this.presupuesto = numeroDePresupuesto;
	}

	public String getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodUnidadAdm() {
		return codUnidadAdm;
	}

	public void setCodUnidadAdm(String cod) {
		this.codUnidadAdm = cod;
	}
}
