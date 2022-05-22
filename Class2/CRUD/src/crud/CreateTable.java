

package crud;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Mishu Rahman Id:181472616
 */
class CreateTable {

   public  void createTable() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Database Name: ");
        String dbName = scan.nextLine();
        String DB_URL = "jdbc:mysql://localhost/"+dbName;
        String USER = "root";
        String PASS = "";
        System.out.println("Enter Table Name: ");
        String tbName = scan.nextLine();
      try{  
            Class.forName("com.mysql.jdbc.Driver");  
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE "+tbName+" IF NOT EXISTS " +
                   "(id INTEGER not NULL AUTO_INCREMENT, " +
                   " stId INTEGER, " + 
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " mobile VARCHAR(255), " + 
                   " batch VARCHAR(255), " + 
                   " PRIMARY KEY ( id ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
      }catch(Exception e){ System.out.println(e);} 
   }
}