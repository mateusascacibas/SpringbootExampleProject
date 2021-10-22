package com.example.exerciciossb.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FirstControllerTest {

	FirstController controller = new FirstController();
	//private String notNullMessage = "verify not null";
	
	
	@Test
	public void olaTest() {
		String result = controller.ola("Mateus");
		assertEquals("Ola Mateus", result);
	}
	
}
