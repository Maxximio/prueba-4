package ec.edu.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.uce.repository.modelo.CitaMedica;
import ec.edu.uce.service.ICitaMedicaService;
import ec.edu.uce.service.IDoctorService;
import ec.edu.uce.service.IPacienteService;

@Controller
@RequestMapping("/sistema")
public class ServiciosController {

	@Autowired
	private IPacienteService paciService;
	
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private ICitaMedicaService citaService;
	
	/////////Funcionalidad 4
	@GetMapping("/agendamiento")
	public String obtenerPaginaAgendamiento(CitaMedica cita) {
		return "agendamiento";
		
	}
	
	@PostMapping("/insertar")
	public String insertarCita(CitaMedica cita,BindingResult result,Model modelo) {
		
		this.citaService.InsertarService(cita);
		return "index";
		
	}
	
	/////////Funcionalidad 5
	@GetMapping("/actualizar/{numeroCitaMedica}")
	public String obtenerUsuario(@PathVariable("numeroCitaMedica")String numeroCitaMedica,CitaMedica citaMedica, Model modelo) {
		
		
		CitaMedica cita=this.citaService.buscarNum(numeroCitaMedica);
		
		modelo.addAttribute("cita",cita);
		return "citaActualiza";
		
	}
	
	@PostMapping("/actualizando")
	public String actualizarCita(CitaMedica cita,BindingResult result,Model modelo) {
		
		this.citaService.actualizarService(cita);
		return "index2";
		
	}
	
	
}
