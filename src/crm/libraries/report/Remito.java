package crm.libraries.report;

public class Remito {
	private long nroPpto;
	public long getNroPpto() {
		return nroPpto;
	}
	public void setNroPpto(long nroPpto) {
		this.nroPpto = nroPpto;
	}
	private String empresa;
	private String calle;
	private String numero;
	private String piso;
	private String localidad;
	private String conIVA;
	private String cuit;
	private RemitoEquipos[] equipos;
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getConIVA() {
		return conIVA;
	}
	public void setConIVA(String conIVA) {
		this.conIVA = conIVA;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public RemitoEquipos[] getEquipos() {
		return equipos;
	}
	public void setEquipos(RemitoEquipos[] equipos) {
		this.equipos = equipos;
	}
	
}
