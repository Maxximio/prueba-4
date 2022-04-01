package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.Doctor;

@Transactional
@Repository
public class DoctorRepoImpl implements IDoctorRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public List<Doctor> buscarTodos() {
		TypedQuery<Doctor> myQuery=(TypedQuery<Doctor>)
				this.entityManager.createQuery("SELECT e FROM Doctor e   ",
						Doctor.class);
		return myQuery.getResultList();
	}

	@Override
	public void actualizar(Doctor doc) {
		this.entityManager.merge(doc);
		
	}

	@Override
	public void Insertar(Doctor doc) {
		this.entityManager.persist(doc);
	}

	@Override
	public void Borrar(Integer id) {
		Doctor doc=this.buscar(id);
		this.entityManager.remove(doc);
	}

	@Override
	public Doctor buscarCedula(String ced) {
		Query miQuery= this.entityManager.createNativeQuery("select * from doctor p where p.doc_cedula=:valor",Doctor.class);
		miQuery.setParameter("valor", ced);
		return (Doctor) miQuery.getSingleResult();
	}
	
	

}
