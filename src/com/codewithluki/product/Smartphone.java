package com.codewithluki.product;

public class Smartphone implements Product {
    @Override
    public double getPrice() {
        return 3999;
    }

    @Override
    public String getName() {
        return "Iphone11";
    }

    @Override
    public double getWeight() {
        return 0.23;
    }

    @Override
    public double getPriceShipment() {
        return 99.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
