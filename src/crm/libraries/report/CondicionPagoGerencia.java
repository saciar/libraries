package crm.libraries.report;

import java.util.Date;

public class CondicionPagoGerencia {
	private long nroPpto;
	private String vendedor;
	private String cliente;
	private String evento;
	private String lugar;
	private double total;
	private Date fechaInicio;
	private Date fechaFin;
	private String estado;
	private String condPago;
	/**
	 * @return Returns the cliente.
	 */
	public String getCliente() {
		return cliente;
	}
	/**
	 * @param cliente The cliente to set.
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return Returns the condPago.
	 */
	public String getCondPago() {
		return condPago;
	}
	/**
	 * @param condPago The condPago to set.
	 */
	public void setCondPago(String condPago) {
		this.condPago = condPago;
	}
	/**
	 * @return Returns the estado.
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado The estado to set.
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return Returns the evento.
	 */
	public String getEvento() {
		return evento;
	}
	/**
	 * @param evento The evento to set.
	 */
	public void setEvento(String evento) {
		this.evento = evento;
	}
	/**
	 * @return Returns the fechaFin.
	 */
	public Date getFechaFin() {
		return fechaFin;
	}
	/**
	 * @param fechaFin The fechaFin to set.
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	/**
	 * @return Returns the fechaInicio.
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}
	/**
	 * @param fechaInicio The fechaInicio to set.
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	/**
	 * @return Returns the lugar.
	 */
	public String getLugar() {
		return lugar;
	}
	/**
	 * @param lugar The lugar to set.
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	/**
	 * @return Returns the nroPpto.
	 */
	public long getNroPpto() {
		return nroPpto;
	}
	/**
	 * @param nroPpto The nroPpto to set.
	 */
	public void setNroPpto(long nroPpto) {
		this.nroPpto = nroPpto;
	}
	/**
	 * @return Returns the total.
	 */
	public double getTotal() {
		return total;
	}
	/**
	 * @param total The total to set.
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	/**
	 * @return Returns the vendedor.
	 */
	public String getVendedor() {
		return vendedor;
	}
	/**
	 * @param vendedor The vendedor to set.
	 */
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
}
