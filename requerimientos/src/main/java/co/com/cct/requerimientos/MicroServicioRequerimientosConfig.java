package co.com.cct.requerimientos;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

/**
 * @author Lina C
 *
 */
public class MicroServicioRequerimientosConfig extends Configuration{
	
	private String nombre;

	@JsonProperty
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
