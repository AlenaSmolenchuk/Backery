package ru.mts.backery.service;


import ru.mts.backery.Order;
import ru.mts.backery.enums.Dish;
import ru.mts.backery.enums.Type;
import ru.mts.backery.utils.RandomUtils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class OrderGenerator {
    private static String[] cities = {"MOSCOW", "NOVOSIBIRSK"};
    private static Class<Dish> dishClass = Dish.class;

    public static Order getOrder() {
        String city = RandomUtils.getRandomFromArray(cities);
        LocalDate date = LocalDate.now();
        Map<Class<Dish>, Integer> map = new HashMap<>();
        map.put(dishClass, RandomUtils.getRandomAmount());
        return new Order(city, map, date, Type.DELIVERY);
    }

}
