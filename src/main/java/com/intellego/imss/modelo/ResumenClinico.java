package com.intellego.imss.modelo;

import java.util.Date;

public class ResumenClinico {
	
	private Date fecha;
	private StringBuilder diagnostico;

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public StringBuilder getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(StringBuilder diagnostico) {
		this.diagnostico = diagnostico;
	}

}
