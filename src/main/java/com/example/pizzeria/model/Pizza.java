package com.example.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private List<Topping> toppings;
    private double basePrice;
    private int baseCalories;

    public Pizza(String name, double basePrice, int baseCalories) {
        this.name = name;
        this.basePrice = basePrice;
        this.baseCalories = baseCalories;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double getPrice() {
        return basePrice + toppings.stream().mapToDouble(Topping::getPrice).sum();
    }

    public int getCalories() {
        return baseCalories + toppings.stream().mapToInt(Topping::getCalories).sum();
    }

    public String getName() {
        StringBuilder fullName = new StringBuilder(name);
        if (!toppings.isEmpty()) {
            fullName.append(" con ");
            for (Topping topping : toppings) {
                fullName.append(topping.getName()).append(", ");
            }
            fullName.setLength(fullName.length() - 2); // Rimuove l'ultima virgola
        }
        return fullName.toString();
    }

    // Getters e Setters
}
