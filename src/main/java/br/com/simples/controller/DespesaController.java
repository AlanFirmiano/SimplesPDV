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

import br.com.simples.model.Despesa;
import br.com.simples.service.DespesaService;

@RestController
@RequestMapping("/despesas")
@CrossOrigin(origins = "*")
public class DespesaController {
	@Autowired
	private DespesaService service;
	
	@PostMapping
	public ResponseEntity<String> save(@RequestBody Despesa despesa){
		return service.save(despesa);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		return service.delete(id);
	}
	
	@PutMapping
	public ResponseEntity<String> update(@RequestBody Despesa despesa){
		return service.update(despesa);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Despesa> get(@PathVariable Integer id){
		return service.get(id);
	}
	
	@GetMapping
	public ResponseEntity<List<Despesa>> get(){
		return service.get();
	}
}
