package com.example.delivery.model.devtypes;

import com.example.delivery.model.enums.DevType;
import com.example.delivery.model.ints.Deliver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bicycle implements Deliver {

    @Value("${bicycle.capacity}")
    private int capacity;

    @Value("${bicycle.devTime}")
    private int time;

    @Override
    public DevType type() {
        return DevType.BICYCLE;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public int devTime() {
        return time;
    }
}
