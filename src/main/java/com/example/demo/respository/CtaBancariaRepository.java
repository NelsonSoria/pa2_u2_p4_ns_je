package com.example.demo.respository;

import com.example.demo.repository.modelo.CtaBancaria;

public interface CtaBancariaRepository {
	
	public void insertar(CtaBancaria cta);
	public void eliminar(Integer id);
	public CtaBancaria seleccionarPorID(Integer id);
	public void actualizar(CtaBancaria cta);

}
