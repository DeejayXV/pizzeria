package com.example.pizzeria.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private Table table;
    private int numberOfSeats;
    private List<Pizza> pizzas;
    private List<Drink> drinks;
    private OrderStatus status;
    private LocalDateTime orderTime;
    private double coverCharge;

    public Order(int orderNumber, Table table, int numberOfSeats, double coverCharge) {
        this.orderNumber = orderNumber;
        this.table = table;
        this.numberOfSeats = numberOfSeats;
        this.coverCharge = coverCharge;
        this.pizzas = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.status = OrderStatus.IN_PROGRESS;
        this.orderTime = LocalDateTime.now();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public double getTotalAmount() {
        double total = pizzas.stream().mapToDouble(Pizza::getPrice).sum();
        total += drinks.stream().mapToDouble(Drink::getPrice).sum();
        total += numberOfSeats * coverCharge;
        return total;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Table getTable() {
        return table;
    }

    // Altri metodi getter e setter se necessario
}
