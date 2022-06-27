package crm.libraries.abm.entities;

import java.util.Vector;

public class Equipamientos implements ABMEntity  {

	private String codigo;
    private String deposito;
    private String subfamilia;
    private String marca;
    private String nroSerie;
    private String activo;
    private String observaciones;
    private String estado;
    private String codigoBarras;
    private String modelo;
    private int alto;
    private int ancho;
    private int largo;
    private int peso;

	public Equipamientos() {
		activo="S";
	}
  
   public Equipamientos(String deposito, String subfamilia, String marca, String nroSerie, String activo,
			String observaciones, String estado, String codigoBarras, String modelo, int alto, int ancho, int largo,
			int peso) {
		super();
		this.deposito = deposito;
		this.subfamilia = subfamilia;
		this.marca = marca;
		this.nroSerie = nroSerie;
		this.activo = activo;
		this.observaciones = observaciones;
		this.estado = estado;
		this.codigoBarras = codigoBarras;
		this.modelo = modelo;
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
		this.peso = peso;
	}

   public void setCodigo(String codigo) {
	   this.codigo=codigo;
   }

   public String getCodigo() {
	   return codigo;
   }

   public Vector toVector() {
	   throw new UnsupportedOperationException("Not supported yet.");
   }

   public String getDeposito() {
	   return deposito;
   }

   public void setDeposito(String deposito) {
	   this.deposito = deposito;
   }

   public String getSubfamilia() {
	   return subfamilia;
   }

   public void setSubfamilia(String subfamilia) {
	   this.subfamilia = subfamilia;
   }

   public String getMarca() {
	   return marca;
   }

   public void setMarca(String marca) {
	   this.marca = marca;
   }

   public String getNroSerie() {
	   return nroSerie;
   }

   public void setNroSerie(String nroSerie) {
	   this.nroSerie = nroSerie;
   }

   public String getActivo() {
	   return activo;
   }

   public void setActivo(String activo) {
	   this.activo = activo;
   }

   public String getObservaciones() {
	   return observaciones;
   }

   public void setObservaciones(String observaciones) {
	   this.observaciones = observaciones;
   }

   public String getEstado() {
	   return estado;
   }

   public void setEstado(String estado) {
	   this.estado = estado;
   }

   public String getCodigoBarras() {
	   return codigoBarras;
   }

   public void setCodigoBarras(String codigoBarras) {
	   this.codigoBarras = codigoBarras;
   }

   public String getModelo() {
	   return modelo;
   }

   public void setModelo(String modelo) {
	   this.modelo = modelo;
   }

   public int getAlto() {
	   return alto;
   }

   public void setAlto(int alto) {
	   this.alto = alto;
   }

   public int getAncho() {
	   return ancho;
   }

   public void setAncho(int ancho) {
	   this.ancho = ancho;
   }

   public int getLargo() {
	   return largo;
   }

   public void setLargo(int largo) {
	   this.largo = largo;
   }

   public int getPeso() {
	   return peso;
   }

   public void setPeso(int peso) {
	   this.peso = peso;
   }

}
