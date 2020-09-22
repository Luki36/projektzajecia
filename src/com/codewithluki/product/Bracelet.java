package com.codewithluki.product;

public class Bracelet implements Product {
    @Override
    public double getPrice() {
        return 1099.99;
    }

    @Override
    public String getName() {
        return "White Gold";
    }

    @Override
    public double getWeight() {
        return 0.056;
    }

    @Override
    public double getPriceShipment() {
        return 49.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
