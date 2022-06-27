package crm.libraries.abm.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import crm.libraries.abm.helper.AgregadoHelper;

public class Presupuesto implements Serializable {
	private Long numeroDePresupuesto;
	private Set<PptoCambioEstado> cambiosEstado;
	private PptoEstadoActual estadoActual;
	private VendedorPpto vendedor;
	private Cliente cliente;
	private String observacionesDelCliente;
	private String fechaDeInicio;
	private String fechaDeFinalizacion;
	private String fechaDeInstalacion;
	private String totalDePersonas;
	private String nombreDelEvento;
	private LugarEvento lugarDelEvento;
	private String observacionesDelEvento;
	private TipoEvento tipoDeEvento;
	private TipoLugarEvento tipoDeLugarDelEvento;
	private TipoUniforme uniforme;
	private PrtPptoHeader encabezadoPpto;
	private PrtPptoFPago formaPagoPpto;
	private PrtPptoCondPago condPagoPpto;
	private PrtPptoValidez validezPpto;
	private PrtPptoTipoPresupuesto tipoPpto;
	private PrtPptoPeriodo periodoPpto;	
	private PrtPptoCancelacion cancelacionPpto;
	private MonedaExtranjera moneda;
	private Double cotizacion;
	private Integer codigoReferencia;
	private String responsableEvento;
	private String responsableTel;
	private String responsableEmail;
	private String responsableNextelFlota;
	private String responsableNextelId;
	private String activo;
	private Ppto_Contacto contacto;
	private Ppto_Contacto_Lugar contactoLugar;
	private Ppto_Facturacion facturacion;
	private Ppto_Rentabilidad rentabilidad;
	private Ppto_Agregado agregado;
	private Ppto_Adelanto adelanto;
	private Ppto_Pago pago;
	//private Ppto_GastoRegalias regalias;
	//private Ppto_GastoCostoOperativo gastosCostoOperativo;
	private Set<Ppto_Facturas> facturas;
	private Set<Ppto_Sala> salas;
	private Set<Ppto_GastoSC> gastosSC;
	private Set<Ppto_GastoOperador> gastosOperador;
	private Set<Ppto_GastoRepresentacion> gastosRepresentacion;
	private Set<Ppto_GastoAsistentes> gastosAsistentes;
	private Set<Ppto_GastoViaticos> gastosViaticos;
	private Set<Ppto_GastoHoteleria> gastosHoteleria;
	private Set<Ppto_GastoVarios> gastosVarios;
	private Integer usuarioActivo;
	private String macAddress;
	private String ip;
		
	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getUsuarioActivo() {
		return usuarioActivo;
	}

	public void setUsuarioActivo(Integer usuarioActivo) {
		this.usuarioActivo = usuarioActivo;
	}

