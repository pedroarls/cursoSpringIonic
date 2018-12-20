package com.udemy.cursoSpringIonic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.udemy.cursoSpringIonic.domain.Cliente;

//Já implementa todos os métodos pra acesso a dados: salvar, deletar, atualizar, do Cliente
//Dentro das chaves temos que passar o tipo do objeto a ser manipulado e o tipo da sua chave
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	@Transactional(readOnly=true)
	Cliente findByEmail(String email);
}
