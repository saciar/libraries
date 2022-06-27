package crm.libraries.abm.entities;

import java.util.Vector;

public class TipoArmado implements ABMEntity{
	private String codigo;
	private String descripcion;    
    private String activo;
	
	public TipoArmado() {
		this.codigo="0";
	}
	
	public TipoArmado(String cod, String desc,String act) {        
        codigo = cod;
        descripcion = desc;
        activo = act;
    }

    public TipoArmado(String codigo, String descripcion) {
    	this();
		this.codigo = codigo;
		this.descripcion = descripcion;
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
    	
    	vector.add(this.codigo);
    	vector.add(this.descripcion);
    	vector.add(this.activo);
    	
    	return vector;
    }
        

}
