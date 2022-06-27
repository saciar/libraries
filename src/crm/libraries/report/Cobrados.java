package crm.libraries.report;

import java.util.Date;

public class Cobrados {

	private long nroppto;
	private String cliente;
	private String evento;
	private String factura;	
	private Date fechaFactura;
	private String facturaAdelanto;	
	private Date fechaAdelanto;
	private String facturaAdicionales;	
	private Date fechaAdicionales;
	private Date fecha;
	private String direccion;
	private String fechaHora;
	private String nota;
	private double pagado;
	private double aCobrar;
	
	public double getACobrar() {
		return aCobrar;
	}
	public void setACobrar(double cobrar) {
		aCobrar = cobrar;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	public String getFactura() {
		return factura;
	}
	public void setFactura(String factura) {
		this.factura = factura;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getFechaFactura() {
		return fechaFactura;
	}
	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}
	public String getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public double getPagado() {
		return pagado;
	}
	public void setPagado(double pagado) {
		this.pagado = pagado;
	}
	public long getNroppto() {
		return nroppto;
	}
	public void setNroppto(long nroppto) {
		this.nroppto = nroppto;
	}
	public String getFacturaAdelanto() {
		return facturaAdelanto;
	}
	public void setFacturaAdelanto(String facturaAdelanto) {
		this.facturaAdelanto = facturaAdelanto;
	}
	public String getFacturaAdicionales() {
		return facturaAdicionales;
	}
	public void setFacturaAdicionales(String facturaAdicionales) {
		this.facturaAdicionales = facturaAdicionales;
	}
	public Date getFechaAdelanto() {
		return fechaAdelanto;
	}
	public void setFechaAdelanto(Date fechaAdelanto) {
		this.fechaAdelanto = fechaAdelanto;
	}
	public Date getFechaAdicionales() {
		return fechaAdicionales;
	}
	public void setFechaAdicionales(Date fechaAdicionales) {
		this.fechaAdicionales = fechaAdicionales;
	}

}
