package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.modelo.CitaMedica;
import ec.edu.uce.repository.modelo.Doctor;
import ec.edu.uce.repository.modelo.Paciente;

@Service
public class GestorServiciosImpl implements IGestorServicios{

	@Autowired
	IDoctorService docService;
	
	@Autowired
	IPacienteService paciService;
	
	@Autowired
	ICitaMedicaService citaService;
	
	
	@Override
	@Transactional
	public void agendamientoCitaMedica__2__(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita,
			String lugar, String cedulaDoct, String CedulaPac) {
		
		Paciente paci=this.paciService.buscarCedula(CedulaPac);
		Doctor doc=this.docService.buscarCedula(CedulaPac);
		
		CitaMedica cita=new CitaMedica();
		
		cita.setNumero(numeroCita);
		cita.setFecha(fechaCita);
		cita.setValor(valorCita);
		cita.setLugar(lugar);
		
		cita.setDoctor(doc);
		cita.setPaciente(paci);
		
		citaService.InsertarService(cita);
	}


	@Override
	@Transactional
	public void actualizacionCita__3__(String numeroCita, String diagnostico, String Receta, LocalDateTime fechaContr) {
		CitaMedica cita=this.citaService.buscarNum(numeroCita);
		
		cita.setDiagnostico(diagnostico);
		cita.setFechaControl(fechaContr);
		cita.setReceta(Receta);
		
		citaService.actualizarService(cita);
	}



}
