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

import com.desafio.lojavirtual.model.Pedido;
import com.desafio.lojavirtual.repository.PedidoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@RestController
@RequestMapping(value="/pedido")
@Api(value="API Rest Loja Virtual - Pedidos")
@CrossOrigin(origins="*")
public class PedidoResource {

	@Autowired
	PedidoRepository pedidoRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public List<Pedido> listarPedidos(){
		return pedidoRepository.findAll();
	}
	
	@GetMapping("/buscar/{id}")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public Pedido buscarPedido(@PathVariable(value="id") long id){
		return pedidoRepository.findById(id);
	}
	
	@PostMapping("/cadastrar")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public void salvarPedido(@RequestBody Pedido pedido) {
		pedidoRepository.save(pedido);				
	}
	
	@DeleteMapping("/excluir/{id}")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public void excluirPedido(@PathVariable(value="id") long id) {
		pedidoRepository.deleteById(id);				
	}
	
	@PutMapping("/atualizar")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public Pedido atualizarPedido(@RequestBody Pedido pedido) {
		return pedidoRepository.save(pedido);				
	}
	
}
