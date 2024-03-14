package ru.mts.backery.utils;

import java.util.Random;

public class RandomUtils {
    private static final Random random = new Random();

    public static int getRandomAmount() {
        return random.nextInt(7);
    }

    public static<T> T getRandomFromArray(T[] array) {
        int len = array.length;
        return array[random.nextInt(len - 1)];
    }

}

