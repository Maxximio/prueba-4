package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.repository.modelo.Doctor;

public interface IDoctorRepo {

	public Doctor buscar(Integer id);
	
	public Doctor buscarCedula(String ced);
	
	public List<Doctor> buscarTodos();
	
	public void actualizar(Doctor doc);
	
	public void Insertar(Doctor doc);
	
	public void Borrar(Integer id);
	
}
