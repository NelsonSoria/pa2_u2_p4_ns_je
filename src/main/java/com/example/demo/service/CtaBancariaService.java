package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.repository.modelo.CtaBancaria;


public interface CtaBancariaService {
	
	public void apertura(String tipo,BigDecimal saldo,String cedula);
	public CtaBancaria consultarPorId(Integer id);
	public void actualizar(CtaBancaria cta);

}
