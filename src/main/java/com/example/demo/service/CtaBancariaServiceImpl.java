package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.CtaBancaria;
import com.example.demo.respository.CtaBancariaRepository;

@Service
public class CtaBancariaServiceImpl implements CtaBancariaService {

	@Autowired
	CtaBancariaRepository bancariaRepository;
	
	@Autowired
	@Qualifier("par")
	AbonoService abonoService;
	
	@Autowired
	@Qualifier("impar")
	AbonoService abonoService2;
	
	@Override
	public CtaBancaria consultarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.seleccionarPorID(id);
	}

	@Override
	public void actualizar(CtaBancaria cta) {
		this.bancariaRepository.actualizar(cta);
		
	}

	@Override
	public void apertura(String tipo, BigDecimal saldo,String cedula) {
		CtaBancaria miCta= new CtaBancaria();
		Double numer = Math.random();
		miCta.setNumero(numer.toString());
		miCta.setTipo(tipo);
		
		LocalDateTime fechaApertura= LocalDateTime.now();
		miCta.setFechaApertura(fechaApertura);
		int dia= fechaApertura.getDayOfMonth();
		BigDecimal saldonuevo= new BigDecimal(0);
		if(dia % 2 == 0) {
				saldonuevo=this.abonoService.calcular(saldo);
			
		}else {
			saldonuevo=this.abonoService2.calcular(saldo);
			
		}
		miCta.setSaldo(saldonuevo);

		miCta.setCedulaPropietario(cedula);
		this.bancariaRepository.insertar(miCta);
		
		
		
		
		
		
		
	}

}
