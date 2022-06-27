package crm.libraries.report;

public class OrdenCompra {
	private String razonSocial;
	private String cuit;
	private String condIva;
	private String nombreEvento;
	private long ordenFacturacion;
	private String lugarEvento;
	private String domicilioLugar;
	private String fechaInicialEvento;
	private String fechaFinalEvento;	
	private long cantidadSalas;
	private String vendedor;
	private String fechaEmision;
	private String telefonosLugar;
	private String responsablePago;
	private String telefonoRespPago;
	private String contactoCliente;
	private String domicilioPago;
	private String diaHoraPago;
	private String codProvCrn;
	private String medioPago;
	private String condicionPago;
	private String domicilioLegal;
	private String nombreFantasia;
	private String domicilioFactura;
	private long cantidadPersonas;
	
	private OrdenCompraSalas[] salas;

	public long getCantidadSalas() {
		return cantidadSalas;
	}

	public void setCantidadSalas(long cantidadSalas) {
		this.cantidadSalas = cantidadSalas;
	}

	public String getCodProvCrn() {
		return codProvCrn;
	}

	public void setCodProvCrn(String codProvCrn) {
		this.codProvCrn = codProvCrn;
	}

	public String getCondicionPago() {
		return condicionPago;
	}

	public void setCondicionPago(String condicionPago) {
		this.condicionPago = condicionPago;
	}

	public String getCondIva() {
		return condIva;
	}

	public void setCondIva(String condIva) {
		this.condIva = condIva;
	}

	public String getContactoCliente() {
		return contactoCliente;
	}

	public void setContactoCliente(String contactoCliente) {
		this.contactoCliente = contactoCliente;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getDiaHoraPago() {
		return diaHoraPago;
	}

	public void setDiaHoraPago(String diaHoraPago) {
		this.diaHoraPago = diaHoraPago;
	}

	public String getDomicilioLegal() {
		return domicilioLegal;
	}

	public void setDomicilioLegal(String domicilioLegal) {
		this.domicilioLegal = domicilioLegal;
	}

	public String getDomicilioLugar() {
		return domicilioLugar;
	}

	public void setDomicilioLugar(String domicilioLugar) {
		this.domicilioLugar = domicilioLugar;
	}

	public String getDomicilioPago() {
		return domicilioPago;
	}

	public void setDomicilioPago(String domicilioPago) {
		this.domicilioPago = domicilioPago;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getFechaFinalEvento() {
		return fechaFinalEvento;
	}

	public void setFechaFinalEvento(String fechaFinalEvento) {
		this.fechaFinalEvento = fechaFinalEvento;
	}

	public String getFechaInicialEvento() {
		return fechaInicialEvento;
	}

	public void setFechaInicialEvento(String fechaInicialEvento) {
		this.fechaInicialEvento = fechaInicialEvento;
	}

	public String getLugarEvento() {
		return lugarEvento;
	}

	public void setLugarEvento(String lugarEvento) {
		this.lugarEvento = lugarEvento;
	}

	public String getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public long getOrdenFacturacion() {
		return ordenFacturacion;
	}

	public void setOrdenFacturacion(long ordenFacturacion) {
		this.ordenFacturacion = ordenFacturacion;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getResponsablePago() {
		return responsablePago;
	}

	public void setResponsablePago(String responsablePago) {
		this.responsablePago = responsablePago;
	}

	public OrdenCompraSalas[] getSalas() {
		return salas;
	}

	public void setSalas(OrdenCompraSalas[] salas) {
		this.salas = salas;
	}

	public String getTelefonoRespPago() {
		return telefonoRespPago;
	}

	public void setTelefonoRespPago(String telefonoRespPago) {
		this.telefonoRespPago = telefonoRespPago;
	}

	public String getTelefonosLugar() {
		return telefonosLugar;
	}

	public void setTelefonosLugar(String telefonosLugar) {
		this.telefonosLugar = telefonosLugar;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public String getNombreFantasia() {
		return nombreFantasia;
	}

	public void setNombreFantasia(String nombreFantasia) {
		this.nombreFantasia = nombreFantasia;
	}

	public long getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(long cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public String getDomicilioFactura() {
		return domicilioFactura;
	}

	public void setDomicilioFactura(String domicilioFactura) {
		this.domicilioFactura = domicilioFactura;
	}
}
