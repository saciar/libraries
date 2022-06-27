package crm.libraries.abm.entities;

import java.util.Vector;

public class CondIVA implements ABMEntity {
        
    public CondIVA() {
		// TODO Auto-generated constructor stub
	}

	public CondIVA(String cod, String desc,String act) {        
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
    	
    	str += "CondIVA:" + this.codigo + 
    			":" + this.descripcion + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("CondIVA:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector v = new Vector();
    	
    	v.add(codigo);
    	v.add(descripcion);    	
    	v.add(activo);
    	
    	return v;
    }
    
    public static CondIVA fromVector(Vector v){    	    	    	    	    	   
    	return new CondIVA((String)v.get(0), (String)v.get(1),"S");
    }
    
    private String codigo;
    private String descripcion;
    private String activo;
}
