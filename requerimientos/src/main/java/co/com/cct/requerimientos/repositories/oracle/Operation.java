package co.com.cct.requerimientos.repositories.oracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Operation {
	
    public String consultar(String sql) throws SQLException{
        Connection conn =Persistency.getConnection();
        String resultado="";
        conn.setAutoCommit(false);
        Statement stmt = conn.createStatement();
        ResultSet rset =stmt.executeQuery(sql);
        while (rset.next())
         resultado=rset.getString(1);
        stmt.close();        
        conn.close();
        return resultado;
    }
    
   public String add(String descripcion,String criterio, long costoTotal,int prioridad,String nombre,String identificacion) throws SQLException
   {
	   Connection conn =Persistency.getConnection();
	   Statement stmt = conn.createStatement();
	   conn.setAutoCommit(true); 
	   String sql = "INSERT INTO SLAMinimos(descripcion, criterio) VALUES ('"+descripcion+"','"+criterio+"')";
	   stmt.executeUpdate(sql);
	   sql = "INSERT INTO requerimientos(costoTotal, prioridad) VALUES ("+costoTotal+","+prioridad+")";
	   stmt.executeUpdate(sql);
	   sql = "INSERT INTO vendedores(nombre, identificacion) VALUES ("+prioridad+","+identificacion+")";
	   stmt.executeUpdate(sql);
	   stmt.close();        
	   conn.close();
	   return "";
   }

}
