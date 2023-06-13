package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CtaBancaria;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.CtaBancariaService;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4NsJeApplication implements CommandLineRunner {

	
	
	@Autowired
	private CtaBancariaService bancariaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4NsJeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		this.bancariaService.apertura("A", new BigDecimal(15500), "895465456");
		CtaBancaria cta=this.bancariaService.consultarPorId(2);
		System.out.println(cta);
		
	}

}
