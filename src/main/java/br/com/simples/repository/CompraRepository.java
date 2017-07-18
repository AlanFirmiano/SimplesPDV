package br.com.simples.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.simples.model.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Integer>{

}
