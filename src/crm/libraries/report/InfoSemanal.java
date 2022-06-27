package crm.libraries.report;

import java.io.Serializable;
import java.util.List;

public class InfoSemanal{
	private long cantidadTotal;
	private long cantidadConfirmados;
	private long cantidadNoConfirmados;
	private double totalConfirmados;
	private double totalNoConfirmados;
	
	private InfoSemanalCliente[] clientesNuevosConfirmados;
	private InfoSemanalCliente[] clientesNuevosNoConfirmados;
	private InfoSemanalCliente[] clientesViejosConfirmados;
	private InfoSemanalCliente[] clientesViejosNoConfirmados;
	
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
	public InfoSemanalCliente[] getClientesNuevosConfirmados() {
		return clientesNuevosConfirmados;
	}
	public void setClientesNuevosConfirmados(
			InfoSemanalCliente[] clientesNuevosConfirmados) {
		this.clientesNuevosConfirmados = clientesNuevosConfirmados;
	}
	public InfoSemanalCliente[] getClientesNuevosNoConfirmados() {
		return clientesNuevosNoConfirmados;
	}
	public void setClientesNuevosNoConfirmados(
			InfoSemanalCliente[] clientesNuevosNoConfirmados) {
		this.clientesNuevosNoConfirmados = clientesNuevosNoConfirmados;
	}
	public InfoSemanalCliente[] getClientesViejosConfirmados() {
		return clientesViejosConfirmados;
	}
	public void setClientesViejosConfirmados(
			InfoSemanalCliente[] clientesViejosConfirmados) {
		this.clientesViejosConfirmados = clientesViejosConfirmados;
	}
	public InfoSemanalCliente[] getClientesViejosNoConfirmados() {
		return clientesViejosNoConfirmados;
	}
	public void setClientesViejosNoConfirmados(
			InfoSemanalCliente[] clientesViejosNoConfirmados) {
		this.clientesViejosNoConfirmados = clientesViejosNoConfirmados;
	}
		
}
