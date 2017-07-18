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

import br.com.simples.model.Endereco;
import br.com.simples.service.EnderecoService;

@RestController
@RequestMapping("/enderecos")
@CrossOrigin(origins = "*")
public class EnderecoController {
	@Autowired
	private EnderecoService service;
	
	@PostMapping
	public ResponseEntity<String> save(@RequestBody Endereco endereco){
		return service.save(endereco);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		return service.delete(id);
	}
	
	@PutMapping
	public ResponseEntity<String> update(@RequestBody Endereco endereco){
		return service.update(endereco);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Endereco> get(@PathVariable Integer id){
		return service.get(id);
	}
	
	@GetMapping
	public ResponseEntity<List<Endereco>> get(){
		return service.get();
	}
}
