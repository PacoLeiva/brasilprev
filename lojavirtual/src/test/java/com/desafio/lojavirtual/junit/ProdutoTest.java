package com.desafio.lojavirtual.junit;

import java.util.List;

import com.desafio.lojavirtual.model.Produto;
import com.desafio.lojavirtual.repository.ProdutoRepository;

import junit.framework.TestCase;

public class ProdutoTest extends TestCase {
	
	ProdutoRepository produtoRepository;
	
	public void testCadastrarProduto() {
		
		int actual = 0;
		int expected = 1;
		
		Produto produto = new Produto();
		produto.setNome("TESTE");
		
		produtoRepository.save(produto);
		
		List<Produto> produtos = produtoRepository.findAll();
		
		for (Produto produtoAnalisado : produtos) {
			
			if (produtoAnalisado.getNome() == "TESTE") {
				actual = 1;
				produtoRepository.deleteById(produtoAnalisado.getId());
			}
			
		}
		
		assertEquals(expected, actual);
		
	}
	
}
