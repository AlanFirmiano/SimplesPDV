package br.com.simples.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.simples.model.Fornecedor;

@Repository
public interface FornecedorRepository  extends JpaRepository<Fornecedor, Integer>{
	
	Fornecedor findByRazao(String razao);
	
	Fornecedor findByCnpj(String cnpj);
	
}
