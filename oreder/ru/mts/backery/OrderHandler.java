package ru.mts.backery;

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


    public void giveOrder(Order order) {
        synchronized (deliveryLock) {
            giveOrderToDelivery();
        }
    }

    void giveOrderToCook() {
    }

    void giveOrderToDelivery() {}

    public static void main(String[] args) {
        System.out.println(OrderGenerator.getOrder());
    }

}
