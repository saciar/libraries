package crm.libraries.report;

public class PresupuestosConfirmadosGerencia {
	private long nroPpto;
	private String vendedor;
	private String cliente;
	private String evento;
	private double total;
	private String estado;
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
}
