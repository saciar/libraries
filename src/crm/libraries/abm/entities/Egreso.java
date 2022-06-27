package crm.libraries.abm.entities;

import java.util.Vector;

public class Egreso implements ABMEntity{
	
	private String codigo;
	private String tipoEgreso;
	private String fecha_egreso;
	private String codUsuario;
	private String nroppto;
	private int codChofer;
	private int codTransporte;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTipoEgreso() {
		return tipoEgreso;
	}
	public void setTipoEgreso(String tipoEgreso) {
		this.tipoEgreso = tipoEgreso;
	}
	public String getFecha_egreso() {
		return fecha_egreso;
	}
	public void setFecha_egreso(String fecha_egreso) {
		this.fecha_egreso = fecha_egreso;
	}
	public String getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}
	public String getNroppto() {
		return nroppto;
	}
	public void setNroppto(String nroppto) {
		this.nroppto = nroppto;
	}
	public int getCodChofer() {
		return codChofer;
	}
	public void setCodChofer(int codChofer) {
		this.codChofer = codChofer;
	}
	public int getCodTransporte() {
		return codTransporte;
	}
	public void setCodTransporte(int codTransporte) {
		this.codTransporte = codTransporte;
	}
	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
