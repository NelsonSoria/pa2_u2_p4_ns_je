package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4NsJeApplication implements CommandLineRunner {

	@Autowired
	private EstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4NsJeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estudiante estu = new Estudiante();
		estu.setApellido("Espinosa");
		estu.setCedula("0565253");
		estu.setNombre("andres");
	  	
	    this.estudianteService.guardar(estu);
	    this.estudianteService.borrar("0565253");
		Estudiante estuq= this.estudianteService.buscarPorCD("123131");
		estuq.setApellido("PAEZ");
		this.estudianteService.actualizar(estuq);
		
	}

}
