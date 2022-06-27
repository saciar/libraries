package crm.libraries.abm.entities;

import java.util.Vector;

public class UnidadAdministrador implements ABMEntity{
	
	public UnidadAdministrador() {
		// TODO Auto-generated constructor stub
	}

	public UnidadAdministrador(String codUni, String codVend,String act){
		codigoUnidad = codUni;
		codigoAdministrador = codVend;
		activo = act;
	}
	
	public String getCodigoAdministrador() {
		return codigoAdministrador;
	}
	
	public void setCodigoAdministrador(String codigoVendedor) {
		this.codigoAdministrador = codigoVendedor;
	}
	
	public String getCodigoUnidad() {
		return codigoUnidad;
	}
	
	public void setCodigoUnidad(String codigoUnidad) {
		this.codigoUnidad = codigoUnidad;
	}
	
	
	
	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "UnidadAdminUsuario:" + this.codigoUnidad + 
    			":" + this.codigoAdministrador + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("UnidadAdminUsuario:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigoUnidad);
    	vector.add(codigoAdministrador);    
    	vector.add(activo);    
    	
    	return vector;
    }
    
    public static UnidadVendedor fromVector(Vector v){    	    	    	    	    	   
    	return new UnidadVendedor((String)v.get(0), (String)v.get(1),"S");
    }
	
    public void setCodigo(String codigo){}
    public String getCodigo(){return null;}
    
	private String codigoUnidad;
	private String codigoAdministrador;
	private String activo;

}
