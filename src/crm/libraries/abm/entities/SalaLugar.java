package crm.libraries.abm.entities;

import java.util.Vector;

public class SalaLugar implements ABMEntity {
	
	public SalaLugar() {
		// TODO Auto-generated constructor stub
	}

	public SalaLugar(String cod, String codLug, String desc,
					 String largo, String ancho, String altura,String activo, String cap){
		codigoSala = cod;
		codigoLugar = codLug;
		descripcion = desc;
		this.altura = altura;
		this.ancho = ancho;
		this.largo = largo;
		this.activo = activo;
		capacidad =cap;
	}
	
	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "SalaLugar:" + this.codigoSala + 
    			":" + this.codigoSala + 
    			":" + this.codigoLugar + 
    			":" + this.descripcion + 
    			":" + this.largo + 
    			":" + this.ancho + 
    			":" + this.altura + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("SalaLugar:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();    	
    	
		vector.add(codigo);
    	vector.add(codigoLugar);
    	vector.add(descripcion);
    	
    	return vector;
    }
    
    public static SalaLugar fromVector(Vector v){    	    	    	    	    	   
    	return new SalaLugar((String)v.get(0), (String)v.get(1), 
    			(String)v.get(2), (String)v.get(3), 
    			(String)v.get(4), (String)v.get(5), (String)v.get(6),"S");
    }
    
    public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoLugar() {
		return codigoLugar;
	}

	public void setCodigoLugar(String codigoLugar) {
		this.codigoLugar = codigoLugar;
	}

	public String getCodigoSala() {
		return codigoSala;
	}

	public void setCodigoSala(String codigoSala) {
		this.codigoSala = codigoSala;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
    
	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getAncho() {
		return ancho;
	}

	public void setAncho(String ancho) {
		this.ancho = ancho;
	}

	public String getLargo() {
		return this.largo;
	}

	public void setLargo(String largo) {
		this.largo = largo;
	}
	
    public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}
	
    private String codigo;
	private String codigoSala;
	private String codigoLugar;
	private String descripcion;
	private String largo;
	private String ancho;
	private String altura;
	private String activo = "S";
	private String capacidad;
	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	
	public String toString(){
		return this.descripcion;
	}
}
