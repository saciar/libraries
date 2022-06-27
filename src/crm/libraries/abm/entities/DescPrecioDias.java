package crm.libraries.abm.entities;

import java.util.Vector;

public class DescPrecioDias implements ABMEntity{
	
	private String codigo;
	private String codigoServicio;
	private String techoDias;
	private String porcentaje;
	private String activo;
	
	public DescPrecioDias() {
		// TODO Auto-generated constructor stub
	}

	public DescPrecioDias (String cod, String codServ, String techo, String porc,String act){
		codigo = cod;
		codigoServicio = codServ;
		techoDias = techo;
		porcentaje = porc;
		activo = act;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getCodigoServicio() {
		return codigoServicio;
	}
	
	public void setCodigoServicio(String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}
	
	public String getPorcentaje() {
		return porcentaje;
	}
	
	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public String getTechoDias() {
		return techoDias;
	}
	
	public void setTechoDias(String techoDias) {
		this.techoDias = techoDias;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "DescPrecioDias:" + this.codigo + 
    			":" + this.codigoServicio + 
    			":" + this.techoDias + 
    			":" + this.porcentaje + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("DescPrecioDias:").length()-1, s.length());
    	
    }
     
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(codigoServicio);
    	vector.add(techoDias);
    	vector.add(porcentaje);
    	
    	return vector;
    }
    
    public static DescPrecioDias fromVector(Vector v){    	    	    	    	    	   
    	return new DescPrecioDias((String)v.get(0), (String)v.get(1), 
    			(String)v.get(2), (String)v.get(3),"S");
    }
	
}
