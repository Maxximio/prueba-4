package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.Paciente;

@Transactional
@Repository
public class PacienteRepoImpl implements IPacienteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public List<Paciente> buscarTodos() {
		TypedQuery<Paciente> myQuery=(TypedQuery<Paciente>)
				this.entityManager.createQuery("SELECT p FROM Paciente p   ",
						Paciente.class);
		return myQuery.getResultList();
	}

	@Override
	public void actualizar(Paciente paci) {
		this.entityManager.merge(paci);
	}

	@Override
	public void Insertar(Paciente paci) {
		this.entityManager.persist(paci);
	}

	@Override
	public void Borrar(Integer id) {
		Paciente paci=this.buscar(id);
		this.entityManager.remove(paci);
	}

	@Override
	public Paciente buscarCedula(String ced) {
		Query miQuery= this.entityManager.createNativeQuery("select * from paciente p where p.paci_cedula=:valor",Paciente.class);
		miQuery.setParameter("valor", ced);
		return (Paciente) miQuery.getSingleResult();
	}

}
