package Beans;

import java.io.Serializable;

public class DetalleCliente implements Serializable{
    private String idCliente;
    private String nombreCliente;
    private String numeroCredencial;
    public DetalleCliente() {
        super();
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNumeroCredencial(String numeroCredencial) {
        this.numeroCredencial = numeroCredencial;
    }

    public String getNumeroCredencial() {
        return numeroCredencial;
    }
}
