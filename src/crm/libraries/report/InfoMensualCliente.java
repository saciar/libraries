package crm.libraries.report;

public class InfoMensualCliente {
	private String nombre;
	private long codCliente;
	private double facturacion;
	private long cantClientes;
	
	public long getCantClientes() {
		return cantClientes;
	}

	public void setCantClientes(long cantClientes) {
		this.cantClientes = cantClientes;
	}

	public double getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(double facturacion) {
		this.facturacion = facturacion;
	}

	public long getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(long codCliente) {
		this.codCliente = codCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
