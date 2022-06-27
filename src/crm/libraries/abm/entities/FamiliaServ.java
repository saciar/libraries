package crm.libraries.abm.entities;

import java.util.Set;
import java.util.Vector;

public class FamiliaServ implements ABMEntity{			

	public FamiliaServ() {
		// TODO Auto-generated constructor stub
	}

	public FamiliaServ(String cod, String desc,String act) {        
        codigo = cod;
        descripcion = desc;
        activo = act;
    }

    public void setCodigo(String cod){
        codigo = cod;
    }
    
    public String getCodigo(){
        return codigo;
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


	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "FamiliaServ:" + this.codigo + 
    			":" + this.descripcion + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("FamiliaServ:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(descripcion);    	
    	vector.add(activo);
    	
    	return vector;
    }
    
    public static FamiliaServ fromVector(Vector v){    	    	    	    	    	   
    	return new FamiliaServ((String)v.get(0), (String)v.get(1), "S");
    }
    
    private String descripcion;
    private String codigo;
    private String activo;
	
}
