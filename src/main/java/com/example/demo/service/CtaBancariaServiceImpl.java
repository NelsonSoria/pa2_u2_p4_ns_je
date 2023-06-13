package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.CtaBancaria;
import com.example.demo.respository.CtaBancariaRepository;

@Service
public class CtaBancariaServiceImpl implements CtaBancariaService {

	@Autowired
	CtaBancariaRepository bancariaRepository;
	
	@Override
	public CtaBancaria consutarPorid(Integer id) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.seleccionarPorCD(id);
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
		if(dia % 2 == 0) {
			BigDecimal valor= saldo.multiply(new BigDecimal(0.05));
			saldo= saldo.add(valor);	
		}

		miCta.setSaldo(saldo);
		miCta.setCedulaPropietario(cedula);
		this.bancariaRepository.insertar(miCta);
		
		
		
		
		
		
		
	}

}
