package crm.libraries.abm.entities;

import java.util.Vector;

public class UnidadAdministrativa implements ABMEntity {
	
	public UnidadAdministrativa() {
		// TODO Auto-generated constructor stub
	}

	public UnidadAdministrativa(String cod, String codScs, String desc,
			String act) {
		codigo = cod;
		codigoSucursal = codScs;
		descripcion = desc;
		activo = act;
	}

	public void setCodigo(String cod) {
		codigo = cod;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigoSucursal(String nom) {
		codigoSucursal = nom;
	}

	public String getCodigoSucursal() {
		return codigoSucursal;
	}

	public void setDescripcion(String cat) {
		descripcion = cat;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public Vector toVector() {
		Vector vector = new Vector();

		vector.add(codigo);
		vector.add(descripcion);

		return vector;
	}

	public static UnidadComercial fromVector(Vector v) {
		return new UnidadComercial((String) v.get(0), (String) v.get(1), (String) v
				.get(2), (String) v.get(3), (String) v.get(4), "S");
	}

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "UnidadAdministrativa:" + this.codigo + 
    			":" + this.codigoSucursal + 
    			":" + this.descripcion + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("UnidadAdministrativa:").length()-1, s.length());
    	
    }
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString(){
		return this.descripcion;
	}

	private String codigo;
	private String codigoSucursal;
	private String descripcion;
	private String activo = "S";
	private String email;

}
