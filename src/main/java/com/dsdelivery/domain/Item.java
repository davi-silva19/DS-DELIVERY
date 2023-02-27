package com.dsdelivery.domain;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Length(min = 2, max=30, message = "O tamanho do nome de ser entre {min} e {max} caracteres")
	private String nome;
	
	@NotNull
	@Min(value = 20, message = "O valor minino deve ser {value} reais")
	private Double preco;

	public Item() {
		super();
	}

	public Item(Long id,
			@NotNull @Length(min = 2, max = 30, message = "O tamanho do nome de ser entre {min} e {max} caracteres") String nome,
			@NotNull @Min(value = 20, message = "O valor minino deve ser {value} reais") Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
	
	
}
