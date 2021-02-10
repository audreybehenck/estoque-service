package br.com.viaflow.estoqueservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String nomeDoMercado;
	
	@Column(nullable = false)
	private String texto;
	
	public Contato() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeDoMercado() {
		return nomeDoMercado;
	}

	public void setNomeDoMercado(String nomeDoMercado) {
		this.nomeDoMercado = nomeDoMercado;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", nomeDoMercado=" + nomeDoMercado + ", texto=" + texto + "]";
	}
	

}
