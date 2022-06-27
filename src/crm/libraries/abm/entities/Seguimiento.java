package crm.libraries.abm.entities;

import java.util.Vector;

public class Seguimiento implements ABMEntity{
	
	public Seguimiento() {
		// TODO Auto-generated constructor stub
	}

	public Seguimiento(String cod, String descripcion,String activo){
		this.codigo = cod;
		this.descripcion = descripcion;
		this.activo = activo;
	}
	
	public void setCodigo(String cod){
        codigo = cod;
    }
    
    public String getCodigo(){
        return codigo;
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

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += getClass().getSimpleName() + 
    			":" + this.codigo + 
    			":" + this.descripcion + 
    			":" + this.activo + ":"; 
    		
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String(getClass().getSimpleName() + ":").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    		    		
    	vector.add(codigo);
    	vector.add(descripcion);    	
    	vector.add(activo);
    	
    	return vector;
    }    
    
    public static Seguimiento fromVector(Vector v){    	    	    	    	    	   
    	return new Seguimiento((String)v.get(0), (String)v.get(1),"S");
    }
    
	private String codigo;
	private String descripcion;
	private String activo = "S";
	
}
