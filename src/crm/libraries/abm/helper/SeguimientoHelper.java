package crm.libraries.abm.helper;

public class SeguimientoHelper {
	private long id;
	private String fechaYHora;
	private String codigoUsuario;
    private String codigoSeguimiento;
    private String codigoSeguimientoRespuesta;
    private String observaciones;
	
    public String getCodigoSeguimiento() {
		return codigoSeguimiento;
	}
	public void setCodigoSeguimiento(String codigoSeguimiento) {
		this.codigoSeguimiento = codigoSeguimiento;
	}
	public String getCodigoSeguimientoRespuesta() {
		return codigoSeguimientoRespuesta;
	}
	public void setCodigoSeguimientoRespuesta(String codigoSeguimientoRespuesta) {
		this.codigoSeguimientoRespuesta = codigoSeguimientoRespuesta;
	}
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getFechaYHora() {
		return fechaYHora;
	}
	public void setFechaYHora(String fechaYHora) {
		this.fechaYHora = fechaYHora;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
}
