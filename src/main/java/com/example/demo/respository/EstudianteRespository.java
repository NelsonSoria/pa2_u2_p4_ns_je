package com.example.demo.respository;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRespository {
	public void insertar(Estudiante estu);
	public void eliminar(String cedula);
	public Estudiante seleccionarPorCD(String cedula);
	public void actualizar(Estudiante estu);

}
