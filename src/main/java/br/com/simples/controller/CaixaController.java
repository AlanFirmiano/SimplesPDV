package br.com.simples.controller;

import br.com.simples.model.Caixa;
import br.com.simples.service.CaixaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/caixas")
public class CaixaController {
    @Autowired
    private CaixaService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Caixa categoria){
        return service.save(categoria);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Caixa categoria){
        return service.update(categoria);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Caixa> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Caixa>> get(){
        return service.get();
    }
}
