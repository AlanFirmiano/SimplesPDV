package br.com.simples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.simples.model.Vendedor;
import br.com.simples.repository.VendedorRepository;

@Service
public class VendedorService {
	@Autowired
	private VendedorRepository repository;

	public ResponseEntity<String> save(Vendedor vendedor){
		repository.save(vendedor);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<String> delete(Integer id){
		repository.delete(id);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<String> update(Vendedor vendedor){
		repository.save(vendedor);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<Vendedor> get(Integer id){
		return new ResponseEntity<Vendedor>(this.repository.findOne(id), HttpStatus.OK);
	}

	public ResponseEntity<List<Vendedor>> get(){
		return new ResponseEntity<List<Vendedor>>(this.repository.findAll(), HttpStatus.OK);
	}
}
