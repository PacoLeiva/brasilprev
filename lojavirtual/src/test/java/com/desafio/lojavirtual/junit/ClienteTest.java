package com.desafio.lojavirtual.junit;

import java.util.List;

import com.desafio.lojavirtual.model.Cliente;
import com.desafio.lojavirtual.repository.ClienteRepository;

import junit.framework.TestCase;

public class ClienteTest extends TestCase {
	
	ClienteRepository clienteRepository;
	
	public void testCadastrarClientes() {
		
		int actual = 0;
		int expected = 1;
		
		Cliente cliente = new Cliente();
		cliente.setUsuario("TESTE");
		
		clienteRepository.save(cliente);
		
		List<Cliente> clientes = clienteRepository.findAll();
		
		for (Cliente clienteAnalisado : clientes) {
			
			if (clienteAnalisado.getUsuario() == "TESTE") {
				actual = 1;
				clienteRepository.deleteById(clienteAnalisado.getId());
			}
			
		}
		
		assertEquals(expected, actual);
		
	}
	
}
