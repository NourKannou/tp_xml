package org.example.nourkannouactivite6;

// Import statements for necessary classes and repositories.
import org.example.entities.Compte;
import org.example.entities.EtatCompte;
import org.example.entities.TypeCompte;
import org.example.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;
import java.util.List;

// The main application class for Nour Kannou's activity 6.
@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.example.repositories")
@EntityScan(basePackages = "org.example.entities")
@ComponentScan("org.example")

public class nourkannouactivite6 {
    // The main method to start the Spring Boot application.
    public static void main(String[] args) {
        SpringApplication.run(nourkannouactivite6.class, args);
    }

    // CommandLineRunner bean for executing code on application startup.
    @Bean
    public CommandLineRunner CLR(CompteRepository compteRepository) {
        return (args) -> {
            // Save sample Compte entities to the database.
            compteRepository.save(new Compte(null, 200, new Date(), TypeCompte.COURANT, EtatCompte.ACTIVE));
            compteRepository.save(new Compte(null, 400, new Date(), TypeCompte.EPARGNE, EtatCompte.CREE));
            compteRepository.save(new Compte(null, 9000, new Date(), TypeCompte.EPARGNE, EtatCompte.BLOQUE));

            // Retrieve all Compte entities from the database.
            List<Compte> comptes = compteRepository.findAll();

            // Print the balances of the retrieved Compte entities.
            for (Compte compte : comptes) {
                System.out.println("Solde du compte " + compte.getId() + ": " + compte.getSolde());
            }
        };
    }
}
