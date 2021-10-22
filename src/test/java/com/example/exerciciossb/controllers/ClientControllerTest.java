package com.example.exerciciossb.controllers;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.example.exerciciossb.model.Client;

public class ClientControllerTest {
	
	ClientController controller = new ClientController();
	Client client = new Client(10, "Mateus", "123.456.789-12");
	
	Client client2 = new Client();
	@Test
	public void clientMethodsGetTest() {
		client.getCpf();
		client.getId();
		client.getNome();
	}
	
	@Test
	public void clientMethodsSetTest() {
		client.setCpf("123.456.789-12");
		client.setId(10);
		client.setNome("Mateus");
	}
	
	@Test
	public void getClientTest() {
		assertNotNull(controller.getClient());
	}
	
	@Test
	public void getClientForIdTest() {
		assertNotNull(controller.getClientForId(1));
	}
	
	@Test
	public void getClientTestForId2Test() {
		assertNotNull(controller.getClientForId2(2));
	}
}
