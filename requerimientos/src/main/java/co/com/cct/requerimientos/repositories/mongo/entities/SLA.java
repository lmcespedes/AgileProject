package co.com.cct.requerimientos.repositories.mongo.entities;

/**
 * @author Lina C
 *
 */
public class SLA {
	String descripcion;
	String criterioMedicion;
	String periodicidad;
	String multa;
	public SLA() {
		super();
	}
	public SLA(String descripcion, String criterioMedicion, String periodicidad, String multa) {
		super();
		this.descripcion = descripcion;
		this.criterioMedicion = criterioMedicion;
		this.periodicidad = periodicidad;
		this.multa = multa;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCriterioMedicion() {
		return criterioMedicion;
	}
	public void setCriterioMedicion(String criterioMedicion) {
		this.criterioMedicion = criterioMedicion;
	}
	public String getPeriodicidad() {
		return periodicidad;
	}
	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}
	public String getMulta() {
		return multa;
	}
	public void setMulta(String multa) {
		this.multa = multa;
	}
	
	

}
