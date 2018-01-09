package br.com.simples.controller;

import br.com.simples.model.Suprimento;
import br.com.simples.service.SuprimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suprimentos")
@CrossOrigin(origins = "*")
public class SuprimentoController {
    @Autowired
    private SuprimentoService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Suprimento suprimento){
        return service.save(suprimento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Suprimento suprimento){
        return service.update(suprimento);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Suprimento> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Suprimento>> get(){
        return service.get();
    }
}
