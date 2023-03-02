package com.example.proyecto_pa_u4_dll_2.respositoy;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.proyecto_pa_u4_dll_2.repository.modelo.Persona;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonaIRepoImpl implements IPersonaIRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Persona> selectTodosCriteriaAPUquery() {
		
		CriteriaBuilder builder=this.entityManager.getCriteriaBuilder();
		
		CriteriaQuery<Persona>criteriaQuery=builder.createQuery(Persona.class);
		
		Root<Persona> root=criteriaQuery.from(Persona.class);
		
		criteriaQuery.select(root);
		
		TypedQuery<Persona>query =this.entityManager.createQuery(criteriaQuery);
		
		return query.getResultList();
	}

	@Override
	public Persona selectPorId(Integer id) {
		Persona personaSelect= entityManager.find(Persona.class, id);
		return personaSelect;
	}

	@Override
	public void actualizar(Persona persona) {
		entityManager.merge(persona);

	}

	@Override
	public void eliminar(Integer id) {
		Persona personaSelect= entityManager.find(Persona.class, id);
		entityManager.remove(personaSelect);

	}

	@Override
	public void guardar(Persona persona) {
		entityManager.persist(persona);

	}

}
