package br.com.simples.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.simples.model.Devendo;

@Repository
public interface DevendoRepository extends JpaRepository<Devendo, Integer>{

}
