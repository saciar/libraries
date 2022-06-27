package crm.libraries.abm.entities;

import java.util.Vector;

public class Servicio implements ABMEntity{
	public static final int MODALIDAD_CONTRATACION_INTERNA = 1;
	public static final int MODALIDAD_CONTRATACION_EXTERNA = 2;
	public static final int MODALIDAD_CONTRATACION_INTERNA_OPCIONAL = 3;
	public static final int MODALIDAD_CONTRATACION_EXTERNA_OPCIONAL = 4;
	
	public Servicio() {
		// TODO Auto-generated constructor stub
	}

	public Servicio(String cod,
            String pes, String fam, String precioVta, String precioVtaMin, String AdmDesc, 
            String AdmSinCargo, String larg, String alt, String anch, 
            String acc, String act, String uni) { 
        codigo = cod;
        peso = pes;
        familia = fam;
        precioVenta = precioVta;
        precioVentaMinimo = precioVtaMin;
        admiteDescuento = AdmDesc;
        admiteSinCargo = AdmSinCargo;      
        largo = larg;
        altura = alt;
        ancho = anch;
        accesorio = acc;
        activo = act;
        unidadNegocio = uni;
    }
    
    public void setCodigo(String cod){
        codigo = cod;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setPeso(String s){
        peso = s;
    }
    
    public String getPeso(){
        return peso;
    }
    
    public void setFamilia(String s){
        familia = s;
    }
    
    public String getFamilia(){
        return familia;
    }
    
    public void setPrecioVenta(String s){
        precioVenta = s;
    }
    
    public String getPrecioVenta(){
        return precioVenta;
    }
    
    public void setPrecioVentaMinimo(String s){
        precioVentaMinimo = s;
    }
    
    public String getPrecioVentaMinimo(){
        return precioVentaMinimo;
    }
    
    public void setAdmiteDescuento(String s){
        admiteDescuento = s;
    }
    
    public String getAdmiteDescuento(){
        return admiteDescuento;
    }
    
    public void setAdmiteSinCargo(String s){
        admiteSinCargo = s;
    }
    
    public String getAdmiteSinCargo(){
        return admiteSinCargo;
    }
    
    public void setLargo(String s){
        largo = s;
    }
    
    public String getLargo(){
        return largo;
    }
    
    public void setAltura(String s){
        altura = s;
    }
    
    public String getAltura(){
        return altura;
    }
    
    public void setAccesorio(String s){
        accesorio = s;
    }
    
    public String getAccesorio(){
        return accesorio;
    }
    
    public void setAncho(String s){
        ancho = s;
    }
    
    public String getAncho(){
        return ancho;
    }
    
    public void setActivo(String s){
        activo = s;
    }
    
    public String getActivo(){
        return activo;
    }
    
    public String getUnidadNegocio() {
		return unidadNegocio;
	}

	public void setUnidadNegocio(String unidadNegocio) {
		this.unidadNegocio = unidadNegocio;
	}

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "Servicio:" + this.codigo + 
    			":" + this.familia + 
    			":" + this.precioVenta + 
    			":" + this.precioVentaMinimo + 
    			":" + this.admiteDescuento + 
    			":" + this.admiteSinCargo + 
    			":" + this.peso + 
    			":" + this.largo +
    			":" + this.altura + 
    			":" + this.ancho + 
    			":" + this.accesorio + 
    			":" + this.activo + 
    			":" + this.unidadNegocio + ":";   
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("Servicio:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector v = new Vector();
    	
    	v.add(codigo);
    	v.add(familia);
    	v.add(precioVenta);
    	
    	return v;
    }
    
    public static Servicio fromVector(Vector v){    	    	    	    	    	   
    	return new Servicio((String)v.get(0), (String)v.get(1), (String)v.get(2), 
    						(String)v.get(3), (String)v.get(4), (String)v.get(5), 
    						(String)v.get(6), (String)v.get(7), (String)v.get(8),
    						(String)v.get(9), (String)v.get(10), "S",
    						(String)v.get(12));
    }					
    
    private String codigo;
    private String familia;
    private String precioVenta;
    private String precioVentaMinimo;
    private String admiteDescuento;
    private String admiteSinCargo;
    private String peso;
    private String largo;
    private String altura;
    private String ancho;
    private String accesorio;
    private String activo = "S";
    private String unidadNegocio;

}
