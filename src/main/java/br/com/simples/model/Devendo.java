package br.com.simples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Devendo {

	@Id
	@GeneratedValue
	private Integer id;
}
