package crm.libraries.abm.helper;


public class ServicioHelper {

	private long tableItemId;

	private int orden;

	private int cantidad;

	private int codigoServicio;

	private int codigoModalidadContratacion;

	private int dias;

	private double precioDeLista;

	private int descuento;

	private double precioDescuento;
	
	private String fechaAlta;
	
	private String detalle;
	
	private String modificado;
	
	private DescDetalladaServicioHelper[] descDetallada;

	public int getDescuento() {
		return descuento;
	}

	public String getModificado() {
		return modificado;
	}

	public void setModificado(String modificado) {
		this.modificado = modificado;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public double getPrecioDeLista() {
		return precioDeLista;
	}

	public void setPrecioDeLista(double precioDeLista) {
		this.precioDeLista = precioDeLista;
	}

	public double getPrecioDescuento() {
		return precioDescuento;
	}

	public void setPrecioDescuento(double precioDescuento) {
		this.precioDescuento = precioDescuento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCodigoModalidadContratacion() {
		return codigoModalidadContratacion;
	}

	public void setCodigoModalidadContratacion(
			int codigoModalidadContratacion) {
		this.codigoModalidadContratacion = codigoModalidadContratacion;
	}

	public int getCodigoServicio() {
		return codigoServicio;
	}

	public void setCodigoServicio(int codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public long getTableItemId() {
		return tableItemId;
	}

	public void setTableItemId(long tableItemId) {
		this.tableItemId = tableItemId;
	}

	
	

	public String toString() {
		String result = "Servicio " + codigoServicio + " x " + cantidad + "\n";

		result += "Descripciones detalladas ";
		if(descDetallada != null){
			for(DescDetalladaServicioHelper desc : descDetallada) {
				result += desc + "\n";
			}
		}
		return result;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public DescDetalladaServicioHelper[] getDescDetallada() {
		return descDetallada;
	}

	public void setDescDetallada(DescDetalladaServicioHelper[] descDetallada) {
		this.descDetallada = descDetallada;
	}
}
