package com.desafio.lojavirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.lojavirtual.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	
	Cliente findById(long id);
	
	
}
