package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.ICitaMedicaRepo;
import ec.edu.uce.repository.modelo.CitaMedica;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired
	private ICitaMedicaRepo citaRepo;
	
	@Override
	public CitaMedica buscarService(Integer id) {
		// TODO Auto-generated method stub
		return this.citaRepo.buscar(id);
	}

	@Override
	public List<CitaMedica> buscarTodosService() {
		// TODO Auto-generated method stub
		return this.citaRepo.buscarTodos();
	}

	@Override
	public void actualizarService(CitaMedica paci) {
		this.citaRepo.actualizar(paci);
	}

	@Override
	public void InsertarService(CitaMedica paci) {
		this.citaRepo.Insertar(paci);
	}

	@Override
	public void BorrarService(Integer id) {
		this.citaRepo.Borrar(id);
	}

	@Override
	public CitaMedica buscarNum(String numero) {
		// TODO Auto-generated method stub
		return this.citaRepo.buscarNumero(numero);
	}

}
