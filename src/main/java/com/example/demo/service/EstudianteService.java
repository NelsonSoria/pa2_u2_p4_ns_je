package com.example.demo.service;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	public void guardar(Estudiante estu);
	public void borrar(String cedula);
	public Estudiante buscarPorCD(String cedula);
	public void actualizar(Estudiante estu);

}
