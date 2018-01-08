package br.com.simples.controller;

import br.com.simples.model.Compra;
import br.com.simples.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compras")
@CrossOrigin(origins = "*")
public class CompraController {
    @Autowired
    private CompraService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Compra compra){
        return service.save(compra);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Compra compra){
        return service.update(compra);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Compra> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Compra>> get(){
        return service.get();
    }
}
