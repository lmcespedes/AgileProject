package co.com.cct.requerimientos.repositories.mongo.entities;

/**
 * @author Lina C
 *
 */
public class Vendedor {
	String identificacion;       
	String vendedorNombre;
	public Vendedor() {
		super();
	}
	public Vendedor(String identificacion, String vendedorNombre) {
		super();
		this.identificacion = identificacion;
		this.vendedorNombre = vendedorNombre;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getVendedorNombre() {
		return vendedorNombre;
	}
	public void setVendedorNombre(String vendedorNombre) {
		this.vendedorNombre = vendedorNombre;
	}
	
	
}
