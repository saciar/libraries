package crm.libraries.abm.entities;

import java.io.Serializable;

public class Ppto_Pago implements Serializable{
	private Long id;
	private Presupuesto presupuesto;
	private String codMedioPago;
	private String codCondicionPago;

	public Ppto_Pago(){
		
	}
	
	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto numeroDePresupuesto) {
		this.presupuesto = numeroDePresupuesto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCodCondicionPago() {
		return codCondicionPago;
	}

	public void setCodCondicionPago(String codCondicionPago) {
		this.codCondicionPago = codCondicionPago;
	}

	public String getCodMedioPago() {
		return codMedioPago;
	}

	public void setCodMedioPago(String codMedioPago) {
		this.codMedioPago = codMedioPago;
	}
}
