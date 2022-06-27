package crm.libraries.abm.entities;

import java.util.Vector;

public class Partido implements ABMEntity{	
	
	public Partido() {
		// TODO Auto-generated constructor stub
	}

	public Partido(String partido,String codPartido,String prov,  String desc,String act) {
		codigo = partido;
		codigoPartido = codPartido;
		codigoProvincia = prov;        
        descripcion = desc;
        activo = act;
    }
    
  

    public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getCodigoProvincia() {
		return codigoProvincia;
	}



	public void setCodigoProvincia(String codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getCodigoPartido() {
		return codigoPartido;
	}

	public void setCodigoPartido(String codigoPartido) {
		this.codigoPartido = codigoPartido;
	}

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "Partido:" + this.codigo + 
    			":" + this.codigoProvincia + 
    			":" + this.descripcion + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("Partido:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(codigoPartido);
    	vector.add(codigoProvincia);
    	vector.add(descripcion);
    	
    	return vector;
    }
    
    public static Partido fromVector(Vector v){    	    	    	    	    	   
    	return null;
    }
    
    private String codigoProvincia;
	private String codigo;
	private String codigoPartido;
	private String descripcion;
	private String activo;
}