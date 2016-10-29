package co.com.cct.requerimientos.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * @author Lina C
 *
 */
public class RegistrarHealthCheck extends HealthCheck {
	
	public RegistrarHealthCheck(){}

	@Override
	protected Result check() throws Exception {
		// TODO Auto-generated method stub
		return Result.healthy("OK");
	}
	
	

}
