package br.com.mauricio.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class CalculadoraTeste {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(7, 3);
		
		Assert.assertEquals(10, soma);
		
	}
	
}
