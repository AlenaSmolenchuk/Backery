package ru.mts.backery;

import ru.mts.backery.enums.Dish;
import ru.mts.backery.enums.Type;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private String city;
    private Map<Class<Dish>, Integer> productMap = new HashMap<>();
    private LocalDate creationDate;

    private Type deliveryType;

    public int getDishCount() {
        return productMap.values().stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public String toString() {
        return "Order{" +
                "city='" + city + '\'' +
                ", productMap=" + productMap +
                ", creationDate=" + creationDate +
                ", deliveryType=" + deliveryType +
                '}';
    }

    public String getCity() {
        return city;
    }

    public Map<Class<Dish>, Integer> getProductMap() {
        return productMap;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Type getDeliveryType() {
        return deliveryType;
    }

    public Order(String city, Map<Class<Dish>, Integer> productMap, LocalDate creationDate, Type deliveryType) {
        this.city = city;
        this.productMap = productMap;
        this.creationDate = creationDate;
        this.deliveryType = deliveryType;
    }
}
