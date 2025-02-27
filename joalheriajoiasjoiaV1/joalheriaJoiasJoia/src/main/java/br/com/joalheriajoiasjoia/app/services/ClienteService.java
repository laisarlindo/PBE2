package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Cliente;
import br.com.joalheriajoiasjoia.app.repositories.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	//LISTAR TODOS OS CLIENTES
	public List<Cliente> buscarCliente(){
		return clienteRepository.findAll();
		
	}
	// BUSCAR CLIENTE POR ID
	public Cliente buscarClientePorId(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	// SALVAR CLIENTE
	public Cliente criarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	// DELETAR CLIENTE
	public void excluirCliente(Long Id) {
		clienteRepository.deleteById(Id);
	}
	//BUSCAR CLIENTE POR CPF
	public Cliente buscarClientePorCpf(String cpf) {
		return clienteRepository.findByCpf(cpf);
	}

}