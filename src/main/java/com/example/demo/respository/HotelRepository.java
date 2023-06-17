package com.example.demo.respository;


import com.example.demo.repository.modelo.Hotel;

public interface HotelRepository {
	public void insertar(Hotel hotel);
	public void eliminar(Integer id);
	public Hotel seleccionarPorID(Integer id);
	public void actualizar(Hotel hotel);

}
