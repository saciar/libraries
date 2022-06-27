package crm.libraries.abm.entities;

import java.io.Serializable;

public class PptoEstadoActual implements Serializable {

	private Long id;
	private Presupuesto presupuesto;
	private int nuevo;
	private int actualizado;
	private int confirmado;
	private int cancelado;    
	private int rechazado;
	private int os;
	private int of;
	private int oc;
	private int facturado;
	private int cobrado;
	private int adelanto;
	private int adelantado;
	private int acobrar;
	private int adelantoacobrar;
	private int adelantocobrado;
	private int adicionales;
	private int adicionalesFacturados;
	
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

	public PptoEstadoActual() {}

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

	public int getNuevo() {
		return nuevo;
	}

	public void setNuevo(int nuevo) {
		this.nuevo = nuevo;
	}

	public int getOf() {
		return of;
	}

	public void setOf(int of) {
		this.of = of;
	}

	public int getOs() {
		return os;
	}

	public void setOs(int os) {
		this.os = os;
	}

	public int getRechazado() {
		return rechazado;
	}

	public void setRechazado(int rechazado) {
		this.rechazado = rechazado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}

	public int getOc() {
		return oc;
	}

	public void setOc(int oc) {
		this.oc = oc;
	}
	
	public void setEstadoActual(PptoEstadoActual ea){
		nuevo = ea.nuevo;
		actualizado = ea.actualizado;
		confirmado = ea.confirmado;
		cancelado = ea.cancelado;
		rechazado = ea.rechazado;
		os = ea.os;
		of = ea.of;
		oc = ea.oc;
		facturado = ea.facturado;
		cobrado = ea.cobrado;
		adelanto = ea.adelanto;
		adelantado = ea.adelantado;
		acobrar = ea.acobrar;
		adelantoacobrar = ea.adelantoacobrar;
		adelantocobrado = ea.adelantocobrado;
		adicionales = ea.adicionales;
		adicionalesFacturados = ea.adicionalesFacturados;
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

	public void setAdelantoacobrar(int adelantoACobrar) {
		this.adelantoacobrar = adelantoACobrar;
	}

	public int getAdelantocobrado() {
		return adelantocobrado;
	}

	public void setAdelantocobrado(int adelantoCobrado) {
		this.adelantocobrado = adelantoCobrado;
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
