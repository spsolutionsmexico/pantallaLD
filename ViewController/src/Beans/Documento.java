package Beans;

import java.io.Serializable;
import java.util.Date;
public class Documento implements Serializable {
    private int idCaso;
    private int id;
    private String nombre;
    private String descripcion;
    private String idTipo;
    private boolean activo;
    private String tipoDocumento;
    private Date fechaRegistro;
    private String url;
    private Usuario usuarioCarga;
    private String contenidoBase64;
    private Integer tamanio;
   
    public Documento() {
        super();
    }


    public void setIdCaso(int idCaso) {
        this.idCaso = idCaso;
    }

    public int getIdCaso() {
        return idCaso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }

    public String getIdTipo() {
        return idTipo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUsuarioCarga(Usuario usuarioCarga) {
        this.usuarioCarga = usuarioCarga;
    }

    public Usuario getUsuarioCarga() {
        return usuarioCarga;
    }

    public void setContenidoBase64(String contenidoBase64) {
        this.contenidoBase64 = contenidoBase64;
    }

    public String getContenidoBase64() {
        return contenidoBase64;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getTamanio() {
        return tamanio;
    }
}
