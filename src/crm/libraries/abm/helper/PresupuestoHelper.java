package crm.libraries.abm.helper;

import crm.libraries.abm.entities.Ppto_Agregado;
import crm.libraries.abm.entities.Ppto_GastoAsistentes;
import crm.libraries.abm.entities.Ppto_GastoHoteleria;
import crm.libraries.abm.entities.Ppto_GastoOperador;
import crm.libraries.abm.entities.Ppto_GastoRepresentacion;
import crm.libraries.abm.entities.Ppto_GastoSC;
import crm.libraries.abm.entities.Ppto_GastoVarios;
import crm.libraries.abm.entities.Ppto_GastoViaticos;
import crm.libraries.abm.entities.Presupuesto;


public class PresupuestoHelper {
	
	
	private SalaHelper[] salas;
	private GastoContratHelper[] gastosContratHelper;
	private Ppto_GastoSC[] gastosSubcontratados;
	private Ppto_GastoOperador[] gastosOperador;
	private Ppto_GastoRepresentacion[] gastosRepresentacion;
	private Ppto_GastoAsistentes[] gastosAsistentes;
	private Ppto_GastoViaticos[] gastosViaticos;
	private Ppto_GastoHoteleria[] gastosHoteleria;
	private Ppto_GastoVarios[] gastosVarios;
	private AgregadoHelper agregado;
	private AdelantoHelper adelanto;
	private ContactoHelper contacto;
	private ContactoLugarHelper contactoLugar;
	private RentabilidadHelper rentabilidad;
	private EstadoActualHelper estado;
	private FacturacionHelper facturacion;
	private PagoHelper pago;
	
	private long numeroDePresupuesto;
	private String codigoUsuario;
	private String codigoVendedor;
	private String codigoCliente;
	private String observacionesDelCliente;
	private String fechaDeInicio;
	private String fechaDeFinalizacion;
	private String fechaDeInstalacion;
	private String totalDePersonas;
	private String nombreDelEvento;
	private String codigoLugarDelEvento;
	private String observacionesDelEvento;
	private String codigoTipoDeEvento;
	private String codigoTipoDeLugarDelEvento;
	private String codigoUniforme;
	private String codigoReferencia;
	private String codigoEncabezado;
	private String codigoFormaPago;
	private String codigoCondPago;
	private String codigoValidez;
	private String codigoTipoPpto;
	private String codigoPeriodo;
	private String codigoMoneda;
	private String codigoCancelacion;
	private Double cotizacion;
	private String responsableEvento;
	private String responsableTel;
	private String responsableEmail;
	private String responsableNextelFlota;
	private String responsableNextelId;
	private String activo;
	
	public String toString(){
		String result = "numero: "+ numeroDePresupuesto+"\n";
		result += "codigoUsuario: "+ codigoUsuario +"\n";
		result += "codigoVendedor: "+ codigoVendedor +"\n";
		result += "codigoCliente: "+ codigoCliente +"\n";
		result += "observacionesDelCliente: "+ observacionesDelCliente +"\n";
		result += "fechaDeInicio: "+fechaDeInicio  +"\n";
		result += "fechaDeFinalizacion: "+fechaDeFinalizacion  +"\n";
		result += "fechaDeInstalacion: "+ fechaDeInstalacion +"\n";
		result += "totalDePersonas: "+ totalDePersonas +"\n";
		result += "nombreDelEvento: "+ nombreDelEvento +"\n";
		result += "codigoLugarDelEvento: "+ codigoLugarDelEvento +"\n";
		result += "observacionesDelEvento: "+ observacionesDelEvento +"\n";
		result += "codigoTipoDeEvento: "+ observacionesDelEvento +"\n";
		result += "codigoTipoDeLugarDelEvento: "+ codigoTipoDeLugarDelEvento +"\n";
		result += "codigoUniforme: "+ codigoUniforme +"\n";
		result += "Responsable evento: "+ responsableEvento +"\n";
		result += "Responsable telefono: "+ responsableTel +"\n";
		result += "Responsable email: "+ responsableEmail +"\n";
		result += "Responsable flota: "+ responsableNextelFlota +"\n";
		result += "Responsable id: "+ responsableNextelId +"\n";
		result += "Accesorios:\n\n";
		
		if (salas != null){
			for (SalaHelper sala: salas) {
				result += sala.toString();
			}
		}
		
		return result;
	}
	
	public PresupuestoHelper(){
		
	}
	
	public boolean isNew(){
		return numeroDePresupuesto == 0;
	}
	
	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getCodigoLugarDelEvento() {
		return codigoLugarDelEvento;
	}

	public void setCodigoLugarDelEvento(String codigoLugarDelEvento) {
		this.codigoLugarDelEvento = codigoLugarDelEvento;
	}

