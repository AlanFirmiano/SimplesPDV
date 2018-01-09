package br.com.simples.service;

import br.com.simples.model.Suprimento;
import br.com.simples.repository.SuprimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuprimentoService {
    @Autowired
    private SuprimentoRepository repository;

    public ResponseEntity<String> save(Suprimento suprimento){
        repository.save(suprimento);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Suprimento suprimento){
        repository.save(suprimento);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Suprimento> get(Integer id){
        return new ResponseEntity<Suprimento>(this.repository.findOne(id), HttpStatus.OK);
    }

    public ResponseEntity<List<Suprimento>> get(){
        return new ResponseEntity<List<Suprimento>>(this.repository.findAll(), HttpStatus.OK);
    }
}
