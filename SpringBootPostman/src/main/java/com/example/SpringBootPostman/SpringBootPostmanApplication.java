package com.example.SpringBootPostman;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootPostmanApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootPostmanApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);
		
		Laptop laptop1 = new Laptop(null, 5999.99,"Lenovo", "Amarilla", LocalDate.of(2020, 10, 9), true);
		Laptop laptop2 = new Laptop(null, 8999.99,"Mac", "Blanca", LocalDate.of(2022, 8, 16), true);
		Laptop laptop3 = new Laptop(null, 2999.99,"Dell", "Negra", LocalDate.of(2020, 4, 25), true);
		
		System.out.println("Equipos en la base de datos " + repository.findAll().size());
		
		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);
		
		System.out.println("Equipos en la base de datos "  + repository.findAll().size());
	}

}
