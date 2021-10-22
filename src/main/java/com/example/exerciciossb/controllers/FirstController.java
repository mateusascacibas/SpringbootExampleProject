package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping(path = "/ola/{nome}")
	public String ola(@PathVariable("nome") String nome) {
			return "Ola " + nome;
	}
}

