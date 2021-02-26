package com.crok.pedido.entity;
/**
 * 
 * @author CROK
 *@Entity = faz a classe se comportar como entidade (tabela no banco)
 */

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	/**
	 * @Id=Informa que esse atributo é o id
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)= define a estrategia de geração de ID (SERIAL = AUTOMÁTICA)
	 */
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private BigDecimal valor;

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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
	
}
