package crm.libraries.report;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Evento {
	private String nombreFantasia;
	private String nombreEvento;
	private long numeroPresupuesto;
	private String lugarEvento;
	private String tipoEvento;
	private String fechaInicialEvento;
	private String fechaFinalEvento;	
	private long cantidadSalas;
	private String fechaInstalacion;
	private String unidad;
	private String vendedor;
	//private String horario;
	private double rentabilidad;
	private String origen;
	//private String operadoresACargo;
	private long sinPrecio;
	private long precioModificado;
	private long subcontrataciones;
	private double monto;
	private boolean cobrado;
	private boolean facturado;
	private boolean confirmado;
	private boolean os;
	private boolean of;
	private boolean adelanto;
	private boolean adelantado;
	private boolean nuevo;
	private int descuento;
	
	private EventoSala[] salas;
	private EventoOperador[] operadores;
	
	/**
	 * @return Returns the cantidadSalas.
	 */
	public long getCantidadSalas() {
		return cantidadSalas;
	}

	/**
	 * @param cantidadSalas The cantidadSalas to set.
	 */
	public void setCantidadSalas(long cantidadSalas) {
		this.cantidadSalas = cantidadSalas;
	}

	/**
	 * @return Returns the cobrado.
	 */
	public boolean getCobrado() {
		return cobrado;
	}

	/**
	 * @param cobrado The cobrado to set.
	 */
	public void setCobrado(boolean cobrado) {
		this.cobrado = cobrado;
	}

	/**
	 * @return Returns the facturado.
	 */
	public boolean isFacturado() {
		return facturado;
	}

	/**
	 * @param facturado The facturado to set.
	 */
	public void setFacturado(boolean facturado) {
		this.facturado = facturado;
	}

	/**
	 * @return Returns the fechaInstalacion.
	 */
	public String getFechaInstalacion() {
		return fechaInstalacion;
	}

	/**
	 * @param fechaInstalacion The fechaInstalacion to set.
	 */
	public void setFechaInstalacion(String fechaInstalacion) {
		this.fechaInstalacion = fechaInstalacion;
	}

	/**
	 * @return Returns the lugarEvento.
	 */
	public String getLugarEvento() {
		return lugarEvento;
	}

	/**
	 * @param lugarEvento The lugarEvento to set.
	 */
	public void setLugarEvento(String lugarEvento) {
		this.lugarEvento = lugarEvento;
	}

	/**
	 * @return Returns the monto.
	 */
	public double getMonto() {
		return monto;
	}

	/**
	 * @param monto The monto to set.
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * @return Returns the nombreEvento.
	 */
	public String getNombreEvento() {
		return nombreEvento;
	}

	/**
	 * @param nombreEvento The nombreEvento to set.
	 */
	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	/**
	 * @return Returns the nombreFantasia.
	 */
	public String getNombreFantasia() {
		return nombreFantasia;
	}

	/**
	 * @param nombreFantasia The nombreFantasia to set.
	 */
	public void setNombreFantasia(String nombreFantasia) {
		this.nombreFantasia = nombreFantasia;
	}

	/**
	 * @return Returns the numeroPresupuesto.
	 */
	public long getNumeroPresupuesto() {
		return numeroPresupuesto;
	}

	/**
	 * @param numeroPresupuesto The numeroPresupuesto to set.
	 */
	public void setNumeroPresupuesto(long numeroPresupuesto) {
		this.numeroPresupuesto = numeroPresupuesto;
	}

	/**
	 * @return Returns the precioModificado.
	 */
	public long getPrecioModificado() {
		return precioModificado;
	}

	/**
	 * @param precioModificado The precioModificado to set.
	 */
	public void setPrecioModificado(long precioModificado) {
		this.precioModificado = precioModificado;
	}

	/**
	 * @return Returns the salas.
	 */
	public EventoSala[] getSalas() {
		return salas;
	}

	/**
	 * @param salas The salas to set.
	 */
	public void setSalas(EventoSala[] salas) {
		this.salas = salas;
	}

	/**
	 * @return Returns the sinPrecio.
	 */
	public long getSinPrecio() {
		return sinPrecio;
	}

	/**
	 * @param sinPrecio The sinPrecio to set.
	 */
	public void setSinPrecio(long sinPrecio) {
		this.sinPrecio = sinPrecio;
	}

	/**
	 * @return Returns the subcontrataciones.
	 */
	public long getSubcontrataciones() {
		return subcontrataciones;
	}

	/**
	 * @param subcontrataciones The subcontrataciones to set.
	 */
	public void setSubcontrataciones(long subcontrataciones) {
		this.subcontrataciones = subcontrataciones;
	}

	/**
	 * @return Returns the tipoEvento.
	 */
	public String getTipoEvento() {
		return tipoEvento;
	}

	/**
	 * @param tipoEvento The tipoEvento to set.
	 */
	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	/**
	 * @return Returns the unidad.
	 */
	public String getUnidad() {
		return unidad;
	}

	/**
	 * @param unidad The unidad to set.
	 */
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	/**
	 * @return Returns the vendedor.
	 */
	public String getVendedor() {
		return vendedor;
	}

	/**
	 * @param vendedor The vendedor to set.
	 */
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	/**
	 * @return Returns the horario.
	 */
	/*public String getHorario() {
		return horario;
	}*/

	/**
	 * @param horario The horario to set.
	 */
	/*public void setHorario(String horario) {
		this.horario = horario;
	}*/

	/**
	 * @return Returns the operadoresACargo.
	 */
	/*public String getOperadoresACargo() {
		return operadoresACargo;
	}*/

	/**
	 * @param operadoresACargo The operadoresACargo to set.
	 */
	/*public void setOperadoresACargo(String operadoresACargo) {
		this.operadoresACargo = operadoresACargo;
	}*/

	/**
	 * @return Returns the origen.
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen The origen to set.
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return Returns the rentabilidad.
	 */
	public double getRentabilidad() {
		return rentabilidad;
	}

	/**
	 * @param rentabilidad The rentabilidad to set.
	 */
	public void setRentabilidad(double rentabilidad) {
		this.rentabilidad = rentabilidad;
	}
	
	/**
	 * @return Returns the fechaFinalEvento
	 */
	public String getFechaFinalEvento() {
		return fechaFinalEvento;
	}

	/**
	 * @param fechaFinalEvento The fechaFinalEvento
	 */
	public void setFechaFinalEvento(String fechaFinalEvento) {
		this.fechaFinalEvento = fechaFinalEvento;
	}
	
	/**
	 * @return Returns the fechaInicialEvento
	 */
	public String getFechaInicialEvento() {
		return fechaInicialEvento;
	}
	
	/**
	 * @param fechaInicialEvento The fechaInicialEvento
	 */
	public void setFechaInicialEvento(String fechaInicialEvento) {
		this.fechaInicialEvento = fechaInicialEvento;
	}

	public EventoOperador[] getOperadores() {
		return operadores;
	}

	public void setOperadores(EventoOperador[] operadores) {
		this.operadores = operadores;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	/**
	 * @return Returns the descuento.
	 */
	public int getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento The descuento to set.
	 */
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	/**
	 * @return Returns the adelantado.
	 */
	public boolean isAdelantado() {
		return adelantado;
	}

	/**
	 * @param adelantado The adelantado to set.
	 */
	public void setAdelantado(boolean adelantado) {
		this.adelantado = adelantado;
	}

	/**
	 * @return Returns the adelanto.
	 */
	public boolean isAdelanto() {
		return adelanto;
	}

	/**
	 * @param adelanto The adelanto to set.
	 */
	public void setAdelanto(boolean adelanto) {
		this.adelanto = adelanto;
	}

	/**
	 * @return Returns the confirmado.
	 */
	public boolean isConfirmado() {
		return confirmado;
	}

	/**
	 * @param confirmado The confirmado to set.
	 */
	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}

	/**
	 * @return Returns the of.
	 */
	public boolean isOf() {
		return of;
	}

	/**
	 * @param of The of to set.
	 */
	public void setOf(boolean of) {
		this.of = of;
	}

	/**
	 * @return Returns the os.
	 */
	public boolean isOs() {
		return os;
	}

	/**
	 * @param os The os to set.
	 */
	public void setOs(boolean os) {
		this.os = os;
	}
}
