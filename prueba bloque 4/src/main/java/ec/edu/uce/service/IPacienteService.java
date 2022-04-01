package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.repository.modelo.Paciente;

public interface IPacienteService {

	public Paciente buscarService(Integer id);
	
	public List<Paciente> buscarTodosService();
	
	public void actualizarService(Paciente paci);
	
	public void InsertarService(Paciente paci);
	
	public void BorrarService(Integer id);
	
	public Paciente buscarCedula(String ced);
	
}
