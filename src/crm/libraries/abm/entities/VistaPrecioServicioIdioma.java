package crm.libraries.abm.entities;

import java.util.Vector;

public class VistaPrecioServicioIdioma implements ABMEntity{
	private String codigo;
	private String codigoFamilia;
	private String familia;
    private String codigoServicio;
    private String servicio;
    private String precioLista;
    private String codigoLugar;
    private String variacion;
    private String precioLugar;
    //private String activo;
    
	public VistaPrecioServicioIdioma(){}
	
	public VistaPrecioServicioIdioma( String cod, String codFam, String fam, String codServ, 
										String serv,String precLista, String codLugar, String var,
										String precLugar) {    
		codigo = cod;
        codigoFamilia = codFam;
        familia = fam;
        codigoServicio = codServ;
        servicio =serv;
        precioLista = precLista;
        codigoLugar = codLugar;
        variacion = var;
        precioLugar = precLugar;
    }
    
    public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoFamilia() {
		return codigoFamilia;
	}

	public void setCodigoFamilia(String codigoFamilia) {
		this.codigoFamilia = codigoFamilia;
	}

	public String getCodigoLugar() {
		return codigoLugar;
	}

	public void setCodigoLugar(String codigoLugar) {
		this.codigoLugar = codigoLugar;
	}

	public String getCodigoServicio() {
		return codigoServicio;
	}

	public void setCodigoServicio(String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getPrecioLista() {
		return precioLista;
	}

	public void setPrecioLista(String precioLista) {
		this.precioLista = precioLista;
	}

	public String getPrecioLugar() {
		return precioLugar;
	}

	public void setPrecioLugar(String precioLugar) {
		this.precioLugar = precioLugar;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getVariacion() {
		return variacion;
	}

	public void setVariacion(String variacion) {
		this.variacion = variacion;
	}

	public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(familia);    	
    	vector.add(codigo);
    	vector.add(codigoFamilia);
    	vector.add(familia);
    	vector.add(codigoServicio);
    	vector.add(servicio);
    	vector.add(precioLista);
        vector.add(codigoLugar);
        vector.add(variacion);
        vector.add(precioLugar);
    	
    	return vector;
    }
    
    public static VistaPrecioServicioIdioma fromVector(Vector v){    	    	    	    	    	   
    	return new VistaPrecioServicioIdioma ((String)v.get(0), (String)v.get(1),
    			(String)v.get(2), (String)v.get(3), (String)v.get(4), (String)v.get(5),
    			(String)v.get(6), (String)v.get(7), (String)v.get(8));
    }
    
    public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "VistaPrecioServicioIdioma:"+ this.codigo + ":" + this.codigoFamilia +":" + this.familia + ":"
    						+ this.codigoServicio + ":" + this.servicio + ":" + this.precioLista + ":"
    						+ this.codigoLugar + ":" + this.variacion + ":" + this.precioLugar +":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("VistaPrecioServicioIdioma:").length()-1, s.length());
    
    }
    
    public String toString() {
    	
    	return getProtocolListString();
    	
    }
}
