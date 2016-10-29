package co.com.cct.requerimientos.services;

import java.sql.SQLException;


import javax.ws.rs.Consumes;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import org.springframework.data.mongodb.core.MongoOperations;






import co.com.cct.requerimientos.repositories.mongo.entities.Requerimiento;
import co.com.cct.requerimientos.repositories.mongo.operations.CRUD;
import co.com.cct.requerimientos.repositories.mongo.operations.CriterioBusqueda;

import  co.com.cct.requerimientos.repositories.oracle.*;
import co.com.cct.requerimientos.repositories.oracle.entities.Insert;

/**
 * @author Lina C
 *
 */
@Path("/Registrar")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Requerimientos {
	MongoOperations mongoOperation;
	public Requerimientos(MongoOperations mongoOperation){this.mongoOperation=mongoOperation;}
	
	
	
	@POST
	@Path("Requerimiento")
	public Response requerimiento(Insert insert) {
		Operation o=new Operation();
		try {
			o.add(insert.getDescripcion(),insert.getCriterio(),insert.getCostoTotal(),insert.getPrioridad(),insert.getNombre(),insert.getIdentificacion());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			RegistrarResponse response=new RegistrarResponse(5,e.getMessage());
			return Response.status(500).entity(response).build();
		}
		RegistrarResponse response=new RegistrarResponse(0,"Registro realizado exitosamente");
		return Response.status(200).entity(response).build();
		}
	
	@POST
	//@Consumes(MediaType.APPLICATION_JSON)
	//@Timed
	@Path("RequerimientoSave")
	public Response requerimientoInsertar(Requerimiento requerimiento) {		
		CRUD crud = new CRUD();
		crud.insert(mongoOperation, requerimiento);
		RegistrarResponse response=new RegistrarResponse(0,"Registro realizado exitosamente");
		return Response.status(200).entity(response).build();
		}
	
	@POST
	//@Consumes(MediaType.APPLICATION_JSON)
	//@Timed
	@Path("RequerimientoFind")
	public Response requerimientoConsultar(CriterioBusqueda criterioBusqueda) {		
		CRUD crud = new CRUD();
		crud.find(mongoOperation, criterioBusqueda);		
		return Response.status(200).entity(crud.find(mongoOperation, criterioBusqueda)).build();
		}
	
}
