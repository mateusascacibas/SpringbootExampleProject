package com.example.exerciciossb.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorControllerTest {
	CalculatorController calc = new CalculatorController();
	@Test
	public void somarTest() {
		String soma = calc.Soma(2, 3);
		assertEquals(soma , "Resultado: 5");
	}
	
	@Test
	public void subtrairTest() {
		String subtracao = calc.Subtrair(10, 3);
		assertEquals(subtracao , "Resultado: 7");
	}
	
	@Test
	public void multiplicarTest() {
		String multiplicacao = calc.Multiplicacao(20, 2);
		assertEquals(multiplicacao, "Resultado: 40");
	}
	
	@Test
	public void dividirTest() {
		String divisao = calc.Divisao(6, 3);
		assertEquals(divisao, "Resultado: 2");
	}
	
}
