package com.example.pizzeria.config;

import com.example.pizzeria.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzeriaConfig {

    @Value("${cover.charge}")
    private double coverCharge;

    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 1.50, 100);
    }

    @Bean
    public Topping funghi() {
        return new Topping("Funghi", 1.00, 50);
    }

    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 5.00, 800);
    }

    @Bean
    public Pizza margheritaConProsciutto() {
        Pizza pizza = margherita();
        pizza.addTopping(prosciutto());
        return pizza;
    }

    @Bean
    public Drink cocaCola() {
        return new Drink("Coca Cola", 2.00, 150);
    }

    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        menu.addPizza(margherita());
        menu.addPizza(margheritaConProsciutto());
        menu.addDrink(cocaCola());
        return menu;
    }

    @Bean
    public Table table1() {
        return new Table(1, 4);
    }

    @Bean
    public Order order(Table table1, Menu menu) {
        Order order = new Order(1, table1, 2, coverCharge);
        order.addPizza(menu.getPizzas().get(0)); // Aggiungi una Margherita
        order.addDrink(menu.getDrinks().get(0)); // Aggiungi una Coca Cola
        return order;
    }
}
