package com.example.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.exerciciossb.model.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
