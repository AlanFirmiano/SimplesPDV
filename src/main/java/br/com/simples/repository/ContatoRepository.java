package br.com.simples.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.simples.model.Contato;

@Repository
public interface ContatoRepository  extends JpaRepository<Contato, Integer>{
	
}
