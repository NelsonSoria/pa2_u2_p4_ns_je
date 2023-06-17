package com.example.demo.respository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional 
public class CiudadanoRepositoryImpl implements CiudadanoRepository{
     
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Ciudadano ciudadano) {
		this.entityManager.persist(ciudadano);
		
	}

	@Override
	public void eliminar(Integer id) {
		Ciudadano ciudEncontrado = this.seleccionarPorID(id);
		this.entityManager.remove(ciudEncontrado);
		
	}

	@Override
	public Ciudadano seleccionarPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ciudadano.class, id);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.entityManager.merge(ciudadano);
		
	}

}
