package br.com.simples.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Compra {
	
	@Id
	@GeneratedValue
	private Integer id;
	@ManyToOne
	private Fornecedor fornecedor;
	@OneToMany
	private ArrayList<Item> itens;
	private Double valorProdutos;
	private Double desconto;
	private Double totalCompra;

	public Compra(){

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public Double getValorProdutos() {
		return valorProdutos;
	}

	public void setValorProdutos(Double valorProdutos) {
		this.valorProdutos = valorProdutos;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(Double totalCompra) {
		this.totalCompra = totalCompra;
	}
}
