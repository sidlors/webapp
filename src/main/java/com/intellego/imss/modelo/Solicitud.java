package com.intellego.imss.modelo;

import java.util.Date;
import java.util.List;

public class Solicitud {
	
	private String id;
	private String estado;
	private String descripcion;
	
	private String peticionario;
	private Date fechaSolicitud;
	private Date fechaEntrega;
	

	private String reporte;
	private List<Documento> listDocumento;
	
	private String resumen;
	private Date fechaResumen;
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPeticionario() {
		return peticionario;
	}
	public void setPeticionario(String peticionario) {
		this.peticionario = peticionario;
	}
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	public Date getFechaResumen() {
		return fechaResumen;
	}
	public void setFechaResumen(Date fechaResumen) {
		this.fechaResumen = fechaResumen;
	}
	public String getReporte() {
		return reporte;
	}
	public void setReporte(String reporte) {
		this.reporte = reporte;
	}
	public List<Documento> getListDocumento() {
		return listDocumento;
	}
	public void setListDocumento(List<Documento> listDocumento) {
		this.listDocumento = listDocumento;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	

}
