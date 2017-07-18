package br.com.simples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.simples.model.Despesa;
import br.com.simples.repository.DespesaRepository;

@Service
public class DespesaService {
	@Autowired
	private DespesaRepository repository;

	public ResponseEntity<String> save(Despesa despesa){
		repository.save(despesa);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<String> delete(Integer id){
		repository.delete(id);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<String> update(Despesa despesa){
		repository.save(despesa);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<Despesa> get(Integer id){
		return new ResponseEntity<Despesa>(this.repository.findOne(id), HttpStatus.OK);
	}

	public ResponseEntity<List<Despesa>> get(){
		return new ResponseEntity<List<Despesa>>(this.repository.findAll(), HttpStatus.OK);
	}
}
