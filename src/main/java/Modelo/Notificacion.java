package Modelo;

public class Notificacion {
	private Medico medico;

	private EstatusNotificacion estatudNotificacion;
	private int numero;

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public EstatusNotificacion getEstatudNotificacion() {
		return estatudNotificacion;
	}

	public void setEstatudNotificacion(EstatusNotificacion estatudNotificacion) {
		this.estatudNotificacion = estatudNotificacion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
