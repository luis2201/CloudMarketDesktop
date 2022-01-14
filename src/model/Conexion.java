package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    
    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:330/cloudmarket";
        String user = "cloudmarket";
        String pass = "cloudmarket";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            
        } catch(Exception e) {
            
        }
        return con;
    }
}
