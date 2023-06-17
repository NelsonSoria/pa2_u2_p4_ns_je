package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.respository.CiudadanoRepository;

@Service
public class CiudadanoServiceImpl implements CiudadanoService{
	
	@Autowired
	private CiudadanoRepository ciudadanoRepository;

	@Override
	public void guardar(Ciudadano ciudadano) {
		this.ciudadanoRepository.insertar(ciudadano);
		
	}

	@Override
	public void borrar(int id) {
		this.ciudadanoRepository.eliminar(id);
		
	}

	@Override
	public Ciudadano buscarPorID(int id) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorID(id);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.ciudadanoRepository.actualizar(ciudadano);
		
	}

}
