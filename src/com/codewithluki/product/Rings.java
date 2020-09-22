package com.codewithluki.product;

public class Rings implements Product {
    @Override
    public double getPrice() {
        return 879;
    }

    @Override
    public String getName() {
        return "Rose Gold";
    }

    @Override
    public double getWeight() {
        return 0.052;
    }

    @Override
    public double getPriceShipment() {
        return 69.99;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
