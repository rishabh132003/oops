

import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:/tmp/mysql.sock/qems","root", "rbj132003");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
