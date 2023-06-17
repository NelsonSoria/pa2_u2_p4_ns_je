package com.example.demo.respository;

import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoRepository {
	
	public void insertar(Empleado empl);
	public void eliminar(Integer id);
	public Empleado seleccionarPorID(Integer id);
	public void actualizar(Empleado empl);

}
