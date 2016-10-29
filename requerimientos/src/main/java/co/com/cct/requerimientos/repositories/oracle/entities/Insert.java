package co.com.cct.requerimientos.repositories.oracle.entities;

/**
 * @author Lina C
 *
 */
public class Insert {
	String descripcion;
	String criterio;
	long costoTotal;
	int prioridad;
	String nombre;
	String identificacion;
	
	public Insert() {
		super();
	}
	public Insert(String descripcion, String criterio, long costoTotal, int prioridad, String nombre,
			String identificacion) {
		super();
		this.descripcion = descripcion;
		this.criterio = criterio;
		this.costoTotal = costoTotal;
		this.prioridad = prioridad;
		this.nombre = nombre;
		this.identificacion = identificacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCriterio() {
		return criterio;
	}
	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}
	public long getCostoTotal() {
		return costoTotal;
	}
	public void setCostoTotal(long costoTotal) {
		this.costoTotal = costoTotal;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	
}
