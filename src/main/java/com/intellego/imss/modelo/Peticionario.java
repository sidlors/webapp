package com.intellego.imss.modelo;

import java.util.Date;

/**
 * 
 * @author AB-COMP03
 *
 */
public class Peticionario {

	private String nombrePeticionario;
	private Date fechaSolicitud;
	private Date fechaEntrega;
	private EstatusSolicitud estatus;
	private String nss;
	

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getNombrePeticionario() {
		return nombrePeticionario;
	}

	public void setNombrePeticionario(String nombrePeticionario) {
		this.nombrePeticionario = nombrePeticionario;
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

	public EstatusSolicitud getEstatus() {
		return estatus;
	}

	public void setEstatus(EstatusSolicitud estatus) {
		this.estatus = estatus;
	}

}
