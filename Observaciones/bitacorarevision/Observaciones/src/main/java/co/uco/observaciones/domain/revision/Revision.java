package co.uco.observaciones.domain.revision;

import co.uco.observaciones.domain.observacion.Observacion;
import co.uco.observaciones.domain.equipo.Equipo;

public class Revision {
    private long id;
    private Observacion observacion;

    private String fecha;

    private co.uco.observaciones.domain.equipo.Equipo Equipo;

    public Revision() {
        this.id=1;
        this.fecha ="01/01/2020";
        this.observacion = new Observacion();
        this.Equipo = new Equipo();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Observacion getObservacion() {
        return observacion;
    }

    public void setObservacion(Observacion observacion) {
        this.observacion = observacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Equipo getEquipo() {
        return Equipo;
    }

    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }
}