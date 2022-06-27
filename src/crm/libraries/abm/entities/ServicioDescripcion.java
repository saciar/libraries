package crm.libraries.abm.entities;

import java.util.Vector;

public class ServicioDescripcion{
    private Long codigo;
    private String codServicio;
    private String codIdioma;
    private String numero;
    private String descripcion;        
	
	
	public ServicioDescripcion() {
	}
	
	    
    public String getCodIdioma() {
		return codIdioma;
	}

	public void setCodIdioma(String codIdioma) {
		this.codIdioma = codIdioma;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getCodServicio() {
		return codServicio;
	}

	public void setCodServicio(String codServicio) {
		this.codServicio = codServicio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}


}
