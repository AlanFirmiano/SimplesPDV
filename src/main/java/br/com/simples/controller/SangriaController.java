package br.com.simples.controller;

import br.com.simples.model.Sangria;
import br.com.simples.service.SangriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sangrias")
@CrossOrigin(origins = "*")
public class SangriaController {
    @Autowired
    private SangriaService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Sangria sangria){
        return service.save(sangria);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Sangria sangria){
        return service.update(sangria);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sangria> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Sangria>> get(){
        return service.get();
    }
}
