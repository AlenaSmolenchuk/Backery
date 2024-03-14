package ru.bakery.bakery;

public class Oven {
    private int capacity;

    public Oven(int capacity) {
        this.capacity = capacity;
    }

    public void busy() {
        capacity--;
    }

    public boolean isFull() {
        return capacity == 0;
    }
}