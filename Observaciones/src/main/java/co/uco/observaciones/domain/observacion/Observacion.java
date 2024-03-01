package co.uco.observaciones.domain.observacion;

import co.uco.observaciones.domain.recomendacion.Recomendacion;

import java.util.ArrayList;
import java.util.List;

public class Observacion {

    private long id;

    private List<Recomendacion> recomendacionList = new ArrayList<>();

    private String descripcion;

    private String mejora;

    public Observacion(){
        this.id=1;
        this.recomendacionList.add(new Recomendacion());
        this.descripcion= "vacio";
        this.mejora="vacio";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Recomendacion> getRecomendacionesList(){
        return recomendacionList;
    }
    public void setRecomendacionesList(List<Recomendacion> recomendacionList) {
        this.recomendacionList = recomendacionList;
    }

    public String getMejora() {
        return mejora;
    }

    public void setMejora(String mejora) {
        this.mejora = mejora;
    }
}
