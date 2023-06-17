package com.example.demo.respository;

import com.example.demo.repository.modelo.Ciudadano;

public interface CiudadanoRepository {
	public void insertar(Ciudadano ciudadano);
	public void eliminar(Integer id);
	public Ciudadano seleccionarPorID(Integer id);
	public void actualizar(Ciudadano ciudadano);

}
