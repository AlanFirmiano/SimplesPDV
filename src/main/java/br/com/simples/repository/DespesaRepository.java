package br.com.simples.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.simples.model.Despesa;

@Repository
public interface DespesaRepository  extends JpaRepository<Despesa, Integer>{
	List<Despesa> findByNome(String nome);
}
