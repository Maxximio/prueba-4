package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.repository.modelo.Doctor;

public interface IDoctorService {

	public Doctor buscarService(Integer id);
	
	public List<Doctor> buscarTodosService();
	
	public void actualizarService(Doctor doc);
	
	public void InsertarService(Doctor doc);
	
	public void BorrarService(Integer id);
	
	public Doctor buscarCedula(String ced);
	
}
