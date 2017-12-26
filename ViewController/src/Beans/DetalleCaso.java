package Beans;

import java.io.Serializable;

public class DetalleCaso implements Serializable {
    private String estadoCaso;
    private String calificacion;
    private String calificacionPLD;
    private String fechaRegistro;
    private String fechaCierre;
    private String analista;


    public DetalleCaso() {
        super();
    }

    public void setEstadoCaso(String estadoCaso) {
        this.estadoCaso = estadoCaso;
    }

    public String getEstadoCaso() {
        return estadoCaso;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacionPLD(String calificacionPLD) {
        this.calificacionPLD = calificacionPLD;
    }

    public String getCalificacionPLD() {
        return calificacionPLD;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setAnalista(String analista) {
        this.analista = analista;
    }

    public String getAnalista() {
        return analista;
    }
}
