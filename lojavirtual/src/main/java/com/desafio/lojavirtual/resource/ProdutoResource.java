package com.desafio.lojavirtual.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.lojavirtual.model.Produto;
import com.desafio.lojavirtual.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@RestController
@RequestMapping(value="/produto")
@Api(value="API Rest Loja Virtual - Produtos")
@CrossOrigin(origins="*")
public class ProdutoResource {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public List<Produto> listarProduto(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/buscar/{id}")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public Produto buscarProduto(@PathVariable(value="id") int id){
		return produtoRepository.findById(id);
	}
	
	@PostMapping("/cadastrar")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public void salvarProduto(@RequestBody Produto produto) {
		produtoRepository.save(produto);				
	}
	
	@DeleteMapping("/excluir/{id}")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public void excluiProduto(@PathVariable(value="id") long id) {
		produtoRepository.deleteById(id);				
	}
	
	@PutMapping("/atualizar")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public Produto atualizarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);				
	}

	
}
