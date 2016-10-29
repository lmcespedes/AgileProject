package co.com.cct.requerimientos.repositories.mongo.operations;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import co.com.cct.requerimientos.repositories.mongo.entities.Requerimiento;

/**
 * @author Lina C
 *
 */
public class CRUD {
	
	public void insert(MongoOperations mongoOperation, Requerimiento requerimiento)
	{
		mongoOperation.save(requerimiento);
	}
	
	public void findOne(MongoOperations mongoOperation, CriterioBusqueda criterioBusqueda)
	{
		Query searchUserQuery=null;		
		 searchUserQuery = new Query(Criteria.where("id").is(criterioBusqueda.getId()));
		 List<Requerimiento> listRequerimientos = mongoOperation.find(searchUserQuery, Requerimiento.class);
		 System.out.println("");
	}
	
	public List<Requerimiento> find(MongoOperations mongoOperation, CriterioBusqueda criterioBusqueda)
	{
		Query searchUserQuery=null;
		//if(criterioBusqueda.fechaApertura!=null && criterioBusqueda.fechaVencimiento==null && criterioBusqueda.identificacion==null)
		 // searchUserQuery = new Query(Criteria.where("vendedor.identificacion").is(criterioBusqueda.fechaApertura).and("fechaVencimiento").is(criterioBusqueda.fechaVencimiento).and("vendedor.identificacion").is(criterioBusqueda.identificacion));
		List<Requerimiento> listRequerimientos =null; 
		if(criterioBusqueda.getIdentificacion()!=null && criterioBusqueda.getFechaVencimientoInicio()==null && criterioBusqueda.getFechaVencimientoFin()==null)			
			searchUserQuery = new Query(Criteria.where("vendedor.identificacion").is(criterioBusqueda.getIdentificacion()));
		else
		{
			if(criterioBusqueda.getIdentificacion()==null && criterioBusqueda.getFechaVencimientoInicio()!=null && criterioBusqueda.getFechaVencimientoFin()!=null)
				searchUserQuery = new Query(Criteria.where("fechaVencimiento").gt(criterioBusqueda.fechaVencimientoInicio).lte(criterioBusqueda.fechaVencimientoFin));			
			else			
				searchUserQuery = new Query(Criteria.where("vendedor.identificacion").is(criterioBusqueda.getIdentificacion()).and("fechaVencimiento").gt(criterioBusqueda.fechaVencimientoInicio).lte(criterioBusqueda.fechaVencimientoFin));			
		}	
		
		listRequerimientos = mongoOperation.find(searchUserQuery, Requerimiento.class);
		
	
		 return listRequerimientos;
	}
	
	

}
