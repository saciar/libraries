package crm.libraries.abm.helper;


public class EstadoActualHelper {
	private long id;
	private int nuevo;
	private int actualizado;
	private int confirmado;
	private int cancelado;    
	private int rechazado;
	private int ordenDeServicio;
	private int ordenDeFacturacion;
	private int ordenDeCompra;
	private int facturado;
	private int cobrado;
	private int adelanto;
	private int adelantado;
	private int acobrar;
	private int adelantoacobrar;
	private int adelantocobrado;
	private int adicionales;
	private int adicionalesFacturados;
	
	public int getActualizado() {
		return actualizado;
	}
	public void setActualizado(int actualizado) {
		this.actualizado = actualizado;
	}
	public int getCancelado() {
		return cancelado;
	}
	public void setCancelado(int cancelado) {
		this.cancelado = cancelado;
	}
	public int getCobrado() {
		return cobrado;
	}
	public void setCobrado(int cobrado) {
		this.cobrado = cobrado;
	}
	public int getConfirmado() {
		return confirmado;
	}
	public void setConfirmado(int confirmado) {
		this.confirmado = confirmado;
	}
	public int getFacturado() {
		return facturado;
	}
	public void setFacturado(int facturado) {
		this.facturado = facturado;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNuevo() {
		return nuevo;
	}
	public void setNuevo(int nuevo) {
		this.nuevo = nuevo;
	}
	public int getOrdenDeCompra() {
		return ordenDeCompra;
	}
	public void setOrdenDeCompra(int ordenDeCompra) {
		this.ordenDeCompra = ordenDeCompra;
	}
	public int getOrdenDeFacturacion() {
		return ordenDeFacturacion;
	}
	public void setOrdenDeFacturacion(int ordenDeFacturacion) {
		this.ordenDeFacturacion = ordenDeFacturacion;
	}
	public int getOrdenDeServicio() {
		return ordenDeServicio;
	}
	public void setOrdenDeServicio(int ordenDeServicio) {
		this.ordenDeServicio = ordenDeServicio;
	}
	public int getRechazado() {
		return rechazado;
	}
	public void setRechazado(int rechazado) {
		this.rechazado = rechazado;
	}
	/**
	 * @return Returns the adelantado.
	 */
	public int getAdelantado() {
		return adelantado;
	}
	/**
	 * @param adelantado The adelantado to set.
	 */
	public void setAdelantado(int adelantado) {
		this.adelantado = adelantado;
	}
	/**
	 * @return Returns the adelanto.
	 */
	public int getAdelanto() {
		return adelanto;
	}
	/**
	 * @param adelanto The adelanto to set.
	 */
	public void setAdelanto(int adelanto) {
		this.adelanto = adelanto;
	}
	public int getAcobrar() {
		return acobrar;
	}
	public void setAcobrar(int acobrar) {
		this.acobrar = acobrar;
	}
	public int getAdelantoacobrar() {
		return adelantoacobrar;
	}
	public void setAdelantoacobrar(int adelantoacobrar) {
		this.adelantoacobrar = adelantoacobrar;
	}
	public int getAdelantocobrado() {
		return adelantocobrado;
	}
	public void setAdelantocobrado(int adelantocobrado) {
		this.adelantocobrado = adelantocobrado;
	}
	public int getAdicionales() {
		return adicionales;
	}
	public void setAdicionales(int adicionales) {
		this.adicionales = adicionales;
	}
	public int getAdicionalesFacturados() {
		return adicionalesFacturados;
	}
	public void setAdicionalesFacturados(int adicionalesFacturados) {
		this.adicionalesFacturados = adicionalesFacturados;
	}
}
