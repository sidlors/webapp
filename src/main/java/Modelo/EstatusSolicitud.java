package Modelo;

public enum EstatusSolicitud {
	NUEVA(1, "Nueva"), PROCESO(2, "Proceso"), TERMINADA(3, "Terminada");
	int id;
	String descripcion;

	private EstatusSolicitud(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

}
