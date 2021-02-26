package com.crok.pedido.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crok.pedido.entity.Produto;

@Repository
public interface Produto_dao extends JpaRepository<Produto, Long> {

}
