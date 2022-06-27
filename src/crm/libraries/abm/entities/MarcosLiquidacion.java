package crm.libraries.abm.entities;

import java.util.Vector;

public class MarcosLiquidacion implements ABMEntity{
	
	public MarcosLiquidacion() {
		// TODO Auto-generated constructor stub
	}

	public MarcosLiquidacion(String codigo, String descripcion,String activo){
		this.codigo = codigo;
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
    	
    	str += "MarcosLiquidacion:" + this.codigo + 
    			":" + this.descripcion + 
    			":" + this.activo + ":"; 
    		
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("Comision:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    		    		
    	vector.add(codigo);
    	vector.add(descripcion);    	
    	vector.add(activo);
    	
    	return vector;
    }    
    
    public static MarcosLiquidacion fromVector(Vector v){    	    	    	    	    	   
    	return new MarcosLiquidacion((String)v.get(0), (String)v.get(1),"S");
    }
    
	private String codigo;
	private String descripcion;
	private String activo;
	
}
