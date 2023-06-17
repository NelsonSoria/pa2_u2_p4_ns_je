package com.example.demo.service;

import com.example.demo.repository.modelo.Ciudadano;

public interface CiudadanoService {
	public void guardar(Ciudadano ciudadano);
	public void borrar(int id);
	public Ciudadano buscarPorID(int id);
	public void actualizar(Ciudadano ciudadano);

}
