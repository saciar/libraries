package crm.libraries.abm.entities;

import java.util.Vector;

public class TxSeguimiento implements ABMEntity{
	public TxSeguimiento() {

	}

	public TxSeguimiento(String cod, String desc, String act, String codUsuario, 
				String codSeguimiento, String codSegRespuesta, String obs) {        
        codigo = cod;
        numeroPresupuesto = desc;
        fechaYHora = act;        
        codigoUsuario = codUsuario;
        codigoSeguimiento = codSeguimiento;
        codigoSeguimientoRespuesta = codSegRespuesta;
        observaciones = obs;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFechaYHora() {
		return fechaYHora;
	}

	public void setFechaYHora(String fechaYHora) {
		this.fechaYHora = fechaYHora;
	}

	public String getNumeroPresupuesto() {
		return numeroPresupuesto;
	}

	public void setNumeroPresupuesto(String numeroPresupuesto) {
		this.numeroPresupuesto = numeroPresupuesto;
	}
	
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

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "TxSeguimiento:" + this.codigo + 
    			":" + this.numeroPresupuesto + 
    			":" + this.fechaYHora + 
    			":" + this.codigoUsuario + 
    			":" + this.codigoSeguimiento + 
    			":" + this.codigoSeguimientoRespuesta + 
    			":" + this.observaciones + ":" ;
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("TxSeguimiento:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigo);    	    	
    	vector.add(numeroPresupuesto);
    	vector.add(fechaYHora);
    	vector.add(codigoUsuario);
    	vector.add(codigoSeguimiento);
    	vector.add(codigoSeguimientoRespuesta);
    	vector.add(observaciones);
    	
    	return vector;
    }
    
    public static TxSeguimiento fromVector(Vector v){    	    	    	    	    	   
    	return new TxSeguimiento((String)v.get(0), (String)v.get(1),(String)v.get(2),
    			(String)v.get(3),(String)v.get(4), (String)v.get(5), (String)v.get(6));
    }
    
    private String fechaYHora;
    private String codigo;
    private String numeroPresupuesto;
    private String codigoUsuario;
    private String codigoSeguimiento;
    private String codigoSeguimientoRespuesta;
    private String observaciones;
	
}
