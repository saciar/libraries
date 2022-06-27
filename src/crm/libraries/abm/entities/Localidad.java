package crm.libraries.abm.entities;

import java.util.Vector;

public class Localidad implements ABMEntity{
        
    public Localidad() {
		// TODO Auto-generated constructor stub
	}

	public Localidad(String cod,String codLocalidad,String cod_p, String desc_loc,String act){
        codigo = cod;
        codigoLocalidad = codLocalidad;
        codigoPartido = cod_p;
        descripcion = desc_loc;
        activo = act;
    }
    
    public void setCodigoPartido(String cod_p){
        codigoPartido = cod_p;        
    }
    
    public String getCodigoPartido(){
        return codigoPartido;
    }
    
    public void setCodigo(String cod_loc){
        codigo = cod_loc;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setDescripcion(String desc_loc){
        descripcion = desc_loc;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}
    
    public String getCodigoLocalidad() {
		return codigoLocalidad;
	}

	public void setCodigoLocalidad(String codigoLocalidad) {
		this.codigoLocalidad = codigoLocalidad;
	}

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "Localidad:" + this.codigo + 
    			":" + this.codigoPartido + 
    			":" + this.descripcion + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("Localidad:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    		    		
    	vector.add(codigo);
    	vector.add(codigoLocalidad);   
    	vector.add(codigoPartido);    	
    	vector.add(descripcion);
    	
    	return vector;
    }
    
    public static Localidad fromVector(Vector v){    	    	    	    	    	   
    	return null;
    }
   
    private String codigo;
    private String codigoPartido;
    private String descripcion;
    private String activo;
    private String codigoLocalidad;
}
