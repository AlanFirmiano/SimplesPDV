package br.com.simples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.simples.model.Categoria;
import br.com.simples.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repository;

	public ResponseEntity<String> save(Categoria categoria){
		repository.save(categoria);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}


	public ResponseEntity<String> delete(Integer id){
		repository.delete(id);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<String> update(Categoria categoria){
		repository.save(categoria);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<Categoria> get(Integer id){
		return new ResponseEntity<Categoria>(this.repository.findOne(id), HttpStatus.OK);
	}

	public ResponseEntity<List<Categoria>> get(){
		return new ResponseEntity<List<Categoria>>(this.repository.findAll(), HttpStatus.OK);
	}

}
