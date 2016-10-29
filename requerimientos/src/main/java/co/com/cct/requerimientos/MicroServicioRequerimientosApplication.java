package co.com.cct.requerimientos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import co.com.cct.requerimientos.health.RegistrarHealthCheck;
import co.com.cct.requerimientos.services.Requerimientos;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * @author Lina C
 *
 */
public class MicroServicioRequerimientosApplication extends Application<MicroServicioRequerimientosConfig> 
{
    public static void main( String[] args ) throws Exception
    {
        new MicroServicioRequerimientosApplication().run(new String []{"server",  "microservicio-desarrollo.yml"});
        //localhost:9000/Registrar/Requerimiento?numero1=1&numero2=2
    }

	@Override
	public void initialize(Bootstrap<MicroServicioRequerimientosConfig> bootstrap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(MicroServicioRequerimientosConfig configuration, Environment environment) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new GenericXmlApplicationContext("Config.xml");
	   	MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		final Requerimientos registrar=new Requerimientos(mongoOperation);
		environment.healthChecks().register("HealthCheckRegistrar",new RegistrarHealthCheck());
		environment.jersey().register(registrar);
		
	}
}
