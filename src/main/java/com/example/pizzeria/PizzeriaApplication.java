package com.example.pizzeria;

import com.example.pizzeria.model.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzeriaApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ApplicationContext ctx) {
		return args -> {
			Menu menu = ctx.getBean(Menu.class);
			menu.printMenu();
		};
	}
}
