package crm.libraries.abm.entities;

import java.util.Vector;

public class MarcaEquipo implements ABMEntity{
	
	public MarcaEquipo() {
		// TODO Auto-generated constructor stub
	}

	public MarcaEquipo(String cod, String desc,String act){
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
    	
    	str += "Pais:" + this.codigo + 
    			":" + this.descripcion + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("Marca:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(descripcion); 
    	
    	return vector;
    }
    
    public static Pais fromVector(Vector v){    	    	    	    	    	   
    	return new Pais((String)v.get(0), (String)v.get(1),"S");
    }
    
    private String codigo;
	private String descripcion;
	private String activo;

}
