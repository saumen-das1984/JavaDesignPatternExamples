package objectpool.design.pattern.example;

import java.sql.Connection;
import java.sql.SQLException;

   public class ObjectPoolTest {
	  public static void main(String args[]) {
	   
	    // Create Database ConnectionPool		  
	    JDBCConnectionPool pool = new JDBCConnectionPool(
	      "oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@localhost:1521:EMP",
	      "username", "password");

	    // Get a connection
	      Connection con = pool.checkOut();
	      try {
			con.prepareStatement("your database queries");
		  } catch (SQLException e) {			
			e.printStackTrace();
		  }

	     // Use the connection	  

	    // Return the connection   	 
	  }
	}
   
   
   