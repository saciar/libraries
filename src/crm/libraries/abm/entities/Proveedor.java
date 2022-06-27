package crm.libraries.abm.entities;

import java.util.Vector;

public class Proveedor implements ABMEntity{
	
	public Proveedor() {
		// TODO Auto-generated constructor stub
	}

	public Proveedor(String cod, String nom, String cont,
            String mail, String tel1, String tel2, String fx, String flNex, 
            String idNex,String call, String nro, String pso, 
            String dpto, String cp, String loc, String part, String prov, String pai,String act) { 
        codigo = cod;
        nombre = nom;
        contacto = cont;
        email = mail;
        telefono1 = tel1;
        telefono2 = tel2;
        fax = fx;
        flotaNextel = flNex;
        idNextel = idNex;      
        calle = call;
        numero = nro;
        piso = pso;
        departamento = dpto;
        codigoPostal = cp;
        localidad = loc;
        partido = part;
        provincia = prov;
        pais = pai;
        activo = act;
    }
    
    public String getCalle() {
		return calle;
	}



	public void setCalle(String calle) {
		this.calle = calle;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getCodigoPostal() {
		return codigoPostal;
	}



	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}



	public String getContacto() {
		return contacto;
	}



	public void setContacto(String contacto) {
		this.contacto = contacto;
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



	public String getFlotaNextel() {
		return flotaNextel;
	}



	public void setFlotaNextel(String flotaNextel) {
		this.flotaNextel = flotaNextel;
	}



	public String getIdNextel() {
		return idNextel;
	}



	public void setIdNextel(String idNextel) {
		this.idNextel = idNextel;
	}



	public String getLocalidad() {
		return localidad;
	}



	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getPais() {
		return pais;
	}



	public void setPais(String pais) {
		this.pais = pais;
	}



	public String getPartido() {
		return partido;
	}



	public void setPartido(String partido) {
		this.partido = partido;
	}



	public String getPiso() {
		return piso;
	}



	public void setPiso(String piso) {
		this.piso = piso;
	}



	public String getProvincia() {
		return provincia;
	}



	public void setProvincia(String provincia) {
		this.provincia = provincia;
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



	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "Proveedor:" + this.codigo + 
    			":" + this.nombre + 
    			":" + this.contacto + 
    			":" + this.telefono1 + 
    			":" + this.telefono2 + 
    			":" + this.fax + 
    			":" + this.flotaNextel + 
    			":" + this.idNextel + 
    			":" + this.email + 
    			":" + this.calle + 
    			":" + this.numero + 
    			":" + this.piso + 
    			":" + this.departamento + 
    			":" + this.codigoPostal + 
    			":" + this.localidad + 
    			":" + this.partido +
    			":" + this.provincia + 
    			":" + this.pais + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("Proveedor:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector v = new Vector();
    	
    	v.add(codigo);
    	v.add(nombre);    	
    	v.add(email);  
    	    	
    	return v;
    }
    
    public String toString(){
    	return nombre;
    }
    
    public static Proveedor fromVector(Vector v){    	    	    	    	    	   
    	return new Proveedor((String)v.get(0), (String)v.get(1), (String)v.get(2), 
    						(String)v.get(3), (String)v.get(4), (String)v.get(5), 
    						(String)v.get(6), (String)v.get(7), (String)v.get(8),
    						(String)v.get(9), (String)v.get(10), (String)v.get(11),
    						(String)v.get(12), (String)v.get(13), (String)v.get(14),
    						(String)v.get(15), (String)v.get(16), (String)v.get(17),
    						"S");
    }					
    
    private String codigo;
    private String nombre;
    private String contacto;    
    private String telefono1;
    private String telefono2;
    private String fax;
    private String flotaNextel;
    private String idNextel;
    private String email;
    private String calle;
    private String numero;
    private String piso;
    private String departamento;
    private String codigoPostal;
    private String localidad;    
    private String partido;
    private String provincia;
    private String pais;
    private String activo = "S";
}
