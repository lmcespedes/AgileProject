package co.com.cct.requerimientos.services;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Lina C
 *
 */
public class RegistrarResponse {
	
	private int status;
	private Object response;
	
	@JsonCreator
	public RegistrarResponse() {
		super();
	}
	
	@JsonCreator
	public RegistrarResponse(@JsonProperty("status")int status,@JsonProperty("response") Object response) {
		super();
		this.status = status;
		this.response = response;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}
	
	
}
