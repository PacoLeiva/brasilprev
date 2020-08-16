package com.desafio.lojavirtual.junit;

import java.util.List;

import com.desafio.lojavirtual.model.Pedido;
import com.desafio.lojavirtual.repository.PedidoRepository;

import junit.framework.TestCase;

public class PedidoTest extends TestCase {
	
	PedidoRepository pedidoRepository;
	
	public void testCadastrarPedidos() {
		
		int actual = 0;
		int expected = 1;
		
		Pedido pedido = new Pedido();
		pedido.setUsuarioId(5678412);
		
		pedidoRepository.save(pedido);
		
		List<Pedido> pedidos = pedidoRepository.findAll();
		
		for (Pedido pedidoAnalisado : pedidos) {
			
			if (pedidoAnalisado.getUsuarioId() == 5678412) {
				actual = 1;
				pedidoRepository.deleteById(pedidoAnalisado.getId());
			}
			
		}
		
		assertEquals(expected, actual);
		
	}
	
}
