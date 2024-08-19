
import java.sql.*;  //for connection class obj.... 
import java.sql.DriverManager;
public class Conn {
    
    Connection c;
    Statement s;


    Conn(){
        try {
            
            //step-1 Register the driver....
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step 2- Creating connection string... to mysql
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","raj18110");
            //step 3- create statement....
            s = c.createStatement();
        

        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
    public static void main(String[] args) {
        System.out.println("connection");
        
    }
}
