package br.com.viaflow.estoqueservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import br.com.viaflow.estoqueservice.entity.Produto;
import br.com.viaflow.estoqueservice.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping
	public Iterable listarTodos() {
		return produtoRepository.findAll();
	}

	@GetMapping("/{id}")
	public Produto buscarPorId(@PathVariable Long id) throws Exception {
		return produtoRepository.findById(id).orElseThrow(Exception::new);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Produto criar(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) throws Exception {
		produtoRepository.findById(id).orElseThrow(Exception::new);
		produtoRepository.deleteById(id);
	}

	@PutMapping("/{id}")
	public Produto incrementar(@PathVariable Long id) throws Exception {
		return produtoRepository.findById(id).map(produto->{
			produto.setPontuacao(produto.getPontuacao()+1);
			produtoRepository.save(produto);
			return produto;
		}).orElseThrow(Exception::new);
		
	}

}
