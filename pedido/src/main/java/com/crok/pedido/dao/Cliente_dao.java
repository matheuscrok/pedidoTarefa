package com.crok.pedido.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crok.pedido.entity.Cliente;
@Repository
public interface Cliente_dao extends JpaRepository<Cliente, Long> {

}
