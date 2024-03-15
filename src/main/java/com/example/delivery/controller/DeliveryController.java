package com.example.delivery.controller;

import com.example.delivery.controller.exception.CityException;
import com.example.delivery.model.Delivery;
import com.example.delivery.model.enums.CityNames;
import com.example.delivery.service.DeliveryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/delivery")
public class DeliveryController {

    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

   @PostMapping("/{id}")
public void showById(@PathVariable Delivery delivery) {
    try {
        if (!delivery.getCity().equals(CityNames.MSC) &&
                !delivery.getCity().equals(CityNames.EKB) &&
                !delivery.getCity().equals(CityNames.NVS) &&
                !delivery.getCity().equals(CityNames.SP)) {
            throw new CityException("Заказ не может быть доставлен");
        } else {
            deliveryService.findById(delivery.getId());
        }
    } catch (CityException e) {

        e.printStackTrace();
    }
}
