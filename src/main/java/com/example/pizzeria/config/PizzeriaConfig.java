package com.example.pizzeria.config;

import com.example.pizzeria.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzeriaConfig {

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
        Pizza margherita = new Pizza("Margherita", 5.00, 800);
        return margherita;
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
}
