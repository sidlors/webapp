package com.intellego.imss.modelo;

import java.util.List;

import org.primefaces.model.SelectableDataModel;

public class SolicitudDataModel implements SelectableDataModel<Solicitud>  {

	private List<Solicitud> listSolicitud;
	
	@Override
	public Solicitud getRowData(String rowKey) {
		for(Solicitud sol: listSolicitud){
			if(sol.getId().equals(rowKey)){
				return sol;
			}
		}
	    return null;
	}
	@Override
	public Object getRowKey(Solicitud solicitud) {
		return solicitud.getId();
	}
	
	
	
	
	public List<Solicitud> getListSolicitud() {
		return listSolicitud;
	}
	public void setListSolicitud(List<Solicitud> listSolicitud) {
		this.listSolicitud = listSolicitud;
	}
	
	

}
