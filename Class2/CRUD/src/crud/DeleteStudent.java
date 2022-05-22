

package crud;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Mishu Rahman Id:181472616
 */
public class DeleteStudent {
   Scanner scan = new Scanner(System.in);

   static final String DB_URL = "jdbc:mysql://localhost/registration";
   static final String USER = "guest";
   static final String PASS = "guest123";

   public  void deleteS() {
      // Open a connection
      System.out.println("Enter Id to delete: ");
        int id = scan.nextInt();
        scan.nextLine();
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "DELETE FROM student " +
            "WHERE stId = "+id;
         stmt.executeUpdate(sql);
         
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}