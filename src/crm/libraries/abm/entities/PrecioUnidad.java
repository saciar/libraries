package crm.libraries.abm.entities;

import java.util.Vector;

public class PrecioUnidad implements ABMEntity{
	
	public PrecioUnidad() {
		// TODO Auto-generated constructor stub
	}

	public PrecioUnidad(String codUni, String codLst){
		codigoUnidad = codUni;
		codigoLista = codLst;
	}
	
	public String getCodigoLista() {
		return codigoLista;
	}
	
	public void setCodigoLista(String codigoLista) {
		this.codigoLista = codigoLista;
	}
	
	public String getCodigoUnidad() {
		return codigoUnidad;
	}
	
	public void setCodigoUnidad(String codigoUnidad) {
		this.codigoUnidad = codigoUnidad;
	}
	

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "PrecioUnidad:" + this.codigoUnidad + 
    			":" + this.codigoLista + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("PrecioUnidad:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigoUnidad);
    	vector.add(codigoLista); 
    	
    	return vector;
    }
    
    public static PrecioUnidad fromVector(Vector v){    	    	    	    	    	   
    	return new PrecioUnidad((String)v.get(0), (String)v.get(1));
    }
	
    public void setCodigo(String codigo){}
    public String getCodigo(){return null;}
    
	private String codigoUnidad;
	private String codigoLista;
}
