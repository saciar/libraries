package crm.libraries.abm.entities;

import java.util.Vector;

public class MedioPago implements ABMEntity{
	
	public MedioPago() {
		// TODO Auto-generated constructor stub
	}

	public MedioPago(String cod, String desc,String descdet,String act) {        
        codigo = cod;
        descripcion = desc;
        descripcionDetallada = descdet;
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

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
	


	public String getDescripcionDetallada() {
		return descripcionDetallada;
	}

	public void setDescripcionDetallada(String descripcionDetallada) {
		this.descripcionDetallada = descripcionDetallada;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "MedioPago:" + this.codigo + 
    			":" + this.descripcion + 
    			":" + this.descripcionDetallada + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("MedioPago:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(descripcion);
    	vector.add(descripcionDetallada);
    	vector.add(activo);
    	
    	return vector;
    }
    
    public static MedioPago fromVector(Vector v){    	    	    	    	    	   
    	return new MedioPago((String)v.get(0), (String)v.get(1),(String)v.get(2),"S");
    }
    
    private String descripcion;
    private String codigo;
    private String descripcionDetallada;
    private String activo = "S";
}
