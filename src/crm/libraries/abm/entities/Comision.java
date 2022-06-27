package crm.libraries.abm.entities;

import java.util.Vector;

public class Comision implements ABMEntity{
	
	public Comision() {
		// TODO Auto-generated constructor stub
	}

	public Comision(String cod, String codVend, 
					String porc, String marcLiq,String activo){
		this.codigo = cod;
		this.codigoVendedor = codVend;
		this.porcentaje = porc;
		this.marcoLiquidacion = marcLiq;
		this.activo = activo;
	}
	
	public void setCodigo(String cod){
        codigo = cod;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setPorcentaje(String por){
    	porcentaje = por;
    }
    
    public String getPorcentaje(){
    	return porcentaje;
    }
    
    public String getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(String codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public String getMarcoLiquidacion() {
		return marcoLiquidacion;
	}

	public void setMarcoLiquidacion(String marcoLiquidacion) {
		this.marcoLiquidacion = marcoLiquidacion;
	}
	
    public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "Comision:" + this.codigo + 
    			":" + this.codigoVendedor + 
    			":" + this.porcentaje + 
    			":" + this.marcoLiquidacion + 
    			":" + this.activo + ":"; 
    		
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("Comision:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    		    		
    	vector.add(codigo);
    	vector.add(codigoVendedor);    	
    	vector.add(porcentaje);
    	
    	return vector;
    }    
    
    public static Comision fromVector(Vector v){    	    	    	    	    	   
    	return new Comision((String)v.get(0), (String)v.get(1),
    			(String)v.get(2), (String) v.get(3),"S");
    }
    
	private String codigo;
	private String codigoVendedor;
	private String porcentaje;
	private String marcoLiquidacion;
	private String activo = "S";
	
}
