package com.desafio.lojavirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.lojavirtual.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	Produto findById(long id);

}
