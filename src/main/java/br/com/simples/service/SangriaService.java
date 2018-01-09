package br.com.simples.service;

import br.com.simples.model.Sangria;
import br.com.simples.repository.SangriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SangriaService {
    @Autowired
    private SangriaRepository repository;

    public ResponseEntity<String> save(Sangria sangria){
        repository.save(sangria);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Sangria sangria){
        repository.save(sangria);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Sangria> get(Integer id){
        return new ResponseEntity<Sangria>(this.repository.findOne(id), HttpStatus.OK);
    }

    public ResponseEntity<List<Sangria>> get(){
        return new ResponseEntity<List<Sangria>>(this.repository.findAll(), HttpStatus.OK);
    }
}
