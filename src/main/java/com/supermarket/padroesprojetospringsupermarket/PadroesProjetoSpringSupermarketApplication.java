package com.supermarket.padroesprojetospringsupermarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Sprind initializr.
 * Os seguintes módulos foram selecionados:
 * -Spring Web
 * -Spring Data JPA
 * -H2 Database
 * -OpenFeing
 * -OpenAPI/Swagger (adicionado manualmente)
 *
 * @Author James Anderson
 * @Version 1.0
 */

@EnableFeignClients//Projeto fica ciente que utilizará o OPenFeign: habilita o Client do Feing.
@SpringBootApplication
public class PadroesProjetoSpringSupermarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoSpringSupermarketApplication.class, args);
	}

}
