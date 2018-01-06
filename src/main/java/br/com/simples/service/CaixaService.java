package br.com.simples.service;

import br.com.simples.model.Caixa;
import br.com.simples.repository.CaixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaixaService {
    @Autowired
    private CaixaRepository repository;

    public ResponseEntity<String> save(Caixa categoria){
        repository.save(categoria);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }


    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Caixa categoria){
        repository.save(categoria);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Caixa> get(Integer id){
        return new ResponseEntity<Caixa>(this.repository.findOne(id), HttpStatus.OK);
    }

    public ResponseEntity<List<Caixa>> get(){
        return new ResponseEntity<List<Caixa>>(this.repository.findAll(), HttpStatus.OK);
    }
}
