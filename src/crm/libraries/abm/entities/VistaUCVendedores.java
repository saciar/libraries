package crm.libraries.abm.entities;

import java.util.Vector;

public class VistaUCVendedores implements ABMEntity{

	private String codigo;
	private long codigoVendedor;
	private String nombreVendedor;
	private int codigoUnidadComercial;
	private String descripcionUnidadComercial;
	
	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public Vector toVector() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getProtocolAddString() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getProtocolListString() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCodigoUnidadComercial() {
		return codigoUnidadComercial;
	}

	public void setCodigoUnidadComercial(int codigoUnidadComercial) {
		this.codigoUnidadComercial = codigoUnidadComercial;
	}

	public long getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(long codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public String getDescripcionUnidadComercial() {
		return descripcionUnidadComercial;
	}

	public void setDescripcionUnidadComercial(String descripcionUnidadComercial) {
		this.descripcionUnidadComercial = descripcionUnidadComercial;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}

	
	
}
