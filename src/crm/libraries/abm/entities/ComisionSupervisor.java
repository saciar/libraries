package crm.libraries.abm.entities;

import java.util.Vector;

public class ComisionSupervisor implements ABMEntity{
    
	private String codigo;
	private String codigoVendedor;
	private String nivel;
	private String objetivo;
	private String porcentaje;
	private String marcoLiquidacion;
	private String activo = "S";
	
	public ComisionSupervisor() {
	}

	public ComisionSupervisor(String cod, String codVend, 
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
	

	
	
	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
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
    
    public static ComisionSupervisor fromVector(Vector v){    	    	    	    	    	   
    	return new ComisionSupervisor((String)v.get(0), (String)v.get(1),
    			(String)v.get(2), (String) v.get(3),"S");
    }

	
}
