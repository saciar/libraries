package crm.libraries.abm.helper;

public class AgregadoHelper {
	private long id;
	private int modoIngreso;
	private int categoriaEvento;
	private int seguridadIngreso;
	private int tipoVenta;
	
	public int getTipoVenta() {
		return tipoVenta;
	}

	public void setTipoVenta(int tipoVenta) {
		this.tipoVenta = tipoVenta;
	}

	public long getId() {
		return id;
	}

	public int getModoIngreso() {
		return modoIngreso;
	}

	public void setModoIngreso(int modoIngreso) {
		this.modoIngreso = modoIngreso;
	}

	public int getSeguridadIngreso() {
		return seguridadIngreso;
	}

	public void setSeguridadIngreso(int seguridadIngreso) {
		this.seguridadIngreso = seguridadIngreso;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCategoriaEvento() {
		return categoriaEvento;
	}

	public void setCategoriaEvento(int categoriaEvento) {
		this.categoriaEvento = categoriaEvento;
	}
	
	
	
}
