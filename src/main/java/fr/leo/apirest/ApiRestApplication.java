package fr.leo.apirest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.leo.apirest.entities.Voiture;
import fr.leo.apirest.entities.repositories.VoitureRepository;

@SpringBootApplication
public class ApiRestApplication {   
	
	public static void main(String[] args) { 
		SpringApplication.run(ApiRestApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(VoitureRepository voitureRepository) {
		return args->{	
			voitureRepository.save(new Voiture(1L, "R4", 4)); 
			voitureRepository.save(new Voiture(2L, "R5", 5));
			voitureRepository.save(new Voiture(3L, "R8", 6));
			voitureRepository.save(new Voiture(4L, "R16", 7)); 
		};
	}	
}
