package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IDoctorRepo;
import ec.edu.uce.repository.IPacienteRepo;
import ec.edu.uce.repository.modelo.Doctor;
import ec.edu.uce.repository.modelo.Paciente;

@Service
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
	private IDoctorRepo docRepo;

	@Override
	public Doctor buscarService(Integer id) {
		// TODO Auto-generated method stub
		return this.docRepo.buscar(id);
	}

	@Override
	public List<Doctor> buscarTodosService() {
		// TODO Auto-generated method stub
		return this.docRepo.buscarTodos();
	}

	@Override
	public void actualizarService(Doctor doc) {
		this.docRepo.actualizar(doc);
	}

	@Override
	public void InsertarService(Doctor doc) {
		this.docRepo.Insertar(doc);
	}

	@Override
	public void BorrarService(Integer id) {
		this.docRepo.Borrar(id);
	}

	@Override
	public Doctor buscarCedula(String ced) {
		// TODO Auto-generated method stub
		return this.docRepo.buscarCedula(ced);
	}
	


}
