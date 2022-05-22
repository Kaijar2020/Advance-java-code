

package crud;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Mishu Rahman Id:181472616
 */
class SelectTable {
   Scanner scan = new Scanner(System.in);
   static final String DB_URL = "jdbc:mysql://localhost/registration";
   static final String USER = "root";
   static final String PASS = "";

   public  void selectTB() {
      // Open a connection
      System.out.println("Enter Table Name: ");
        String tbName = scan.nextLine();
        String QUERY = "SELECT stId, first, last, batch, mobile FROM "+tbName;
        
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
      ) {		      
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("stId"));
            System.out.print(", First Name: " + rs.getString("first"));
            System.out.print(", Last Name: " + rs.getString("last"));
            System.out.print(", Batch: " + rs.getString("batch"));
            System.out.println(", Mobile: " + rs.getString("mobile"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}

