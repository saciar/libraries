package crm.libraries.abm.entities;

import java.util.Vector;

public class UnidadBonus implements ABMEntity{
	
	public UnidadBonus() {
		// TODO Auto-generated constructor stub
	}

	public UnidadBonus (String cod, String niv, String obj, String bon,String act){
		codigo = cod;
		nivel = niv;
		objetivo = obj;
		bonusEquipo = bon;
		activo = act;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNivel() {
		return nivel;
	}
	
	public void setNivel(String descrip) {
		this.nivel = descrip;
	}
	
	public String getObjetivo() {
		return objetivo;
	}
	
	public void setObjetivo(String var) {
		this.objetivo = var;
	}
	
	public String getBonusEquipo() {
		return bonusEquipo;
	}

	public void setBonusEquipo(String bonusEquipo) {
		this.bonusEquipo = bonusEquipo;
	}
	
    public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}
	
	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "UnidadBonus:" + this.codigo + 
    			":" + this.nivel + 
    			":" + this.objetivo + 
    			":" + this.bonusEquipo + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("UnidadBonus:").length()-1, s.length());
    	
    }
     
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(nivel);
    	vector.add(objetivo);
    	vector.add(activo);
    	
    	return vector;
    }
    
    public static UnidadBonus fromVector(Vector v){    	    	    	    	    	   
    	return new UnidadBonus((String)v.get(0), (String)v.get(1), 
    			(String)v.get(2), (String)v.get(3),"S");
    }
	
	private String codigo;
	private String nivel;
	private String objetivo;
	private String bonusEquipo;
	private String activo = "S";
}
