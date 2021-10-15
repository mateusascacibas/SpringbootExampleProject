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

import com.example.exerciciossb.model.Produto;
import com.example.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		System.out.println("Preço com desconto aplicado: " + (produto.getPreco() - (produto.getPreco() * produto.getDesconto())));
		produtoRepository.save(produto);	
		return produto;
	}
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
		return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Produto>obterProdutoPorID(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	@GetMapping(path= "/pagina/{numeroPagina}/{qtdPagina}")
	public Iterable<Produto>obterProdutoPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdPagina){
		if(qtdPagina > 5) {
			qtdPagina = 5;
		}
		PageRequest page = PageRequest.of(numeroPagina,qtdPagina);
		return produtoRepository.findAll(page);
	}
	
//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) { 
		produtoRepository.deleteById(id);
	}
}
