package crm.libraries.abm.entities;

import java.util.Vector;

public class ListaPrecioCustom implements ABMEntity {
	
	public ListaPrecioCustom() {
		// TODO Auto-generated constructor stub
	}

	public ListaPrecioCustom (String cod, String codigoLugar, 
			String codServ, String porc,String act){
		codigo = cod;
		this.codigoLugar = codigoLugar;
		descripcion = codServ;
		variacion = porc;
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
	
	public void setDescripcion(String descrip) {
		this.descripcion = descrip;
	}
	
	public String getVariacion() {
		return variacion;
	}
	
	public void setVariacion(String var) {
		this.variacion = var;
	}
	
	public String getCodigoLugar() {
		return codigoLugar;
	}

	public void setCodigoLugar(String codigoLugar) {
		this.codigoLugar = codigoLugar;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}
	
	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "ListaPrecioCustom:" + this.codigo +
    			":" + this.codigoLugar +
    			":" + this.descripcion + 
    			":" + this.variacion + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("ListaPrecioCustom: ").length()-1, s.length());
    	
    }
	
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(descripcion);
    	vector.add(variacion);
    	
    	return vector;
    }
    
    public static ListaPrecioCustom fromVector(Vector v){    	    	    	    	    	   
    	return new ListaPrecioCustom((String)v.get(0), (String)v.get(1), 
    			(String)v.get(2), (String)v.get(3),"S");
    }
	
	private String codigo;
	private String codigoLugar;
	private String descripcion;
	private String variacion;
	private String activo = "S";
}
