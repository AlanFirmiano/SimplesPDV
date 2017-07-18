package br.com.simples.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.simples.model.Caixa;

@Repository
public interface CaixaRepository  extends JpaRepository<Caixa, Integer>{

}
