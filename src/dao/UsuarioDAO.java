package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Conexion;
import model.UsuarioModel;

public class UsuarioDAO {
    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar(){
        List<UsuarioModel>datos = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        try{
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                UsuarioModel u = new UsuarioModel();
                u.setIdusuario(rs.getInt(1));
                u.setNombres(rs.getString(2));
                u.setUsuario(rs.getString(3));
                u.setContrasena(rs.getString(4));
                u.setIdrol(rs.getInt(5));
                u.setFoto(rs.getString(6));
                u.setEstado(rs.getBoolean(7));
                datos.add(u);
            }
        } catch(Exception e){
            System.out.print("Error! " + e);
        }
        return datos;
    }
}
