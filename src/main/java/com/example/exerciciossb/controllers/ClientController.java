package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.model.Client;
@RestController
@RequestMapping(path = "/clientes")
public class ClientController {
	@GetMapping(path = "/qualquer")
	public Client getClient() {
			return new Client(3, "Mateus", "123.456.789-00");
	}
	@GetMapping("/{id}")
	public Client getClientForId(@PathVariable int id) {
		return new Client(id, "Dayelle", "123.456.789-00");
	}
	@GetMapping()
	public Client getClientForId2(@RequestParam(name = "id") int id) {
		return new Client(id, "Anna", "122.312.133-00");
	}
}
