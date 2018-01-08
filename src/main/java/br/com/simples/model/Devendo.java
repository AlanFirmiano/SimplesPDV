package br.com.simples.model;

import javax.persistence.*;

@Entity
public class Devendo {

	@Id
	@GeneratedValue
	private Integer id;
	@ManyToOne
	private Cliente cliente;
	@OneToOne
	private Venda venda;
	private Double valorEntrada;
	private boolean status;

	public Devendo(){

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Double getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(Double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
