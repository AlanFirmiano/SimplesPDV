package br.com.simples.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.simples.model.Venda;

@Repository
public interface VendaRepository  extends JpaRepository<Venda, Integer>{

}
