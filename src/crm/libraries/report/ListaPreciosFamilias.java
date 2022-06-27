package crm.libraries.report;

public class ListaPreciosFamilias {
	
	private String descripcion;	
	private ListaPreciosServicios[] servicios;

	/**
	 * @return Returns the servicios.
	 */
	public ListaPreciosServicios[] getServicios() {
		return servicios;
	}

	/**
	 * @param servicios The servicios to set.
	 */
	public void setServicios(ListaPreciosServicios[] servicios) {
		this.servicios = servicios;
	}

	/**
	 * @return Returns the descripcion.
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion The descripcion to set.
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
