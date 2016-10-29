package co.com.cct.requerimientos.repositories.mongo.operations;

import java.util.Date;

/**
 * @author Lina C
 *
 */
public class CriterioBusqueda {

	String id;
	Date fechaVencimientoInicio;
	Date fechaVencimientoFin;	
	String identificacion;
	


	public CriterioBusqueda() {
		super();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getFechaVencimientoInicio() {
		return fechaVencimientoInicio;
	}

	public void setFechaVencimientoInicio(Date fechaVencimientoInicio) {
		this.fechaVencimientoInicio = fechaVencimientoInicio;
	}

	public Date getFechaVencimientoFin() {
		return fechaVencimientoFin;
	}

	public void setFechaVencimientoFin(Date fechaVencimientoFin) {
		this.fechaVencimientoFin = fechaVencimientoFin;
	}
	
	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	

}
