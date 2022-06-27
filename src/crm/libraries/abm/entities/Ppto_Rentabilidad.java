package crm.libraries.abm.entities;

import java.io.Serializable;

public class Ppto_Rentabilidad implements Serializable{
	private Long id;
	private Presupuesto presupuesto;
	private String facturacionOriginal;
	private String facturacionExtra;
	private String costoOperativo;
	private String gastosAsistentes;
	private String gastosContrataciones;
	private String gastosOperadores;
	private String gastosOtros;
	private String comisionesLugar;
	private String comisionesTerceros;
	
	public String getComisionesLugar() {
		return comisionesLugar;
	}
	public void setComisionesLugar(String comisionesLugar) {
		this.comisionesLugar = comisionesLugar;
	}
	public String getComisionesTerceros() {
		return comisionesTerceros;
	}
	public void setComisionesTerceros(String comisionesTerceros) {
		this.comisionesTerceros = comisionesTerceros;
	}
	public String getCostoOperativo() {
		return costoOperativo;
	}
	public void setCostoOperativo(String costoOperativo) {
		this.costoOperativo = costoOperativo;
	}
	public String getFacturacionExtra() {
		return facturacionExtra;
	}
	public void setFacturacionExtra(String facturacionExtra) {
		this.facturacionExtra = facturacionExtra;
	}
	public String getFacturacionOriginal() {
		return facturacionOriginal;
	}
	public void setFacturacionOriginal(String facturacionOriginal) {
		this.facturacionOriginal = facturacionOriginal;
	}
	public String getGastosAsistentes() {
		return gastosAsistentes;
	}
	public void setGastosAsistentes(String gastosAsistentes) {
		this.gastosAsistentes = gastosAsistentes;
	}
	public String getGastosContrataciones() {
		return gastosContrataciones;
	}
	public void setGastosContrataciones(String gastosContrataciones) {
		this.gastosContrataciones = gastosContrataciones;
	}
	public String getGastosOperadores() {
		return gastosOperadores;
	}
	public void setGastosOperadores(String gastosOperadores) {
		this.gastosOperadores = gastosOperadores;
	}
	public String getGastosOtros() {
		return gastosOtros;
	}
	public void setGastosOtros(String gastosOtros) {
		this.gastosOtros = gastosOtros;
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
	
	
}
