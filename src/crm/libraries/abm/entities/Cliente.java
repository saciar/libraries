package crm.libraries.abm.entities;

import java.util.Vector;

/**
 * @hibernate.class table="MST_CLIENTE"
 */
public class Cliente implements ABMEntity {
    
    public Cliente() {
		
	}

    public Cliente(String cod, String empresa, String nombreFantasia){
    	this.codigo = cod;
    	this.empresa = empresa;
    	this.nombreFantasia = nombreFantasia;
    }
    
    public Cliente(String cod, String empresa, String nombreFantasia, char activo){
    	this.codigo = cod;
    	this.empresa = empresa;
    	this.nombreFantasia = nombreFantasia;
    	this.activo = activo;
    }
    
    public Cliente(String codigo, String cuit, String pagoContacto, String pagoTelefono, String iva  ){
    	this.codigo = codigo;
    	this.cuit = cuit;
    	this.pagoContacto = pagoContacto;
    	this.pagoTelefono = pagoTelefono;
    	this.iva = iva;
    }
    
	public Cliente(String cod, String codigoBejerman, String emp,
            String call, String nro, String pso, String dpto, String cp, 
            String loc, String partido, String provincia, String pais, String CUIT, String IVA, 
            String pCont, String pTel,String nombreFantasia,String fechaModificacion, char act) { 
		this.codigo = cod;
        this.codigoBejerman = codigoBejerman;
        this.empresa = emp;        
        this.calle = call;
        this.numero = nro;
        this.piso = pso;
        this.departamento = dpto;
        this.codigoPostal = cp;
        this.localidad = loc;
        this.partido = partido;
        this.provincia = provincia;
        this.pais = pais;
        this.cuit = CUIT;
        this.iva = IVA;
        this.pagoContacto = pCont;
        this.pagoTelefono = pTel;
        this.nombreFantasia = nombreFantasia;
        this.fechaModificacion = fechaModificacion;
        this.activo = act;
    }
    
    public void setCodigo(String cod){
        codigo = cod;
    }
    
    /**
     * @hibernate.id column="cl_codcliente"
     */
    public String getCodigo(){
        return codigo;
    }
    
    public void setEmpresa(String s){
        empresa = s;
    }
    
    /**
     * @hibernate.property column="empresa" 
     * @return
     */
    public String getEmpresa(){
        return empresa;
    }
    
    
    
    public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
     * @hibernate.property column="domleg_calle" 
     * @return
     */
    public String getCalle(){
        return calle;
    }
    
    public void setNumero(String s){
        numero = s;
    }
    
    /**
     * @hibernate.property column="domleg_nro" 
     * @return
     */
    public String getNumero(){
        return numero;
    }
    
    public void setDepartamento(String s){
        departamento = s;
    }
    
    /**
     * @hibernate.property column="domleg_dpto" 
     * @return
     */
    public String getDepartamento(){
        return departamento;
    }
    
    public void setPiso(String s){
        piso = s;
    }
    
    /**
     * @hibernate.property column="domleg_piso" 
     * @return
     */
    public String getPiso(){
        return piso;
    }
    
    public void setCodigoPostal(String s){
        codigoPostal = s;
    }
    
    /**
     * @hibernate.property column="domleg_cp" 
     * @return
     */
    public String getCodigoPostal(){
        return codigoPostal;
    }
    
    public void setLocalidad(String s){
        localidad = s;
    }
    
    /**
     * @hibernate.property column="domleg_loc" 
     * @return
     */
    public String getLocalidad(){
        return localidad;
    }
    
    public void setCuit(String s){
        cuit = s;
    }
    
    /**
     * @hibernate.property column="CUIT" 
     * @return
     */
    public String getCuit(){
        return cuit;
    }
    
    public void setIva(String s){
        iva = s;
    }
    
    /**
     * @hibernate.property column="cl_iva" 
     * @return
     */
    public String getIva(){
        return iva;
    }
    
    public void setPagoContacto(String s){
        pagoContacto = s;
    }
    
    /**
     * @hibernate.property column="pago_contacto" 
     * @return
     */
    public String getPagoContacto(){
        return pagoContacto;
    }
    
    public void setPagoTelefono(String s){
        pagoTelefono = s;
    }
    
    /**
     * @hibernate.property column="pago_telefono" 
     * @return
     */
    public String getPagoTelefono(){
        return pagoTelefono;
    }
    
    /**
     * @hibernate.property column="cl_cod_bejerman" 
     * @return
     */
    public String getCodigoBejerman() {
		return codigoBejerman;
	}

	public void setCodigoBejerman(String codigoBejerman) {
		this.codigoBejerman = codigoBejerman;
	}
	
	/**
     * @hibernate.property column="domleg_codpais" 
     * @return
     */
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
     * @hibernate.property column="domleg_codpartido" 
     * @return
     */
	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	/**
     * @hibernate.property column="domleg_codprovincia" 
     * @return
     */
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
    
	/**
     * @hibernate.property column="nombre_fantasia" 
     * @return
     */
    public String getNombreFantasia() {
		return nombreFantasia;
	}

	public void setNombreFantasia(String nombreFantasia) {
		this.nombreFantasia = nombreFantasia;
	}

	/**
     * @hibernate.property column="activo" 
     * @return
     */
    public char getActivo() {
		return activo;
	}

    public boolean isActivo(){
    	return activo == 'S';
    }
    
	public void setActivo(char activo) {
		this.activo = activo;
	}
	
	/**
     * @hibernate.property column="fecha_modificacion" 
     * @return
     */
	public String getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
    public Vector toVector(){
    	Vector v = new Vector();
    	
    	v.add(codigo);
    	v.add(this.codigoBejerman);
    	v.add(empresa);
    	v.add(calle);
    	v.add(numero);
    	v.add(piso);
    	v.add(departamento);
    	v.add(codigoPostal);
    	v.add(localidad);
    	v.add(this.partido);
    	v.add(this.provincia);
    	v.add(this.pais);
    	v.add(cuit);
    	v.add(iva);
    	v.add(pagoContacto);
    	v.add(pagoTelefono);
    	v.add(nombreFantasia);
    	v.add(fechaModificacion);
    	//v.add(activo);
    	    	
    	return v;
    }
    
    public static Cliente fromVector(Vector v){    	    	    	    	    	   
    	return new Cliente((String)v.get(0), (String)v.get(1), (String)v.get(2), 
    						(String)v.get(3), (String)v.get(4), (String)v.get(5), 
    						(String)v.get(6), (String)v.get(7), (String)v.get(8),
    						(String)v.get(9), (String)v.get(10), (String)v.get(11),
    						(String)v.get(12), (String)v.get(13), (String)v.get(14),
    						(String)v.get(15), (String)v.get(16), (String)v.get(17),'S');
    }
    
    public boolean equals(Object o){
    	if (o == null)
    		return false;
    	if (!(o instanceof Cliente))
    		return false;
    	
    	return codigo.equals(((Cliente)o).codigo);
    }
    
	//@Override
	public int hashCode() {
		return codigo.hashCode();
	}
    
    private String codigo = "";
    private String codigoBejerman;  
    private String empresa;
    //private String referencia;
    private String calle;
    private String numero;
    private String piso;
    private String departamento;
    private String codigoPostal;
    private String localidad;
    private String partido;
    private String provincia;
    private String pais;
    private String cuit;
    private String iva;
    private String pagoContacto;
    private String pagoTelefono;
	private String nombreFantasia;
	private String fechaModificacion;
	private char activo = 'S'; // todos estan activos salvo que especifique lo contrario

}
