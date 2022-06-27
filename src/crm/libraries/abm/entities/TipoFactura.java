package crm.libraries.abm.entities;

import java.util.Vector;

public class TipoFactura implements ABMEntity{
	
	public TipoFactura() {
		codigo = "0";
	}

	public TipoFactura(String cod, String desc,String act) {        
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
    	
    	str += "TipoFactura:" + this.codigo + 
    			":" + this.activo + 
    			":" + this.descripcion + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("TipoFactura:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(descripcion); 
    	vector.add(activo); 
    	
    	return vector;
    }
    
    public static TipoFactura fromVector(Vector v){    	    	    	    	    	   
    	return new TipoFactura((String)v.get(0), (String)v.get(1),"S");
    }
    
    private String descripcion;
    private String codigo;
    private String activo;

}
