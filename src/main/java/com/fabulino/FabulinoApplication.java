package com.fabulino;

import java.sql.Connection;

import javax.sql.DataSource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FabulinoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FabulinoApplication.class, args);
	}

	// Verificar conexión con la base de datos al inicio
    @Bean
    CommandLineRunner comprobarConexionBD(DataSource dataSource) {
    	return new CommandLineRunner() {
    	    @Override
    	    public void run(String... args) {
    	        try (Connection connection = dataSource.getConnection()) {
    	            System.out.println("Conexión con la base de datos exitosa: " + connection.getCatalog());
    	        } catch (Exception e) {
    	            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
    	        }
    	    }
    	};

    }
}
