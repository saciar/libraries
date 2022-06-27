package crm.libraries.abm.entities;

import java.util.Vector;

public class Provincia implements ABMEntity{	
	
	public Provincia() {
		// TODO Auto-generated constructor stub
	}

	public Provincia(String codigo, String codProv,String codPais, String desc,String act){		
		this.codigo = codigo;
		codigoProvincia = codProv;
		codigoPais = codPais;
		descripcion = desc;
		activo = act;
	}
    
	public void setCodigoPais(String cod){
        codigoPais = cod;
    }
    
    public String getCodigoPais(){
        return codigoPais;
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
    
    public String getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(String codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "Provincia:" + this.codigo + 
    			":" + this.codigoPais + 
    			":" + this.descripcion + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("Provincia:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(codigoProvincia);
    	vector.add(codigoPais);
    	vector.add(descripcion);
    	
    	return vector;
    }
    
    public static Provincia fromVector(Vector v){    	    	    	    	    	   
    	return null;
    }

	private String codigo;
	private String codigoProvincia;
    private String codigoPais;
	private String descripcion;
	private String activo;
}
