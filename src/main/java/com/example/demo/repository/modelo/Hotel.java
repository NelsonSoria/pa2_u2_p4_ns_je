package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.OneToMany;

public class Hotel {

	private Integer id;
	private String nombre;
	private String direccion;
	
	@OneToMany(mappedBy = "hotel")
	private List<Habitacion> habitaciones;

	//set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
	
	
}
