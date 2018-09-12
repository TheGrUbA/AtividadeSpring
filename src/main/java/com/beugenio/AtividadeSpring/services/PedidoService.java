package com.beugenio.AtividadeSpring.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.beugenio.AtividadeSpring.domain.Pedido;
import com.beugenio.AtividadeSpring.repositories.PedidoRepository;
import com.beugenio.AtividadeSpring.services.exceptions.ObjectNotFoundException;
@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}