package com.example.demo.repository.modelo;

import org.springframework.context.annotation.Scope;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="ciudadano")

public class Ciudadano {
	
	@GeneratedValue(generator = "seq_ciudadano",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="seq_ciudadano",sequenceName ="seq_ciudadano",allocationSize = 1 )
	@Id
	@Column(name="ciud_id")
	private Integer id;
	
	@Column(name="ciud_nombre")
	private String nombre;
	
	@Column(name="ciud_apellido")
	private String apellido;
	
	@Column(name="ciud_cedula")
	private String cedula;
	
	@OneToOne(mappedBy = "ciudadano",cascade = CascadeType.ALL)
	private Empleado empleado;
	
	//set get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}
	
}
