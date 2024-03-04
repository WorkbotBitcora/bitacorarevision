package co.uco.observaciones.domain.bitacora;

import co.uco.observaciones.domain.revision.Revision;
import co.uco.observaciones.domain.usuario.Usuario;
import jakarta.persistence.*;

@Entity
@Table (name = "Bitacoras")
public class Bitacora {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Usuario usuario;

    private String fecha;

    private Descripcion descripcion;

    private co.uco.observaciones.domain.revision.Revision Revision;

    private Estado Estado;

    private Bitacora(Usuario usuario, Descripcion descripcion) {
        this.id = 1;
        this.usuario = usuario;
        this.fecha = "01/02/2001";
        this.descripcion = descripcion;
        this.Revision = new Revision();
        this.Estado = new Estado();
    }

    public Bitacora(){

    }
    public Bitacora(long id, Usuario usuario, String fecha, Descripcion descripcion, Revision Revision, Estado Estado){
        this.id = id;
        this.usuario = usuario;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.Revision = Revision;
        this.Estado = Estado;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuarioID) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Descripcion getDescription() {
        return descripcion;
    }

    public void setDescripcion(long descriptionID) {
        this.descripcion = descripcion;
    }

    public Revision getRevision() {
        return Revision;
    }

    public void setRevision(Revision revisionID) {
        this.Revision = Revision;
    }

    public Estado getEstado() {
        return Estado;
    }

    public void setEstado(Estado Estado) {
        this.Estado = Estado;
    }
}


