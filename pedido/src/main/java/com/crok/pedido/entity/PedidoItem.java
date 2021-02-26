package com.crok.pedido.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 * @author CROK
 *@Entity= gera uma tabela no banco de dados com essa classe
 */
@Entity
public class PedidoItem {
	/**
	 * @Id= indica o atributo id da classe
	 * @GeneratedValue(strategy  = GenerationType.IDENTITY) = para gerar o id serial no banco automático
	 * @ManyToOne = chave estrangeira (Muitos para um) a relação das tabela é muitos pra um
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer qtd;
	
	private BigDecimal valorUnit;
	
	@ManyToOne
	private Produto produto;

	
	
	public BigDecimal getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(BigDecimal valorUnit) {
		this.valorUnit = valorUnit;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	
	
}
