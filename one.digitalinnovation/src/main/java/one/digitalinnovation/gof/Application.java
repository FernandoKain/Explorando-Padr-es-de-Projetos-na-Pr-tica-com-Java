package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto gerado com SpringTools
 * Módulos selecionados:
 * - Spring Web
 * - Spring Data JPA
 * - H2 Database
 * - Openfeign
 * 
 * @author FernandoKain
 *
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
