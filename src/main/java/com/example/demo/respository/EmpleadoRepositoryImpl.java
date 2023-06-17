package com.example.demo.respository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional 
public class EmpleadoRepositoryImpl implements EmpleadoRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Empleado empl) {
		this.entityManager.persist(empl);	
	}
	@Override
	public void eliminar(Integer id) {
		Empleado emplEncontrado= this.seleccionarPorID(id);
		this.entityManager.remove(emplEncontrado);
	}
	@Override
	public Empleado seleccionarPorID(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empleado.class, id);
	}

	@Override
	public void actualizar(Empleado empl) {
		this.entityManager.merge(empl);
		
	}

}
