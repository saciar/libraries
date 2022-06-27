package crm.libraries.abm.entities;

import java.util.Vector;

public class VendedorUsuario implements ABMEntity{
	public VendedorUsuario() {
		// TODO Auto-generated constructor stub
	}

	public VendedorUsuario(String codVend, String codUsu){
		codigoVendedor = codVend;
		codigoUsuario = codUsu;
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

	public String getProtocolAddString() {
    	
    	String str = new String();
    	
    	str += "VendedorUsuario:" + this.codigoVendedor + 
    			":" + this.codigoUsuario + ":";
    	
    	return str;
    	
    }
    
    public String getProtocolListString() {
    	
    	String s = getProtocolAddString();
    	
    	return s.substring(new String("VendedorUsuario:").length()-1, s.length());
    	
    }
    
    public Vector toVector(){
    	Vector vector = new Vector();
    	
    	vector.add(codigoVendedor);
    	vector.add(codigoUsuario);       
    	
    	return vector;
    }
    
    public static VendedorUsuario fromVector(Vector v){    	    	    	    	    	   
    	return new VendedorUsuario((String)v.get(0), (String)v.get(1));
    }
	
    public void setCodigo(String codigo){}
    public String getCodigo(){return null;}
    
	private String codigoVendedor;
	private String codigoUsuario;
}
