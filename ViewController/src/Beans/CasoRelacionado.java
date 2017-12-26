package Beans;

import java.io.Serializable;

public class CasoRelacionado implements Serializable {
    private int id;
    private int idCasoOrigen;
    private int idCasoRelacionado;
    private String fechaRegistro;
    private String tipoRelacion;
    private String estado;
    private String comentarios;
    private Boolean seleccionado;

    public CasoRelacionado() {
        super();
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setIdCasoOrigen(int idCasoOrigen) {
        this.idCasoOrigen = idCasoOrigen;
    }

    public int getIdCasoOrigen() {
        return idCasoOrigen;
    }

    public void setIdCasoRelacionado(int idCasoRelacionado) {
        this.idCasoRelacionado = idCasoRelacionado;
    }

    public int getIdCasoRelacionado() {
        return idCasoRelacionado;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setTipoRelacion(String tipoRelacion) {
        this.tipoRelacion = tipoRelacion;
    }

    public String getTipoRelacion() {
        return tipoRelacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setSeleccionado(Boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    public Boolean getSeleccionado() {
        return seleccionado;
    }
}
