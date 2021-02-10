package br.com.viaflow.estoqueservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.viaflow.estoqueservice.entity.Contato;
import br.com.viaflow.estoqueservice.repository.ContatoRepository;

@RestController
@RequestMapping("/api/contato")
public class ContatoController {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@GetMapping
	public Iterable listarTodos() {
		return contatoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Contato criar(@RequestBody Contato contato) {
		return contatoRepository.save(contato);
	}

}
