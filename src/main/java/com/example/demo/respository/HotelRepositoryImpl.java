package com.example.demo.respository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional 
public class HotelRepositoryImpl implements HotelRepository{
     
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Hotel ciudadano) {
		this.entityManager.persist(ciudadano);
		
	}

	@Override
	public void eliminar(Integer id) {
		Hotel hotEncontrado = this.seleccionarPorID(id);
		this.entityManager.remove(hotEncontrado);
		
	}

	@Override
	public Hotel seleccionarPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Hotel.class, id);
	}

	@Override
	public void actualizar(Hotel hotel) {
		this.entityManager.merge(hotel);
		
	}

}
