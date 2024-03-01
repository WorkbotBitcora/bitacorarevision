package co.uco.observaciones.domain.equipo;

public class Equipo {

    private long id;

    private String marca;

    private tipoEquipos tipoEquipo;

    public Equipo(){
        this.id=1;
        this.marca="no hay ninguna marca encontrada";
        this.tipoEquipo = new tipoEquipos();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca (){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public tipoEquipos getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(tipoEquipos tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }
}
