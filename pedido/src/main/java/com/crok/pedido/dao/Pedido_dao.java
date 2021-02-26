package com.crok.pedido.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crok.pedido.entity.Pedido;
/**
 * 
 * @author CROK
 *@Repository<nome da classe, tipo do atributo ID> = 
 */
@Repository
public interface Pedido_dao extends JpaRepository<Pedido, Long> {

}
