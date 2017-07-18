package br.com.simples.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.simples.model.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{
	
	Cliente findByCpf(String cpf);
	
	Cliente findByRg(String rg);
	
	List<Cliente> findByTipo(String tipo);
}
