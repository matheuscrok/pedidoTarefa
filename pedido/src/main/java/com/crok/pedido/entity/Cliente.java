package com.crok.pedido.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author CROK
 *@Entity = hibernate cri uma tabela no banco de dados referente a essa classe = DISSE CERTO PROFESSOR?
 */
@Entity
public class Cliente {
	/**
	 * @Id= indica o atributo id da classe
	 * @GeneratedValue(strategy  = GenerationType.IDENTITY) = para gerar o id serial no banco automático
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/**
	 * @Column = comando referente a colunas no banco
	 * (nullable = false) = campo na coluna nao pode ser null
	 */
	@Column(nullable = false)
	private String nome;
	
	

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
	
	
	
}
