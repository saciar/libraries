package crm.libraries.abm.entities;

import java.util.Vector;

public class VistaFamiliaServicioIdioma {
	private String codigo;
	private String codigoFamilia;
	private String familia;
    private String codigoServicio;
    private String descripcion;
    //private String activo;
    
	public VistaFamiliaServicioIdioma(){}
	
	public VistaFamiliaServicioIdioma( String cod, String codFam, String fam, String codServ, String desc) {    
		codigo = cod;
        codigoFamilia = codFam;
        familia = fam;
        codigoServicio = codServ;
        descripcion = desc;
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
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(familia);    	
    	vector.add(codigo);
    	vector.add(codigoFamilia);
    	vector.add(familia);
    	vector.add(codigoServicio);
    	vector.add(descripcion);
   
    	
    	return vector;
    }
    
    public static VistaFamiliaServicioIdioma fromVector(Vector v){    	    	    	    	    	   
    	return new VistaFamiliaServicioIdioma ((String)v.get(0), (String)v.get(1),
    			(String)v.get(2), (String)v.get(3), (String)v.get(4));
    }
    
    public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "VistaFamiliaServicioIdioma:"+ this.codigo + ":" + this.codigoFamilia +":" + this.familia + ":"
    						+ this.codigoServicio + ":" + this.descripcion +":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("VistaFamiliaServicioIdioma:").length()-1, s.length());
    
    }
    
    public String toString() {
    	
    	return getProtocolListString();
    	
    }
}
