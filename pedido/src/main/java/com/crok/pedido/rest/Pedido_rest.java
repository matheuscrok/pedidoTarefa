package com.crok.pedido.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crok.pedido.dao.Pedido_dao;
import com.crok.pedido.entity.Pedido;

/**
 * 
 * @author CROK
 *@RequestController
 *@RequestMapping("/nome de referencia da classe")
 *@Autowired=
 */
@RestController
@RequestMapping("/pedido")
public class Pedido_rest {

	@Autowired
	private Pedido_dao pedidoDao;

	/**
	 * @GetMapping = metodo get pega os objetos salvos e mostra pro usuário
	 * @return
	 */
	@GetMapping
	public List<Pedido> get(){
		return pedidoDao.findAll();
	}
	/**
	 * @PostMapping = método post edita e salva o objeto no banco.
	 * @param pedido
	 */
	@PostMapping
	public void post(@RequestBody Pedido pedido) {
		pedidoDao.save(pedido);
	}
	/**
	 * @DeleteMapping("/{id}")= metodo delete ("/{id do objeto}") = deleta na barra de procura com id do objeto no lugar do nome da pagina
	 * @PathVariable("id")=
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		pedidoDao.deleteById(id);
	}
	
	
}
