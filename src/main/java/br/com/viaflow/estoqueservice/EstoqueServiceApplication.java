package br.com.viaflow.estoqueservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("br.com.viaflow.estoqueservice.repository") 
@EntityScan("br.com.viaflow.estoqueservice.entity")
@SpringBootApplication
public class EstoqueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstoqueServiceApplication.class, args);
	}

}
