package crm.libraries.abm.entities;

import java.io.Serializable;
import java.util.Vector;

public interface ABMEntity extends Serializable{
    public void setCodigo(String codigo);
    public String getCodigo();
	public Vector toVector();
}
