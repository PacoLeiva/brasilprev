package com.desafio.lojavirtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.lojavirtual.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	Pedido findById(long id);

}
