package crm.libraries.abm.helper;

public class PagoHelper {
	private long id;
	private int codMedioPago;
	private int codCondicionPago;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCodCondicionPago() {
		return codCondicionPago;
	}

	public void setCodCondicionPago(int codCondicionPago) {
		this.codCondicionPago = codCondicionPago;
	}

	public int getCodMedioPago() {
		return codMedioPago;
	}

	public void setCodMedioPago(int codMedioPago) {
		this.codMedioPago = codMedioPago;
	}
}