	public String getCodigoReferencia() {
		return codigoReferencia;
	}

	public void setCodigoReferencia(String codigoReferencia) {
		this.codigoReferencia = codigoReferencia;
	}

	public String getCodigoTipoDeEvento() {
		return codigoTipoDeEvento;
	}

	public void setCodigoTipoDeEvento(String codigoTipoDeEvento) {
		this.codigoTipoDeEvento = codigoTipoDeEvento;
	}

	public String getCodigoTipoDeLugarDelEvento() {
		return codigoTipoDeLugarDelEvento;
	}

	public void setCodigoTipoDeLugarDelEvento(String codigoTipoDeLugarDelEvento) {
		this.codigoTipoDeLugarDelEvento = codigoTipoDeLugarDelEvento;
	}

	public String getCodigoUniforme() {
		return codigoUniforme;
	}

	public void setCodigoUniforme(String codigoUniforme) {
		this.codigoUniforme = codigoUniforme;
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(String codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public String getFechaDeFinalizacion() {
		return fechaDeFinalizacion;
	}

	public void setFechaDeFinalizacion(String fechaDeFinalizacion) {
		this.fechaDeFinalizacion = fechaDeFinalizacion;
	}

	public String getFechaDeInicio() {
		return fechaDeInicio;
	}

	public void setFechaDeInicio(String fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}

	public String getFechaDeInstalacion() {
		return fechaDeInstalacion;
	}

	public void setFechaDeInstalacion(String fechaDeInstalacion) {
		this.fechaDeInstalacion = fechaDeInstalacion;
	}

	public String getNombreDelEvento() {
		return nombreDelEvento;
	}

	public void setNombreDelEvento(String nombreDelEvento) {
		this.nombreDelEvento = nombreDelEvento;
	}

	public String getObservacionesDelCliente() {
		return observacionesDelCliente;
	}

	public void setObservacionesDelCliente(String observacionesDelCliente) {
		this.observacionesDelCliente = observacionesDelCliente;
	}

	public String getObservacionesDelEvento() {
		return observacionesDelEvento;
	}

	public void setObservacionesDelEvento(String observacionesDelEvento) {
		this.observacionesDelEvento = observacionesDelEvento;
	}

	public SalaHelper[] getSalas() {
		return salas;
	}

	public void setSalas(SalaHelper[] salas) {
		this.salas = salas;
	}

	public String getTotalDePersonas() {
		return totalDePersonas;
	}

	public void setTotalDePersonas(String totalDePersonas) {
		this.totalDePersonas = totalDePersonas;
	}

	public long getNumeroDePresupuesto() {
		return numeroDePresupuesto;
	}

	public void setNumeroDePresupuesto(long numeroDePresupuesto) {
		this.numeroDePresupuesto = numeroDePresupuesto;
	}

	public GastoContratHelper[] getGastosContratHelper() {
		return gastosContratHelper;
	}

	public void setGastosContratHelper(GastoContratHelper[] gastosContratHelper) {
		this.gastosContratHelper = gastosContratHelper;
	}

	public Ppto_GastoAsistentes[] getGastosAsistentes() {
		return gastosAsistentes;
	}

	public void setGastosAsistentes(Ppto_GastoAsistentes[] gastosAsistentes) {
		this.gastosAsistentes = gastosAsistentes;
	}

	public Ppto_GastoHoteleria[] getGastosHoteleria() {
		return gastosHoteleria;
	}

	public void setGastosHoteleria(Ppto_GastoHoteleria[] gastosHoteleria) {
		this.gastosHoteleria = gastosHoteleria;
	}

	public Ppto_GastoOperador[] getGastosOperador() {
		return gastosOperador;
	}

	public void setGastosOperador(Ppto_GastoOperador[] gastosOperador) {
		this.gastosOperador = gastosOperador;
	}

	public Ppto_GastoRepresentacion[] getGastosRepresentacion() {
		return gastosRepresentacion;
	}

	public void setGastosRepresentacion(
			Ppto_GastoRepresentacion[] gastosRepresentacion) {
		this.gastosRepresentacion = gastosRepresentacion;
	}

	public Ppto_GastoVarios[] getGastosVarios() {
		return gastosVarios;
	}

	public void setGastosVarios(Ppto_GastoVarios[] gastosVarios) {
		this.gastosVarios = gastosVarios;
	}

	public Ppto_GastoViaticos[] getGastosViaticos() {
		return gastosViaticos;
	}

	public void setGastosViaticos(Ppto_GastoViaticos[] gastosViaticos) {
		this.gastosViaticos = gastosViaticos;
	}

	public EstadoActualHelper getEstado() {
		return estado;
	}

	public void setEstado(EstadoActualHelper estado) {
		this.estado = estado;
	}

	public ContactoHelper getContacto(){
		return contacto;
	}
	
	public void setContacto(ContactoHelper cont){
		contacto = cont;
	}

	public FacturacionHelper getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(FacturacionHelper facturacion) {
		this.facturacion = facturacion;
	}

	/*public SeguimientoHelper getSeguimiento() {
		return seguimiento;
	}

	public void setSeguimiento(SeguimientoHelper seguimiento) {
		this.seguimiento = seguimiento;
	}*/

	public PagoHelper getPago() {
		return pago;
	}

	public void setPago(PagoHelper pago) {
		this.pago = pago;
	}

	public RentabilidadHelper getRentabilidad() {
		return rentabilidad;
	}

	public void setRentabilidad(RentabilidadHelper rentabilidad) {
		this.rentabilidad = rentabilidad;
	}

	public String getResponsableEmail() {
		return responsableEmail;
	}

	public void setResponsableEmail(String responsableEmail) {
		this.responsableEmail = responsableEmail;
	}

	public String getResponsableEvento() {
		return responsableEvento;
	}

	public void setResponsableEvento(String responsableEvento) {
		this.responsableEvento = responsableEvento;
	}

	public String getResponsableNextelFlota() {
		return responsableNextelFlota;
	}

	public void setResponsableNextelFlota(String responsableNextelFlota) {
		this.responsableNextelFlota = responsableNextelFlota;
	}

	public String getResponsableNextelId() {
		return responsableNextelId;
	}

	public void setResponsableNextelId(String responsableNextelId) {
		this.responsableNextelId = responsableNextelId;
	}

	public String getResponsableTel() {
		return responsableTel;
	}

	public void setResponsableTel(String responsableTel) {
		this.responsableTel = responsableTel;
	}

	public ContactoLugarHelper getContactoLugar() {
		return contactoLugar;
	}

	public void setContactoLugar(ContactoLugarHelper contactoLugar) {
		this.contactoLugar = contactoLugar;
	}

	public AgregadoHelper getAgregado() {
		return agregado;
	}

	public void setAgregado(AgregadoHelper agregado) {
		this.agregado = agregado;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getCodigoEncabezado() {
		return codigoEncabezado;
	}

	public void setCodigoEncabezado(String codigoEncabezado) {
		this.codigoEncabezado = codigoEncabezado;
	}

	public String getCodigoFormaPago() {
		return codigoFormaPago;
	}

	public void setCodigoFormaPago(String codigoFormaPago) {
		this.codigoFormaPago = codigoFormaPago;
	}

	public String getCodigoPeriodo() {
		return codigoPeriodo;
	}

	public void setCodigoPeriodo(String codigoPeriodo) {
		this.codigoPeriodo = codigoPeriodo;
	}

	public String getCodigoTipoPpto() {
		return codigoTipoPpto;
	}

	public void setCodigoTipoPpto(String codigoTipoPpto) {
		this.codigoTipoPpto = codigoTipoPpto;
	}

	public String getCodigoValidez() {
		return codigoValidez;
	}

	public void setCodigoValidez(String codigoValidez) {
		this.codigoValidez = codigoValidez;
	}

	public String getCodigoMoneda() {
		return codigoMoneda;
	}

	public void setCodigoMoneda(String codigoMoneda) {
		this.codigoMoneda = codigoMoneda;
	}

	public Double getCotizacion() {
		return cotizacion;
	}

	public void setCotizacion(Double cotizacion) {
		this.cotizacion = cotizacion;
	}

	/**
	 * @return Returns the codigoCondPago.
	 */
	public String getCodigoCondPago() {
		return codigoCondPago;
	}

	/**
	 * @param codigoCondPago The codigoCondPago to set.
	 */
	public void setCodigoCondPago(String codigoCondPago) {
		this.codigoCondPago = codigoCondPago;
	}

	/**
	 * @return Returns the codigoCancelacion.
	 */
	public String getCodigoCancelacion() {
		return codigoCancelacion;
	}

	/**
	 * @param codigoCancelacion The codigoCancelacion to set.
	 */
	public void setCodigoCancelacion(String codigoCancelacion) {
		this.codigoCancelacion = codigoCancelacion;
	}

	/**
	 * @return Returns the adelanto.
	 */
	public AdelantoHelper getAdelanto() {
		return adelanto;
	}

	/**
	 * @param adelanto The adelanto to set.
	 */
	public void setAdelanto(AdelantoHelper adelanto) {
		this.adelanto = adelanto;
	}

	public Ppto_GastoSC[] getGastosSubcontratados() {
		return gastosSubcontratados;
	}

	public void setGastosSubcontratados(Ppto_GastoSC[] gastosSubcontratados) {
		this.gastosSubcontratados = gastosSubcontratados;
	}
		
}
