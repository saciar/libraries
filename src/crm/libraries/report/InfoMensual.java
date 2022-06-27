package crm.libraries.report;

public class InfoMensual {
	private long cantidadTotal;
	private long cantidadConfirmados;
	private long cantidadNoConfirmados;
	private double totalConfirmados;
	private double totalNoConfirmados;
	
	private InfoMensualCliente[] top10ClientesCantEventos;
	private InfoMensualCliente[] top10ClientesFacturado;
	
	private InfoMensualCliente[] clientesNuevosConfirmados;
	private InfoMensualCliente[] clientesNuevosNoConfirmados;
	private InfoMensualCliente[] clientesViejosConfirmados;
	private InfoMensualCliente[] clientesViejosNoConfirmados;
	
	public long getCantidadConfirmados() {
		return cantidadConfirmados;
	}
	public void setCantidadConfirmados(long cantidadConfirmados) {
		this.cantidadConfirmados = cantidadConfirmados;
	}
	public long getCantidadNoConfirmados() {
		return cantidadNoConfirmados;
	}
	public void setCantidadNoConfirmados(long cantidadNoConfirmados) {
		this.cantidadNoConfirmados = cantidadNoConfirmados;
	}
	public long getCantidadTotal() {
		return cantidadTotal;
	}
	public void setCantidadTotal(long cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}
	public InfoMensualCliente[] getClientesNuevosConfirmados() {
		return clientesNuevosConfirmados;
	}
	public void setClientesNuevosConfirmados(
			InfoMensualCliente[] clientesNuevosConfirmados) {
		this.clientesNuevosConfirmados = clientesNuevosConfirmados;
	}
	public InfoMensualCliente[] getClientesNuevosNoConfirmados() {
		return clientesNuevosNoConfirmados;
	}
	public void setClientesNuevosNoConfirmados(
			InfoMensualCliente[] clientesNuevosNoConfirmados) {
		this.clientesNuevosNoConfirmados = clientesNuevosNoConfirmados;
	}
	public InfoMensualCliente[] getClientesViejosConfirmados() {
		return clientesViejosConfirmados;
	}
	public void setClientesViejosConfirmados(
			InfoMensualCliente[] clientesViejosConfirmados) {
		this.clientesViejosConfirmados = clientesViejosConfirmados;
	}
	public InfoMensualCliente[] getClientesViejosNoConfirmados() {
		return clientesViejosNoConfirmados;
	}
	public void setClientesViejosNoConfirmados(
			InfoMensualCliente[] clientesViejosNoConfirmados) {
		this.clientesViejosNoConfirmados = clientesViejosNoConfirmados;
	}
	public double getTotalConfirmados() {
		return totalConfirmados;
	}
	public void setTotalConfirmados(double totalConfirmados) {
		this.totalConfirmados = totalConfirmados;
	}
	public double getTotalNoConfirmados() {
		return totalNoConfirmados;
	}
	public void setTotalNoConfirmados(double totalNoConfirmados) {
		this.totalNoConfirmados = totalNoConfirmados;
	}
	public InfoMensualCliente[] getTop10ClientesCantEventos() {
		return top10ClientesCantEventos;
	}
	public void setTop10ClientesCantEventos(
			InfoMensualCliente[] top10ClientesCantEventos) {
		this.top10ClientesCantEventos = top10ClientesCantEventos;
	}
	public InfoMensualCliente[] getTop10ClientesFacturado() {
		return top10ClientesFacturado;
	}
	public void setTop10ClientesFacturado(
			InfoMensualCliente[] top10ClientesFacturado) {
		this.top10ClientesFacturado = top10ClientesFacturado;
	}
}
