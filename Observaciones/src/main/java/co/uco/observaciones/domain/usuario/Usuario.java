package co.uco.observaciones.domain.usuario;

public class Usuario {

    private long id;

    private String nombre;

    private tipoUsuarios tipoUsuario;

    public Usuario(String nombre, long idTipoUsuario){
        this.id = 1;
        this.nombre = nombre;
        this.tipoUsuario = new tipoUsuarios(idTipoUsuario);

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre(){return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre; }

    public tipoUsuarios getTipoUsuarios (){ return tipoUsuario;}

    public void setTipoUsuario(tipoUsuarios tipoUsuario){ this.tipoUsuario = tipoUsuario;}
}
