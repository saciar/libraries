package crm.libraries.report;

public class ListaPrecios {
	
	private String mes;	
	private double dtoTemporada;
	private ListaPreciosFamilias[] familias;
	
	/**
	 * @return Returns the servicios.
	 */
	public ListaPreciosFamilias[] getFamilias() {
		return familias;
	}
	/**
	 * @param familias The servicios to set.
	 */
	public void setFamilias(ListaPreciosFamilias[] familias) {
		this.familias = familias;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	/**
	 * @return Returns the dtoTemporada.
	 */
	public double getDtoTemporada() {
		return dtoTemporada;
	}
	/**
	 * @param dtoTemporada The dtoTemporada to set.
	 */
	public void setDtoTemporada(double dtoTemporada) {
		this.dtoTemporada = dtoTemporada;
	}
	
	
}
