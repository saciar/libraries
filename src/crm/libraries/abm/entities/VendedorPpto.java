package crm.libraries.abm.entities;

import java.io.Serializable;

public class VendedorPpto implements Serializable {

	private Long id;
	private Presupuesto presupuesto;
	private Vendedor vendedor;
	private String fecha;
	
	public VendedorPpto() {}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
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

	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
	
}
