package Beans;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;

public class Caso implements Serializable {
    private int idCaso;
    private DetalleCaso detalleCaso;
    private DetalleCliente detalleCliente;
    private ArrayList<Alerta> alertas;
    private ArrayList<Comentario> comentarios;
    private ArrayList<CasoRelacionado> casosRelacionados;
    private ArrayList<Documento> documentos;

    public Caso() {
        super();
        GetInfoCaso infocaso = new GetInfoCaso();
        infocaso.getInfoCasoFromBindings();
        ConsultarWS consultarWS = new ConsultarWS();
        consultarWS.obtenerData();
        //--seteo id cliente
        this.idCaso=123456;
        //--seteo detalle de caso
        DetalleCaso ddcaso = new DetalleCaso();
        ddcaso.setAnalista("Alanista dev");
        ddcaso.setCalificacion("SS");
        ddcaso.setCalificacionPLD("AA");
        ddcaso.setEstadoCaso("OK");
        ddcaso.setFechaCierre("20/12/17");
        ddcaso.setFechaRegistro("19/12/17");
        this.detalleCaso=ddcaso;
        //--seteo detalle de cliente
        DetalleCliente ddcliente = new DetalleCliente();
        ddcliente.setIdCliente("987654");
        ddcliente.setNombreCliente("John Doe");
        ddcliente.setNumeroCredencial("123456789");
        this.detalleCliente=ddcliente;
        //--seteo alertas 
        Alerta alertaRow1 = new Alerta();
        alertaRow1.setCalificacion("AA");
        alertaRow1.setFechaRegistro("12/12/17");
        alertaRow1.setId(01);
        alertaRow1.setSeleccionado(false);
        alertaRow1.setTipoAlerta("tipo1");
        alertaRow1.setValida("OK");
        
        Alerta alertaRow2 = new Alerta();
        alertaRow2.setCalificacion("BB");
        alertaRow2.setFechaRegistro("12/12/17");
        alertaRow2.setId(01);
        alertaRow2.setSeleccionado(false);
        alertaRow2.setTipoAlerta("tipo2");
        alertaRow2.setValida("OK");
        
        this.alertas = new ArrayList();
        this.alertas.add(alertaRow1);
        this.alertas.add(alertaRow2);        
        
        //seteo cometarios 
        Comentario comentarioRow1 = new Comentario();
        comentarioRow1.setComentario("---------comentario-------------");
        comentarioRow1.setEsPublico("si");
        comentarioRow1.setEvento("evento");
        comentarioRow1.setFechaRegistro("20/12/17");
        comentarioRow1.setId(12345);
        comentarioRow1.setSeveridad(1);
        comentarioRow1.setUsuario("Pancho Lopez");
        
        Comentario comentarioRow2 = new Comentario();
        comentarioRow2.setComentario("---------comentario 2-------------");
        comentarioRow2.setEsPublico("si");
        comentarioRow2.setEvento("evento2");
        comentarioRow2.setFechaRegistro("20/12/17");
        comentarioRow2.setId(12345);
        comentarioRow2.setSeveridad(1);
        comentarioRow2.setUsuario("Juan Perez");
        
        this.comentarios=new ArrayList(); 
        this.comentarios.add(comentarioRow1);
        this.comentarios.add(comentarioRow2);
        
        //--seteo casosRelacionados
        
        CasoRelacionado casorelacionadoRow1 =new CasoRelacionado();
        casorelacionadoRow1.setComentarios("comentarios");
        casorelacionadoRow1.setEstado("estado");
        casorelacionadoRow1.setFechaRegistro("10/12/17");
        casorelacionadoRow1.setId(5);
        casorelacionadoRow1.setIdCasoOrigen(10);
        casorelacionadoRow1.setIdCasoRelacionado(15);
        casorelacionadoRow1.setTipoRelacion("tipoRelacion");
        casorelacionadoRow1.setSeleccionado(false);
        
        CasoRelacionado casorelacionadoRow2 =new CasoRelacionado();
        casorelacionadoRow2.setComentarios("comentarios");
        casorelacionadoRow2.setEstado("estado");
        casorelacionadoRow2.setFechaRegistro("01/12/17");
        casorelacionadoRow2.setId(50);
        casorelacionadoRow2.setIdCasoOrigen(100);
        casorelacionadoRow2.setIdCasoRelacionado(150);
        casorelacionadoRow2.setTipoRelacion("tipoRelacion");
        casorelacionadoRow2.setSeleccionado(false);
        
        this.casosRelacionados= new ArrayList(); 
        this.casosRelacionados.add(casorelacionadoRow1);
        this.casosRelacionados.add(casorelacionadoRow2);
        
        //--seteo Documentos
        
        Documento documentoRow1 = new Documento();
        documentoRow1.setActivo(true);
        documentoRow1.setDescripcion("descripcion");
        Date fr = new Date();
        documentoRow1.setFechaRegistro(fr);
        documentoRow1.setId(456);
        documentoRow1.setIdCaso(123);
        documentoRow1.setIdTipo("doc");
        documentoRow1.setNombre("My Documeto 1");
        documentoRow1.setTamanio(123456);
        documentoRow1.setTipoDocumento(".docx");
        documentoRow1.setUrl("http://www.url-doc.com");
        Usuario us = new Usuario();
        //seteo ususario
        us.setIdAreaNegocio(05);
        us.setIdPerfil(01);
        us.setIdSucursal(101);
        us.setIdUsuario(12345);
        us.setNombrePerfil(02);
        us.setNombreUsuario("John Doe");
        documentoRow1.setUsuarioCarga(us);
        this.documentos= new ArrayList();
        this.documentos.add(documentoRow1);
    }
    public void setAlertas(ArrayList<Alerta> alertas) {
        this.alertas = alertas;
    }

    public ArrayList<Alerta> getAlertas() {
        return alertas;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setCasosRelacionados(ArrayList<CasoRelacionado> casosRelacionados) {
        this.casosRelacionados = casosRelacionados;
    }

    public ArrayList<CasoRelacionado> getCasosRelacionados() {
        return casosRelacionados;
    }

    public void setDocumentos(ArrayList<Documento> documentos) {
        this.documentos = documentos;
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }

    public void setIdCaso(int idCaso) {
        this.idCaso = idCaso;
    }

    public int getIdCaso() {
        return idCaso;
    }

    public void setDetalleCaso(DetalleCaso detalleCaso) {
        this.detalleCaso = detalleCaso;
    }

    public DetalleCaso getDetalleCaso() {
        return detalleCaso;
    }

    public void setDetalleCliente(DetalleCliente detalleCliente) {
        this.detalleCliente = detalleCliente;
    }

    public DetalleCliente getDetalleCliente() {
        return detalleCliente;
    }
}
