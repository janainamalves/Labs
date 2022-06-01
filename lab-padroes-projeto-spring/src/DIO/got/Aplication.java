package DIO.got;

import org.springframework.boot.SpringApplication;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring wEB
 * - H2 Database
 * - OpenFeign
 * 
 * @author janainamalves
 */
@EnableFeignClients
@SpringBootApplication
public class Application {
	
	public static void main (String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

}
