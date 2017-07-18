package br.com.simples.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.simples.model.Cliente;
import br.com.simples.service.ClienteService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {
	@Autowired
	private ClienteService service;
	
	@PostMapping
	public ResponseEntity<String> save(@RequestBody Cliente cliente){
		return service.save(cliente);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		return service.delete(id);
	}
	
	@PutMapping
	public ResponseEntity<String> update(@RequestBody Cliente cliente){
		return service.update(cliente);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> get(@PathVariable Integer id){
		return service.get(id);
	}
	
	@GetMapping
	public ResponseEntity<List<Cliente>> get(){
		return service.get();
	}
}
