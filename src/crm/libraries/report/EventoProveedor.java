package crm.libraries.report;

public class EventoProveedor {
	private long proveedor_id;
	private String proveedor;
	private String telefonos;
	private String domicilio;
	
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public long getProveedor_id() {
		return proveedor_id;
	}
	public void setProveedor_id(long proveedor_id) {
		this.proveedor_id = proveedor_id;
	}
	public String getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(String telefonos) {
		this.telefonos = telefonos;
	}
	
}
