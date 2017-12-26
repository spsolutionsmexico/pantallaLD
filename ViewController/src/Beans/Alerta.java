package Beans;

import java.io.Serializable;

public class Alerta implements Serializable {
    private int id;
    private String fechaRegistro;
    private String tipoAlerta;
    private String valida;
    private String calificacion;
    private Boolean seleccionado;

    public Alerta() {
        super();
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setTipoAlerta(String tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }

    public String getTipoAlerta() {
        return tipoAlerta;
    }

    public void setValida(String valida) {
        this.valida = valida;
    }

    public String getValida() {
        return valida;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setSeleccionado(Boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    public Boolean getSeleccionado() {
        return seleccionado;
    }
}

