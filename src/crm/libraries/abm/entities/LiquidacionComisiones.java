package crm.libraries.abm.entities;

import java.util.Vector;

public class LiquidacionComisiones implements ABMEntity{
	
	private String codigo;
	private String numeroPresupuesto;
	private String fechaDesde;
	private String fechaHasta;
	private String facturado;
	private String liquidado;
	private String codigoUnidad;
	private String codigoVendedor;
	private String cobrado;
	private String tipoComision;
	

	public LiquidacionComisiones(String cobrado, String codigo, String unidad,
			String vendedor, String facturado, String desde, String hasta, 
			String liquidado, String presupuesto, String tipoComi) {
		this.cobrado = cobrado;
		this.codigo = codigo;
		codigoUnidad = unidad;
		codigoVendedor = vendedor;
		this.facturado = facturado;
		fechaDesde = desde;
		fechaHasta = hasta;
		this.liquidado = liquidado;
		numeroPresupuesto = presupuesto;
		tipoComision = tipoComi;
	}

	public LiquidacionComisiones(){
	}

	public String getCobrado() {
		return cobrado;
	}

	public void setCobrado(String cobrado) {
		this.cobrado = cobrado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoUnidad() {
		return codigoUnidad;
	}

	public void setCodigoUnidad(String codigoUnidad) {
		this.codigoUnidad = codigoUnidad;
	}

	public String getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(String codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public String getFacturado() {
		return facturado;
	}

	public void setFacturado(String facturado) {
		this.facturado = facturado;
	}

	public String getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(String fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public String getFechaHasta() {
		return fechaHasta;
	}

	public void setFechaHasta(String fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	public String getLiquidado() {
		return liquidado;
	}

	public void setLiquidado(String liquidado) {
		this.liquidado = liquidado;
	}

	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNumeroPresupuesto() {
		return numeroPresupuesto;
	}

	public void setNumeroPresupuesto(String numeroPresupuesto) {
		this.numeroPresupuesto = numeroPresupuesto;
	}

	public String getTipoComision() {
		return tipoComision;
	}

	public void setTipoComision(String tipoComision) {
		this.tipoComision = tipoComision;
	}
	
	
}
