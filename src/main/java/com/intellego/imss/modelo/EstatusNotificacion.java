package com.intellego.imss.modelo;

public enum EstatusNotificacion {
	NUEVO(1, "Nuevo"), PROCESO(2, "Proceso"), TERMINADO(3, "Terminado");
	int id;
	String descripcion;

	private EstatusNotificacion(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

}
