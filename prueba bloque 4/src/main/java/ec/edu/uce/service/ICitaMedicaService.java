package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.repository.modelo.CitaMedica;

public interface ICitaMedicaService {

	public CitaMedica buscarService(Integer id);
	
	public List<CitaMedica> buscarTodosService();
	
	public void actualizarService(CitaMedica cita);
	
	public void InsertarService(CitaMedica cita);
	
	public void BorrarService(Integer id);
	
	public CitaMedica buscarNum(String numero);
	
}
