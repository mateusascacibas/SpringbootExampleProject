package com.example.exerciciossb.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HttpMethodsControllerTest {
	HttpMethodsController http = new HttpMethodsController();
	@Test
	public void getTest() {
		String get = http.get();
		assertEquals("Requisicao Get", get);
	}
	
	@Test
	public void postTest() {
		String post = http.post();
		assertEquals("Requisicao Post", post);
	}
	
	@Test
	public void putTest() {
		String put = http.put();
		assertEquals("Requisicao Put", put);
	}
	
	@Test
	public void patchTest() {
		String patch = http.patch();
		assertEquals("Requisicao Patch", patch);
	}
	
	@Test
	public void deleteTest() {
		String delete = http.delete();
		assertEquals("Requisicao Delete", delete);
	}
	
}
