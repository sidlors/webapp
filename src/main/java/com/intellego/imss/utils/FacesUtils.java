package com.intellego.imss.utils;

//import org.apache.commons.lang.StringUtils;
import org.primefaces.context.RequestContext;

public class FacesUtils {
	
	public static void actualizarVista(String...idsVista) {
    	//final PartialViewContext partialViewContext = FacesContext.getCurrentInstance().getPartialViewContext();
    	
    	for (String id : idsVista) {    		
    		RequestContext.getCurrentInstance().update(id);
    		//partialViewContext.getRenderIds().add(id);
		}    	
		
	}
    
	public static void addCallBack(String name, Object value){
    	 final RequestContext context = RequestContext.getCurrentInstance();
         context.addCallbackParam(name, value);
    }
}
