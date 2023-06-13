package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("par")
public class AbonoDiaParServiceImpl implements AbonoService{

	@Override
	public BigDecimal calcular(BigDecimal saldo) {
		BigDecimal valor= saldo.multiply(new BigDecimal(0.05));
		saldo= saldo.add(valor);
		
		return saldo;
	}

}
