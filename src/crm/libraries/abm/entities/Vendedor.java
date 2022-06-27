package crm.libraries.abm.entities;

import java.util.Vector;

public class Vendedor implements ABMEntity{
	
	public Vendedor() {
		// TODO Auto-generated constructor stub
	}

	public Vendedor(String cod,String codUsr, String nom, String cat, String fec, String nxtFlot,
						String nxtId, String codEqui,String act) {
		
        codigo = cod;
        codUsuario = codUsr;
        apellidoYNombre = nom;
        categoria = cat;
        fecing = fec;
        nextelFlota = nxtFlot;
        idNextel = nxtId;
        codEquipo = codEqui;
        activo = act;
        
    }

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
    

    public String getApellidoYNombre() {
		return apellidoYNombre;
	}
	public void setApellidoYNombre(String apellidoYNombre) {
		this.apellidoYNombre = apellidoYNombre;
	}


	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getCodEquipo() {
		return codEquipo;
	}
	public void setCodEquipo(String codEquipo) {
		this.codEquipo = codEquipo;
	}



	public String getFecing() {
		return fecing;
	}
	public void setFecing(String fecing) {
		this.fecing = fecing;
	}


	public String getIdNextel() {
		return idNextel;
	}
	public void setIdNextel(String idNextel) {
		this.idNextel = idNextel;
	}

	public String getNextelFlota() {
		return nextelFlota;
	}
	public void setNextelFlota(String nextelFlota) {
		this.nextelFlota = nextelFlota;
	}


	public String getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}


	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "Vendedor:" + this.codigo + 
    			":" + this.apellidoYNombre + 
    			":" + this.categoria + 
    			":" + this.fecing + 
    			":" + this.nextelFlota + 
    			":" + this.idNextel + 
    			":" + this.codEquipo + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("Vendedor:").length()-1, s.length());
    	
    }
     
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(apellidoYNombre);
    	
    	return vector;
    }
    
    public static Vendedor fromVector(Vector v){    	    	    	    	    	   
    	return new Vendedor((String)v.get(0), (String)v.get(1), 
    			(String)v.get(2), (String)v.get(3), (String)v.get(4), (String)v.get(5),
    			(String)v.get(6),(String)v.get(6),"S");
    }
    
    private String codigo;
    private String codUsuario;
    private String apellidoYNombre;
    private String categoria;
    private String fecing;
    private String nextelFlota;
    private String idNextel;
    private String codEquipo;
    private String activo;
}
