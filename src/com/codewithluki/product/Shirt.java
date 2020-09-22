package com.codewithluki.product;

public class Shirt implements Product {
    @Override
    public double getPrice() {
        return 415;
    }

    @Override
    public String getName() {
        return "Finamore";
    }

    @Override
    public double getWeight() {
        return 0.38;
    }

    @Override
    public double getPriceShipment() {
        return 19.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
