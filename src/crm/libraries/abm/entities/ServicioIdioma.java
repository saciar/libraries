package crm.libraries.abm.entities;

import java.util.Vector;

public class ServicioIdioma implements ABMEntity{
	
	public ServicioIdioma() {
		// TODO Auto-generated constructor stub
	}

	public ServicioIdioma(String cod, String codId, String desc, String descAbrev,String act) {        
        codigoServicio = cod;
        codigoIdioma = codId;
        descripcion = desc;
        descripcionAbreviada = descAbrev;
        activo = act;
    }

    public void setCodigoServicio(String cod){
        codigoServicio = cod;
    }
    
    public String getCodigoServicio(){
        return codigoServicio;
    }
    
    public String getCodigoIdioma() {
		return codigoIdioma;
	}

	public void setCodigoIdioma(String codigoIdioma) {
		this.codigoIdioma = codigoIdioma;
	}
  
    public void setDescripcion(String desc){
        descripcion = desc;
    }
    
    public String getDescripcion(){
        return descripcion;
    }   
    
	public String getDescripcionAbreviada() {
		return descripcionAbreviada;
	}

	public void setDescripcionAbreviada(String descripcionAbreviada) {
		this.descripcionAbreviada = descripcionAbreviada;
	} 
    
	
	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "ServicioIdioma:" + this.codigoServicio + 
    			":" + this.codigoIdioma + 
    			":" + this.descripcion + 
    			":" + this.descripcionAbreviada + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("ServicioIdioma:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigoServicio);
    	vector.add(codigoIdioma);
    	vector.add(descripcionAbreviada);
    	
    	return vector;
    }
    
    public static ServicioIdioma fromVector(Vector v){    	    	    	    	    	   
    	return new ServicioIdioma((String)v.get(0), (String)v.get(1), (String)v.get(2), (String)v.get(3), "S");
    }
    
    public void setCodigo(String codigo){}
    public String getCodigo(){return null;}
    
    private String codigoServicio;
    private String codigoIdioma;
    private String descripcion;
    private String descripcionAbreviada;
	private String activo = "S";
}
