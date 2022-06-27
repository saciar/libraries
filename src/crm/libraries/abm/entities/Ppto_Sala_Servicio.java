package crm.libraries.abm.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @hibernate.class table="TX_PPTO_SALAS_SERVICIOS"
 */
public class Ppto_Sala_Servicio implements Serializable {
	
	private long id;
	private Ppto_Sala sala;
	private String orden;
	private String cantidad;
	private Servicio servicio;
	private ModalidadContrat modalidad;
	private String dias;
	
	private String precioDeLista;
	private String descuento;
	private String precioDescuento;
	private String fechaCreacion;
	
	private String detalle; 
	private String modificado;
	
	//private Set<Ppto_Sala_Servicio_Accesorio> accesorios;
	
	public String getModificado() {
		return modificado;
	}

	public void setModificado(String modificado) {
		this.modificado = modificado;
	}

	private Set<Ppto_Sala_Servicio_Desc_Detallada> descripcionDetallada;

	public Ppto_Sala_Servicio(){}
	
	public Ppto_Sala_Servicio(String cantidad, String dias, ModalidadContrat modalidad, String orden, Ppto_Sala sala, Servicio servicio, String fechaCreacion) {
		this.cantidad = cantidad;
		this.dias = dias;
		this.modalidad = modalidad;
		this.orden = orden;
		this.sala = sala;
		this.servicio = servicio;
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @hibernate.property column="ppto_ss_cantidad"
	 * @return
	 */
	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @hibernate.property column="ppto_ss_dias"
	 * @return
	 */
	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}

	/**
	 * @hibernate.id column="ppto_ss_id" generator-class="increment"
	 * @return
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @hibernate.many-to-one column="ppto_ss_modalidad" insert="false" update="false"
	 * @return
	 */
	public ModalidadContrat getModalidad() {
		return modalidad;
	}

	public void setModalidad(ModalidadContrat modalidad) {
		this.modalidad = modalidad;
	}

	/**
	 * @hibernate.property column="ppto_ss_orden"
	 * @return
	 */
	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	/**
	 * @hibernate.many-to-one column="ppto_ss_pls"
	 * @return
	 */
	public Ppto_Sala getSala() {
		return sala;
	}

	public void setSala(Ppto_Sala salaDelPresupuesto) {
		this.sala = salaDelPresupuesto;
	}

	/**
	 * @hibernate.many-to-one column="ppto_ss_servicio" insert="false" update="false"
	 * @return
	 */
	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
	/**
	 * @hibernate.set cascade="none"
	 * @hibernate.collection-key column=?ppto_ssa_plsa? 
	 * @hibernate.collection-one-to-many class="crm.libraries.abm.entities.Ppto_Sala_Servicio_Accesorio"
	 */
	/*public Set<Ppto_Sala_Servicio_Accesorio> getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(Set<Ppto_Sala_Servicio_Accesorio> accesorios) {
		this.accesorios = accesorios;
	}*/

	/**
	 * @hibernate.property column="ppto_ss_descuento"
	 * @return
	 */
	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	/**
	 * @hibernate.property column="ppto_ss_preciolista"
	 * @return
	 */
	public String getPrecioDeLista() {
		return precioDeLista;
	}

	public void setPrecioDeLista(String precioDeLista) {
		this.precioDeLista = precioDeLista;
	}

	/**
	 * @hibernate.property column="ppto_ss_preciodto"
	 * @return
	 */
	public String getPrecioDescuento() {
		return precioDescuento;
	}

	public void setPrecioDescuento(String precioDescuento) {
		this.precioDescuento = precioDescuento;
	}

	/*public void addAccesorio( Ppto_Sala_Servicio_Accesorio accesorio ) {
		
		if ( this.accesorios == null )
			this.accesorios = new HashSet();
		
		this.accesorios.add( accesorio );
		
		accesorio.setServicioDeSala(this);
		
	}*/
	
	public void addDescDetallada( Ppto_Sala_Servicio_Desc_Detallada desc ) {
		
		if ( this.descripcionDetallada == null )
			this.descripcionDetallada = new HashSet<Ppto_Sala_Servicio_Desc_Detallada>();
		
		this.descripcionDetallada.add( desc );
		
		desc.setServicio(this);
		
	}

	/**
	 * @hibernate.property column="ppto_ss_fecappend"
	 * @return
	 */
	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Set<Ppto_Sala_Servicio_Desc_Detallada> getDescripcionDetallada() {
		return descripcionDetallada;
	}

	public void setDescripcionDetallada(
			Set<Ppto_Sala_Servicio_Desc_Detallada> descripcionDetallada) {
		this.descripcionDetallada = descripcionDetallada;
	}
	
}
