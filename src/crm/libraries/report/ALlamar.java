package crm.libraries.report;

import java.util.Date;

public class ALlamar {

	private long nroppto;
	private String cliente;
	private String evento;
	private String factura;
	private Date fecha;
	private Date fechaFactura;
	private String contacto;
	private String telefono;
	private String nota;

	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String direccion) {
		this.contacto = direccion;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String fechaHora) {
		this.telefono = fechaHora;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public long getNroppto() {
		return nroppto;
	}
	public void setNroppto(long nroppto) {
		this.nroppto = nroppto;
	}

}
