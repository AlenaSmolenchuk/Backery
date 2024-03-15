package com.example.delivery.model.ints;

import com.example.delivery.model.enums.CityNames;

public interface City {

    CityNames name();

    default int countOfAutoDelivers() {
        return 2;
    }
    default int countOfBicycleDelivers() {
        return 3;
    }
    default int countOfManDelivers() {
        return 5;
    }
}
