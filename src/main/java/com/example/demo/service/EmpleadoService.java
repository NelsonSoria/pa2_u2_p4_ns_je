package com.example.demo.service;

import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoService {
	public void guardar(Empleado empleado);
	public void borrar(int id);
	public Empleado buscarPorID(int id);
	public void actualizar(Empleado empleado);

}
