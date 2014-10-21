package com.intellego.imss.modelo;
/**
 * Expediente
 * @author AB-COMP03
 *
 */
public class Expediente {
	private String nss;

	private Archivo archivo;

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

}
