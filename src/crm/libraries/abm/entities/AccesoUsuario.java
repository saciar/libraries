package crm.libraries.abm.entities;

import java.util.Vector;

public class AccesoUsuario implements ABMEntity {
	
	public AccesoUsuario() {
		// TODO Auto-generated constructor stub
	}

	public AccesoUsuario(String codUs, String codAcc,String activo ){
		codigoUsuario = codUs;
		codigoAcceso = codAcc;
		this.activo = activo;
	}
	
	public String getCodigoAcceso() {
		return codigoAcceso;
	}
	
	public void setCodigoAcceso(String codigoAcceso) {
		this.codigoAcceso = codigoAcceso;
	}
	
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	

    public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}
	
	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "AccesoUsuario:" + this.codigoUsuario + 
    			":" + this.codigoAcceso + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("AccesoUsuario:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigoUsuario);
    	vector.add(codigoAcceso);   
    	vector.add(activo);   
    	
    	return vector;
    }
    
    public static AccesoUsuario fromVector(Vector v){    	    	    	    	    	   
    	return new AccesoUsuario((String)v.get(0), (String)v.get(1),"S");
    }
    
    public void setCodigo(String codigo){}
    public String getCodigo(){return null;}
	
	private String codigoUsuario;
	private String codigoAcceso;
	private String activo;
}
