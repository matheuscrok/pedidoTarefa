package com.crok.pedido.entity;


import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * 
 * @author CROK
 *
 */
@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Cliente cliente;

	/**
	 * BOA PRÁTICA
	 * quando objeto não é lista(List) = ou existe VALOR ou é NULL
	 * no caso da lista(List) pode ter 3 retorno = NULL, pode possuir instacia e ser VAZIO, ou pode ter VALOR
	 * por isso é necessário sempre INSTACIAR p atributo lista, porque se garante que ela vem vazia ou vem com item,
	 * e nunca vai vir NULL
	 * 
	 * @OneToMany( cascade = CascadeType.ALL) = relação de tabelas UM para MUITOS obriga a usar CASCADE por causa que
	 * um depende do outro (COMPOSIÇÃO = não vive separado uma da outra tabela)
	 * (cascade = CascadeType.ALL) = indica que quando inserir um pedido com ITENS , automaticamente insere um ITEM também
	 * sem precisar ficar fazendo save em cada um
	 *(orphanRemoval = true) = para o CASCADE funcionar também no DELETE
	 *@JoinColumn(name = "nome da classe_id") = qual a coluna de junção que faz a ONE TO MANY funcionar 
	 *
	 */
	@OneToMany( cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name ="pedido_id")
	private List<PedidoItem> itens = new ArrayList<>();

	/**
	 * @Temporal(TemporalType.TIMESTAMP)= DATA E TEMPO (dia,mes,ano e hora,segundo,minuto)
	 * (TemporalType.DATE)= DATA (dia,mes,ano)
	 * (TemporalType.TIME)= TEMPO (hr,min,seg)
	 */

	@Temporal(TemporalType.TIMESTAMP)
	private Date data;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * TODO ID SÓ SE USA GET, SEM NECESSIDADE DE SET
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * TODA COLEÇÃO SOMENTE SE USA GET, NÃO TEM NECESSIDADE DE SET
	 * @return
	 */
	public List<PedidoItem> getItens() {
		return itens;
	}

	
}
