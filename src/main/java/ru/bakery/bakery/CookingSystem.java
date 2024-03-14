package ru.bakery.bakery;

import java.util.ArrayList;
import java.util.Objects;

public class CookingSystem {
    private final Oven[] ovens = new Oven[10];
    private ArrayList<String> orders;
    private int secTime = 0;

    public CookingSystem(ArrayList<Recipe> recipes) {
        ovens[0] = new Oven(10);
        ovens[1] = new Oven(10);

        ovens[2] = new Oven(5);
        ovens[3] = new Oven(5);
        ovens[4] = new Oven(5);

        ovens[5] = new Oven(2);
        ovens[6] = new Oven(2);
        ovens[7] = new Oven(2);
        ovens[8] = new Oven(2);
        ovens[9] = new Oven(2);

        int i = 9;
        for (Recipe recipe: recipes) {

            if (!Objects.equals(recipe.getName(), Recipe.TEA.getName()) && !Objects.equals(recipe.getName(), Recipe.COFFEE.getName())) {
                if (!ovens[i].isFull()) {
                    ovens[i].busy();
                }
            } else {
                if (Objects.equals(recipe.getName(), Recipe.TEA.getName())) {
                    secTime = 3;
                } else {
                    secTime = 4;
                }
            }
        }

        try {
            Thread.sleep(secTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (Recipe recipe: recipes) {
            orders.add(recipe.getName());
        }
    }

    public ArrayList<String> getOrder() {
        return orders;
    }
}
