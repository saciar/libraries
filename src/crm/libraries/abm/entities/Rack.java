package crm.libraries.abm.entities;

import java.util.Set;
import java.util.Vector;

public class Rack implements ABMEntity  {

	private String codigo;
    private String codRack;
    private String codEquipamiento;
    private String activo;

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public Rack() {

	}
  
   public Rack(String rack, String equipamiento) {
		super();
		this.codRack = rack;
		this.codEquipamiento = equipamiento;
	}

   public void setCodigo(String codigo) {
	   this.codigo=codigo;
   }

   public String getCodigo() {
	   return codigo;
   }

   public Vector toVector() {
	   throw new UnsupportedOperationException("Not supported yet.");
   }

   public String getCodRack() {
	   return codRack;
   }

   public void setCodRack(String codRack) {
	   this.codRack = codRack;
   }

   public String getCodEquipamiento() {
	   return codEquipamiento;
   }

   public void setCodEquipamiento(String codEquipamiento) {
	   this.codEquipamiento = codEquipamiento;
   }

}
