package com.example.exerciciossb.controllers;


import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.exerciciossb.model.Product;
import com.example.exerciciossb.model.repositories.ProductRepository;

public class ProductControllerTest {
	ProductController controller = new ProductController();
	Product product = new Product();
	Product product2 = new Product("Lapis",5, 0.2);
	
	ProductRepository bd = Mockito.mock(ProductRepository.class);
	
	@Test
	public void getProductsTest() {
		product2.getId();
		product2.getNome();
		product2.getPreco();
		product2.getDesconto();
	}
	
	@Test
	public void setProductsTest() {
		product.setId(10);
		product.setNome("Lapis");
		product.setPreco(5);
		product.setDesconto(0.2);
	}
//	@Test
//	public void novoProdutoTest() {
//		
//		product.setId(19);
//		product.setNome("Caderno");
//		product.getId();
//		product.getNome();
//		product.setPreco(20.99);
//		product.setDesconto(0.4);
//		assertNull(controller.newProduct(product));
//	}
	
}
