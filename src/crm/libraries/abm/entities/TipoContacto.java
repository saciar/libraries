package crm.libraries.abm.entities;

import java.util.Vector;

public class TipoContacto implements ABMEntity{
    private String codigo;
	private String descripcion;
    private String activo;
    
	public TipoContacto() {		
	}

	public TipoContacto(String codigo, String descripcion,String activo) {        
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.activo = activo;
    }

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
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

    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);
    	vector.add(descripcion);    
    	vector.add(activo);
    	
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
