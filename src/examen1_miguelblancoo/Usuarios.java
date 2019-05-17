package examen1_miguelblancoo;

public class Usuarios {

    String usuario;
    String contrasena;
    String poder;


    public Usuarios(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Usuarios(String usuario, String contrasena, String poder) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.poder = poder;
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

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }

}
