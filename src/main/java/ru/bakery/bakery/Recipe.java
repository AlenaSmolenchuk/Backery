package ru.bakery.bakery;

public enum Recipe {
    MEAT_PIE("Пирожок с мясом"),
    CABBAGE_PIE("Пирожок с капустой"),
    FISH_PIE("Пирог с рыбой"),
    BERRY_PIE("Пирог с ягодой"),
    TEA("Чай"),
    COFFEE("Кофе");

    private final String name;

    Recipe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

