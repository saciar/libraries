package crm.libraries.report;

import java.util.Date;

public class SubcontratadosGerencia {
	private long nroPpto;
	private String vendedor;
	private String cliente;
	private double precioVenta;
	private double precioCompra;
	private Date fechaInicio;
	private Date fechaFin;
	private String servicio;
	private String propio;

	/**
	 * @return Returns the propio.
	 */
	public String getPropio() {
		return propio;
	}
	/**
	 * @param propio The propio to set.
	 */
	public void setPropio(String propio) {
		this.propio = propio;
	}
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
	public double getPrecioVenta() {
		return precioVenta;
	}
	/**
	 * @param total The total to set.
	 */
	public void setPrecioVenta(double total) {
		this.precioVenta = total;
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
	 * @return Returns the precioCompra.
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}
	/**
	 * @param precioCompra The precioCompra to set.
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	/**
	 * @return Returns the servicio.
	 */
	public String getServicio() {
		return servicio;
	}
	/**
	 * @param servicio The servicio to set.
	 */
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

}
