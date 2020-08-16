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

import com.desafio.lojavirtual.model.Cliente;
import com.desafio.lojavirtual.model.Produto;
import com.desafio.lojavirtual.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/produto")
@Api(value="API Rest Loja Virtual - Produtos")
@CrossOrigin(origins="*")
public class ProdutoResource {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value="Metodo retorna uma lista com todos os Produtos salvos no Banco de Dados")
	public List<Produto> listarProduto(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/buscar/{id}")
	@ApiOperation(value="Metodo retorna um produto, de acordo com o id fornecido na busca")
	public Produto buscarProduto(@PathVariable(value="id") int id){
		return produtoRepository.findById(id);
	}
	
	@PostMapping("/cadastrar")
	@ApiOperation(value="Metodo insere um novo produto no banco de dados")
	public void salvarProduto(@RequestBody Produto produto) {
		produtoRepository.save(produto);				
	}
	
	@DeleteMapping("/excluir/{id}")
	@ApiOperation(value="Metodo deleta um produto no banco de dados, de acordo com o id fornecido")
	public void excluiProduto(@PathVariable(value="id") long id) {
		produtoRepository.deleteById(id);				
	}
	
	@PutMapping("/atualizar")
	@ApiOperation(value="Metodo atualiza um produto no banco de dados")
	public Produto atualizarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);				
	}

	
}
