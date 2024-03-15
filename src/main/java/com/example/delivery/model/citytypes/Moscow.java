package com.example.delivery.model.citytypes;

import com.example.delivery.model.enums.CityNames;
import com.example.delivery.model.ints.City;

public class Moscow implements City {
    @Override
    public CityNames name() {
        return CityNames.MSC;
    }
}
