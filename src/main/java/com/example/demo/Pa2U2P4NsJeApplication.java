package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Ciudadano;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.EmpleadoService;

@SpringBootApplication
public class Pa2U2P4NsJeApplication implements CommandLineRunner {

	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private CiudadanoService ciudadanoService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4NsJeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Ciudadano ciud3 = new Ciudadano();
		ciud3.setApellido("Espinosa2");
		ciud3.setCedula("154654456");
		ciud3.setNombre("Joel2");
		
		Ciudadano ciud2 = new Ciudadano();
		ciud2.setApellido("Espinosa26");
		ciud2.setCedula("154654456");
		ciud2.setNombre("Joel26");
		
		
		Empleado empl3 = new Empleado();
		empl3.setCargo("barrendero2");
		empl3.setSueldo(new BigDecimal(0.51));
		
		Empleado empl4 = new Empleado();
		empl4.setCargo("barrendero2");
		empl4.setSueldo(new BigDecimal(0.51));
		
	   	
		ciud3.setEmpleado(empl3);
		empl4.setCiudadano(ciud2);
	
		
		 this.ciudadanoService.guardar(ciud3);
		 System.out.println("Se inserto un ciudadano");
		 
	     this.empleadoService.guardar(empl4);
		System.out.println("Se inserto un empleado");
	     
		//Empleado emplencontrado= this.empleadoService.buscarPorID(1);
		//System.err.println(ciud2);
	   // System.out.println(emplencontrado);
		
		
	}

}
