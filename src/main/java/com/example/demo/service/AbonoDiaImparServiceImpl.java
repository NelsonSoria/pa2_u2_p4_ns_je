package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("impar")
public class AbonoDiaImparServiceImpl implements AbonoService{

	@Override
	public BigDecimal calcular(BigDecimal saldo) {
		// TODO Auto-generated method stub
		return saldo;
	}

}
