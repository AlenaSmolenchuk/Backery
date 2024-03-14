package ru.mts.backery;

import ru.mts.backery.enums.Type;
import ru.mts.backery.service.OrderGenerator;

public class OrderHandler {

    Object cookLock = new Object();
    Object deliveryLock = new Object();


    public void makeOrder(Order order) throws InterruptedException {
        synchronized (cookLock) {
            Thread.sleep(3000);
            giveOrderToCook();
        }
    }

    public void onGetDishes(Order order) {
        if (order.getDeliveryType().equals(Type.DELIVERY)) giveOrderToDelivery();
    }


    void giveOrderToCook() {

    }

    void giveOrderToDelivery() {
        synchronized (deliveryLock) {

        }
    }


}
