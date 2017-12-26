package Beans;

import java.io.Serializable;

public class Comentario implements Serializable {
    private int id;
    private String usuario;
    private String fechaRegistro;
    private String esPublico;
    private String comentario;
    private int severidad; 
    private String evento;

    public Comentario() {
        super();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setEsPublico(String esPublico) {
        this.esPublico = esPublico;
    }

    public String getEsPublico() {
        return esPublico;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setSeveridad(int severidad) {
        this.severidad = severidad;
    }

    public int getSeveridad() {
        return severidad;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }
}
