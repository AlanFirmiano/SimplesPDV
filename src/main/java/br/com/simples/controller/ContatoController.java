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

import br.com.simples.model.Contato;
import br.com.simples.service.ContatoService;

@RestController
@RequestMapping("/contatos")
@CrossOrigin(origins = "*")
public class ContatoController {
	@Autowired
	private ContatoService service;
	
	@PostMapping
	public ResponseEntity<String> save(@RequestBody Contato contato){
		return service.save(contato);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		return service.delete(id);
	}
	
	@PutMapping
	public ResponseEntity<String> update(@RequestBody Contato contato){
		return service.update(contato);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Contato> get(@PathVariable Integer id){
		return service.get(id);
	}
	
	@GetMapping
	public ResponseEntity<List<Contato>> get(){
		return service.get();
	}
}