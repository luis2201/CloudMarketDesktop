package model;

public class UsuarioModel {
    int idusuario;
    String nombres;
    String usuario;
    String contrasena;
    int idrol;
    String foto;
    boolean estado;
    
    public UsuarioModel() {

    }
    
    public UsuarioModel(int idusuario, String nombres, String usuario, String contrasena, int idrol, String foto, boolean estado) {
        this.idusuario = idusuario;
        this.nombres = nombres;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.idrol = idrol;
        this.foto = foto;
        this.estado = estado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
