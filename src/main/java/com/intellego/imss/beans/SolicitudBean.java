package com.intellego.imss.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import com.intellego.imss.modelo.Documento;
import com.intellego.imss.modelo.Solicitud;
import com.intellego.imss.utils.FacesUtils;

@ManagedBean(name = "solicitudBean")
@SessionScoped
public class SolicitudBean {


	private List<Solicitud> listSolicitud;
	private List<Documento> listDocumento;
	private Documento selectedDocumento;
	private Solicitud selectedSolicitud;
	

	private String text;

	private boolean ventana1;
	private boolean ventana2;
	private boolean ventana3;

	@PostConstruct
	public void init() {

		listDocumento = new ArrayList<Documento>();
		listSolicitud = new ArrayList<Solicitud>();
		selectedDocumento = new Documento();
		llenarListas();

	}

	private void llenarListas(){

		Documento doc;
		doc = new Documento();
		doc.setNombreArchivo("documento.xdoc");
		doc.setImagen("../images/word.png");
		doc.setUrl("C:\\INTELLEGO\\IMSS_Digital\\web.doc");
		doc.setTipo(3);
		listDocumento.add(doc);


		doc = new Documento();
		doc.setNombreArchivo("archivo_pdf2.pdf");
		doc.setImagen("../images/pdf2.png");
		doc.setUrl("http://www.cenetec.salud.gob.mx/descargas/gpc/CatalogoMaestro/028_GPC__PrenatalRiesgo/IMSS_028_08_GRR.pdf");
		//doc.setUrl("C:\\INTELLEGO\\IMSS_Digital\\imagenes\\archivo.pdf");
		doc.setTipo(2);
		listDocumento.add(doc);


		doc = new Documento();
		doc.setNombreArchivo("archivo_de_imagen.jpg");
		doc.setUrl("../images/radiografia-de-lectores.jpg");
		doc.setTipo(1);
		doc.setImagen("../images/img.png");
		listDocumento.add(doc);

		doc = new Documento();
		doc.setNombreArchivo("archivo_de_imagen.png");
		doc.setUrl("../images/radiografia.jpg");
		doc.setImagen("../images/img2.png");
		doc.setTipo(1);
		listDocumento.add(doc);

		doc = new Documento();
		doc.setNombreArchivo("archivo_texto.txt");
		doc.setImagen("../images/txt.png");
		doc.setTipo(0);
		listDocumento.add(doc);

		doc = new Documento();
		doc.setNombreArchivo("archivo_default.txt");
		doc.setImagen("../images/doc.png");
		doc.setTipo(0);
		listDocumento.add(doc);



		Solicitud sol;
		for(int i = 0; i<4;i++){
			sol = new Solicitud();
			sol.setId(String.valueOf(i));
			sol.setEstado("pendiente");
			sol.setFechaSolicitud(new Date());
			sol.setPeticionario("Angelo Hidalgo");
			sol.setFechaEntrega(new Date());
			listSolicitud.add(sol);

		}


	}

	public void onRowSelect(SelectEvent event) {
		selectedSolicitud = (Solicitud) event.getObject();
		System.out.println("Solicitud seleccionada "+selectedSolicitud.getId());
	}


	public void abrirDialog(){

		//RequestContext.getCurrentInstance().update("_imssgestorportlet_WAR_imssgestorportlet_:form:docDialog1");


		if(!ventana1){
			ventana1 = true;
			FacesUtils.actualizarVista("_imsssolicitudsample_WAR_imsssolicitudsample100SNAPSHOT_:form:docDialog1");

			RequestContext.getCurrentInstance().execute("docDialog1.show()");

			//FacesUtils.addCallBack("ventana", 1);
			return;
		}
		if(!ventana2){
			ventana2 = true;
			FacesUtils.actualizarVista("_imsssolicitudsample_WAR_imsssolicitudsample100SNAPSHOT_:form:docDialog2");
			RequestContext.getCurrentInstance().execute("docDialog2.show()");
			//FacesUtils.addCallBack("ventana", 2);		
			return;	
		}
		if(!ventana3){
			ventana3 = true;
			FacesUtils.actualizarVista("_imsssolicitudsample_WAR_imsssolicitudsample100SNAPSHOT_:form:docDialog3");
			RequestContext.getCurrentInstance().execute("docDialog3.show()");
			//FacesUtils.addCallBack("ventana", 3);
			return;			
		}
	}

	public void cerrarDialog(int ventana){

		//FacesUtils.addCallBack("ventana", true);
		if(ventana == 1){
			ventana1 = false;
			RequestContext.getCurrentInstance().execute("docDialog1.hide();");

			//FacesUtils.addCallBack("ventana", 1);
			return;
		}
		if(ventana==2){
			ventana2 = false;
			RequestContext.getCurrentInstance().execute("docDialog2.hide()");
			//FacesUtils.addCallBack("ventana", 2);			
			return;
		}
		if(ventana==3){
			ventana3 = false;
			RequestContext.getCurrentInstance().execute("docDialog3.hide();");
			//FacesUtils.addCallBack("ventana", 3);			
			return;
		}
	}
	

	public void hideDialog(int ventana){

		//FacesUtils.addCallBack("ventana", true);
		System.out.println("HIDE DIALOG "+ventana);
		if(ventana == 1){
			ventana1 = false;
			return;
		}
		if(ventana==2){
			ventana2 = false;
			RequestContext.getCurrentInstance().execute("docDialog2.hide()");
			return;
		}
		if(ventana==3){
			ventana3 = false;
			RequestContext.getCurrentInstance().execute("docDialog3.hide();");
			return;
		}



	}



	public void changeListener(){
		System.out.println("Texto "+text);

	}



	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Solicitud> getListSolicitud() {
		return listSolicitud;
	}

	public void setListSolicitud(List<Solicitud> listSolicitud) {
		this.listSolicitud = listSolicitud;
	}

	public List<Documento> getListDocumento() {
		return listDocumento;
	}

	public void setListDocumento(List<Documento> listDocumento) {
		this.listDocumento = listDocumento;
	}

	public Documento getSelectedDocumento() {
		return selectedDocumento;
	}

	public void setSelectedDocumento(Documento selectedDocumento) {
		this.selectedDocumento = selectedDocumento;
	}

	public boolean isVentana1() {
		return ventana1;
	}

	public void setVentana1(boolean ventana1) {
		this.ventana1 = ventana1;
	}

	public boolean isVentana2() {
		return ventana2;
	}

	public void setVentana2(boolean ventana2) {
		this.ventana2 = ventana2;
	}

	public boolean isVentana3() {
		return ventana3;
	}

	public void setVentana3(boolean ventana3) {
		this.ventana3 = ventana3;
	}

	public Solicitud getSelectedSolicitud() {
		return selectedSolicitud;
	}

	public void setSelectedSolicitud(Solicitud selectedSolicitud) {
		this.selectedSolicitud = selectedSolicitud;
	}






}
