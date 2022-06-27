package crm.libraries.abm.entities;

import java.util.Vector;

public class GerenciaComercial implements ABMEntity{
    
	private String codigo;
	private String descripcion;    
    private String codigoGerente;
    private String activo = "S";
    
	public GerenciaComercial(){}
	


	
    public GerenciaComercial(String activo, String codigo, String gerente, String descripcion) {
		this.activo = activo;
		this.codigo = codigo;
		codigoGerente = gerente;
		this.descripcion = descripcion;
	}




	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
    
    public void setDescripcion(String desc){
        descripcion = desc;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    
    public String getCodigoGerente() {
		return codigoGerente;
	}

	public void setCodigoGerente(String codigoGerente) {
		this.codigoGerente = codigoGerente;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(descripcion);    	
    	vector.add(activo);
    	
    	return vector;
    }
    
    public static GerenciaComercial fromVector(Vector v){    	    	    	    	    	   
    	return null;
    }
    
    public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "Titulo:" + this.codigo + ":" + this.descripcion + ":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("Titulo:").length()-1, s.length());
    	
    }
    
    public String toString() {
    	
    	return getProtocolListString();
    	
    }
}
