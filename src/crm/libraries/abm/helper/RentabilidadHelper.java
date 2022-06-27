package crm.libraries.abm.helper;

import crm.libraries.abm.entities.Presupuesto;

public class RentabilidadHelper {
	private long id;
	private Presupuesto presupuesto;
	private double facturacionOriginal;
	private double facturacionExtra;
	private double costoOperativo;
	private double gastosAsistentes;
	private double gastosContrataciones;
	private double gastosOperadores;
	private double gastosOtros;
	private double comisionesLugar;
	private double comisionesTerceros;
	
	public double getComisionesLugar() {
		return comisionesLugar;
	}
	public void setComisionesLugar(double comisionesLugar) {
		this.comisionesLugar = comisionesLugar;
	}
	public double getComisionesTerceros() {
		return comisionesTerceros;
	}
	public void setComisionesTerceros(double comisionesTerceros) {
		this.comisionesTerceros = comisionesTerceros;
	}
	public double getCostoOperativo() {
		return costoOperativo;
	}
	public void setCostoOperativo(double costoOperativo) {
		this.costoOperativo = costoOperativo;
	}
	public double getFacturacionExtra() {
		return facturacionExtra;
	}
	public void setFacturacionExtra(double facturacionExtra) {
		this.facturacionExtra = facturacionExtra;
	}
	public double getFacturacionOriginal() {
		return facturacionOriginal;
	}
	public void setFacturacionOriginal(double facturacionOriginal) {
		this.facturacionOriginal = facturacionOriginal;
	}
	public double getGastosAsistentes() {
		return gastosAsistentes;
	}
	public void setGastosAsistentes(double gastosAsistentes) {
		this.gastosAsistentes = gastosAsistentes;
	}
	public double getGastosContrataciones() {
		return gastosContrataciones;
	}
	public void setGastosContrataciones(double gastosContrataciones) {
		this.gastosContrataciones = gastosContrataciones;
	}
	public double getGastosOperadores() {
		return gastosOperadores;
	}
	public void setGastosOperadores(double gastosOperadores) {
		this.gastosOperadores = gastosOperadores;
	}
	public double getGastosOtros() {
		return gastosOtros;
	}
	public void setGastosOtros(double gastosOtros) {
		this.gastosOtros = gastosOtros;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Presupuesto getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}
}
