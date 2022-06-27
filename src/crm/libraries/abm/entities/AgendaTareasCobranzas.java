package crm.libraries.abm.entities;

import java.util.Vector;

public class AgendaTareasCobranzas implements ABMEntity {
	
	private String codigo;
	private String numeroPresupuesto;
	private String fechaIngreso;
	private String fechaVencimiento;
	private String asunto;
	private int alerta;
	private String activo;
	private String completa;
	private String monto;
	private Integer factura;
	
	public AgendaTareasCobranzas(){
		
	}
	
	public AgendaTareasCobranzas(String activo, int alerta, String asunto, String codigo, String ingreso, String vencimiento, String presupuesto, String compl, String mon, Integer fact ) {
		this.activo = activo;
		this.alerta = alerta;
		this.asunto = asunto;
		this.codigo = codigo;
		fechaIngreso = ingreso;
		fechaVencimiento = vencimiento;
		numeroPresupuesto = presupuesto;
		completa = compl;
		monto = mon;
		factura= fact;
	}

	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	public int getAlerta() {
		return alerta;
	}
	public void setAlerta(int alerta) {
		this.alerta = alerta;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getNumeroPresupuesto() {
		return numeroPresupuesto;
	}
	public void setNumeroPresupuesto(String numeroPresupuesto) {
		this.numeroPresupuesto = numeroPresupuesto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
		
	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCompleta() {
		return completa;
	}

	public void setCompleta(String completa) {
		this.completa = completa;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public Integer getFactura() {
		return factura;
	}

	public void setFactura(Integer factura) {
		this.factura = factura;
	} 

}
