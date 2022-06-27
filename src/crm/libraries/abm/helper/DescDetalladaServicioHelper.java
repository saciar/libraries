package crm.libraries.abm.helper;

public class DescDetalladaServicioHelper {
	private long id;
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String toString(){
		return "[Descripcion] " + descripcion + " id. " + id;
	}
}
