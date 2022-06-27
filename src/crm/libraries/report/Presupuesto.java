package crm.libraries.report;

public class Presupuesto {
	private String cancelacion;
	private String vendedor;
	private String telVendedor;
	private String cliente;
	private long nroPpto;
	private String contactoCliente;
	private String firma;
	private String footer;
	private String header;
	private String formaPago;
	private String instalacion;
	private String telContacto;
	private String titulo;
	private String validez;
	private String seguridad;
	private String personal;
	private String condReserva;
	private String tipoPresupuesto;
	private String periodo;
	private String simboloMoneda;
	private String condPago;
	private double cotizacion;
	private String evento;
	
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	private PresupuestoSala[] salas;
	
	public String getCancelacion() {
		return cancelacion;
	}
	public void setCancelacion(String cancelacion) {
		this.cancelacion = cancelacion;
	}
	public String getContactoCliente() {
		return contactoCliente;
	}
	public void setContactoCliente(String contactoCliente) {
		this.contactoCliente = contactoCliente;
	}
	public String getFirma() {
		return firma;
	}
	public void setFirma(String firma) {
		this.firma = firma;
	}
	public String getFooter() {
		return footer;
	}
	public void setFooter(String footer) {
		this.footer = footer;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	
	public String getInstalacion() {
		return instalacion;
	}
	public void setInstalacion(String instalacion) {
		this.instalacion = instalacion;
	}
	public String getTelContacto() {
		return telContacto;
	}
	public void setTelContacto(String telContacto) {
		this.telContacto = telContacto;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getValidez() {
		return validez;
	}
	public void setValidez(String validez) {
		this.validez = validez;
	}
	public long getNroPpto() {
		return nroPpto;
	}
	public void setNroPpto(long nroPpto) {
		this.nroPpto = nroPpto;
	}
	public String getTelVendedor() {
		return telVendedor;
	}
	public void setTelVendedor(String telVendedor) {
		this.telVendedor = telVendedor;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public PresupuestoSala[] getSalas() {
		return salas;
	}
	public void setSalas(PresupuestoSala[] salas) {
		this.salas = salas;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getCondReserva() {
		return condReserva;
	}
	public void setCondReserva(String condReserva) {
		this.condReserva = condReserva;
	}
	public String getPersonal() {
		return personal;
	}
	public void setPersonal(String personal) {
		this.personal = personal;
	}
	public String getSeguridad() {
		return seguridad;
	}
	public void setSeguridad(String seguridad) {
		this.seguridad = seguridad;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getTipoPresupuesto() {
		return tipoPresupuesto;
	}
	public void setTipoPresupuesto(String tipoPresupuesto) {
		this.tipoPresupuesto = tipoPresupuesto;
	}
	public String getSimboloMoneda() {
		return simboloMoneda;
	}
	public void setSimboloMoneda(String moneda) {
		this.simboloMoneda = moneda;
	}
	public double getCotizacion() {
		return cotizacion;
	}
	public void setCotizacion(double cotizacion) {
		this.cotizacion = cotizacion;
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
	
	
}
