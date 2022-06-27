package crm.libraries.abm.entities;

import java.util.Vector;

public class CategEvento implements ABMEntity{
	
	public CategEvento() {
		// TODO Auto-generated constructor stub
	}

	public CategEvento(String cod, String desc,String act) {        
        codigo = cod;
        descripcion = desc;
        activo = act;
    }

    public String getCodigo() {
		return codigo;
	}
    
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
    	
    	str += "CategEvento:" + this.codigo + 
    			":" + this.descripcion + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("CategEvento:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(descripcion);    
    	vector.add(activo);
    	
    	return vector;
    }
    
    public static CategEvento fromVector(Vector v){    	    	    	    	    	   
    	return new CategEvento((String)v.get(0), (String)v.get(1),"S");
    }
    
    private String descripcion;
    private String codigo;
    private String activo = "S";
}
