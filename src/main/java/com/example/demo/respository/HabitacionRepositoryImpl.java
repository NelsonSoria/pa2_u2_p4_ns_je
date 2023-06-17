package com.example.demo.respository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional 
public class HabitacionRepositoryImpl implements HabitacionRepository{
     
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Habitacion habitacion) {
		this.entityManager.persist(habitacion);
		
	}

	@Override
	public void eliminar(Integer id) {
		Habitacion habEncontrado = this.seleccionarPorID(id);
		this.entityManager.remove(habEncontrado);
		
	}

	@Override
	public Habitacion seleccionarPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Habitacion.class, id);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		this.entityManager.merge(habitacion);
		
	}

}
