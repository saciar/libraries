package crm.libraries.abm.entities;

import java.util.Vector;

public class ClienteFacturacion implements ABMEntity {

	public ClienteFacturacion() {
		// TODO Auto-generated constructor stub
	}

	public ClienteFacturacion(String codigo, String calle, String numero,
			String piso, String depto, String codigoPostal, String localidad,
			String partido, String provincia, String pais, String diaHoraPago,
			String domicilioPago, String codProveedor) {
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.depto = depto;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.partido = partido;
		this.provincia = provincia;
		this.pais = pais;
		this.diaHoraPago = diaHoraPago;
		this.domicilioPago = domicilioPago;
		this.codProveedor = codProveedor;
	}

	public void setCodigo(String cod) {
		codigo = cod;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCodProveedor() {
		return codProveedor;
	}

	public void setCodProveedor(String codProveedor) {
		this.codProveedor = codProveedor;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public String getDiaHoraPago() {
		return diaHoraPago;
	}

	public void setDiaHoraPago(String diaHoraPago) {
		this.diaHoraPago = diaHoraPago;
	}

	public String getDomicilioPago() {
		return domicilioPago;
	}

	public void setDomicilioPago(String domicilioPago) {
		this.domicilioPago = domicilioPago;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getProtocolAddString() {

		String str = new String();

		str += this.getClass().getSimpleName() + ":" + this.codigo + ":"
				+ this.calle + ":" + this.numero + ":" + this.piso + ":"
				+ this.depto + ":" + this.codigoPostal + ":" + this.localidad
				+ ":" + this.partido + ":" + this.provincia + ":" + this.pais
				+ ":" + this.diaHoraPago + ":" + this.domicilioPago + ":"
				+ this.codProveedor + ":";

		return str;

	}

	public String getProtocolListString() {

		String s = getProtocolAddString();

		return s.substring(new String("Comision:").length() - 1, s.length());

	}

	public Vector toVector() {
		Vector vector = new Vector();

		vector.add(codigo);
		vector.add(calle);
		vector.add(numero);
		vector.add(piso);
		vector.add(depto);
		vector.add(codigoPostal);
		vector.add(localidad);
		vector.add(partido);
		vector.add(provincia);
		vector.add(pais);
		vector.add(diaHoraPago);
		vector.add(domicilioPago);
		vector.add(codProveedor);

		return vector;
	}

	public static ClienteFacturacion fromVector(Vector v) {
		return new ClienteFacturacion((String) v.get(0), (String) v.get(1),
				(String) v.get(2), (String) v.get(3), (String) v.get(4),
				(String) v.get(5), (String) v.get(6), (String) v.get(7),
				(String) v.get(8), (String) v.get(9), (String) v.get(10),
				(String) v.get(11), "S");
	}

	private String codigo;
	private String calle;
	private String numero;
	private String piso;
	private String depto;
	private String codigoPostal;
	private String localidad;
	private String partido;
	private String provincia;
	private String pais;
	private String diaHoraPago;
	private String domicilioPago;
	private String codProveedor;	
	
}
