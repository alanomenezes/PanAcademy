package br.com.gama.atividade.atividades;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtividadesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadesApplication.class, args);
	}

	@GetMapping("/ola")
	public AtividadeModel ola() {
		return new AtividadeModel (skills:"");
	}
}
