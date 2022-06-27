package crm.libraries.abm.entities;

import java.util.Vector;

public class CategVendedor implements ABMEntity{
	
	public CategVendedor() {
		// TODO Auto-generated constructor stub
	}

	public CategVendedor(String cat, String desc,String act) {        
        codigo = cat;
        descripcion = desc;
        activo = act;
    }

    public void setCodigo(String cat){
        codigo = cat;
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
    	
    	str += "CategVendedor:" + this.codigo + 
    			":" + this.descripcion +  
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("CategVendedor:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(descripcion);    	
    	vector.add(activo);
    	
    	return vector;
    }
    
    public static CategVendedor fromVector(Vector v){    	    	    	    	    	   
    	return new CategVendedor((String)v.get(0), (String)v.get(1),"S");
    }
    
    private String codigo;
    private String descripcion;
    private String activo;
}
