

package crud;
import java.sql.*;

import java.util.Scanner;
/**
 *
 * @author Mishu Rahman Id:181472616
 */
public class CreateDB {

   static final String DB_URL = "jdbc:mysql://localhost/";
   static final String USER = "root";
   static final String PASS = "";

   public  void createDB() {
     
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter Database Name: ");
        String dbName = scan.nextLine();
        
        try{  
            Class.forName("com.mysql.jdbc.Driver"); 
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "CREATE DATABASE "+dbName;
         stmt.executeUpdate(sql);
         System.out.println("Database created successfully... With naem"+dbName);   	  
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }catch(Exception e){ System.out.println(e);}  
   }
}
