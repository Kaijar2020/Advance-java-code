package crud;

import java.util.Scanner;

/**
 *
 * @author Mishu Rahman
 */
public class CRUD {
       

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CreateDB cd = new CreateDB();
        CreateTable ct = new CreateTable();
        SelectTable st = new SelectTable();
        DeleteStudent ds = new DeleteStudent();
        System.out.println("Select 1 for create database\n2 for Table \n 3 for insert \n 4 for select\n4 for delete");
         int id = scan.nextInt();
        if(id==1){
            cd.createDB();
        }else if(id==2){
            ct.createTable();
            
        }
        else if(id==3){
            ct.createTable();
            
        }
        else if(id==4){
            st.selectTB();
            
        }else if(id == 5){
            ds.deleteS();
        }
        
        
        
        
    }
    
}
