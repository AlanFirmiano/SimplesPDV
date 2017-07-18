package br.com.simples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.simples.model.Produto;
import br.com.simples.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repository;

	public ResponseEntity<String> save(Produto produto){
		repository.save(produto);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<String> delete(Integer id){
		repository.delete(id);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<String> update(Produto produto){
		repository.save(produto);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<Produto> get(Integer id){
		return new ResponseEntity<Produto>(this.repository.findOne(id), HttpStatus.OK);
	}

	public ResponseEntity<List<Produto>> get(){
		return new ResponseEntity<List<Produto>>(this.repository.findAll(), HttpStatus.OK);
	}
}
