package com.dsdelivery.domain;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(optional = true)
	private Cliente cliente;
	
	@ManyToMany
	@Cascade(CascadeType.MERGE)
	private List<Item> itens;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date data;
	
	@Min(1)
	private Double valorTotal;

	public Pedido() {
		super();
	}

	

	public Pedido(Long id, Cliente cliente, List<Item> itens, @Min(1) Double valorTotal) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.itens = itens;
		this.valorTotal = valorTotal;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	

	
}
