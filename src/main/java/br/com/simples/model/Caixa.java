package br.com.simples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Caixa {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String numero;
	private Double valorCaixa;

	public Caixa(){

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getValorCaixa() {
		return valorCaixa;
	}

	public void setValorCaixa(Double valorCaixa) {
		this.valorCaixa = valorCaixa;
	}
}
