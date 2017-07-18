package br.com.simples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Fornecedor {

	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String razao;
	private String cnpj;
	@OneToOne
	private Endereco endereco;
	@OneToOne
	private Contato contato;
	
	public Fornecedor(){

	}

	public Fornecedor(String nome, String razao, String cnpj, Endereco endereco, Contato contato){
		this.nome = nome;
		this.razao = razao;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.contato = contato;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
}
