package com.example.delivery.model.devtypes;

import com.example.delivery.model.enums.DevType;
import com.example.delivery.model.ints.Deliver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Man implements Deliver {

    @Value("${man.capacity}")
    private int capacity;

    @Value("${man.devTime}")
    private int time;
    @Override
    public DevType type() {
        return DevType.MAN;
    }

    @Override
    public int capacity() {
        return 5;
    }

    @Override
    public int devTime() {
        return 3;
    }
}
