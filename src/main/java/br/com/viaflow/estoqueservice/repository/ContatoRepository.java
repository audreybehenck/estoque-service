package br.com.viaflow.estoqueservice.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.viaflow.estoqueservice.entity.Contato;

public interface ContatoRepository extends CrudRepository <Contato, Long> {

}
