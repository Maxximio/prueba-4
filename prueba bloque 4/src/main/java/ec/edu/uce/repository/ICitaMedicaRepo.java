package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.repository.modelo.CitaMedica;

public interface ICitaMedicaRepo {

	public CitaMedica buscar(Integer id);
	
	public List<CitaMedica> buscarTodos();
	
	public void actualizar(CitaMedica cita);
	
	public void Insertar(CitaMedica cita);
	
	public void Borrar(Integer id);
	
	//String numero
	public CitaMedica buscarNumero(String numero);
	
}
