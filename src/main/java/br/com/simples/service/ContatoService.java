package br.com.simples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.simples.model.Contato;
import br.com.simples.repository.ContatoRepository;

@Service
public class ContatoService {
	@Autowired
	private ContatoRepository repository;

	public ResponseEntity<String> save(Contato contato){
		repository.save(contato);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<String> delete(Integer id){
		repository.delete(id);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<String> update(Contato contato){
		repository.save(contato);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<Contato> get(Integer id){
		return new ResponseEntity<Contato>(this.repository.findOne(id), HttpStatus.OK);
	}

	public ResponseEntity<List<Contato>> get(){
		return new ResponseEntity<List<Contato>>(this.repository.findAll(), HttpStatus.OK);
	}
}
