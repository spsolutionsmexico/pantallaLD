package Beans;

import java.io.Serializable;

public class Usuario implements Serializable{
    private int idUsuario;
    private int idSucursal;
    private int idPerfil;
    private int idAreaNegocio;
    private int nombrePerfil;
    private String nombreUsuario;
    public Usuario() {
        super();
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdAreaNegocio(int idAreaNegocio) {
        this.idAreaNegocio = idAreaNegocio;
    }

    public int getIdAreaNegocio() {
        return idAreaNegocio;
    }

    public void setNombrePerfil(int nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public int getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
}
