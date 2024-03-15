package com.example.delivery.model.ints;

import com.example.delivery.model.enums.DevType;

public interface Deliver {

    DevType type();

    int capacity();

    int devTime();
}
