package crm.libraries.abm.entities;

import java.util.Vector;

public class UnidadComercial implements ABMEntity {
	
	public UnidadComercial() {
		// TODO Auto-generated constructor stub
	}

	public UnidadComercial(String cod, String codScs, String desc, String codSp,
			String obj,String act) {
		codigo = cod;
		codigoSucursal = codScs;
		descripcion = desc;
		codigoSupervisor = codSp;
		objetivoGlobal = obj;
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

	public void setCodigoSupervisor(String fac) {
		codigoSupervisor = fac;
	}

	public String getCodigoSupervisor() {
		return codigoSupervisor;
	}

	public void setObjetivoGlobal(String flot) {
		objetivoGlobal = flot;
	}

	public String getObjetivoGlobal() {
		return objetivoGlobal;
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
		vector.add(objetivoGlobal);
		vector.add(descripcion);

		return vector;
	}

	public static UnidadComercial fromVector(Vector v) {
		return new UnidadComercial((String) v.get(0), (String) v.get(1), (String) v
				.get(2), (String) v.get(3), (String) v.get(4), "S");
	}

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "UnidadComercial:" + this.codigo + 
    			":" + this.codigoSucursal + 
    			":" + this.descripcion + 
    			":" + this.codigoSupervisor + 
    			":" + this.objetivoGlobal + 
    			":" + this.activo + ":"; 
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("UnidadComercial:").length()-1, s.length());
    	
    }
	
	private String codigo;
	private String codigoSucursal;
	private String descripcion;
	private String codigoSupervisor;
	private String objetivoGlobal;
	private String activo = "S";
}
