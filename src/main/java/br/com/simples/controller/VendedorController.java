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

import br.com.simples.model.Vendedor;
import br.com.simples.service.VendedorService;

@RestController
@RequestMapping("/vendedores")
@CrossOrigin(origins = "*")
public class VendedorController {
	@Autowired
	private VendedorService service;
	
	@PostMapping
	public ResponseEntity<String> save(@RequestBody Vendedor vendedor){
		return service.save(vendedor);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		return service.delete(id);
	}
	
	@PutMapping
	public ResponseEntity<String> update(@RequestBody Vendedor vendedor){
		return service.update(vendedor);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Vendedor> get(@PathVariable Integer id){
		return service.get(id);
	}
	
	@GetMapping
	public ResponseEntity<List<Vendedor>> get(){
		return service.get();
	}
}
