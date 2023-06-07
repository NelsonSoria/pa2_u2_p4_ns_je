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

}
