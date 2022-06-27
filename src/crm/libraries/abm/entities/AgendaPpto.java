package crm.libraries.abm.entities;

import java.util.Vector;

public class AgendaPpto implements ABMEntity {
	
	private String codigo;
	private String codCobrador;
	private String codContacto;
	private String direccionPago;
	private String horarioPago;
	private String codTipoRecibo;
	private String numeroRecibo;

	public String getDireccionPago() {
		return direccionPago;
	}

	public void setDireccionPago(String direccionPago) {
		this.direccionPago = direccionPago;
	}

	public String getHorarioPago() {
		return horarioPago;
	}

	public void setHorarioPago(String horarioPago) {
		this.horarioPago = horarioPago;
	}

	public AgendaPpto() {
		
	}	

	public AgendaPpto(String codigo, String codCobrador, String codContacto, String direccion, String horario) {
		this.codigo = codigo;
		this.codCobrador = codCobrador;
		this.codContacto = codContacto;
		this.direccionPago = direccion;
		this.horarioPago = horario;
	}

	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getCodCobrador() {
		return codCobrador;
	}



	public void setCodCobrador(String codCobrador) {
		this.codCobrador = codCobrador;
	}



	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCodContacto() {
		return codContacto;
	}

	public void setCodContacto(String codContacto) {
		this.codContacto = codContacto;
	}

	public String getCodTipoRecibo() {
		return codTipoRecibo;
	}

	public void setCodTipoRecibo(String codTipoRecibo) {
		this.codTipoRecibo = codTipoRecibo;
	}

	public String getNumeroRecibo() {
		return numeroRecibo;
	}

	public void setNumeroRecibo(String numeroRecibo) {
		this.numeroRecibo = numeroRecibo;
	}

}
