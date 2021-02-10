package br.com.viaflow.estoqueservice.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.viaflow.estoqueservice.entity.Produto;

public interface ProdutoRepository extends CrudRepository <Produto, Long> {
		    

}
