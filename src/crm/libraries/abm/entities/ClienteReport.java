package crm.libraries.abm.entities;

public class ClienteReport {
	private String codigo;
	private String empresa;
	private boolean activo = true;
	
	public ClienteReport(String codigo, String empresa) {
		this.codigo = codigo;
		this.empresa = empresa;
	}
	
	public ClienteReport(String codigo, String empresa, char activo) {
		this.codigo = codigo;
		this.empresa = empresa;
		this.activo = (activo=='S');
	}

	public boolean isActivo() {
		return activo;
	}
	
	public boolean getActivo(){
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
    public boolean equals(Object o){
    	if (o == null)
    		return false;
    	if (!(o instanceof ClienteReport))
    		return false;
    	
    	return codigo.equals(((ClienteReport)o).codigo);
    }

	//@Override
	public int hashCode() {
		return codigo.hashCode();
	}
}
