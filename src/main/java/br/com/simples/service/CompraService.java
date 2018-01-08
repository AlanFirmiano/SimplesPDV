package br.com.simples.service;

import br.com.simples.model.Compra;
import br.com.simples.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraService {
    @Autowired
    private CompraRepository repository;

    public ResponseEntity<String> save(Compra compra){
        repository.save(compra);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Compra compra){
        repository.save(compra);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Compra> get(Integer id){
        return new ResponseEntity<Compra>(this.repository.findOne(id), HttpStatus.OK);
    }

    public ResponseEntity<List<Compra>> get(){
        return new ResponseEntity<List<Compra>>(this.repository.findAll(), HttpStatus.OK);
    }
}
