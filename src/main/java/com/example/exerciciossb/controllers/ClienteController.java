package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.model.Cliente;
@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	@GetMapping(path = "/qualquer")
	public Cliente ObterCliente() {
			return new Cliente(3, "Mateus", "123.456.789-00");
	}
	@GetMapping("/{id}")
	public Cliente ObterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Dayelle", "123.456.789-00");
	}
	@GetMapping()
	public Cliente ObterClientePorId2(@RequestParam(name = "id") int id) {
		return new Cliente(id, "Anna", "122.312.133-00");
	}
}
