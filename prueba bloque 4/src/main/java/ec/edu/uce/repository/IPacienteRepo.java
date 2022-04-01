package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.repository.modelo.Paciente;

public interface IPacienteRepo {

	public Paciente buscar(Integer id);
	
	public Paciente buscarCedula(String ced);
	
	public List<Paciente> buscarTodos();
	
	public void actualizar(Paciente paci);
	
	public void Insertar(Paciente paci);
	
	public void Borrar(Integer id);
	
}
