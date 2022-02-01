package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con;
    
    public Connection getConnection() throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost/cloudmarket";
        String user = "cloudmarket";
        String pass = "cloudmarket";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url + "?"+"user="+user+"&password="+pass);
        } catch(SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
        return con;
    }
}
