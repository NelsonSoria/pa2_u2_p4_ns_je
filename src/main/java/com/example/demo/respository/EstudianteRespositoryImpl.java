package com.example.demo.respository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional 
public class EstudianteRespositoryImpl implements EstudianteRespository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Estudiante estu) {
	   this.entityManager.persist(estu);
		
	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estuEncontrado=this.seleccionarPorCD(cedula);
		this.entityManager.remove(estuEncontrado);
		
	}

	@Override
	public Estudiante seleccionarPorCD(String cedula) {
		return this.entityManager.find(Estudiante.class, cedula);//.class para decir con que va a trabajar el metodo
	}

	@Override
	public void actualizar(Estudiante estu) {
		this.entityManager.merge(estu);
	
	}

}
