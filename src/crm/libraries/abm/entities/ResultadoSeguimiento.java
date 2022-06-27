package crm.libraries.abm.entities;

import java.util.Vector;

public class ResultadoSeguimiento implements ABMEntity{
	
	public ResultadoSeguimiento() {
		// TODO Auto-generated constructor stub
	}

	public ResultadoSeguimiento(String cod,String codSeguimiento, String descripcion,String activo){
		this.codigo = cod;
		this.codSeguimiento = codSeguimiento;
		this.descripcion = descripcion;
		this.activo = activo;
	}
	
	public void setCodigo(String cod){
        codigo = cod;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
	
    public String getCodSeguimiento() {
		return codSeguimiento;
	}

	public void setCodSeguimiento(String codSeguimiento) {
		this.codSeguimiento = codSeguimiento;
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
    			":" + this.codSeguimiento + 
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
    	vector.add(codSeguimiento);
    	vector.add(descripcion);    	
    	
    	return vector;
    }    
    
    public static ResultadoSeguimiento fromVector(Vector v){    	    	    	    	    	   
    	return new ResultadoSeguimiento((String)v.get(0), (String)v.get(1),(String)v.get(2),"S");
    }
    
	private String codigo;
	private String codSeguimiento;
	private String descripcion;
	private String activo = "S";
	
}
