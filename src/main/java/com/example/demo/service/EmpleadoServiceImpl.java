package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.Empleado;
import com.example.demo.respository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Override
	public void guardar(Empleado empleado) {
		this.empleadoRepository.insertar(empleado);
		
	}

	@Override
	public void borrar(int id) {
		this.empleadoRepository.eliminar(id);
		
	}

	@Override
	public Empleado buscarPorID(int id) {
		// TODO Auto-generated method stub
		return this.empleadoRepository.seleccionarPorID(id);
	}

	@Override
	public void actualizar(Empleado empleado) {
		this.empleadoRepository.actualizar(empleado);
		
	}

}
