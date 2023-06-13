package com.example.demo.repository.modelo;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name ="estudiante") //,schema="" para cambiar el schema
@Entity
public class Estudiante {
	
	
	//Este atributo no debe ser seteado(SET)
	@GeneratedValue(generator = "seq_estudiante",strategy = GenerationType.SEQUENCE)// con el strategy le decimos explicitamente que vamos a trabajar con una secuencia
	@SequenceGenerator(name="seq_estudiante",sequenceName ="seq_estudiante",allocationSize = 1 ) //el AllocactionSize debe coincidir cone el incremento de mi BD
	@Id
	@Column(name= "estu_id")
	private Integer id;  //mapeo especifico para secuencia
	
	@Column(name= "estu_cedula")
	private String cedula;
	
	@Column(name= "estu_nombre") //mapear las columnas con los atributos
	private String nombre;
	
	@Column(name= "estu_apellido")// le vas a vincular la columna estu-apellido con el atributo
	private String apellido;
	
	
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
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}

}
