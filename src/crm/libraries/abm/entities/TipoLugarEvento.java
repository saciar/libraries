package crm.libraries.abm.entities;

import java.util.Vector;

public class TipoLugarEvento implements ABMEntity{
	
	public TipoLugarEvento() {
		codigo = "0";
	}

	public TipoLugarEvento(String cod, String desc,String act) {        
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
    	
    	str += "UnidadComercial:" + this.codigo + 
    			":" + this.descripcion + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("TipoLugerEvento:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(descripcion);  
    	vector.add(activo);
    	
    	return vector;
    }
    
    public static TipoLugarEvento fromVector(Vector v){    	    	    	    	    	   
    	return new TipoLugarEvento((String)v.get(0), (String)v.get(1),"S");
    }
    
    private String descripcion;
    private String codigo;
    private String activo;
}
