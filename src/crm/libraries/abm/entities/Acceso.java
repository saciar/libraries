package crm.libraries.abm.entities;

import java.util.Set;
import java.util.Vector;
/**
 * @hibernate.class table="MST_ACCESOS"
 */
public class Acceso implements ABMEntity{
    private String descripcion;
    private String codigo;
    private String activo;
    
	public Acceso() {		
	}

	public Acceso(String cod, String desc,String activo) {        
        codigo = cod;
        descripcion = desc;
        this.activo = activo;
    }

	
	/**
	 * @hibernate.id column="ax_codacceso" length="100" not-null="true"
	 */
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String cod){
        codigo = cod;
    }
    

    
	/**
	 * @hibernate.property column="descripacceso" length="100" not-null="true"
	 */
    public String getDescripcion(){
        return descripcion;
    }   
    public void setDescripcion(String desc){
        descripcion = desc;
    }
    


	/**
	 * @hibernate.property column="activo" length="100" not-null="true"
	 */
    public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	

	

    /**
     * @hibernate.set table="MST_USR_ACCESOS" lazy="false" cascade="save-update" inverse="true"
     * @hibernate.collection-key column="ua_codacceso"
     * @hibernate.collection-many-to-many column="ua_codusuario" class="crm.libraries.abm.entities.Usuario"
     */


	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "Acceso:" + this.codigo + 
    			":" + this.descripcion + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("Acceso:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(descripcion);    
    	vector.add(activo);
    	
    	return vector;
    }
    
    public static Acceso fromVector(Vector v){    	    	    	    	    	   
    	return new Acceso((String)v.get(0), (String)v.get(1),"S");
    }
    

}
