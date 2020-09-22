package com.codewithluki.product;

public class Car implements Product {
    @Override
    public double getPrice() {
        return 390_000;
    }

    @Override
    public String getName() {
        return "Porsche";
    }

    @Override
    public double getWeight() {
        return 1360;
    }

    @Override
    public double getPriceShipment() {
        return 0;
    }

    @Override
    public double getCapacity() {
        return 0;
    }
}
