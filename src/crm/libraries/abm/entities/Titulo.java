package crm.libraries.abm.entities;

import java.util.Vector;

public class Titulo implements ABMEntity{
    
	private String descripcion;
    private String codigo;
    private String activo = "S";
    
	public Titulo(){}
	
    public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Titulo(String cod, String desc,String act) {        
        codigo = cod;
        descripcion = desc;
        activo = act;
    }
    
    public void setDescripcion(String desc){
        descripcion = desc;
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
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(descripcion);    	
    	vector.add(activo);
    	
    	return vector;
    }
    
    public static Titulo fromVector(Vector v){    	    	    	    	    	   
    	return new Titulo ((String)v.get(0), (String)v.get(1),"S");
    }
    
    public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "Titulo:" + this.codigo + ":" + this.descripcion + ":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("Titulo:").length()-1, s.length());
    	
    }
    
    public String toString() {
    	
    	return getProtocolListString();
    	
    }
}
