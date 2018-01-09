package br.com.simples.repository;

import br.com.simples.model.Sangria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SangriaRepository extends JpaRepository<Sangria, Integer> {

}
