package com.example.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pizza> pizzas;
    private List<Drink> drinks;

    public Menu() {
        this.pizzas = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void printMenu() {
        System.out.println("Pizze:");
        for (Pizza pizza : pizzas) {
            System.out.printf("%s - Prezzo: %.2f€, Calorie: %d kcal%n",
                    pizza.getName(), pizza.getPrice(), pizza.getCalories());
        }
        System.out.println("\nBevande:");
        for (Drink drink : drinks) {
            System.out.printf("%s - Prezzo: %.2f€, Calorie: %d kcal%n",
                    drink.getName(), drink.getPrice(), drink.getCalories());
        }
    }
}
