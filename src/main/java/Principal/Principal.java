package Principal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import Modelo.Archivo;
import Modelo.EstatusNotificacion;
import Modelo.EstatusSolicitud;
import Modelo.Expediente;
import Modelo.Medico;
import Modelo.Notificacion;
import Modelo.Peticionario;

public class Principal {

	public static void main(String[] args) {
		Calendar calendar;
		calendar = Calendar.getInstance();
		calendar.set(2014, 11, 12);
		System.out.println("peticionarioes de diagnostico: ");
		// Medicos
		List<Medico> listaMedicos = new ArrayList<Medico>();
		System.out.println("Medicos");
		Medico medico1 = new Medico();
		medico1.setNombre("Horacio");
		medico1.setApellidoPaterno("Garcia");
		medico1.setApellidoMaterno("Morales");
		listaMedicos.add(medico1);

		Medico medico2 = new Medico();
		medico2.setNombre("Ernesto");
		medico2.setApellidoPaterno("Martinez");
		medico2.setApellidoMaterno("Gonzales");
		listaMedicos.add(medico2);

		Medico medico3 = new Medico();
		medico3.setNombre("Ricardo");
		medico3.setApellidoPaterno("Paz");
		medico3.setApellidoMaterno("");
		listaMedicos.add(medico3);

		// Archivo
		Archivo archivo1 = new Archivo();
		archivo1.setFechaCreacion(new Date());
		archivo1.setNombre("Estudio1.jpg");

		// Expedientes
		Expediente expediente1 = new Expediente();
		expediente1.setNss("124578241");
		expediente1.setArchivo(archivo1);

		Expediente expediente2 = new Expediente();
		expediente2.setNss("18389229");

		Expediente expediente3 = new Expediente();
		expediente3.setNss("18389229");

		Expediente expediente4 = new Expediente();
		expediente4.setNss("894372225");

		// Notificaciones
		List<Notificacion> notificacionesMedico1 = new ArrayList<Notificacion>();
		Notificacion notificacionNueva = new Notificacion();
		notificacionNueva.setNumero(5);
		notificacionNueva.setEstatudNotificacion(EstatusNotificacion.NUEVO);
		notificacionNueva.setMedico(medico1);
		notificacionesMedico1.add(notificacionNueva);

		Notificacion notificacionProceso = new Notificacion();
		notificacionProceso.setEstatudNotificacion(EstatusNotificacion.PROCESO);
		notificacionProceso.setNumero(1);
		notificacionProceso.setMedico(medico1);
		notificacionesMedico1.add(notificacionProceso);

		Notificacion notificacionTerminada = new Notificacion();
		notificacionTerminada
				.setEstatudNotificacion(EstatusNotificacion.TERMINADO);
		notificacionTerminada.setNumero(2);
		notificacionTerminada.setMedico(medico1);
		notificacionesMedico1.add(notificacionTerminada);

		for (Notificacion notificacion : notificacionesMedico1) {
			System.out.println("Medico: "
					+ notificacion.getMedico().getNombre() + " "
					+ notificacion.getMedico().getApellidoPaterno() + ""
					+ notificacion.getMedico().getApellidoMaterno());
			System.out.println("Notificaciones "
					+ notificacion.getEstatudNotificacion() + ": "
					+ notificacion.getNumero());
		}
		// peticionarioes Nuevas
		List<Peticionario> listaPeticionariosNuevos = new ArrayList<Peticionario>();

		Peticionario peticionario = new Peticionario();
		peticionario.setEstatus(EstatusSolicitud.NUEVA);
		peticionario.setNombrePeticionario("Juan Manuel Hernandez");
		peticionario.setFechaSolicitud(new Date());
		peticionario.setFechaEntrega(calendar.getTime());
		peticionario.setNss("124578241");
		listaPeticionariosNuevos.add(peticionario);

		peticionario = new Peticionario();
		peticionario.setEstatus(EstatusSolicitud.NUEVA);
		peticionario.setNombrePeticionario("Alma Delia Martinez Gomez");
		peticionario.setFechaSolicitud(new Date());
		peticionario.setFechaEntrega(new Date());
		peticionario.setNss("18389229");
		listaPeticionariosNuevos.add(peticionario);

		peticionario = new Peticionario();
		peticionario.setEstatus(EstatusSolicitud.NUEVA);
		peticionario.setNombrePeticionario("Mario Alberto Fernandez Lopez");
		peticionario.setFechaSolicitud(new Date());
		peticionario.setFechaEntrega(new Date());
		peticionario.setNss("894372225");
		listaPeticionariosNuevos.add(peticionario);

		peticionario = new Peticionario();
		peticionario.setEstatus(EstatusSolicitud.NUEVA);
		peticionario.setNombrePeticionario("Maria del Carmen Gutierrez Blanco");
		peticionario.setFechaSolicitud(new Date());
		peticionario.setFechaEntrega(new Date());
		peticionario.setNss("36146988");
		listaPeticionariosNuevos.add(peticionario);

		peticionario = new Peticionario();
		peticionario.setEstatus(EstatusSolicitud.NUEVA);
		peticionario.setNombrePeticionario("Carlos Fuentes Morales");
		peticionario.setFechaSolicitud(new Date());
		peticionario.setFechaEntrega(new Date());
		peticionario.setNss("364795236");
		listaPeticionariosNuevos.add(peticionario);
		
		System.out.println("peticionarioes nuevas ");
		for (Peticionario sol : listaPeticionariosNuevos) {
			System.out.println("-- " + sol.getNombrePeticionario());
			System.out.println("-- " + sol.getEstatus());
		}

		// peticionarioes en proceso
		List<Peticionario> listaPeticionariosProceso = new ArrayList<Peticionario>();
		peticionario = new Peticionario();
		peticionario.setEstatus(EstatusSolicitud.PROCESO);
		peticionario.setNombrePeticionario("Mario Alberto Fernandez Lopez");
		peticionario.setFechaSolicitud(new Date());
		peticionario.setFechaEntrega(new Date());
		peticionario.setNss("894372225");
		listaPeticionariosProceso.add(peticionario);
		System.out.println("solicitudes en proceso ");
		for (Peticionario sol : listaPeticionariosProceso) {
			System.out.println("-- " + sol.getNombrePeticionario());
			System.out.println("-- " + sol.getEstatus());
		}

		// peticionarioes en terminadas
		List<Peticionario> listaPeticionariosTerminados = new ArrayList<Peticionario>();
		peticionario = new Peticionario();
		peticionario.setEstatus(EstatusSolicitud.TERMINADA);
		peticionario.setNombrePeticionario("Juan Manuel Hernandez");
		peticionario.setFechaSolicitud(new Date());
		peticionario.setFechaEntrega(new Date());
		peticionario.setNss("124578241");
		listaPeticionariosTerminados.add(peticionario);

		peticionario = new Peticionario();
		peticionario.setEstatus(EstatusSolicitud.TERMINADA);
		peticionario.setNombrePeticionario("Carlos Fuentes Morales");
		peticionario.setFechaSolicitud(new Date());
		peticionario.setFechaEntrega(new Date());
		peticionario.setNss("364795236");
		listaPeticionariosTerminados.add(peticionario);
		System.out.println("solicitudes terminadas ");
		for (Peticionario sol : listaPeticionariosTerminados) {
			System.out.println("-- " + sol.getNombrePeticionario());
			System.out.println("-- " + sol.getEstatus());
		}
	}

}
