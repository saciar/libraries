package crm.libraries.abm.entities;

import java.util.Vector;

public class Administrador implements ABMEntity{
	
	private String codigo;
    private String codUsuario;
    private String apellidoYNombre;
    private String categoria;
    private String fecing;
    private String nextelFlota;
    private String idNextel;
    private String activo;
	
    public Administrador(){

    }
    
	public Administrador(String cod,String codUsr, String nom, String cat, String fec, String nxtFlot,
						String nxtId, String act) {
		
        codigo = cod;
        codUsuario = codUsr;
        apellidoYNombre = nom;
        categoria = cat;
        fecing = fec;
        nextelFlota = nxtFlot;
        idNextel = nxtId;
        activo = act;
        
    }

	/**
	 * @return Returns the activo.
	 */
	public String getActivo() {
		return activo;
	}

	/**
	 * @param activo The activo to set.
	 */
	public void setActivo(String activo) {
		this.activo = activo;
	}

	/**
	 * @return Returns the apellidoYNombre.
	 */
	public String getApellidoYNombre() {
		return apellidoYNombre;
	}

	/**
	 * @param apellidoYNombre The apellidoYNombre to set.
	 */
	public void setApellidoYNombre(String apellidoYNombre) {
		this.apellidoYNombre = apellidoYNombre;
	}

	/**
	 * @return Returns the categoria.
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria The categoria to set.
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return Returns the codigo.
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo The codigo to set.
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return Returns the codUsuario.
	 */
	public String getCodUsuario() {
		return codUsuario;
	}

	/**
	 * @param codUsuario The codUsuario to set.
	 */
	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	/**
	 * @return Returns the fecing.
	 */
	public String getFecing() {
		return fecing;
	}

	/**
	 * @param fecing The fecing to set.
	 */
	public void setFecing(String fecing) {
		this.fecing = fecing;
	}

	/**
	 * @return Returns the idNextel.
	 */
	public String getIdNextel() {
		return idNextel;
	}

	/**
	 * @param idNextel The idNextel to set.
	 */
	public void setIdNextel(String idNextel) {
		this.idNextel = idNextel;
	}

	/**
	 * @return Returns the nextelFlota.
	 */
	public String getNextelFlota() {
		return nextelFlota;
	}

	/**
	 * @param nextelFlota The nextelFlota to set.
	 */
	public void setNextelFlota(String nextelFlota) {
		this.nextelFlota = nextelFlota;
	}

	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}

}
