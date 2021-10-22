package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculatorController {
	@GetMapping("/somar/{a}/{b}")
	public String Soma(@PathVariable int a,@PathVariable int b) {
		return "Resultado: " + (a + b);
	}
	
	@GetMapping("/subtrair")
	public String Subtrair( @RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
		return "Resultado: " + (a - b);
	}

	@GetMapping("/multiplicar/{a}/{b}")
	public String Multiplicacao(@PathVariable int a, @PathVariable int b) {
		return "Resultado: " + (a * b);
	}
	
	@GetMapping("/dividir/{a}/{b}")
	public String Divisao(@PathVariable int a, @PathVariable int b) {
			return "Resultado: " + (a / b);
	}
}
