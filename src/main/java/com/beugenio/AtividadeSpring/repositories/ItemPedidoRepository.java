package com.beugenio.AtividadeSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.beugenio.AtividadeSpring.domain.ItemPedido;
 
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
	
 }