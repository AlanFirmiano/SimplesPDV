package br.com.simples.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.simples.model.Categoria;
import br.com.simples.model.Fornecedor;
import br.com.simples.model.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Integer>{
	
	Produto findByCodigo(String codigo);
	
	Produto findById(Integer id);
	
	List<Produto> findByCategoria(Categoria categoria);
	
	List<Produto> findByFornecedor(Fornecedor fornecedor);
}
