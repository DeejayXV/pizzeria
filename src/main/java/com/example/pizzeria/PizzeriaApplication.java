package com.example.pizzeria;

import com.example.pizzeria.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PizzeriaApplication {

	private static final Logger logger = LoggerFactory.getLogger(PizzeriaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PizzeriaApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ApplicationContext ctx) {
		return args -> {
			Order order = ctx.getBean(Order.class);
			logger.info("Order Number: {}", order.getOrderNumber());
			logger.info("Table ID: {}", order.getTable().getId());
			logger.info("Number of Seats: {}", order.getTable().getMaxSeats());
			logger.info("Order Status: {}", order.getStatus());
			logger.info("Order Time: {}", order.getOrderTime());
			logger.info("Total Amount: {:.2f}€", order.getTotalAmount());
		};
	}
}
