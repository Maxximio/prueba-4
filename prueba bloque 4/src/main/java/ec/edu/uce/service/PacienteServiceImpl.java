package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IPacienteRepo;
import ec.edu.uce.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepo paciRepo;
	
	@Override
	public Paciente buscarService(Integer id) {
		// TODO Auto-generated method stub
		return this.paciRepo.buscar(id);
	}

	@Override
	public List<Paciente> buscarTodosService() {
		// TODO Auto-generated method stub
		return this.paciRepo.buscarTodos();
	}

	@Override
	public void actualizarService(Paciente paci) {
		this.paciRepo.actualizar(paci);
	}

	@Override
	public void InsertarService(Paciente paci) {
		this.paciRepo.Insertar(paci);
	}

	@Override
	public void BorrarService(Integer id) {
		this.paciRepo.Borrar(id);
	}

	@Override
	public Paciente buscarCedula(String ced) {
		// TODO Auto-generated method stub
		return this.paciRepo.buscarCedula(ced);
	}

}
