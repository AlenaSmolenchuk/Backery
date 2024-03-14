package ru.mts.entity;

public enum MaterialType {
    DOUGH(1000),
    MEAT(2000),
    CABBAGE(2000),
    FISH(3000),
    BERRY(5000),
    TEA(2000),
    COFFEE(2000);
    private MaterialType(Integer producingTime) {
        this.producingTime = producingTime;
    }

    private final Integer producingTime;

    public Integer getProducingTime() {
        return producingTime;
    }
}
