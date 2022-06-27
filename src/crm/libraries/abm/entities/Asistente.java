package crm.libraries.abm.entities;

import java.util.Vector;

public class Asistente implements ABMEntity{
	
	public Asistente() {
		// TODO Auto-generated constructor stub
	}

	public Asistente (String cod, String nom, String mod,String act) {
		codigo = cod;		
		apellidoYNombre = nom;
		modalidad = mod;
		activo = act;
	}

	public void setCodigo(String cod){
		codigo = cod;
	}
	
	public String getCodigo(){
		return codigo;
	}

	public void setApellidoYNombre(String nom){
		apellidoYNombre = nom;
	}

	public String getApellidoYNombre(){
		return apellidoYNombre;
	}

	public void setModalidad(String mod){
		modalidad = mod;
	}

	public String getModalidad(){
		return modalidad;
	}  


    public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}
	
	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "Asistente:" + this.codigo + 
    			":" + this.apellidoYNombre + 
    			":" + this.modalidad + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("Asistente:").length()-1, s.length());
    	
    }

	public Vector toVector(){
		Vector vector = new Vector();

		vector.add(codigo);
		vector.add(apellidoYNombre);
		vector.add(modalidad);
		
		return vector;
	}

	public static Asistente fromVector(Vector v){    	    	    	    	    	   
		return new Asistente((String)v.get(0), (String)v.get(1), (String)v.get(2), "S");
	}

	private String codigo;
	private String apellidoYNombre;
	private String modalidad;
	private String activo;
}
