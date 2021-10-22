package com.example.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.model.Product;
import com.example.exerciciossb.model.repositories.ProductRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Product newProduct(@Valid Product product) {
		System.out.println("Preço com desconto aplicado: " + (product.getPreco() - (product.getPreco() * product.getDesconto())));
		productRepository.save(product);
		return product;
	}
	@GetMapping
	public Iterable<Product> getProducts() {
		return productRepository.findAll();
	}
	
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Product> getProductsByName(@PathVariable String parteNome) {
		return productRepository.findByNomeContainingIgnoreCase(parteNome);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Product>getProductsById(@PathVariable int id) {
		return productRepository.findById(id);
	}
	
	@GetMapping(path= "/pagina/{numeroPagina}/{qtdPagina}")
	public Iterable<Product>getProductsByPage(@PathVariable int pageNumber, @PathVariable int qtdPage){
		if(qtdPage > 5) {
			qtdPage = 5;
		}
		PageRequest page = PageRequest.of(pageNumber,qtdPage);
		return productRepository.findAll(page);
	}
	
//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteProduct(@PathVariable int id) { 
		productRepository.deleteById(id);
	}
}
