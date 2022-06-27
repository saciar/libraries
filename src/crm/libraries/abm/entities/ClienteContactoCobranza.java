package crm.libraries.abm.entities;

import java.util.Date;
import java.util.Vector;

public class ClienteContactoCobranza implements ABMEntity{
	
	private String codigo = "";
	private String codigoCliente;
	private String codigoContacto;
	private String titulo;
    private String apellidoYNombre;
    private String departamento;
    private String cargo;    
    private String telefono1;
    private String telefono2;
    private String fax;
    private String interno;
    private Integer flotaNextel;
    private Integer idNextel;
    private String email;
    private Date fechaUltimoContacto;
    private char activo = 'S';
    
    public ClienteContactoCobranza() {
		// TODO Auto-generated constructor stub
	}
    
    public ClienteContactoCobranza(String cod, String codCliente, String codContacto, 
    		String tit, String apynom, String dpto, String crgo, 
    		String tel1, String tel2, String fx, String inter, int flNex, int idNex, 
    		String mail, Date fechaUlt, char act) { 
        codigo = cod;
        codigoCliente = codCliente;
        codigoContacto = codContacto;
        //tipoContacto = tipo;
        titulo = tit;
        apellidoYNombre = apynom;
        departamento = dpto;
        cargo = crgo;        
        telefono1 = tel1;
        telefono2 = tel2;
        fax = fx;
        interno = inter;
        flotaNextel = flNex;
        idNextel = idNex;
        email = mail;
        fechaUltimoContacto = fechaUlt;
        activo = act;
    }

	public char getActivo() {
		return activo;
	}

	public void setActivo(char activo) {
		this.activo = activo;
	}
	
    public boolean isActivo(){
    	return activo == 'S';
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

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getCodigoContacto() {
		return codigoContacto;
	}

	public void setCodigoContacto(String codigoContacto) {
		this.codigoContacto = codigoContacto;
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

	public Date getFechaUltimoContacto() {
		return fechaUltimoContacto;
	}

	public void setFechaUltimoContacto(Date fechaUltimoContacto) {
		this.fechaUltimoContacto = fechaUltimoContacto;
	}

	public Integer getFlotaNextel() {
		return flotaNextel;
	}

	public void setFlotaNextel(Integer flotaNextel) {
		this.flotaNextel = flotaNextel;
	}

	public Integer getIdNextel() {
		return idNextel;
	}

	public void setIdNextel(Integer idNextel) {
		this.idNextel = idNextel;
	}

	public String getInterno() {
		return interno;
	}

	public void setInterno(String interno) {
		this.interno = interno;
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
    
	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "ClienteContacto:" + this.codigo + 
    			":" + this.codigoCliente+ 
    			":" + this.codigoContacto + 
    			":" + this.titulo+ 
    			":" + this.apellidoYNombre + 
    			":" + this.departamento +
    			":" + this.cargo +     			
    			":" + this.telefono1 + 
    			":" + this.telefono2 +
    			":" + this.fax+ 
    			":" + this.interno+ 
    			":" + this.flotaNextel + 
    			":" + this.idNextel + 
    			":" + this.email + 
    			":" + this.fechaUltimoContacto+ 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
	
	public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("ClienteContacto:").length()-1, s.length());
    	
    }
	
	public Vector toVector(){
    	Vector v = new Vector();
    	
    	v.add(codigo);
    	v.add(apellidoYNombre);
    	v.add(email);
    	    	
    	return v;
    }
	
	public static ClienteContactoCobranza fromVector(Vector v){    	    	    	    	    	   
    	return new ClienteContactoCobranza((String)v.get(0), (String)v.get(1), (String)v.get(2), 
    						(String)v.get(3), (String)v.get(4), (String)v.get(5), 
    						(String)v.get(6), (String)v.get(7), (String)v.get(8),
    						(String)v.get(9), (String)v.get(10), (Integer)v.get(11),
    						(Integer)v.get(12),(String)v.get(13), (Date)v.get(14),'S');
    }
	
	public boolean equals(Object o){
    	if (o == null)
    		return false;
    	if (!(o instanceof ClienteContactoCobranza))
    		return false;
    	
    	return codigo.equals(((ClienteContactoCobranza)o).codigo);
    }
    
	//@Override
	public int hashCode() {
		return codigo.hashCode();
	}

}
