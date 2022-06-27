package crm.libraries.abm.entities;

import java.util.Vector;

public class EquiposSubFamilias implements ABMEntity {

	private String codigo;
    private String eqSubfamDescripcion;
    private boolean eqSubfamActivo;
    private String eqSubfamFamilia;
	
    public EquiposSubFamilias(){
    	
    }
    
    public String toString(){
		return eqSubfamDescripcion;
	}
    
	public String getEqSubfamDescripcion() {
		return eqSubfamDescripcion;
	}

	public void setEqSubfamDescripcion(String eqSubfamDescripcion) {
		this.eqSubfamDescripcion = eqSubfamDescripcion;
	}

	public boolean isEqSubfamActivo() {
		return eqSubfamActivo;
	}

	public void setEqSubfamActivo(boolean eqSubfamActivo) {
		this.eqSubfamActivo = eqSubfamActivo;
	}

	public String getEqSubfamFamilia() {
		return eqSubfamFamilia;
	}

	public void setEqSubfamFamilia(String eqSubfamFamilia) {
		this.eqSubfamFamilia = eqSubfamFamilia;
	}

	public void setCodigo(String codigo) {
		// TODO Auto-generated method stub
		this.codigo= codigo;
	}

	public String getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}

}
