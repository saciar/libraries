package crm.libraries.abm.entities;

import java.util.Vector;

public class LugarEventoContacto implements ABMEntity {

	private String codigo;

	private String activo = "S";

	private String codLugar;

	private String codigoContacto;

	private String titulo;

	private String apellidoYNombre;

	private String departamento;

	private String cargo;

	private String telefono1;

	private String telefono2;

	private String fax;

	private String interno;

	private String nextelFota;

	private String nextelId;

	private String email;

	private String fecha;

	public LugarEventoContacto() {
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getApellidoYNombre() {
		return apellidoYNombre;
	}

	public void setApellidoYNombre(String apellidoYNombre) {
		this.apellidoYNombre = apellidoYNombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoContacto() {
		return codigoContacto;
	}

	public void setCodigoContacto(String codigoContacto) {
		this.codigoContacto = codigoContacto;
	}

	public String getCodLugar() {
		return codLugar;
	}

	public void setCodLugar(String codLugar) {
		this.codLugar = codLugar;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getInterno() {
		return interno;
	}

	public void setInterno(String interno) {
		this.interno = interno;
	}

	public String getNextelFota() {
		return nextelFota;
	}

	public void setNextelFota(String nextelFota) {
		this.nextelFota = nextelFota;
	}

	public String getNextelId() {
		return nextelId;
	}

	public void setNextelId(String nextelId) {
		this.nextelId = nextelId;
	}

	public String getTelefono1() {
		return telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	public String getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Vector toVector(){
    	Vector v = new Vector();
    	
    	v.add(this.codigo);
    	v.add(this.apellidoYNombre);
    	v.add(this.email);
    	    	
    	return v;
    }
}
