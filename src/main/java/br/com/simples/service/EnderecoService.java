package br.com.simples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.simples.model.Endereco;
import br.com.simples.repository.EnderecoRepository;

@Service
public class EnderecoService {
	@Autowired
	private EnderecoRepository repository;

	public ResponseEntity<String> save(Endereco endereco){
		repository.save(endereco);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<String> delete(Integer id){
		repository.delete(id);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<String> update(Endereco endereco){
		repository.save(endereco);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<Endereco> get(Integer id){
		return new ResponseEntity<Endereco>(this.repository.findOne(id), HttpStatus.OK);
	}

	public ResponseEntity<List<Endereco>> get(){
		return new ResponseEntity<List<Endereco>>(this.repository.findAll(), HttpStatus.OK);
	}
}
