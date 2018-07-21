package com.udemy.cursoSpringIonic.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.cursoSpringIonic.domain.Pedido;
import com.udemy.cursoSpringIonic.repositories.PedidoRepository;
import com.udemy.cursoSpringIonic.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}

//	public Pedido buscar(Integer id) {
//		Optional<Pedido> obj = repo.findById(id);
//		return obj.orElse(null);
//	}
}
