package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.respository.EstudianteRespository;

@Service
public class EstudianteServiceImpl implements EstudianteService{

	@Autowired
	private EstudianteRespository estudianteRespository;
	
	@Override
	public void guardar(Estudiante estu) {
		this.estudianteRespository.insertar(estu);
		
	}

	@Override
	public void borrar(String cedula) {
		this.estudianteRespository.eliminar(cedula);
		
	}

	@Override
	public Estudiante buscarPorCD(String cedula) {
		
		return this.estudianteRespository.seleccionarPorCD(cedula);
	}

	@Override
	public void actualizar(Estudiante estu) {
		this.estudianteRespository.actualizar(estu);
		
	}

}
