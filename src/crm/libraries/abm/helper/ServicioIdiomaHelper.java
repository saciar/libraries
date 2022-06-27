package crm.libraries.abm.helper;

import java.util.List;

public class ServicioIdiomaHelper {
	private String idioma;
	private String titulo;
	private String descripcion;
	private List descriptionLines;
	public ServicioIdiomaHelper(String idioma,String titulo, String descripcion,List descriptionLines) {
		this.idioma = idioma;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.descriptionLines = descriptionLines;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public List getDescriptionLines() {
		return descriptionLines;
	}

	public void setDescriptionLines(List descriptionLines) {
		this.descriptionLines = descriptionLines;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
