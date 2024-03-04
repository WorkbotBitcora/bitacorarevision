package co.uco.observaciones.domain.equipo;

public class tipoEquipos {

    private long id;

    private String nombre;

    public tipoEquipos(){
        this.id=1;
        this.nombre ="no hay ningun equipo registrado";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
