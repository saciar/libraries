package crm.libraries.abm.entities;

import java.util.Vector;

public class TipoUniforme implements ABMEntity{
	
	public TipoUniforme() {
		codigo = "0";
	}

	public TipoUniforme(String cod, String desc,String act) {        
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
    	
    	str += "TipoUniforme:" + this.codigo + 
    			":" + this.descripcion + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("TipoUniforme:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(descripcion); 
    	vector.add(activo); 
    	
    	return vector;
    }
    
    public static TipoUniforme fromVector(Vector v){    	    	    	    	    	   
    	return new TipoUniforme((String)v.get(0), (String)v.get(1),"S");
    }
    
    private String descripcion;
    private String codigo;
    private String activo;
}
