package crm.libraries.abm.entities;

import java.util.Vector;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

public class CodigoPostal implements ABMEntity{
        
    public CodigoPostal() {
		// TODO Auto-generated constructor stub
	}

	public CodigoPostal(String codigo,String codLocalidad,String codigoPostal,String activo){
		this.codigo = codigo;
		this.codLocalidad = codLocalidad;
		this.codigoPostal = codigoPostal;
		this.activo = activo;
    }
 
    public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
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

	public String getCodLocalidad() {
		return codLocalidad;
	}

	public void setCodLocalidad(String codLocalidad) {
		this.codLocalidad = codLocalidad;
	}

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str +=  this.getClass().getSimpleName() + 
    			":" + this.codigo + 
    			":" + this.codLocalidad + 
    			":" + this.codigoPostal +
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String(this.getClass().getSimpleName() + ":").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    		    		
    	vector.add(codigo);    	
    	vector.add(codigoPostal);
    	vector.add(codLocalidad);
    	
    	return vector;
    }
    
    public static CodigoPostal fromVector(Vector v){    	    	    	    	    	   
    	return new CodigoPostal((String)v.get(0), (String)v.get(1), (String)v.get(2),"S");
    }
    
    private String codigo;    
    private String codLocalidad;
    private String codigoPostal;
    private String activo;
}
