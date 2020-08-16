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
import com.desafio.lojavirtual.repository.ClienteRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@RestController
@RequestMapping(value="/cliente")
@Api(value="API Rest Loja Virtual - Clientes")
@CrossOrigin(origins="*")
public class ClienteResource {

	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/listar")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public List<Cliente> listarClientes(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("/buscar/{id}")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public Cliente buscarCliente(@PathVariable(value="id") long id){
		return clienteRepository.findById(id);
	}
	
	@PostMapping("/cadastrar")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public void salvarCliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);				
	}
	
	@DeleteMapping("/excluir/{id}")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public void excluirCliente(@PathVariable(value="id") long id) {
		clienteRepository.deleteById(id);				
	}
	
	@PutMapping("/atualizar")
	@ApiOperation(value = "", authorizations = { @Authorization(value="token") })
	public Cliente atualizarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);				
	}
	
}
