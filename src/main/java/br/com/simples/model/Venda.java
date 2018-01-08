package br.com.simples.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Venda {

	@Id
	@GeneratedValue
	private Integer id;
	private Date data;
	private Double valorProdutos;
	private Double desconto;
	private Double valorTotal;
	@ManyToMany(cascade={CascadeType.ALL})
	private List<Item> itens;
	@ManyToOne
	private Vendedor vendedor;
	@ManyToOne
	private Cliente cliente;

	public Venda(){

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
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

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
