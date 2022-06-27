package crm.libraries.abm.entities;

import java.util.Vector;

public class UnidadVendedor implements ABMEntity{
	
	public UnidadVendedor() {
		// TODO Auto-generated constructor stub
	}

	public UnidadVendedor(String codUni, String codVend,String act){
		codigoUnidad = codUni;
		codigoVendedor = codVend;
		activo = act;
	}
	
	public String getCodigoVendedor() {
		return codigoVendedor;
	}
	
	public void setCodigoVendedor(String codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
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
    	
    	str += "UnidadVendedor:" + this.codigoUnidad + 
    			":" + this.codigoVendedor + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("UnidadVendedor:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigoUnidad);
    	vector.add(codigoVendedor);    
    	vector.add(activo);    
    	
    	return vector;
    }
    
    public static UnidadVendedor fromVector(Vector v){    	    	    	    	    	   
    	return new UnidadVendedor((String)v.get(0), (String)v.get(1),"S");
    }
	
    public void setCodigo(String codigo){}
    public String getCodigo(){return null;}
    
	private String codigoUnidad;
	private String codigoVendedor;
	private String activo;
}
