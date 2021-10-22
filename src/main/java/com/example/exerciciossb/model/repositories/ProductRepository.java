package com.example.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.exerciciossb.model.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

public Iterable<Product> findByNomeContainingIgnoreCase(String parteNome);
}
