package es.studium.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Principal implements CommandLineRunner {

    @Autowired
    private Viaje viaje; // Se inyecta automáticamente el Bean Viaje

    public static void main(String[] args) {
        SpringApplication.run(Principal.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(viaje);
        System.out.println("se ha creado correctamente.");
    }
}

