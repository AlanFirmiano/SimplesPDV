package br.com.simples.repository;

import br.com.simples.model.Suprimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuprimentoRepository extends JpaRepository<Suprimento, Integer> {

}