	public Presupuesto() {}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public VendedorPpto getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorPpto vendedor) {
		this.vendedor = vendedor;
	}

	public PptoEstadoActual getEstado() {
		return estadoActual;
	}

	public void setEstado(PptoEstadoActual estado) {
		this.estadoActual = estado;
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

	public LugarEvento getLugarDelEvento() {
		return lugarDelEvento;
	}

	public void setLugarDelEvento(LugarEvento lugarDelEvento) {
		this.lugarDelEvento = lugarDelEvento;
	}

	public String getNombreDelEvento() {
		return nombreDelEvento;
	}

	public void setNombreDelEvento(String nombreDelEvento) {
		this.nombreDelEvento = nombreDelEvento;
	}

	public Long getNumeroDePresupuesto() {
		return numeroDePresupuesto;
	}

	public void setNumeroDePresupuesto(Long numeroDePresupuesto) {
		this.numeroDePresupuesto = numeroDePresupuesto;
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

	public TipoEvento getTipoDeEvento() {
		return tipoDeEvento;
	}

	public void setTipoDeEvento(TipoEvento tipoDeEvento) {
		this.tipoDeEvento = tipoDeEvento;
	}

	public TipoLugarEvento getTipoDeLugarDelEvento() {
		return tipoDeLugarDelEvento;
	}

	public void setTipoDeLugarDelEvento(TipoLugarEvento tipoDeLugarDelEvento) {
		this.tipoDeLugarDelEvento = tipoDeLugarDelEvento;
	}

	public String getTotalDePersonas() {
		return totalDePersonas;
	}

	public void setTotalDePersonas(String totalDePersonas) {
		this.totalDePersonas = totalDePersonas;
	}

	public TipoUniforme getUniforme() {
		return uniforme;
	}

	public void setUniforme(TipoUniforme uniforme) {
		this.uniforme = uniforme;
	}

	public Set<Ppto_Sala> getSalas() {
		return salas;
	}
	
	public Object[] getSalasArray() {
		return ordenarSalas(salas);
	}
	
	private Object[] ordenarSalas(Set<Ppto_Sala> servicios){
		int i,j;
		Object[] array = servicios.toArray();
		Ppto_Sala temp;
		
		for (i=1; i<servicios.size(); i++)
            for (j=0; j<servicios.size() - i; j++){
            	if ((Integer.parseInt(((Ppto_Sala)array[j]).getOrden())) > Integer.parseInt(((Ppto_Sala)array[j+1]).getOrden()))
                {
                temp = (Ppto_Sala)array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                }
        }
		return array;
		
	}

	public void setSalas(Set<Ppto_Sala> salas) {
		this.salas = salas;
	}

	public void addSala ( Ppto_Sala sala ) {

		if ( salas == null )
			salas = new HashSet<Ppto_Sala>();

		this.salas.add( sala );

		sala.setPresupuesto( this );

	}

	public void setGastosSC(Set<Ppto_GastoSC> gastosSC) {
		this.gastosSC = gastosSC;
	}

	public Set getGastosSC() {
		return gastosSC;
	}

	public void addGastoSC( Ppto_GastoSC gastoSC ) {
		if (this.gastosSC == null ){
			this.gastosSC = new HashSet<Ppto_GastoSC>();
		}
		this.gastosSC.add( gastoSC );		
	}
	

	public Set<PptoCambioEstado> getCambiosEstado() {
		return cambiosEstado;
	}

	public PptoEstadoActual getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(PptoEstadoActual estadoActual) {
		this.estadoActual = estadoActual;
	}

	public void addCambioEstado ( PptoCambioEstado ca ) {

		if ( cambiosEstado == null )
			cambiosEstado = new HashSet<PptoCambioEstado>();

		this.cambiosEstado.add( ca );

		ca.setPresupuesto( this );

	}
	
	public Integer getCodigoReferencia() {
		return codigoReferencia;
	}

	public void setCodigoReferencia(Integer codigoReferencia) {
		this.codigoReferencia = codigoReferencia;
	}

	public Set<Ppto_GastoOperador> getGastosOperador() {
		return gastosOperador;
	}

	public void setGastosOperador(Set<Ppto_GastoOperador> gastosOperador) {
		this.gastosOperador = gastosOperador;
	}

	public void addGastoOperador( Ppto_GastoOperador gastoOperador ) {
		if (this.gastosOperador == null ){
			this.gastosOperador = new HashSet<Ppto_GastoOperador>();
		}
		this.gastosOperador.add( gastoOperador );		
	}

	public Set<Ppto_GastoRepresentacion> getGastosRepresentacion() {
		return gastosRepresentacion;
	}

	public void setGastosRepresentacion(
			Set<Ppto_GastoRepresentacion> gastosRepresentacion) {
		this.gastosRepresentacion = gastosRepresentacion;
	}
	public void addGastoRepresentacion( Ppto_GastoRepresentacion gastoRepresentacion ) {
		if (this.gastosRepresentacion == null ){
			this.gastosRepresentacion = new HashSet<Ppto_GastoRepresentacion>();
		}
		this.gastosRepresentacion.add( gastoRepresentacion );		
	}

	public Set<Ppto_GastoAsistentes> getGastosAsistentes() {
		return gastosAsistentes;
	}

	public void setGastosAsistentes(Set<Ppto_GastoAsistentes> gastosAsistentes) {
		this.gastosAsistentes = gastosAsistentes;
	}
	
	public void addGastoAsistentes( Ppto_GastoAsistentes gastoAsistentes ) {
		if (this.gastosAsistentes == null ){
			this.gastosAsistentes = new HashSet<Ppto_GastoAsistentes>();
		}
		this.gastosAsistentes.add( gastoAsistentes );		
	}

	public Set<Ppto_GastoHoteleria> getGastosHoteleria() {
		return gastosHoteleria;
	}

	public void setGastosHoteleria(Set<Ppto_GastoHoteleria> gastosHoteleria) {
		this.gastosHoteleria = gastosHoteleria;
	}

	public void addGastoHoteleria( Ppto_GastoHoteleria gastoHoteleria ) {
		if (this.gastosHoteleria == null ){
			this.gastosHoteleria = new HashSet<Ppto_GastoHoteleria>();
		}
		this.gastosHoteleria.add( gastoHoteleria );		
	}
	
	public Set<Ppto_GastoVarios> getGastosVarios() {
		return gastosVarios;
	}

	public void setGastosVarios(Set<Ppto_GastoVarios> gastosVarios) {
		this.gastosVarios = gastosVarios;
	}

	public void addGastoVarios( Ppto_GastoVarios gastoVarios ) {
		if (this.gastosVarios == null ){
			this.gastosVarios = new HashSet<Ppto_GastoVarios>();
		}
		this.gastosVarios.add( gastoVarios );		
	}
	
	/*public Set<Ppto_GastoRegalias> getGastosRegalias() {
		return this.gastosRegalias;
	}
	
	public void setGastosRegalias(Set<Ppto_GastoRegalias> gastosRegalias) {
		this.gastosRegalias = gastosRegalias;
	}

	public void addGastoRegalias( Ppto_GastoRegalias gastosRegalias ) {
		if (this.gastosRegalias == null ){
			this.gastosRegalias = new HashSet<Ppto_GastoRegalias>();
		}
		this.gastosRegalias.add( gastosRegalias );		
	}
	
	public Set<Ppto_GastoCostoOperativo> getGastosCostoOperativo() {
		return gastosCostoOperativo;
	}

	public void setGastosCostoOperativo(Set<Ppto_GastoCostoOperativo> gastoCO) {
		this.gastosCostoOperativo = gastoCO;
	}

	public void addGastoCOstoOperativo( Ppto_GastoCostoOperativo gastoCO ) {
		if (this.gastosCostoOperativo == null ){
			this.gastosCostoOperativo = new HashSet<Ppto_GastoCostoOperativo>();
		}
		this.gastosCostoOperativo.add( gastoCO );		
	}*/
	
	public Set<Ppto_GastoViaticos> getGastosViaticos() {
		return gastosViaticos;
	}

	public void setGastosViaticos(Set<Ppto_GastoViaticos> gastosViaticos) {
		this.gastosViaticos = gastosViaticos;
	}
	
	public void addGastoViaticos( Ppto_GastoViaticos gastoViaticos ) {
		if (this.gastosViaticos == null ){
			this.gastosViaticos = new HashSet<Ppto_GastoViaticos>();
		}
		this.gastosViaticos.add( gastoViaticos );		
	}

	
	/*public void addAccesorioAccesorio( Ppto_AccesorioAccesorio accesorios ) {
		if (this.accesoriosAccesorio == null ){
			this.accesoriosAccesorio = new HashSet<Ppto_AccesorioAccesorio>();
		}
		this.accesoriosAccesorio.add( accesorios );		
	}
	
	public Set<Ppto_AccesorioAccesorio> getAccesoriosAccesorio() {
		return accesoriosAccesorio;
	}

	public void setAccesoriosAccesorio(
			Set<Ppto_AccesorioAccesorio> accesoriosAccesorio) {
		this.accesoriosAccesorio = accesoriosAccesorio;
	}

	
	public void addAccesorioOperador( Ppto_AccesorioOperador accesorios ) {
		if (this.accesoriosOperador == null ){
			this.accesoriosOperador = new HashSet<Ppto_AccesorioOperador>();
		}
		this.accesoriosOperador.add( accesorios );		
	}
	public Set<Ppto_AccesorioOperador> getAccesoriosOperador() {
		return accesoriosOperador;
	}

	public void setAccesoriosOperador(Set<Ppto_AccesorioOperador> accesoriosOperador) {
		this.accesoriosOperador = accesoriosOperador;
	}

	
	public void addAccesorioOperadorAudio( Ppto_AccesorioOperadorAudio accesorios ) {
		if (this.accesoriosOperadorAudio == null ){
			this.accesoriosOperadorAudio = new HashSet<Ppto_AccesorioOperadorAudio>();
		}
		this.accesoriosOperadorAudio.add( accesorios );		
	}
	public Set<Ppto_AccesorioOperadorAudio> getAccesoriosOperadorAudio() {
		return accesoriosOperadorAudio;
	}

	public void setAccesoriosOperadorAudio(
			Set<Ppto_AccesorioOperadorAudio> accesoriosOperadorAudio) {
		this.accesoriosOperadorAudio = accesoriosOperadorAudio;
	}

	public void addAccesorioOperadorComputers( Ppto_AccesorioOperadorComputers accesorios ) {
		if (this.accesoriosOperadorComputers == null ){
			this.accesoriosOperadorComputers = new HashSet<Ppto_AccesorioOperadorComputers>();
		}
		this.accesoriosOperadorComputers.add( accesorios );		
	}
	public Set<Ppto_AccesorioOperadorComputers> getAccesoriosOperadorComputers() {
		return accesoriosOperadorComputers;
	}

	public void setAccesoriosOperadorComputers(
			Set<Ppto_AccesorioOperadorComputers> accesoriosOperadorComputers) {
		this.accesoriosOperadorComputers = accesoriosOperadorComputers;
	}

	public void addAccesorioOperadorGeneral( Ppto_AccesorioOperadorGeneral accesorios ) {
		if (this.accesoriosOperadorGeneral == null ){
			this.accesoriosOperadorGeneral = new HashSet<Ppto_AccesorioOperadorGeneral>();
		}
		this.accesoriosOperadorGeneral.add( accesorios );		
	}
	public Set<Ppto_AccesorioOperadorGeneral> getAccesoriosOperadorGeneral() {
		return accesoriosOperadorGeneral;
	}

	public void setAccesoriosOperadorGeneral(
			Set<Ppto_AccesorioOperadorGeneral> accesoriosOperadorGeneral) {
		this.accesoriosOperadorGeneral = accesoriosOperadorGeneral;
	}

	
	public void addAccesorioOperadorLighting( Ppto_AccesorioOperadorLighting accesorios ) {
		if (this.accesoriosOperadorLighting == null ){
			this.accesoriosOperadorLighting = new HashSet<Ppto_AccesorioOperadorLighting>();
		}
		this.accesoriosOperadorLighting.add( accesorios );		
	}
	public Set<Ppto_AccesorioOperadorLighting> getAccesoriosOperadorLighting() {
		return accesoriosOperadorLighting;
	}

	public void setAccesoriosOperadorLighting(
			Set<Ppto_AccesorioOperadorLighting> accesoriosOperadorLighting) {
		this.accesoriosOperadorLighting = accesoriosOperadorLighting;
	}

	
	public void addAccesorioOperadorVideo( Ppto_AccesorioOperadorVideo accesorios ) {
		if (this.accesoriosOperadorVideo == null ){
			this.accesoriosOperadorVideo = new HashSet<Ppto_AccesorioOperadorVideo>();
		}
		this.accesoriosOperadorVideo.add( accesorios );		
	}
	public Set<Ppto_AccesorioOperadorVideo> getAccesoriosOperadorVideo() {
		return accesoriosOperadorVideo;
	}

	public void setAccesoriosOperadorVideo(
			Set<Ppto_AccesorioOperadorVideo> accesoriosOperadorVideo) {
		this.accesoriosOperadorVideo = accesoriosOperadorVideo;
	}*/
	
	/**
	 * Indica si este presupuesto ya ha sido grabado en la base de datos
	 * 
	 * @return
	 */
	public boolean isNew(){
		return numeroDePresupuesto == null || numeroDePresupuesto.longValue() == 0;
	}
	
	/**
	 * Este metodo creará un presupuesto con los datos predeterminados, utilizado
	 * para inicializar un formulario.
	 * 
	 * @return
	 */
	public static Presupuesto createDefault(){
		Presupuesto p = new Presupuesto();
		p.numeroDePresupuesto = new Long(0);
		p.codigoReferencia = new Integer(0);
		p.nombreDelEvento = "";
		p.tipoDeEvento = new TipoEvento();
		p.uniforme = new TipoUniforme();
		p.lugarDelEvento = new LugarEvento();
		p.tipoDeLugarDelEvento = new TipoLugarEvento();
		p.gastosSC = null;
		p.gastosAsistentes = null;
		p.gastosHoteleria = null;
		p.gastosRepresentacion = null;
		p.gastosVarios = null;
		p.gastosViaticos = null;
		p.fechaDeFinalizacion = null;
		p.fechaDeInicio = null;
		p.fechaDeInstalacion = null;
		p.totalDePersonas = "0";
		p.estadoActual = null;
		p.salas = null;		
		p.agregado = new Ppto_Agregado();
		p.adelanto = new Ppto_Adelanto();
		p.responsableEvento = "";
		p.responsableEmail = "";
		p.responsableTel = "";
		p.responsableNextelFlota = "";
		p.responsableNextelId = "";
		p.activo = "N";
		p.encabezadoPpto= null;
		p.formaPagoPpto= new PrtPptoFPago("100","-");
		p.condPagoPpto = new PrtPptoCondPago("100","-");
		p.validezPpto= null;
		p.tipoPpto= null;
		p.periodoPpto= null;
		p.cancelacionPpto = null;
		p.moneda= null;
		p.cotizacion= 1.0;
		p.facturacion = null;
		return p;
	}
	
	/**
	 * Este metodo creará un presupuesto con los datos predeterminados, utilizado
	 * para inicializar un formulario.
	 * 
	 * @return
	 */
	public static Presupuesto createCopia(Presupuesto ppto){
		Presupuesto p = new Presupuesto();
		p.numeroDePresupuesto = new Long(0);
		p.codigoReferencia = new Integer(0);
		p.cliente = ppto.getCliente();
		p.contacto = ppto.getContacto();
		p.nombreDelEvento = "";
		p.tipoDeEvento = new TipoEvento();
		p.uniforme = new TipoUniforme();
		p.lugarDelEvento = ppto.getLugarDelEvento();
		p.tipoDeLugarDelEvento = new TipoLugarEvento();
		p.gastosSC = null;
		p.gastosAsistentes = null;
		p.gastosHoteleria = null;
		p.gastosRepresentacion = null;
		p.gastosVarios = null;
		p.gastosViaticos = null;
		p.fechaDeFinalizacion = null;
		p.fechaDeInicio = null;
		p.fechaDeInstalacion = null;
		p.totalDePersonas = "0";
		p.estadoActual = null;
		p.salas = ppto.getSalas();		
		p.agregado = new Ppto_Agregado();
		p.adelanto = new Ppto_Adelanto();
		p.responsableEvento = "";
		p.responsableEmail = "";
		p.responsableTel = "";
		p.responsableNextelFlota = "";
		p.responsableNextelId = "";
		p.activo = "N";
		p.encabezadoPpto= null;
		p.formaPagoPpto= new PrtPptoFPago("100","-");
		p.condPagoPpto = new PrtPptoCondPago("100","-");
		p.validezPpto= null;
		p.tipoPpto= null;
		p.periodoPpto= null;
		p.cancelacionPpto = null;
		p.moneda= null;
		p.cotizacion= 1.0;
		p.facturacion = null;
		return p;
	}
	
	public void setCambiosEstado(Set<PptoCambioEstado> cambiosEstado) {
		this.cambiosEstado = cambiosEstado;
	}

	public void setContacto(Ppto_Contacto cont) {
		this.contacto = cont;
		
	}

	public Ppto_Contacto getContacto() {
		return contacto;
	}

	public Ppto_Facturacion getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(Ppto_Facturacion facturacion) {
		this.facturacion = facturacion;
	}	
	
	/*public Ppto_Seguimiento getSeguimiento() {
		return seguimiento;
	}

	public void setSeguimiento(Ppto_Seguimiento seguimiento) {
		this.seguimiento = seguimiento;
	}*/

	public Ppto_Pago getPago() {
		return pago;
	}

	public void setPago(Ppto_Pago pago) {
		this.pago = pago;
	}

	public Ppto_Rentabilidad getRentabilidad() {
		return rentabilidad;
	}

	public void setRentabilidad(Ppto_Rentabilidad rentabilidad) {
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

	public Ppto_Contacto_Lugar getContactoLugar() {
		return contactoLugar;
	}

	public void setContactoLugar(Ppto_Contacto_Lugar contactoLugar) {
		this.contactoLugar = contactoLugar;
	}

	public Ppto_Agregado getAgregado() {
		return agregado;
	}

	public void setAgregado(Ppto_Agregado agregado) {
		this.agregado = agregado;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public PrtPptoHeader getEncabezadoPpto() {
		return encabezadoPpto;
	}

	public void setEncabezadoPpto(PrtPptoHeader encabezadoPpto) {
		this.encabezadoPpto = encabezadoPpto;
	}

	public PrtPptoFPago getFormaPagoPpto() {
		return formaPagoPpto;
	}

	public void setFormaPagoPpto(PrtPptoFPago formaPagoPpto) {
		this.formaPagoPpto = formaPagoPpto;
	}

	public PrtPptoPeriodo getPeriodoPpto() {
		return periodoPpto;
	}

	public void setPeriodoPpto(PrtPptoPeriodo periodoPpto) {
		this.periodoPpto = periodoPpto;
	}

	public PrtPptoTipoPresupuesto getTipoPpto() {
		return tipoPpto;
	}

	public void setTipoPpto(PrtPptoTipoPresupuesto tipoPpto) {
		this.tipoPpto = tipoPpto;
	}

	public PrtPptoValidez getValidezPpto() {
		return validezPpto;
	}

	public void setValidezPpto(PrtPptoValidez validezPpto) {
		this.validezPpto = validezPpto;
	}

	public MonedaExtranjera getMoneda() {
		return moneda;
	}

	public void setMoneda(MonedaExtranjera moneda) {
		this.moneda = moneda;
	}

	public Double getCotizacion() {
		return cotizacion;
	}

	public void setCotizacion(Double cotizacion) {
		this.cotizacion = cotizacion;
	}

	/**
	 * @return Returns the condPagoPpto.
	 */
	public PrtPptoCondPago getCondPagoPpto() {
		return condPagoPpto;
	}

	/**
	 * @param condPagoPpto The condPagoPpto to set.
	 */
	public void setCondPagoPpto(PrtPptoCondPago condPagoPpto) {
		this.condPagoPpto = condPagoPpto;
	}

	/**
	 * @return Returns the cancelacionPpto.
	 */
	public PrtPptoCancelacion getCancelacionPpto() {
		return cancelacionPpto;
	}

	/**
	 * @param cancelacionPpto The cancelacionPpto to set.
	 */
	public void setCancelacionPpto(PrtPptoCancelacion cancelacionPpto) {
		this.cancelacionPpto = cancelacionPpto;
	}

	/**
	 * @return Returns the adelanto.
	 */
	public Ppto_Adelanto getAdelanto() {
		return adelanto;
	}

	/**
	 * @param adelanto The adelanto to set.
	 */
	public void setAdelanto(Ppto_Adelanto adelanto) {
		this.adelanto = adelanto;
	}

	/**
	 * @return Returns the factura.
	 */
	public Set<Ppto_Facturas> getFacturas() {
		return facturas;
	}

	/**
	 * @param factura The factura to set.
	 */
	public void setFacturas(Set<Ppto_Facturas> factura) {
		this.facturas = factura;
	}
	
	public void addFactura ( Ppto_Facturas ca ) {

		if ( facturas == null )
			facturas = new HashSet<Ppto_Facturas>();

		this.facturas.add( ca );

		ca.setPresupuesto( this );

	}

	/*public Ppto_GastoRegalias getRegalias() {
		return regalias;
	}

	public void setRegalias(Ppto_GastoRegalias gastosRegalias) {
		this.regalias = gastosRegalias;
	}

	public Ppto_GastoCostoOperativo getGastosCostoOperativo() {
		return gastosCostoOperativo;
	}

	public void setGastosCostoOperativo(
			Ppto_GastoCostoOperativo gastosCostoOperativo) {
		this.gastosCostoOperativo = gastosCostoOperativo;
	}*/
	
	

}
