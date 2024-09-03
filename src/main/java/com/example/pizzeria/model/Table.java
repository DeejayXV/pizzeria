package com.example.pizzeria.model;

public class Table {
    private int id;
    private int maxSeats;
    private boolean occupied;

    public Table(int id, int maxSeats) {
        this.id = id;
        this.maxSeats = maxSeats;
        this.occupied = false;
    }

    public void occupy() {
        this.occupied = true;
    }

    public void free() {
        this.occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public int getId() {
        return id;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    // Altri metodi getter e setter se necessario
}
