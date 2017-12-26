package Beans;

import java.io.Serializable;

import java.util.List;

import javax.faces.context.FacesContext;


import oracle.adf.view.rich.context.AdfFacesContext;

//Modificar para obtener datos de los servicios


public class GetInfoCaso implements Serializable{
    /* ===============  VARIABLES   =================*/
    String facetName = "facetName";
    /* ===============  METHODS   =================*/
    public GetInfoCaso() {

        super();
    }

    public void getInfoCasoFromBindings() {
        
        String idCaso = "1";
        String rolUIId = "GerenteSucursal";
        String user = "Ususrio AR";
        String titulo = "Titulo01";
        String urlCRM="http://www.miurl.com";

        //Caso caso = new Caso();
        // Get idCaso
        //DCBindingContainer bindings = ((DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry());
        //AttributeBinding attrBinding = (AttributeBinding) bindings.getControlBinding("idCaso");

        //Set idCaso
        //idCaso = attrBinding.getInputValue() != null ? String.valueOf(attrBinding.getInputValue()) : "";
        // return id;
        //System.out.println("================ Method Call - idCaso:" + idCaso);

        // Get rolUIId
        //attrBinding = (AttributeBinding) bindings.getControlBinding("rolUIId");
        //Set rolUIId
        //rolUIId = attrBinding.getInputValue() != null ? String.valueOf(attrBinding.getInputValue()) : "AnalistaRiesgo";//"DocumentadorCaso"; //"GerenteSucursal";//"AnalistaCRM";//"AnalistaRiesgo";

        //AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_userRol", rolUIId);
        //System.out.println("================ Method Call - rolUIId:" + rolUIId);


        // Get idCliente
        //attrBinding = (AttributeBinding) bindings.getControlBinding("idCliente");
        //Set idCliente
        //String idCliente = attrBinding.getInputValue() != null ? String.valueOf(attrBinding.getInputValue()) : "1";

        //   AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_userRol", rolUIId);
        //System.out.println("================ Method Call - idCliente:" + idCliente);


        //Set titulo Rol
        titulo = getTituloRol(rolUIId);
        AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_tituloRol",titulo);
        AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_facetName", facetName);

        //Get Info Caso
        //BindingContainer bindings1 = getBindings();
        //OperationBinding operation = bindings1.getOperationBinding("GetFullInfoCaso");
        //operation.getParamsMap().put("idCaso", idCaso);
        //caso = (Caso) operation.execute();

        
        //Set caso bean to PageFlow
        //AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_caso", caso);
        //System.out.println("================ Method Call - GetFullInfoCaso:" + caso.getIdCaso() + " nombre: " +
        //                   caso.getNombreCliente() + " fecha:" + caso.getFechaRegistro());


        //Get userName
        //user = getBpmUserName();
        //System.out.println("================ Method Call - user:" + user);
        //Set uderName to PageFlow
        AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_userName", user);

        //Obtener Total Score
        //BindingContainer bindingsScore = getBindings();
        //OperationBinding operationScore = bindingsScore.getOperationBinding("obtenerTotalScore");
        //int totalScore = (Integer) operationScore.execute();
        
        //valor fijo para puebas 
        int totalScore = 1;
        //---------------
        AdfFacesContext.getCurrentInstance().getPageFlowScope().put("totalScore", totalScore);
        //System.out.println("================ Method Call - totalScore:" + totalScore);

        //Filtra Comentarios
        //BindingContainer bindingsComentarios = getBindings();
        //OperationBinding operationComentarios = bindingsComentarios.getOperationBinding("filtrarComentarios");
        //operationComentarios.getParamsMap().put("rol", rolUIId);
        //operationComentarios.execute();
        //System.out.println("================ Method Call - filtrarComentarios:" + rolUIId);
        
        // Get urlCRM
        //attrBinding = (AttributeBinding) bindings.getControlBinding("urlCRM");
        //Set urlCRM
        //urlCRM = attrBinding.getInputValue() != null ? String.valueOf(attrBinding.getInputValue()) : "";

        AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_urlCRM", urlCRM);
        //System.out.println("================ Method Call - p_urlCRM:" + urlCRM);
        
        
      
    }


    /** obteber ususrio bpm
     public String getBpmUserName() {
        FacesContext context = FacesContext.getCurrentInstance();
        String ctx =
            (String) context.getApplication().evaluateExpressionGet(context, "#{pageFlowScope.bpmWorklistContext}",
                                                                    String.class);
        IWorkflowServiceClient workflowSvcClient = ADFWorklistBeanUtil.getWorkflowServiceClient();
        ITaskQueryService wfQueryService = workflowSvcClient.getTaskQueryService();
        IWorkflowContext wfContext;
        String userName = "";
        try {
            wfContext = wfQueryService.getWorkflowContext(ctx);
            userName = wfContext.getUser();
        } catch (WorkflowException e) {
            e.printStackTrace();
        }
        return userName;
    }**/

    /*
     *
     *
     */
    public String getTituloRol(String rol) {
        String resp = "";
        switch (rol) {
        case "AnalistaRiesgo":
            resp = "Análisis de Caso";
            facetName = "AnalizarCaso";
            setVisibilidadTabs(0);
            setDisclosedTabs(1);
            break;
        case "GerenteSucursal":
            resp = "Aprobar Alerta";
            facetName = "AprobarAlerta";
            setVisibilidadTabs(0);
            setDisclosedTabs(2);
            break;
        case "DocumentadorCaso":
            resp = "Documentar Caso";
            facetName = "DocumentarCaso";
            setVisibilidadTabs(1);
            setDisclosedTabs(3);
            break;
        case "AnalistaCRM":
            resp = "Análisis de Calificación";
            facetName = "AnalisisCalif";
            setVisibilidadTabs(0);
            setDisclosedTabs(4);
            break;

        case "GR":

        case "GS":

        case "AC":

        case "PV":
            resp = "Caso Asignado";
            facetName = "CasoAsignado";
            setVisibilidadTabs(1);
            break;
        }
        return resp;
    }

    /*
     *
     *
     */
    //public BindingContainer getBindings() {
    //    return BindingContext.getCurrent().getCurrentBindingsEntry();
    //}

    /*
     *
     *
     */

    public void setVisibilidadTabs(int caso) {

        if (caso == 0) {// != Documentador Caso
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_visibleDetalle", "true");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_visibleAlertas", "true");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_visibleSeguimiento", "true");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_visibleCasosRel", "true");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_visibleDocumentos", "true");
                
        } else if (caso == 1) {//Documentador Caso
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_visibleDetalle", "true");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_visibleAlertas", "false");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_visibleSeguimiento", "true");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_visibleCasosRel", "false");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_visibleDocumentos", "true");
        }
    }
    
    /*
     *
     */
    public void setDisclosedTabs(int caso) {

        switch (caso){
        case 1: //Analisis de Caso
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabDetalle", "true");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabAlertas", "false");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabSeguimiento", "false");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabCasosRel", "false");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabDocumentos", "false");
            break;
        case 2://Aprobar Alerta
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabDetalle", "false");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabAlertas", "true");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabSeguimiento", "false");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabCasosRel", "false");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabDocumentos", "false");
            break;
        case 3://Documentar Caso
        AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabDetalle", "true");
        AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabAlertas", "false");
        AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabSeguimiento", "false");
        AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabCasosRel", "false");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabDocumentos", "false");
            break;
        case 4://Análisis de Calificación
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabDetalle", "true");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabAlertas", "false");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabSeguimiento", "false");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabCasosRel", "false");
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("p_disclosedTabDocumentos", "false");
            break;
        
        }
   
    }
    
    
    
   
}
