import java.sql.*;
public class connect {

    public static void main(String[] args){

        Connection c=null;
             try{

                Class.forName("org.sqlite.JDBC");
                c= DriverManager.getConnection("jdbc:sqlite:firstdatabase.db");
                System.out.println("connected");
             }catch(Exception ex){
                 System.out.println("can not connected");
                 System.exit(0);
             }
    }
    
}