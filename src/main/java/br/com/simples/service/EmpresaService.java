package br.com.simples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.simples.model.Empresa;
import br.com.simples.repository.EmpresaRepository;

@Service
public class EmpresaService {
	@Autowired
	EmpresaRepository repository;
	
	public ResponseEntity<String> save(Empresa empresa){
		repository.save(empresa);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<String> delete(Integer id){
		repository.delete(id);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<String> update(Empresa empresa){
		repository.save(empresa);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<Empresa> get(Integer id){
		return new ResponseEntity<Empresa>(this.repository.findOne(id), HttpStatus.OK);
	}

	public ResponseEntity<List<Empresa>> get(){
		return new ResponseEntity<List<Empresa>>(this.repository.findAll(), HttpStatus.OK);
	}
}
