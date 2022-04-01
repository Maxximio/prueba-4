package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.CitaMedica;
import ec.edu.uce.repository.modelo.Doctor;

@Transactional
@Repository
public class CitaMedicaRepoImpl implements ICitaMedicaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public CitaMedica buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CitaMedica.class, id);
	}

	@Override
	public List<CitaMedica> buscarTodos() {
		TypedQuery<CitaMedica> myQuery=(TypedQuery<CitaMedica>)
				this.entityManager.createQuery("SELECT p FROM CitaMedica p   ",
						CitaMedica.class);
		return myQuery.getResultList();
	}

	@Override
	public void actualizar(CitaMedica cita) {
		this.entityManager.merge(cita);
	}

	@Override
	public void Insertar(CitaMedica cita) {
		this.entityManager.persist(cita);
	}

	@Override
	public void Borrar(Integer id) {
		CitaMedica cita=this.buscar(id);
		this.entityManager.remove(cita);
	}

	@Override
	public CitaMedica buscarNumero(String numero) {
		Query miQuery= this.entityManager.createNativeQuery
				("select * from cita_medica c where c.cita_numero=:valor",CitaMedica.class);
		miQuery.setParameter("valor", numero);
		return (CitaMedica) miQuery.getSingleResult();
	}

}
