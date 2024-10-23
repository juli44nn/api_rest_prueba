package com.example.inicial1;

import com.example.inicial1.entities.Base;
import com.example.inicial1.entities.Domicilio;
import com.example.inicial1.entities.Persona;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;
import java.util.Optional;
//@Configuration
//@EnableJpaRepositories(basePackages ="com.example.inicial1.repositories")
//@ComponentScan(basePackages = "com.example.inicial1.repositories")
//@ComponentScan(basePackages = "com.example.inicial1")
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.inicial1.controllers", "com.example.inicial1.services", "com.example.inicial1.repositories"})
public class Inicial1Application {
	private static final Logger logger = LoggerFactory.getLogger(Inicial1Application.class);


	public static void main(String[] args) {
		SpringApplication.run(Inicial1Application.class, args);

		System.out.println("funcionando");
	}



	/*
	@Bean
	@Transactional
	CommandLineRunner init(PersonaRepository personaRepository) {
		return args -> {
	// Creo un objeto persona
Persona per1 = Persona.builder().
		nombre("Alberto").apellido("Cortez").
		build();

Domicilio dom1 = Domicilio.builder().
		calle("Suipacha").
		numero(239).build();

per1.setDomicilio(dom1);

			personaRepository.save(per1);

// Creo otra persona
			Persona per2 = Persona.builder().
					nombre("Alicia").apellido("Calderon").
					build();

			Domicilio dom2 = Domicilio.builder().
					calle("Lulunta").
					numero(339).build();
			Domicilio dom3 = Domicilio.builder().calle("suprata").numero(41)
					.build();

			per2.setDomicilio(dom2);


			// Lo grabo a través del repositorio de Spring
			personaRepository.save(per2);

			List<Persona> recuperadas = personaRepository.findAll();
			System.out.println(recuperadas);

			logger.info("Detalles de la persona: {}", recuperadas);




			Optional<Persona> recuperada = personaRepository.findById(1L);
			System.out.println(recuperada);

			logger.info("Detalles de la persona: {}", recuperada);


			dom1.setCalle("Rodriguezaaaa");

			personaRepository.save(per1);



		};

		};

*/



}
