package crm.libraries.presupuestos;

import java.util.HashSet;
import java.util.Set;

public class PresupuestoAbstracto {
	
	private String numeroDePresupuesto;
	private String estado;
	private String codigoDelVendedor;
	private String codigoDelCliente;
	private String observacionesDelCliente;
	private String fechaDeInicio;
	private String fechaDeFinalizacion;
	private String fechaDeInstalacion;
	private String totalDePersonas;
	private String nombreDelEvento;
	private String codigoLugarDelEvento;
	private String observacionesDelEvento;
	private String codigoTipoDeEvento;
	private String codigoTipoDeLugarDelEvento;
	private String codigoDelUniforme;
	private String codigoReferencia;
	private String codigoUsuario;
	private String responsableEvento;
	private String responsableTel;
	private String responsableEmail;
	private String responsableNextelFlota;
	private String responsableNextelId;
	private Set salas;
	
	public PresupuestoAbstracto() { salas = new HashSet(); }

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}



	public String getCodigoDelCliente() {
		return codigoDelCliente;
	}

	public void setCodigoDelCliente(String codigoDelCliente) {
		this.codigoDelCliente = codigoDelCliente;
	}

	public String getCodigoDelUniforme() {
		return codigoDelUniforme;
	}

	public void setCodigoDelUniforme(String codigoDelUniforme) {
		this.codigoDelUniforme = codigoDelUniforme;
	}

	public String getCodigoDelVendedor() {
		return codigoDelVendedor;
	}

	public void setCodigoDelVendedor(String codigoDelVendedor) {
		this.codigoDelVendedor = codigoDelVendedor;
	}

	public String getCodigoLugarDelEvento() {
		return codigoLugarDelEvento;
	}

	public void setCodigoLugarDelEvento(String codigoLugarDelEvento) {
		this.codigoLugarDelEvento = codigoLugarDelEvento;
	}

	public String getCodigoReferencia() {
		return codigoReferencia;
	}

	public void setCodigoReferencia(String codigoReferencia) {
		this.codigoReferencia = codigoReferencia;
	}

	public String getCodigoTipoDeEvento() {
		return codigoTipoDeEvento;
	}

	public void setCodigoTipoDeEvento(String codigoTipoDeEvento) {
		this.codigoTipoDeEvento = codigoTipoDeEvento;
	}

	public String getCodigoTipoDeLugarDelEvento() {
		return codigoTipoDeLugarDelEvento;
	}

	public void setCodigoTipoDeLugarDelEvento(String codigoTipoDeLugarDelEvento) {
		this.codigoTipoDeLugarDelEvento = codigoTipoDeLugarDelEvento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaDeFinalizacion() {
		return fechaDeFinalizacion;
	}

	public void setFechaDeFinalizacion(String fechaDeFinalizacion) {
		this.fechaDeFinalizacion = fechaDeFinalizacion;
	}

	public String getFechaDeInicio() {
		return fechaDeInicio;
	}

	public void setFechaDeInicio(String fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}

	public String getFechaDeInstalacion() {
		return fechaDeInstalacion;
	}

	public void setFechaDeInstalacion(String fechaDeInstalacion) {
		this.fechaDeInstalacion = fechaDeInstalacion;
	}

	public String getNombreDelEvento() {
		return nombreDelEvento;
	}

	public void setNombreDelEvento(String nombreDelEvento) {
		this.nombreDelEvento = nombreDelEvento;
	}

	public String getNumeroDePresupuesto() {
		return numeroDePresupuesto;
	}

	public void setNumeroDePresupuesto(String numeroDePresupuesto) {
		this.numeroDePresupuesto = numeroDePresupuesto;
	}

	public String getObservacionesDelCliente() {
		return observacionesDelCliente;
	}

	public void setObservacionesDelCliente(String observacionesDelCliente) {
		this.observacionesDelCliente = observacionesDelCliente;
	}

	public String getObservacionesDelEvento() {
		return observacionesDelEvento;
	}

	public void setObservacionesDelEvento(String observacionesDelEvento) {
		this.observacionesDelEvento = observacionesDelEvento;
	}

	public Set getSalas() {
		return salas;
	}

	public void setSalas(Set salas) {
		this.salas = salas;
	}

	public String getTotalDePersonas() {
		return totalDePersonas;
	}

	public void setTotalDePersonas(String totalDePersonas) {
		this.totalDePersonas = totalDePersonas;
	}
	
	public void agregarSala ( PresupuestoAbstracto.Sala sala) {
		
		salas.add ( sala );
		
	}
	
	public class Sala {
		
		private String codigoSalaLugar;
		private String fechaDeInicio;
		private String fechaDeFinalizacion;
		private String fechaDeInstalacion;
		private String totalDePersonas;
		
		private Set servicios;
		
		public Sala() { servicios = new HashSet(); }

		public String getCodigoSalaLugar() {
			return codigoSalaLugar;
		}

		public void setCodigoSalaLugar(String codigoSalaLugar) {
			this.codigoSalaLugar = codigoSalaLugar;
		}

		public String getFechaDeFinalizacion() {
			return fechaDeFinalizacion;
		}

		public void setFechaDeFinalizacion(String fechaDeFinalizacion) {
			this.fechaDeFinalizacion = fechaDeFinalizacion;
		}

		public String getFechaDeInicio() {
			return fechaDeInicio;
		}

		public void setFechaDeInicio(String fechaDeInicio) {
			this.fechaDeInicio = fechaDeInicio;
		}

		public String getFechaDeInstalacion() {
			return fechaDeInstalacion;
		}

		public void setFechaDeInstalacion(String fechaDeInstalacion) {
			this.fechaDeInstalacion = fechaDeInstalacion;
		}		

		public Set getServicios() {
			return servicios;
		}

		public void setServicios(Set servicios) {
			this.servicios = servicios;
		}

		public String getTotalDePersonas() {
			return totalDePersonas;
		}

		public void setTotalDePersonas(String totalDePersonas) {
			this.totalDePersonas = totalDePersonas;
		}
		
		public void agregarServicio ( 
				PresupuestoAbstracto.Sala.Servicio servicio ) {
			
			servicios.add ( servicio );
			
		}
		
		public class Servicio {
			
			private String orden;
			private String cantidad;
			private String codigoServicio;
			private String codigoModalidadContratacion;
			private String dias;
			
			private Set accesorios;

			public Servicio() { accesorios = new HashSet(); }
			
			public Set getAccesorios() {
				return accesorios;
			}

			public void setAccesorios(Set accesorios) {
				this.accesorios = accesorios;
			}

			public String getCantidad() {
				return cantidad;
			}

			public void setCantidad(String cantidad) {
				this.cantidad = cantidad;
			}

			public String getCodigoModalidadContratacion() {
				return codigoModalidadContratacion;
			}

			public void setCodigoModalidadContratacion(String codigoModalidadContratacion) {
				this.codigoModalidadContratacion = codigoModalidadContratacion;
			}

			public String getCodigoServicio() {
				return codigoServicio;
			}

			public void setCodigoServicio(String codigoServicio) {
				this.codigoServicio = codigoServicio;
			}

			public String getDias() {
				return dias;
			}

			public void setDias(String dias) {
				this.dias = dias;
			}	

			public String getOrden() {
				return orden;
			}

			public void setOrden(String orden) {
				this.orden = orden;
			}
			
			public void agregarAccesorio ( 
					PresupuestoAbstracto.Sala.Servicio.Accesorio accesorio ) {
				
				accesorios.add ( accesorio );
				
			}
			
			public class Accesorio {
				
				private String codigoAccesorio;
				
				public Accesorio(){}

				public String getCodigoAccesorio() {
					return codigoAccesorio;
				}

				public void setCodigoAccesorio(String codigoAccesorio) {
					this.codigoAccesorio = codigoAccesorio;
				}

			}
			
		}
		
	}

	public String getResponsableEmail() {
		return responsableEmail;
	}

	public void setResponsableEmail(String responsableEmail) {
		this.responsableEmail = responsableEmail;
	}

	public String getResponsableEvento() {
		return responsableEvento;
	}

	public void setResponsableEvento(String responsableEvento) {
		this.responsableEvento = responsableEvento;
	}

	public String getResponsableNextelFlota() {
		return responsableNextelFlota;
	}

	public void setResponsableNextelFlota(String responsableNextelFlota) {
		this.responsableNextelFlota = responsableNextelFlota;
	}

	public String getResponsableNextelId() {
		return responsableNextelId;
	}

	public void setResponsableNextelId(String responsableNextelId) {
		this.responsableNextelId = responsableNextelId;
	}

	public String getResponsableTel() {
		return responsableTel;
	}

	public void setResponsableTel(String responsableTel) {
		this.responsableTel = responsableTel;
	}
}
