package com.udemy.cursoSpringIonic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.cursoSpringIonic.domain.Cidade;

//Já implementa todos os métodos pra acesso a dados: salvar, deletar, atualizar, da Cidade
//Dentro das chaves temos que passar o tipo do objeto a ser manipulado e o tipo da sua chave
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
