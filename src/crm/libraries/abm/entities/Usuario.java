package crm.libraries.abm.entities;

import java.awt.Image;
import java.util.Set;
import java.util.Vector;

import com.mysql.jdbc.Blob;
/**
 * @hibernate.class table="MST_USUARIOS"
 */
public class Usuario implements ABMEntity{
	private String codigo;
	private String loginName;
	private String password;
	private String apellidoYNombre;
	private String perfil;
	private String email;
	private String activo;
	private Integer limite_descuento;
	private byte[] foto;

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Integer getLimite_descuento() {
		return limite_descuento;
	}

	public void setLimite_descuento(Integer limite_descuento) {
		this.limite_descuento = limite_descuento;
	}

	public Usuario() {		
	}

	public Usuario (String cod, String log, String pass, String nom, String perf,String email,
			String act) {
		codigo = cod;		
		loginName = log;
		password = pass;
		apellidoYNombre = nom;
		perfil = perf;
		activo = act;
	}

	/**
	 * @hibernate.id column="us_codusuario" length="100" not-null="true"
	 */
	public String getCodigo(){
		return codigo;
	}	
	public void setCodigo(String cod){
		codigo = cod;
	}
	



	/**
	 * @hibernate.property column="login_name" length="100" not-null="true"
	 */
	public String getLoginName(){
		return loginName;
	}   
	public void setLoginName(String log){
		loginName = log;
	}

    


	/**
	 * @hibernate.property column="password" length="100" not-null="true"
	 */
	public String getPassword(){
		return password;
	}  
	public void setPassword(String pass){
		password = pass;
	}




	/**
	 * @hibernate.property column="apynom" length="100" not-null="true"
	 */
	public String getApellidoYNombre(){
		return apellidoYNombre;
	}
	public void setApellidoYNombre(String nom){
		apellidoYNombre = nom;
	}


	

	/**
	 * @hibernate.property column="us_perfil" length="100" not-null="true"
	 */
	public String getPerfil(){
		return perfil;
	}  
	public void setPerfil(String perf){
		perfil = perf;
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
	 * @hibernate.property  column="email" length="100" not-null="true"
	 */	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	 /**
     * @hibernate.set table="MST_USR_ACCESOS" lazy="false" cascade="save-update"
     * @hibernate.collection-key column="ua_codusuario"
     * @hibernate.collection-many-to-many column="ua_codacceso" class="crm.libraries.abm.entities.Acceso"
     */
	

	
	public Vector toVector() {
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(apellidoYNombre); 
    	vector.add(email);  
    	
    	return vector;
	}

	public String getProtocolAddString() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getProtocolListString() {
		// TODO Auto-generated method stub
		return null;
	}


}
